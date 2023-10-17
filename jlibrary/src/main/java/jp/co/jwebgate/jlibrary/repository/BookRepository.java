package jp.co.jwebgate.jlibrary.repository;

import java.util.List;

import org.dbflute.optional.OptionalScalar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.util.StringUtils;

import jp.co.jwebgate.jlibrary.dbflute.exbhv.BookBhv;
import jp.co.jwebgate.jlibrary.dbflute.exentity.Book;

/**
 * 図書リポジトリ
 * 
 * @author j_user 
 */
@Repository
public class BookRepository {

	@Autowired
	private BookBhv bookBhv;

	/**
	 * タイトルから図書情報リストの取得
	 *
	 * @param title タイトル
	 * @return 図書情報リスト
	 */
	public List<Book> selectBookByTitle(String title) {
		return bookBhv.selectList(cb -> {
			if (!StringUtils.isNullOrEmpty(title)) {
				cb.query().setTitle_LikeSearch(title, op -> op.likeContain());
			}
			cb.setupSelect_Genre();
		}).getSelectedList();
	}

	/**
	 * 図書情報の挿入
	 *
	 * @param book 図書情報
	 */
	public void insertBook(Book book) {
		bookBhv.insert(book);
	}

	/**
	 * 管理番号の最大値の取得
	 *
	 * @return 管理番号の最大値
	 */
	public String selectMaxControlNumber() {
		OptionalScalar<String> optSclr = bookBhv.selectScalar(String.class).max(cb -> {
			cb.specify().columnControlNumber();
		});
		if (optSclr.isPresent()) {
			return optSclr.get();
		} else {
			return "0000000000";
		}
	}
}
