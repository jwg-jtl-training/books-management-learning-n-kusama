package jp.co.jwebgate.jlibrary.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.jwebgate.jlibrary.dbflute.exentity.Genre;
import jp.co.jwebgate.jlibrary.dto.GenreDto;
import jp.co.jwebgate.jlibrary.form.RegisterBookForm;
import jp.co.jwebgate.jlibrary.repository.BookRepository;
import jp.co.jwebgate.jlibrary.repository.GenreRepository;

/**
 * GeneralUserListServiceクラスのテスト
 * 
 */
@SpringBootTest
class RegisterBookServiceTest {

	@InjectMocks
	RegisterBookService registerBookService;

	@Mock
	BookRepository mockBookRepository;

	@Mock
	GenreRepository mockGenreRepository;

	/**
	 * registBookメソッドのテスト
	 * 
	 */
	@Test
	void registBook() {

		RegisterBookForm form = new RegisterBookForm();

		form.setTitle("タイトル");
		form.setAuthor("著者");
		form.setPublisher("出版社");
		form.setIsbn10("1234567890");
		form.setIsbn13("1234567890123");
		form.setGenreId(01);
		form.setShelfNumber("001");
		form.setControlNumber("001");

		registerBookService.registBook(form);

		verify(mockBookRepository, times(1)).insertBook(any());
	}

	/**
	 * getGenreDtoListメソッドのテスト
	 * 
	 */

	//親ジャンルの場合
	@Test
	void getGenreDtoListWithGenre() {
		Genre genre = new Genre();
		genre.setGenreCode("100");
		List<Genre> testList = new ArrayList<Genre>();
		testList.add(genre);

		Mockito.doReturn(testList).when(mockGenreRepository).selectGenreList();

		List<Genre> genreList = mockGenreRepository.selectGenreList();
		List<GenreDto> genreDtoList = new ArrayList<GenreDto>();

		GenreDto dto = new GenreDto(genreList.get(0));

		dto.setChildrenGenreDtoList(new ArrayList<GenreDto>());
		genreDtoList.add(dto);

		int expected = genreDtoList.size();
		int actual = registerBookService.getGenreDtoList().size();

		assertEquals(expected, actual);
	}

	//子ジャンルの場合
	@Test
	void getGenreDtoListWithChildrenGenre() {
		Genre genre = new Genre();
		genre.setGenreCode("100");
		Genre childrenGenre = new Genre();
		childrenGenre.setGenreCode("001");
		List<Genre> testList = new ArrayList<Genre>();
		testList.add(genre);
		testList.add(childrenGenre);

		Mockito.doReturn(testList).when(mockGenreRepository).selectGenreList();

		List<Genre> genreList = mockGenreRepository.selectGenreList();
		List<GenreDto> genreDtoList = new ArrayList<GenreDto>();

		GenreDto dto = new GenreDto(genreList.get(0));

		dto.setChildrenGenreDtoList(new ArrayList<GenreDto>());
		genreDtoList.add(dto);

		int parentSize = genreDtoList.size();

		genreDtoList.get(parentSize - 1).getChildrenGenreDtoList().add(new GenreDto(genreList.get(1)));

		List<GenreDto> expected = genreDtoList;
		List<GenreDto> actual = registerBookService.getGenreDtoList();

		assertEquals(expected, actual);
	}

	/**
	 * generateControlNumberメソッドのテスト
	 * 
	 */
	@Test
	void generateControlNumber() {

		Mockito.doReturn("0000000000").when(mockBookRepository).selectMaxControlNumber();

		String maxControlNumber = mockBookRepository.selectMaxControlNumber();
		int maxControlNumberInt = Integer.parseInt(maxControlNumber);

		String expected = String.format("%010d", maxControlNumberInt + 1);
		String actual = registerBookService.generateControlNumber();

		assertEquals(expected, actual);
	}

}
