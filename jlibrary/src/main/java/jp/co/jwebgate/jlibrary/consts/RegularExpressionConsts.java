package jp.co.jwebgate.jlibrary.consts;


import org.springframework.stereotype.Component;

@Component
public class RegularExpressionConsts {

	/**
	 * 半角英数字
	 */
	public static final String halfAlphabetNumber = "^[0-9a-zA-Z@_.+-]+$";
	
	/**
	 * 半角数字
	 */
	public static final String halfNumber = "^[0-9]+$";
	
	/**
	 * 全角カナ
	 */
	public static final String fullKana = "^[\\u30a0-\\u30ff]+$";
	
	/**
	 *携帯電話 
	 */
	public static final String mobilePhone = "^(070|080|090)-\\d{4}-\\d{4}$" ;
	
	/**
	 * 郵便番号
	 */
	public static final String postCode = "^[0-9]{3}-[0-9]{4}$" ;
	
}