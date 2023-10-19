package jp.co.jwebgate.jlibrary.form;
import java.util.Objects;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	@NotNull
	private Integer genreId;
	/**
	 * 棚番号
	 */
	private String shelfNumber;
	/**
	 * 管理番号
	 */
	@NotBlank
	private String controlNumber;
	
	/**
	 * ISBN10,ISBN13のどちらか片方が入力されているかの確認
	 * @return 判定結果
	 */

	@AssertTrue
	public boolean isCheckISBN() {
		if (isbn10 == null || isbn13 == null) {
			return true;
		}

		if (isbn10.length() >= 1 && isbn13.length() >= 1) {
			return false;
		}

		if (isbn10.length() >= 1 || isbn13.length() >= 1) {
			return true;
		}
		return false;
	}

	/**
	 * ISBN10の値が10桁であるかの確認
	 * @return 判定結果
	 */
	@AssertTrue
	public boolean isCheckISBN10() {
		if (isbn10 == null && isbn13 == null) {
			return true;
		}

		if (isbn10 != null && isbn10.length() >= 1) {
			if (isbn10.length() != 10) {
				return false;
			}
		}
		return true;
	}

	/**
	 * ISBN13の値が13桁であるかの確認
	 * @return 判定結果
	 */
	@AssertTrue
	public boolean isCheckISBN13() {
		if (isbn10 == null && isbn13 == null) {
			return true;
		}

		if (isbn13 != null && isbn13.length() >= 1) {
			if (isbn13.length() != 13) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 棚番号の値が3桁であるかの確認
	 * @return 判定結果
	 */
	@AssertTrue
	public boolean isCheckShelfNumberSize() {
		if (shelfNumber == null || shelfNumber.isEmpty()) {
			return true;
		}
		return Objects.equals(shelfNumber.length(), 3);
	}

	/**
	 * 棚番号の値が半角英数字であるかの確認
	 * @return 判定結果
	 */
	@AssertTrue
	public boolean isCheckShelfNumber() {
		if (shelfNumber == null || shelfNumber.isEmpty()) {
			return true;
		}

		if (shelfNumber.matches(RegularExpressionConsts.halfAlphabetNumber)) {
			return true;
		}
		return false;
	}
}