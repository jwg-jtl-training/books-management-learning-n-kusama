package jp.co.jwebgate.jlibrary.form;

import lombok.Data;

@Data
public class RegisterStaffUserForm {

	private String staffUserId;
	
	private String password;
	
	private String confirmPassword;
	
	private String nameKana;
	
	private String name;
	
	private String email;
	
	public RegisterStaffUserForm() {}
	
	public RegisterStaffUserForm(String newStaffUserId) {
		this.staffUserId = newStaffUserId;
	}
}