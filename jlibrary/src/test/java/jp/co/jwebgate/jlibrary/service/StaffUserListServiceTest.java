package jp.co.jwebgate.jlibrary.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import jp.co.jwebgate.jlibrary.dto.StaffUserDto;
import jp.co.jwebgate.jlibrary.repository.UserRepository;

/**
 * StaffUserListServiceクラスのテスト
 */
@SpringBootTest
class StaffUserListServiceTest {
	
	@InjectMocks
	StaffUserListService service;
	
	@Mock
	UserRepository userRepository;

	@Mock
	StaffUser user;
	
	/**
	 * getStaffUserDtoListメソッドのテスト
	 */
	@Test
	void test1() {
		
		List<StaffUser> list = Arrays.asList(user);
		Mockito.doReturn(list).when(userRepository).selectStaffUserAll();
		List<StaffUserDto> actual = userRepository.selectStaffUserAll().stream().map(e -> new StaffUserDto(e)).toList();
		
		assertEquals(service.getStaffUserDtoList(), actual);

	}
}
