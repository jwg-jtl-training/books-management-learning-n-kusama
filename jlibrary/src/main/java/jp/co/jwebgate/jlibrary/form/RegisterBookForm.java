package jp.co.jwebgate.jlibrary.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
	@NotBlank(message = "タイトルを入力してください。")
	private String title;
	
	/**
     * 著者名
     */
	@NotBlank(message = "著者名を入力してください。")
	private String author;

	/**
     * 出版社
     */
	@NotBlank(message = "出版社名を入力してください。")
	private String publisher;

	/**
     * ISBN-10
     */
	@Size(max = 30, message = "ISBNは10字以内で入力してください")
	@Pattern(regexp = "^[0-9]+$", message = "ISBNを半角数字で入力してください")
	private String isbn10;

	/**
     * ISBN-13
     */
	@Size(max = 30, message = "ISBNは13字以内で入力してください")
	@Pattern(regexp = "^[0-9]+$", message =  "ISBNを半角数字で入力してください")
	private String isbn13;

	/**
     * ジャンルID
     */
	@NotNull(message = "ジャンルを選択してください。")
	private Integer genreId;

	/**
     * 棚番号
     */
	@Size(max = 3, message = "棚番号は3字以内で入力してください")
	@Pattern(regexp = "^[0-9a-zA-Z]+$", message = "棚番号を半角英数字で入力してください")  
	private String shelfNumber;

	/**
     * 管理番号
     */
	@NotBlank(message = "管理番号を生成してください。")
	private String controlNumber;
	
}