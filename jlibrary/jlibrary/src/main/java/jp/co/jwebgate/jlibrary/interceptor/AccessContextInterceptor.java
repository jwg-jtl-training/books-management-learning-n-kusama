package jp.co.jwebgate.jlibrary.interceptor;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Optional;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.dbflute.hook.AccessContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

@Component
public class AccessContextInterceptor implements MethodInterceptor{
    
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        if (AccessContext.isExistAccessContextOnThread()) {
            // 既に設定されていたら何もしないで次へ
            // (二度呼び出しされたときのために念のため)
            return invocation.proceed();
        }
        setupAccessContext(invocation);
        try {
            return invocation.proceed();
        } finally {
            // 最後はしっかりクリアすること (必須)
            AccessContext.clearAccessContextOnThread();
        }
    }
    
    private void setupAccessContext(MethodInvocation invocation) {
        Method method = invocation.getMethod();
        if(!isRequestMethod(method)) {
            return;
        }
        
        String className = method.getDeclaringClass().getName();
        String methodName = method.getName();
        
        // [アクセス日時]
        // 例えば、アプリで日時を取得する統一したインターフェースからの日時を利用。
        LocalDateTime accessLocalDateTime = LocalDateTime.now();

        // [アクセスユーザ]
        // 例えば、セッション上のログインユーザを利用。
        // ログインしていない場合のことも考慮すること。
        String accessUser = getUserName().orElse("guest");

        // [アクセスプロセス]
        // 例えば、Pageクラスの名前をそのまま利用。
        // アプリケーションでプロセスを判別できる適切な名前を設定すること。
        // DBのカラムサイズに注意(サイズオーバーしないように)
        String accessProcess = String.format("%s#%s", className, methodName);

        AccessContext context = new AccessContext();
        context.setAccessLocalDateTime(accessLocalDateTime);
        context.setAccessUser(accessUser);
        context.setAccessProcess(accessProcess);
        AccessContext.setAccessContextOnThread(context);
    }
    
    private boolean isRequestMethod(Method method) {
        return (method.getAnnotation(RequestMapping.class) != null
                || method.getAnnotation(GetMapping.class) != null
                || method.getAnnotation(PostMapping.class) != null);
    }
    
    private Optional<String> getUserName(){
        return Optional.ofNullable(SecurityContextHolder.getContext())
                .map(c->c.getAuthentication())
                .map(a->a.getPrincipal()).filter(UserDetails.class::isInstance)
                .map(p->UserDetails.class.cast(p))
                .map(u->u.getUsername());
    }
}