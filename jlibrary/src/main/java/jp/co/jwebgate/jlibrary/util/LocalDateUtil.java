package jp.co.jwebgate.jlibrary.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.thymeleaf.util.StringUtils;

public class LocalDateUtil {

	private LocalDateUtil() {}
	/**
	 * パターン01<br>
	 * yyyy-MM-dd
	 */
	public static final String DATE_FROMATTER_01 = "yyyy-MM-dd";
	
	/**
	 * パターン02<br>
	 * yyyy/MM/dd
	 */
	public static final String DATE_FROMATTER_02 = "yyyy/MM/dd";
	
	/**
	 * LocalDateをStringに変換（yyyy-MM-dd）<br>
	 * 変換できない場合は空文字を返却
	 * @param targetDate
	 * @return String（yyyy-MM-dd）
	 */
	public static String convert01LocalDateToString(LocalDate targetDate) {
		if(targetDate != null) {
			try {
				return targetDate.format(DateTimeFormatter.ofPattern(DATE_FROMATTER_01));
			}catch(IllegalArgumentException e) {
				return "";
			}
		}else {
			return "";
		}
	}
	
	/**
	 * String(yyyy-mm-dd)からLocalDateに変換<br>
	 * 変換できない場合はnullを返却
	 * @param targetStr
	 * @return LocalDate
	 */
	public static LocalDate convert01StringToLocalDate(String targetStr) {
		if(!StringUtils.isEmpty(targetStr)) {
			try {
				return LocalDate.parse(targetStr, DateTimeFormatter.ofPattern(DATE_FROMATTER_01));
			}catch(IllegalArgumentException e) {
				return null;
			}
		}else {
			return null;
		}
	}
	
	/**
	 * LocalDateをStringに変換（yyyy/MM/dd）<br>
	 * 変換できない場合は空文字を返却
	 * @param targetDate
	 * @return String（yyyy/MM/dd）
	 */
	public static String convert02LocalDateToString(LocalDate targetDate) {
		if(targetDate != null) {
			try {
				return targetDate.format(DateTimeFormatter.ofPattern(DATE_FROMATTER_02));
			}catch(IllegalArgumentException e) {
				return "";
			}
		}else {
			return "";
		}
	}
	
	/**
	 * String(yyyy/mm/dd)からLocalDateに変換<br>
	 * 変換できない場合はnullを返却
	 * @param targetStr
	 * @return LocalDate
	 */
	public static LocalDate convert02StringToLocalDate(String targetStr) {
		if(!StringUtils.isEmpty(targetStr)) {
			try {
				return LocalDate.parse(targetStr, DateTimeFormatter.ofPattern(DATE_FROMATTER_02));
			}catch(IllegalArgumentException e) {
				return null;
			}
		}else {
			return null;
		}
	}
}
