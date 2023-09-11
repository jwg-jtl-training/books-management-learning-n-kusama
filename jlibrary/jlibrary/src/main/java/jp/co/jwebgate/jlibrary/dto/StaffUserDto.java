package jp.co.jwebgate.jlibrary.dto;

import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import lombok.Data;

@Data
public class StaffUserDto {

	private String staffUserId;
	
	private String name;
	
	private String nameKana;
	
	private String email;
	
	public StaffUserDto(StaffUser staffUser) {
		this.staffUserId = staffUser.getStaffUserId();
		this.name = staffUser.getName();
		this.nameKana = staffUser.getNameKana();
		this.email = staffUser.getEmail();
	}
}
