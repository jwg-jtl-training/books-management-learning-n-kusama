package jp.co.jwebgate.jlibrary.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.jwebgate.jlibrary.dbflute.exbhv.GenreBhv;
import jp.co.jwebgate.jlibrary.dbflute.exentity.Genre;

/**
 * ジャンルリポジトリ
 * 
 * @author j_user 
 */
@Repository
public class GenreRepository {
	
	@Autowired
	private GenreBhv genrebhv;

	/**
     * ジャンルリストの取得
     *
     * @return ジャンルリスト
     */
	public List<Genre> selectGenreList() {
		
		List<Genre> genreList = genrebhv.selectList(cb->{
			cb.query().addOrderBy_GenreCode_Asc();
		}).getSelectedList();
		
		return genreList;
	}
}
