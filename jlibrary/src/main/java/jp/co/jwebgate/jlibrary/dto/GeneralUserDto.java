package jp.co.jwebgate.jlibrary.dto;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.util.LocalDateUtil;
import lombok.Data;

@Data
public class GeneralUserDto {

	private String generalUserId;
	
	private String name;
	
	private String nameKana;
	
	private String birthday;
	
	private String phoneNumber;
	
	private String address;
	
	public GeneralUserDto(GeneralUser generalUser) {
		this.generalUserId = generalUser.getGeneralUserId();
		this.name = generalUser.getName();
		this.nameKana = generalUser.getNameKana();
		this.birthday = LocalDateUtil.convert01LocalDateToString(generalUser.getBirthday());
		this.phoneNumber = generalUser.getPhoneNumber();
		this.address = generalUser.getAddress();
		
	}
}
