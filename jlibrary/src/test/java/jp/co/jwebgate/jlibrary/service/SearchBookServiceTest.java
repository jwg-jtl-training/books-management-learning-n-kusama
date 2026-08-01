package jp.co.jwebgate.jlibrary.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.dbflute.optional.OptionalEntity;
import org.dbflute.optional.OptionalThingExceptionThrower;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.jwebgate.jlibrary.dbflute.exentity.Book;
import jp.co.jwebgate.jlibrary.dbflute.exentity.Genre;
import jp.co.jwebgate.jlibrary.dto.BookDto;
import jp.co.jwebgate.jlibrary.form.SearchBookForm;
import jp.co.jwebgate.jlibrary.repository.BookRepository;

/**
 * SearchBookServiceクラスのテスト
 */

@SpringBootTest
public class SearchBookServiceTest {
	
	@InjectMocks
	SearchBookService service;
	
	@Mock
	BookRepository bookRepository;
	
	@Mock
	OptionalThingExceptionThrower thrower;
	
	/**
	 * searchBookメソッドのテスト
	 */
	@Test
	void test1() {
		
		SearchBookForm form = new SearchBookForm();
		form.setKeyword("title");

		Book book = new Book();
		book.setTitle("title");
		book.setAuthor("author");
		book.setPublisher("publisher");
		book.setIsbn10("isbn10");
		book.setGenreId(1);
		Genre genre = new Genre();
		
		OptionalEntity<Genre> opt = new OptionalEntity<Genre>(genre, thrower);
		book.setGenre(opt);

		
		List<Book> bookList = Arrays.asList(book);
		Mockito.doReturn(bookList).when(bookRepository).selectBookByTitleOrAuthor(any());
		
		List<Book> testBook = bookRepository.selectBookByTitleOrAuthor(form.getKeyword());
		
		List<BookDto> expect = service.searchBook(form);
		List<BookDto> actual = testBook.stream().map(e->new BookDto(e)).toList();

		assertEquals(expect,actual);
	}

}
