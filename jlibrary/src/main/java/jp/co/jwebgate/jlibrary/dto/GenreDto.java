package jp.co.jwebgate.jlibrary.dto;

import java.util.List;

import jp.co.jwebgate.jlibrary.dbflute.exentity.Genre;
import lombok.Data;

/**
 * ジャンルデータ
 * @author j_user
 */
@Data
public class GenreDto {
	
	/**
     * ID
     */
	private Integer id;
	
	/**
     * ジャンル名
     */
	private String genreName;
	
	/**
     * ジャンルコード
     */
	private String genreCode;
	
	/**
     * 子リスト
     */
	private List<GenreDto> childrenGenreDtoList;
	
	/**
     * GenreDtoメソッド
     * ジャンル情報の取得
     */
	public GenreDto(Genre genre) {
		this.id = genre.getId();
		this.genreName = genre.getGenreName();
		this.genreCode = genre.getGenreCode();
	}
	
}
