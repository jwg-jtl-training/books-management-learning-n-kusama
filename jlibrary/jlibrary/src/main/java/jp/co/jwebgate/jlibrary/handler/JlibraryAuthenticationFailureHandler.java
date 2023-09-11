package jp.co.jwebgate.jlibrary.handler;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import jp.co.jwebgate.jlibrary.consts.UrlConsts;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class JlibraryAuthenticationFailureHandler  implements AuthenticationFailureHandler{

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
		AuthenticationException exception) throws IOException, ServletException {
		DefaultRedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
		log.info("LOGIN : FAILD");
		redirectStrategy.sendRedirect(request, response, UrlConsts.LOGIN + UrlConsts.ERROR);
	}
}
