package jp.co.jwebgate.jlibrary.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jp.co.jwebgate.jlibrary.consts.RegularExpressionConsts;
import lombok.Data;

/**
 * 図書登録フォーム
 * @author j_user
 */
@Data
public class RegisterBookForm {

	/**
     * タイトル
     */
	@NotBlank
	private String title;
	
	/**
     * 著者名
     */
	@NotBlank
	private String author;
	
	/**
     * 出版社
     */
	@NotBlank
	private String publisher;
	
	/**
     * ISBN-10
     */
	@Size(min = 0, max = 10)
	private String isbn10;
	
	/**
     * ISBN-13
     */
	@Size(min = 0, max = 13)
	private String isbn13;
	
	/**
     * ジャンルID
     */
	@NotNull
	private Integer genreId;

	/**
     * 棚番号
     */
	@Size(min = 0, max = 3)
	@Pattern(regexp = RegularExpressionConsts.halfAlphabetNumber, message = "棚番号を半角英数字で入力してください。")  
	private String shelfNumber;
	
	/**
     * 管理番号
     */
	@NotBlank
	private String controlNumber;
	
}