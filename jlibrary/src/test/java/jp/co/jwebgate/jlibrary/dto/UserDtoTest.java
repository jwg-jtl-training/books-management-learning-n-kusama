package jp.co.jwebgate.jlibrary.dto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;

@SpringBootTest
class UserDtoTest {

	@Test
	void UserDtoWithStaffUser() {
		StaffUser entity = new StaffUser();
		List<String> roleCdList = new ArrayList<>();
		
		entity.setStaffUserId("1234567890");
		entity.setPassword("password");
		entity.setNameKana("てすと");
		entity.setName("テスト");
		entity.setEmail("test@mail.com");
		roleCdList.add("ROLE_ADMIN");
		roleCdList.add("ROLE_STAFF");
		roleCdList.add("ROLE_GENERAL");
		
		UserDto dto = new UserDto(entity,roleCdList);
		
		assertEquals(dto.getUserType(), "1");
		assertEquals(dto.getUserId(), entity.getStaffUserId());
		assertEquals(dto.getPassword(), entity.getPassword());
		assertEquals(dto.getNameKana(), entity.getNameKana());
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getBirthday(), null);
		assertEquals(dto.getPhoneNumber(), null);
		assertEquals(dto.getAddress(), null);
		assertEquals(dto.getEmail(), entity.getEmail());
		assertEquals(dto.getRoleCdList(), roleCdList);
	}

	@Test
	void UserDtoWithGeneralUser() {
		GeneralUser entity = new GeneralUser();
		List<String> roleCdList = new ArrayList<>();
	
		 LocalDate birthday = LocalDate.of(2015, 01, 01);
		entity.setGeneralUserId("1234567890");
		entity.setPassword("password");
		entity.setNameKana("てすと");
		entity.setName("テスト");
		entity.setBirthday(birthday);
		entity.setPhoneNumber("08000000000");
		entity.setAddress("東京都");
		roleCdList.add("ROLE_ADMIN");
		roleCdList.add("ROLE_STAFF");
		roleCdList.add("ROLE_GENERAL");
		
		UserDto dto = new UserDto(entity,roleCdList);
		
		assertEquals(dto.getUserType(), "2");
		assertEquals(dto.getUserId(), entity.getGeneralUserId());
		assertEquals(dto.getPassword(), entity.getPassword());
		assertEquals(dto.getNameKana(), entity.getNameKana());
		assertEquals(dto.getName(), entity.getName());
		assertEquals(dto.getBirthday(), entity.getBirthday());
		assertEquals(dto.getPhoneNumber(), entity.getPhoneNumber());
		assertEquals(dto.getAddress(), entity.getAddress());
		assertEquals(dto.getEmail(), null);
		assertEquals(dto.getRoleCdList(), roleCdList);
	}

}

