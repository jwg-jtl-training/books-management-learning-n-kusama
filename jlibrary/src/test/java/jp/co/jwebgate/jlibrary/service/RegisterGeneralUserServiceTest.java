package jp.co.jwebgate.jlibrary.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.UserRoleMap;
import jp.co.jwebgate.jlibrary.enums.EnumRoles;
import jp.co.jwebgate.jlibrary.form.RegisterGeneralUserForm;
import jp.co.jwebgate.jlibrary.repository.UserRepository;
import jp.co.jwebgate.jlibrary.util.LocalDateUtil;

/**
 * RegisterGeneralUserServiceクラスのテスト
 */
/**
 * 
 */
/**
 * 
 */
@SpringBootTest
public class RegisterGeneralUserServiceTest {
	
	@InjectMocks
	RegisterGeneralUserService service;
	
	@Mock
	UserRepository userRepository;
	
	@Mock
	PasswordEncoder passwordEncoder;
	
	/**
	 * registerGeneralUserメソッドのテスト
	 */
	@Test
	void test1(){

		RegisterGeneralUserForm form = new RegisterGeneralUserForm();
		form.setGeneralUserId("1");
		form.setName("Name");
		form.setNameKana("NameKana");
		form.setBirthday("2000-01-01");
		form.setPhoneNumber("00000000000");
		form.setAddress("Address");
		
		doReturn("sdfghjsdfgbvd").when(passwordEncoder).encode("unavailable");

		GeneralUser generalUser = new GeneralUser();
		generalUser.setGeneralUserId(form.getGeneralUserId());
		generalUser.setPassword(passwordEncoder.encode("unavailable"));
		generalUser.setName(form.getName());
		generalUser.setNameKana(form.getNameKana());
		generalUser.setBirthday(LocalDateUtil.convert01StringToLocalDate(form.getBirthday()));
		generalUser.setPhoneNumber(form.getPhoneNumber());
		generalUser.setAddress(form.getAddress());
		
		UserRoleMap userRoleMap = new UserRoleMap();
		userRoleMap.setGeneralUserId(generalUser.getGeneralUserId());
		userRoleMap.setRoleId(EnumRoles.GENERAL.getId());
		
		Mockito.doNothing().when(userRepository).insertGeneralUser(generalUser);
		Mockito.doNothing().when(userRepository).insertUserRoleMap(userRoleMap);
	
		service.registerGeneralUser(form);
		verify(userRepository,times(1)).insertGeneralUser(generalUser);
		verify(userRepository,times(1)).insertUserRoleMap(userRoleMap);
	}
	
	/**
	 * getNewGeneralUserIdメソッドのテスト
	 */
	@Test
	void test2() {
		doReturn("1").when(userRepository).getNewGeneralUserId();
		assertEquals("1",service.getNewGeneralUserId());
	}
}
