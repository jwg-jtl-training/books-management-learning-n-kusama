package jp.co.jwebgate.jlibrary.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoggingHandlerInterceptor implements HandlerInterceptor {

	Logger logger = LoggerFactory.getLogger(LoggingHandlerInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		String message = String.format("[%s] %-4s %s", request.getLocalAddr(), request.getMethod(),
				request.getRequestURI());
		logger.info(message);
		return true;
	}
}
