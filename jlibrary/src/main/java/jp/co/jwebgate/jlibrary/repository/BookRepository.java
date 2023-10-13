package jp.co.jwebgate.jlibrary.repository;

import java.util.List;

import org.dbflute.optional.OptionalScalar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.util.StringUtils;

import jp.co.jwebgate.jlibrary.dbflute.exbhv.BookBhv;
import jp.co.jwebgate.jlibrary.dbflute.exentity.Book;

@Repository
public class BookRepository {
	
	@Autowired
	private BookBhv bookBhv;
	
	public List<Book> selectBookByTitle(String title){
		return bookBhv.selectList(cb->{
			if(!StringUtils.isNullOrEmpty(title )) {
				cb.orScopeQuery(orCB -> {
				orCB.query().setTitle_LikeSearch(title, op -> op.likeContain());
				orCB.query().setAuthor_LikeSearch(title, op -> op.likeContain());
			});}
			cb.setupSelect_Genre();
		}).getSelectedList();
	}
	
	public void insertBook(Book book) {
		bookBhv.insert(book);
	}
	
	public String selectMaxControlNumber() {
		OptionalScalar<String> optSclr = bookBhv.selectScalar(String.class).max(cb->{
			cb.specify().columnControlNumber();
		});
		if(optSclr.isPresent()) {
			return optSclr.get();
		}else {
			return "0000000000";
		}
	}
}
