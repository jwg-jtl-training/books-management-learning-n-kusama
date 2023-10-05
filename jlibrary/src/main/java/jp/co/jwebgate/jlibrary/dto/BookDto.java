package jp.co.jwebgate.jlibrary.dto;

import jp.co.jwebgate.jlibrary.dbflute.exentity.Book;
import lombok.Data;

@Data
public class BookDto {

	private String title;

	private String author;

	private String publisher;

	private String isbn;

	private Integer genreId;

	private String shelfNumber;

	private GenreDto genreDto;

	public BookDto(Book book) {
		this.title = book.getTitle();
		this.author = book.getAuthor();
		this.publisher = book.getPublisher();
		this.isbn = book.getIsbn10() != null ? book.getIsbn10() : book.getIsbn13();
		this.genreId = book.getGenreId();
		this.shelfNumber = book.getShelfNumber();
		this.genreDto = new GenreDto(book.getGenre().get());
	}
}
