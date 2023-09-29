package jp.co.jwebgate.jlibrary.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.dbflute.optional.OptionalEntity;
import org.dbflute.optional.OptionalThingExceptionThrower;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.jwebgate.jlibrary.dbflute.exentity.Book;
import jp.co.jwebgate.jlibrary.dbflute.exentity.Genre;


/**
 * BookDtoクラスのテスト
 */
@SpringBootTest
class BookDtoTest {

	@Mock
	OptionalThingExceptionThrower thrower;
	
	
	/**
	 * BookDtoメソッドのテスト
	 * ISBN10がnullでない場合、Isbn10の値を取得
	 */
	@Test
	void test1() {
		
		Book book = new Book();
		book.setTitle("title");
		book.setAuthor("author");
		book.setPublisher("publisher");
		book.setIsbn10("isbn10");
		book.setGenreId(1);
		Genre genre = new Genre();
		
		OptionalEntity<Genre> opt = new OptionalEntity<Genre>(genre, thrower);
		book.setGenre(opt);
		
		BookDto dto = new BookDto(book);
		
		
		assertEquals(dto.getTitle(), book.getTitle());
		assertEquals(dto.getAuthor(), book.getAuthor());
		assertEquals(dto.getPublisher(), book.getPublisher());
		assertEquals(dto.getIsbn(), book.getIsbn10());
		assertEquals(dto.getGenreId(), book.getGenreId());	
	}
	
	/**
	 * BookDtoメソッドのテスト
	 * ISBN10がnullの場合、Isbn13の値を取得
	 */
	@Test
	void test2(){
		
		Book book = new Book();
		book.setTitle("title");
		book.setAuthor("author");
		book.setPublisher("publisher");
		book.setIsbn10(null);
		book.setGenreId(1);
		Genre genre = new Genre();
		
		OptionalEntity<Genre> opt = new OptionalEntity<Genre>(genre, thrower);
		book.setGenre(opt);
		
		BookDto dto = new BookDto(book);
		
		assertEquals(dto.getTitle(), book.getTitle());
		assertEquals(dto.getAuthor(), book.getAuthor());
		assertEquals(dto.getPublisher(), book.getPublisher());
		assertEquals(dto.getIsbn(), book.getIsbn13());
		assertEquals(dto.getGenreId(), book.getGenreId());	
	}
}
