package jp.co.jwebgate.jlibrary.dto;

import jp.co.jwebgate.jlibrary.dbflute.exentity.Book;
import lombok.Data;

/**
 * 図書データ
 * @author j_user
 */
@Data
public class BookDto {

	/**
     * タイトル
     */
	private String title;

	/**
     * 著者
     */
	private String author;

	/**
     * 出版社
     */
	private String publisher;

	/**
     * ISBN
     */
	private String isbn;

	/**
     * ジャンルID
     */
	private Integer genreId;

	/**
     * 棚番号
     */
	private String shelfNumber;

	/**
     * ジャンルデータ
     */
	private GenreDto genreDto;


	/**
     * BookDtoメソッド
     * 図書の情報取得
     */
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
