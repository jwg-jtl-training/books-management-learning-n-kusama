package jp.co.jwebgate.jlibrary.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jp.co.jwebgate.jlibrary.consts.RegularExpressionConsts;
import lombok.Data;

/**
 * 職員登録フォーム
 * @author j_user
 */
@Data
public class RegisterStaffUserForm {

	/**
	 * 職員ID
	 */
	private String staffUserId;

	/**
	 * パスワード
	 */
	@NotBlank
	@Pattern(regexp = RegularExpressionConsts.halfAlphabetNumber, message = "{patternHanEisuzi}")
	@Size(min = 6, max = 30)
	private String password;

	/**
	 * パスワード（確認用）
	 */
	@NotBlank
	@Pattern(regexp = RegularExpressionConsts.halfAlphabetNumber, message = "{patternHanEisuzi}")
	@Size(min = 6, max = 30)
	private String confirmPassword;

	/**
	 * フリガナ
	 */
	@NotBlank
	@Pattern(regexp = RegularExpressionConsts.halfAlphabetNumber, message = "{patternHanEisuzi}")
	@Size(min = 1, max = 50)
	private String nameKana;

	/**
	 * 氏名
	 */
	@NotBlank
	@Size(min = 1, max = 25)
	private String name;

	/**
	 * メールアドレス
	 */
	@NotBlank
	@Email
	@Pattern(regexp = RegularExpressionConsts.halfAlphabetNumber, message = "{patternHanEisuzi}")
	@Size(min = 6, max = 30)
	private String email;
	
	/**
	 * RegisterStaffUserFormメソッド
	 * 引数がnewStaffUserIdの場合
	 */
	public RegisterStaffUserForm(String newStaffUserId) {
		this.staffUserId = newStaffUserId;
	}

	/**
	 * 引数なしコンストラクタ
	 */
	public RegisterStaffUserForm() {

	}
}