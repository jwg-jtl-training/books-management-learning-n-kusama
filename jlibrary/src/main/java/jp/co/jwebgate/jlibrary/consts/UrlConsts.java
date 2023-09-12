package jp.co.jwebgate.jlibrary.consts;


import org.springframework.stereotype.Component;

@Component
public class UrlConsts {

	public static final String REDIRECT = "redirect:";
	
	public static final String FORWARD = "forward:";
	
	public static final String ROOT = "/";
	
	public static final String STAFF = "/staff";
	
	public static final String ADMIN = "/admin";
	
	public static final String GENERAL = "/general";
	
	public static final String LOGIN = "/login";
	
	public static final String LOGOUT = "/logout";
	
	public static final String STAFF_LOGIN = "/staffLogin";
	
	public static final String ERROR = "?error";
	
	public static final String REGISTER_GENERAL_USER = STAFF + "/registerGeneralUser";
	
	public static final String REGISTER_STAFF_USER = "/registerStaffUser";
	
	public static final String SEARCH_BOOK = "/searchBook";

	public static final String SEARCH_BOOK_RESULT = "/searchBookResult";
	
	public static final String REGISTER_BOOK = STAFF + "/registerBook";
	
	public static final String GENERAL_USER_LIST = STAFF + "/generalUserList";
	
	public static final String STAFF_USER_LIST = STAFF + "/staffUserList";
	
	public static final String CSS = "/css/**";
	
	public static final String WILDCARD = "/**";
	
}