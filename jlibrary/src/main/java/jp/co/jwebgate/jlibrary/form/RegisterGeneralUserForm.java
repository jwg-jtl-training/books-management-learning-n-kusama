package jp.co.jwebgate.jlibrary.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class RegisterGeneralUserForm {

	private String generalUserId;
	
	/**
	* フリガナ
	*/
	@Size(max = 50, message = "フリガナは50文字以下で入力してください。")
	@Pattern(regexp = "^[\\u30a0-\\u30ff]+$", message = "フリガナを全角カナで入力してください。")
	private String nameKana;
	
	/**
	* 氏名
	*/
	@NotEmpty(message = "氏名を入力してください。")
	@Size(max = 25, message = "氏名は25文字以下で入力してください。")
	private String name;
	
	/**
	* 生年月日
	*/
	@NotEmpty(message = "生年月日を入力してください。")
	private String birthday;
	
	/**
	* 電話番号
	*/
	@Size(min = 10, max = 11, message = "電話番号を10桁もしくは11桁で入力してください。")
	@Pattern(regexp = "^[0-9]+$", message = "電話番号を半角数字で入力してください。")
	private String phoneNumber;
	
	/**
	* 住所
	*/
	@NotEmpty(message = "住所を入力してください。")
	@Size(max = 255, message = "住所は255文字以下で入力してください。")
	private String address;
	
	public RegisterGeneralUserForm() {}
	
	public RegisterGeneralUserForm(String newGeneralUserId) {
		this.generalUserId = newGeneralUserId;
	}
	
}