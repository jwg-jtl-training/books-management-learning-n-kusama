package jp.co.jwebgate.jlibrary.form;

import lombok.Data;

@Data
public class RegisterGeneralUserForm {

	private String generalUserId;
	
	private String nameKana;
	
	private String name;
	
	private String birthday;
	
	private String phoneNumber;
	
	private String address;
	
	public RegisterGeneralUserForm() {}
	
	public RegisterGeneralUserForm(String newGeneralUserId) {
		this.generalUserId = newGeneralUserId;
	}
	
}