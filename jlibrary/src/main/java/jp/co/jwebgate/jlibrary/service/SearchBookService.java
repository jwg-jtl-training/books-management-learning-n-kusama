package jp.co.jwebgate.jlibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jwebgate.jlibrary.dbflute.exentity.Book;
import jp.co.jwebgate.jlibrary.dto.BookDto;
import jp.co.jwebgate.jlibrary.form.SearchBookForm;
import jp.co.jwebgate.jlibrary.repository.BookRepository;

@Service
public class SearchBookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<BookDto> searchBook(SearchBookForm form) {
		List<Book> bookList = bookRepository.selectBookByTitle(form.getTitle());
		return bookList.stream().map(e->new BookDto(e)).toList();
	}
}
