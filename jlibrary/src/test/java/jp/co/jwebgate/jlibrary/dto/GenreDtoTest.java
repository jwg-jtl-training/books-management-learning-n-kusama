package jp.co.jwebgate.jlibrary.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.jwebgate.jlibrary.dbflute.exentity.Genre;

/**
 * GenreDtoクラスのテスト
 */
@SpringBootTest
class GenreDtoTest {

	/**
	 * GenreDtoメソッドのテスト
	 */
	@Test
	void test1() {

		Genre genre = new Genre();

		genre.setId(1);
		genre.setGenreName("Name");
		genre.setGenreCode("111");

		GenreDto dto = new GenreDto(genre);

		assertEquals(dto.getId(), genre.getId());
		assertEquals(dto.getGenreName(), genre.getGenreName());
		assertEquals(dto.getGenreCode(), genre.getGenreCode());
	}
}
