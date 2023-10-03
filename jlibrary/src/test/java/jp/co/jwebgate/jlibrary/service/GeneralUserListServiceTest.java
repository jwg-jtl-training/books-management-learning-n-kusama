package jp.co.jwebgate.jlibrary.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.dto.GeneralUserDto;
import jp.co.jwebgate.jlibrary.repository.UserRepository;

/**
 * GeneralUserListServiceクラスのテスト
 * 
 */
@SpringBootTest
class GeneralUserListServiceTest {

	@InjectMocks
	GeneralUserListService generalUserListService;

	@Mock
	UserRepository mockUserRepository;

	@Mock
	GeneralUserDto mockGeneralUserDto;

	@Mock
	GeneralUser mockGeneralUser;

	/**
	 * getGeneralUserDtoListメソッドのテスト
	 * 
	 */
	@Test
	void getGeneralUserDtoList() {
		
		List<GeneralUser> testGeneralUserDtoList = Arrays.asList(mockGeneralUser);
		Mockito.doReturn(testGeneralUserDtoList).when(mockUserRepository).selectGeneralUserAll();

		List<GeneralUser> test = mockUserRepository.selectGeneralUserAll();
		
		List<GeneralUserDto> expect = test.stream().map(e -> new GeneralUserDto(e)).toList();
		List<GeneralUserDto> actual = generalUserListService.getGeneralUserDtoList();

		assertEquals(expect.size(), actual.size());
	}
}