package jp.co.jwebgate.jlibrary.config;

import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jp.co.jwebgate.jlibrary.interceptor.AccessContextInterceptor;
import jp.co.jwebgate.jlibrary.interceptor.LoggingHandlerInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

  @Bean
  LoggingHandlerInterceptor loggingHandlerInterceptor() {
    return new LoggingHandlerInterceptor();
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(loggingHandlerInterceptor())
            .addPathPatterns("/**");
  }
  
  
  @Bean
  Advisor serviceLoggingAdvisor() {
    AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
    pointcut.setExpression(
        "execution(* *..*.*Service.*(..))");
    return new DefaultPointcutAdvisor(pointcut, new AccessContextInterceptor());
  }
  
  @Bean
  Advisor addAccessContextInterceptor() {
    AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
    pointcut.setExpression(
        "execution(* *..*.*Controller.*(..))");
    return new DefaultPointcutAdvisor(pointcut, new AccessContextInterceptor());
  }
}
