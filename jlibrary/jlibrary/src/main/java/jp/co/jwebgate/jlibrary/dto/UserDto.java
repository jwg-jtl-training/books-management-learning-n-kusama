package jp.co.jwebgate.jlibrary.dto;

import java.time.LocalDate;
import java.util.List;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import lombok.Data;

@Data
public class UserDto {
	
	private String userType;

	private String userId;
	
	private String password;
	
	private String nameKana;
	
	private String name;
	
	private LocalDate birthday;
	
	private String phoneNumber;
	
	private String address;
	
	private String email;
	
	private List<String> roleCdList;
	
	public UserDto(StaffUser entity, List<String> roleCdList) {
		this.userType = "1";
		this.userId = entity.getStaffUserId();
		this.password = entity.getPassword();
		this.nameKana = entity.getNameKana();
		this.name = entity.getName();
		this.birthday = null;
		this.phoneNumber = null;
		this.address = null;
		this.email = entity.getEmail();
		this.roleCdList = roleCdList;
	}
	
	public UserDto(GeneralUser entity, List<String> roleCdList) {
		this.userType = "2";
		this.userId = entity.getGeneralUserId();
		this.password = entity.getPassword();
		this.nameKana = entity.getNameKana();
		this.name = entity.getName();
		this.birthday = entity.getBirthday();
		this.phoneNumber = entity.getPhoneNumber();
		this.address = entity.getAddress();
		this.email = null;
		this.roleCdList = roleCdList;
	}
}
