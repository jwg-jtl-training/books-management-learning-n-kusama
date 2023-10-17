package jp.co.jwebgate.jlibrary.form;

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
	private String title;

	/**
	 * 著者名
	 */
	private String author;

	/**
	 * 出版社
	 */
	private String publisher;

	/**
	 * ISBN-10
	 */
	private String isbn10;

	/**
	 * ISBN-13
	 */
	private String isbn13;

	/**
	 * ジャンルID
	 */
	private Integer genreId;

	/**
	 * 棚番号
	 */
	private String shelfNumber;

	/**
	 * 管理番号
	 */
	private String controlNumber;

}