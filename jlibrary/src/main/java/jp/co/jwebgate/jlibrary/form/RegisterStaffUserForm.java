package jp.co.jwebgate.jlibrary.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class RegisterStaffUserForm {

	private String staffUserId;
	
	@NotBlank(message = "パスワードを入力してください。")
	@Pattern(regexp = "^[0-9a-zA-Z]+$", message = "半角英数字で入力してください。")
	@Size(max = 30, message = "30字以内で入力してください。")
	private String password;

	@NotBlank(message = "再確認用のパスワードを入力してください。")
	@Pattern(regexp = "^[0-9a-zA-Z]+$", message = "半角英数字で入力してください。")
	@Size(max = 30, message = "30字以内で入力してください。")
	private String confirmPassword;
	
	@NotBlank(message = "氏名カナを入力してください。")
	@Pattern(regexp = "^[ァ-タダ-ヶー０-９]+$", message = "全角カナで入力してください。")
	@Size(max = 50, message = "50字以内で入力してください。")
	private String nameKana;
	
	@NotBlank(message = "氏名を入力してください。")
	@Size(max = 25, message = "25字以内で入力してください。")
	private String name;
	
	@NotBlank(message = "メールアドレスを入力してください。")
	@Email
	@Pattern(regexp = "^[0-9a-zA-Z@_.+-]+$", message = "半角英数字で入力してください。")
	@Size(max = 30, message = "30字以内で入力してください。")
	private String email;
	
	public RegisterStaffUserForm() {}
	
	public RegisterStaffUserForm(String newStaffUserId) {
		this.staffUserId = newStaffUserId;
	}
}