package jp.co.jwebgate.jlibrary.handler;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jp.co.jwebgate.jlibrary.consts.UrlConsts;
import jp.co.jwebgate.jlibrary.details.LoginUserDetails;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class JlibraryAuthenticationSuccessHandler  implements AuthenticationSuccessHandler{

	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		DefaultRedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
		LoginUserDetails details = (LoginUserDetails)authentication.getPrincipal();
		List<String> roleCdList = details.getLoginUser().getRoleCdList();
		if(roleCdList.contains("ROLE_ADMIN")) {
			log.info("ROLE : ADMIN");
			redirectStrategy.sendRedirect(request, response, UrlConsts.SEARCH_BOOK);
		}else if(roleCdList.contains("ROLE_STAFF")){
			log.info("ROLE : STAFF");
			redirectStrategy.sendRedirect(request, response, UrlConsts.SEARCH_BOOK);
		}else {
			log.info("ROLE : GENERAL");
			redirectStrategy.sendRedirect(request, response, UrlConsts.SEARCH_BOOK);
		}
	}

}

