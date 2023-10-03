package jp.co.jwebgate.jlibrary.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

import org.dbflute.optional.OptionalEntity;
import org.dbflute.optional.OptionalThingExceptionThrower;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import jp.co.jwebgate.jlibrary.details.LoginUserDetails;
import jp.co.jwebgate.jlibrary.repository.UserRepository;

/**
 * LoginUserDetailsServiceクラスのテスト
 * 
 */
@SpringBootTest
class LoginUserDetailsServiceTest {

	@InjectMocks
	LoginUserDetailsService loginUserDetailsService;

	@Mock
	OptionalThingExceptionThrower thrower;

	@Mock
	UserRepository mockUserRepository;

	@Mock
	StaffUser mockStaffUser;

	@Mock
	GeneralUser mockGeneralUser;

	/**
	 * loadUserByUsernameメソッドのテスト
	 * 
	 */
	
	//UserIdがGから始まる(一般利用者ID)場合、エラーを投げる
	@Test
	void loadUserByUsernameWithUserIdStartG() {
		String userId = "G1234512345";
		assertThrows(UsernameNotFoundException.class, () -> loginUserDetailsService.loadUserByUsername(userId));
	}
	
	//UserIdがnullの場合、エラーを投げる
	@Test
	void loadUserByUsernameWithoutUserId() {
		String userId = null;
		assertThrows(UsernameNotFoundException.class, () -> loginUserDetailsService.loadUserByUsername(userId));
	}

	//staffUserOptが存在する場合、ログインユーザーの詳細を返す
	@Test
	void loadUserByUsernameWithStaffUserId() {
		String staffUserId = "S1234512345";

		OptionalEntity<StaffUser> staffUser = OptionalEntity.of(mockStaffUser);

		Mockito.doReturn(staffUser).when(mockUserRepository).selectStaffUserRole(any());
		OptionalEntity<StaffUser> staffUserOpt = mockUserRepository.selectStaffUserRole(staffUserId);

		assertEquals(staffUserOpt, staffUser);

		UserDetails expected = new LoginUserDetails(staffUserOpt.get(),
				mockUserRepository.selectRoleCdList(staffUserId));

		UserDetails actual = loginUserDetailsService.loadUserByUsername(staffUserId);

		assertEquals(expected.getUsername(), actual.getUsername());
	}
}
