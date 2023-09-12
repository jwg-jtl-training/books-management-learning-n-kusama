package jp.co.jwebgate.jlibrary.form;

import lombok.Data;

@Data
public class RegisterBookForm {

	private String title;
	
	private String author;
	
	private String publisher;
	
	private String isbn10;
	
	private String isbn13;
	
	private Integer genreId;

	private String shelfNumber;
	
	private String controlNumber;
	
}