package jp.co.jwebgate.jlibrary.config;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import jp.co.jwebgate.jlibrary.consts.UrlConsts;
import jp.co.jwebgate.jlibrary.handler.JlibraryAuthenticationFailureHandler;
import jp.co.jwebgate.jlibrary.handler.JlibraryAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	
	@Autowired
	private JlibraryAuthenticationSuccessHandler jlibraryAuthenticationSuccessHandler;

	@Autowired
	private JlibraryAuthenticationFailureHandler jlibraryAuthenticationFailureHandler;
	
	private Set<String> antPatterns = 
			Set.of("/jquery-3.7.1/**","/bootstrap-5.3.0-dist/**","/css/**", "/js/**", "/error/**"
					, UrlConsts.ROOT, UrlConsts.LOGIN + UrlConsts.WILDCARD
					, UrlConsts.SEARCH_BOOK + UrlConsts.WILDCARD, UrlConsts.SEARCH_BOOK_RESULT + UrlConsts.WILDCARD
					, UrlConsts.REGISTER_STAFF_USER + UrlConsts.WILDCARD);
	
	@Bean
	public SecurityFilterChain staffSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			// 全ユーザーアクセス許可
			.antMatchers(antPatterns.stream().toArray(String[]::new)).permitAll()
			// "/staff"はROLE_STAFFとROLE_ADMINのみアクセス可能
			.mvcMatchers("/staff").hasRole("STAFF")
			.mvcMatchers("/staff").hasRole("ADMIN")
			// "/admin"はROLE_ADMINのみアクセス可能
			.mvcMatchers("/admin").hasRole("ADMIN")
			// それ以外は全て認証なしのアクセス不許可
			.anyRequest().authenticated()
			//　ログイン設定
			.and().formLogin()
			// 認証処理のパス
			.loginProcessingUrl(UrlConsts.LOGIN)
			// ログインフォームのパス
			.loginPage(UrlConsts.LOGIN)
			// 認証OK時のハンドリングを実施
			.successHandler(jlibraryAuthenticationSuccessHandler)
			// 認証NG時のハンドリングを実施
			.failureHandler(jlibraryAuthenticationFailureHandler)
			// ユーザー名、パスワードのパラメータ名
			.usernameParameter("username").passwordParameter("password").and().exceptionHandling()
			// ログアウト設定
			.and().logout().logoutRequestMatcher(new AntPathRequestMatcher(UrlConsts.LOGOUT))
			.logoutSuccessUrl(UrlConsts.LOGIN).invalidateHttpSession(true).permitAll();
		
        return http.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}

