package jp.co.jwebgate.jlibrary.enums;

import lombok.Getter;

@Getter
public enum EnumRoles {
	
	ADMIN(1, "ROLE_ADMIN", "管理者"),
	STAFF(2, "ROLE_STAFF", "職員"),
	GENERAL(3, "ROLE_GENERAL", "一般利用者");
	
	private Integer id;
	
	private String cd;
	
	private String name;
	
	private EnumRoles(Integer id, String cd, String name) {
		this.id = id;
		this.cd = cd;
		this.name = name;
	}
}
