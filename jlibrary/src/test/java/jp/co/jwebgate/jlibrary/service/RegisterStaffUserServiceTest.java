package jp.co.jwebgate.jlibrary.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.UserRoleMap;
import jp.co.jwebgate.jlibrary.enums.EnumRoles;
import jp.co.jwebgate.jlibrary.form.RegisterStaffUserForm;
import jp.co.jwebgate.jlibrary.repository.UserRepository;


/**
 * RegisterStaffUserServiceクラスのテスト
 */
@SpringBootTest
class RegisterStaffUserServiceTest {

	@InjectMocks
	RegisterStaffUserService service;

	@Mock
	UserRepository userRepository;

	@Mock
	PasswordEncoder passwordEncoder;

	/**
	 * registerStaffUserメソッドのテスト
	 */
	@Test
	void test1() {

		RegisterStaffUserForm form = new RegisterStaffUserForm();
		form.setStaffUserId("1");
		form.setPassword("12345678");
		form.setConfirmPassword("12345678");
		form.setName("Name");
		form.setNameKana("NameKana");
		form.setEmail("Email");

		Mockito.doReturn("aoijfda89ue98au394iorjwefk").when(passwordEncoder).encode(form.getPassword());

		StaffUser staffUser = new StaffUser();
		staffUser.setStaffUserId(form.getStaffUserId());
		staffUser.setPassword(passwordEncoder.encode(form.getPassword()));
		staffUser.setName(form.getName());
		staffUser.setNameKana(form.getNameKana());
		staffUser.setEmail(form.getEmail());

		Mockito.doNothing().when(userRepository).insertStaffUser(any());

		UserRoleMap userRoleMap = new UserRoleMap();
		userRoleMap.setStaffUserId(staffUser.getStaffUserId());
		userRoleMap.setRoleId(EnumRoles.STAFF.getId());

		Mockito.doNothing().when(userRepository).insertUserRoleMap(any());

		service.registerStaffUser(form);
		verify(userRepository, times(1)).insertStaffUser(staffUser);
		verify(userRepository, times(1)).insertUserRoleMap(userRoleMap);
	}

	/**
	 * getNewStaffUserIdメソッドのテスト
	 */
	@Test
	void test2() {

		Mockito.doReturn("1").when(userRepository).getNewStaffUserId();
		assertEquals("1", service.getNewStaffUserId());
	}
}
