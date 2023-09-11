package jp.co.jwebgate.jlibrary.dto;

import java.util.List;

import jp.co.jwebgate.jlibrary.dbflute.exentity.Genre;
import lombok.Data;

@Data
public class GenreDto {

	private Integer id;
	
	private String genreName;
	
	private String genreCode;
	
	private List<GenreDto> childrenGenreDtoList;
	
	public GenreDto(Genre genre) {
		this.id = genre.getId();
		this.genreName = genre.getGenreName();
		this.genreCode = genre.getGenreCode();
	}
	
}
