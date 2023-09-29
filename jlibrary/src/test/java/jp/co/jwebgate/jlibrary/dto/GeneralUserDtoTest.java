package jp.co.jwebgate.jlibrary.dto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;

/**
 * GeneralUserDtoクラスのテスト
 */
@SpringBootTest
class GeneralUserDtoTest {

	/**
	 * GeneralUserDtoメソッドのテスト
	 */
	@Test
	void test1() {

		LocalDate birthday = LocalDate.of(2000, 01, 01);

		GeneralUser generalUser = new GeneralUser();
		generalUser.setGeneralUserId("1111111111");
		generalUser.setName("Name");
		generalUser.setNameKana("NameKana");
		generalUser.setBirthday(birthday);
		generalUser.setPhoneNumber("00000000000");
		generalUser.setAddress("Address");

		GeneralUserDto dto = new GeneralUserDto(generalUser);

		assertEquals(dto.getGeneralUserId(), generalUser.getGeneralUserId());
		assertEquals(dto.getName(), generalUser.getName());
		assertEquals(dto.getNameKana(), generalUser.getNameKana());
		assertEquals(dto.getBirthday(), generalUser.getBirthday().toString());
		assertEquals(dto.getPhoneNumber(), generalUser.getPhoneNumber());
		assertEquals(dto.getAddress(), generalUser.getAddress());
	}
}
