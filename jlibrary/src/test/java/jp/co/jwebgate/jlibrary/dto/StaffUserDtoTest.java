package jp.co.jwebgate.jlibrary.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;

/**
 * StaffUserDtoクラスのテスト
 */
@SpringBootTest
class StaffUserDtoTest {
	
	/**
	 * StaffUserDtoメソッドのテスト
	 */
	@Test
	void test1() {
		
		StaffUser staffUser = new StaffUser();
		
		staffUser.setStaffUserId("1");
		staffUser.setName("Name");
		staffUser.setNameKana("NameKana");
		staffUser.setEmail("Email");
	
		StaffUserDto dto = new StaffUserDto(staffUser);
		
		assertEquals(dto.getStaffUserId(), staffUser.getStaffUserId());
		assertEquals(dto.getName(), staffUser.getName());
		assertEquals(dto.getNameKana(), staffUser.getNameKana());
		assertEquals(dto.getEmail(), staffUser.getEmail());
	}
}
