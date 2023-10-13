package jp.co.jwebgate.jlibrary.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jwebgate.jlibrary.dbflute.exentity.Book;
import jp.co.jwebgate.jlibrary.dbflute.exentity.Genre;
import jp.co.jwebgate.jlibrary.dto.GenreDto;
import jp.co.jwebgate.jlibrary.form.RegisterBookForm;
import jp.co.jwebgate.jlibrary.repository.BookRepository;
import jp.co.jwebgate.jlibrary.repository.GenreRepository;

/**
 * 図書登録画面
 * @author j_user
 *
 */
@Service
public class RegisterBookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private GenreRepository genreRepository;
	
	private final String PARENT_GENRE_CODE_MARKER = "0";
	
	/**
	 * 図書登録
	 * @param form
	 */
	public void registBook(RegisterBookForm form) {
		
		Book book = new Book();
		
		book.setTitle(form.getTitle());
		book.setAuthor(form.getAuthor());
		book.setPublisher(form.getPublisher());
		book.setIsbn10(form.getIsbn10());
		book.setIsbn13(form.getIsbn13());
		book.setGenreId(form.getGenreId());
		book.setShelfNumber(form.getShelfNumber());
		book.setControlNumber(form.getControlNumber());
		
		bookRepository.insertBook(book);
	}
	
	/**
	 * ジャンルのDTOリストを取得
	 * @return
	 */
	public List<GenreDto> getGenreDtoList(){
		
		List<Genre> genreList = genreRepository.selectGenreList();
		
		List<GenreDto> genreDtoList = new ArrayList<GenreDto>();
		
		for(int index = 0 ; index < genreList.size() ; index++) {
			
			int parentSize = genreDtoList.size();
			GenreDto dto = new GenreDto(genreList.get(index));
			// 親判定
			if(genreList.get(index).getGenreCode().endsWith(PARENT_GENRE_CODE_MARKER)) {
				// 親の場合
				// 子のListのインスタス生成
				dto.setChildrenGenreDtoList(new ArrayList<GenreDto>());
				genreDtoList.add(dto);
			}else {
				genreDtoList.get(parentSize - 1).getChildrenGenreDtoList().add(new GenreDto(genreList.get(index)));
			}
		}
		
		return genreDtoList;
	}
	
	/**
	 * 管理番号の生成
	 * @return
	 */
	public String generateControlNumber() {
		String maxControlNumber = bookRepository.selectMaxControlNumber();
		int maxControlNumberInt = Integer.parseInt(maxControlNumber);
		return String.format("%010d",maxControlNumberInt + 1);
	}
}
