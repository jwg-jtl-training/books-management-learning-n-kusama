package jp.co.jwebgate.jlibrary.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import jp.co.jwebgate.jlibrary.consts.RegularExpressionConsts;
import lombok.Data;

/**
 * 一般利用者登録フォーム
 * @author j_user
 */
@Data
public class RegisterGeneralUserForm {

	/**
	* 一般利用者ID
	*/
	private String generalUserId;
	
	/**
	* フリガナ
	*/
	@Size(min = 1, max = 50)
	@Pattern(regexp = RegularExpressionConsts.fullKana, message = "フリガナを全角カナで入力してください")
	private String nameKana;
	
	/**
	* 氏名
	*/
	@NotBlank
	@Size(min = 1, max = 25)
	private String name;
	
	/**
	* 生年月日
	*/
	@NotBlank
	private String birthday;
	
	/**
	* 電話番号
	*/
	@Size(min = 10, max = 11)
	@Pattern(regexp = RegularExpressionConsts.halfNumber, message = "電話番号を半角数字で入力してください")
	private String phoneNumber;
	
	/**
	* 住所
	*/
	@NotBlank
	@Size(min = 1, max = 255)
	private String address;
	
	
	/**
	* RegisterGeneralUserFormメソッド
	* 引数がnewGeneralUserIdの場合
	*/
	public RegisterGeneralUserForm(String newGeneralUserId) {
		this.generalUserId = newGeneralUserId;
	}
	
	/**
	 * 引数なしコンストラクタ
	 */
	public RegisterGeneralUserForm() {}
	
}