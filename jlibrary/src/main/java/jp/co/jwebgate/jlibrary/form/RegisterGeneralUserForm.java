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
	@Size(max = 50, message = "{sizeMax}")
	@Pattern(regexp = RegularExpressionConsts.fullKana, message = "{patternZenKana}")
	private String nameKana;
	/**
	* 氏名
	*/
	@NotBlank
	@Size(max = 25, message = "{sizeMax}")
	private String name;
	/**
	* 生年月日
	*/
	@NotBlank
	private String birthday;
	/**
	* 電話番号
	*/
	@Size(min = 10, max = 11, message = "{sizeMinAndMax}")
	@Pattern(regexp = RegularExpressionConsts.halfNumber, message = "{patternHanSuzi}")
	private String phoneNumber;
	/**
	* 住所
	*/
	@NotBlank
	@Size(max = 255, message = "{sizeMax}")
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
	public RegisterGeneralUserForm() {
	}
}












