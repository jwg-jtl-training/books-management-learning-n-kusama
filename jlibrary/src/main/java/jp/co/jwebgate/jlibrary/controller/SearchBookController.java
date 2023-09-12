package jp.co.jwebgate.jlibrary.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.co.jwebgate.jlibrary.consts.UrlConsts;
import jp.co.jwebgate.jlibrary.dto.BookDto;
import jp.co.jwebgate.jlibrary.form.SearchBookForm;
import jp.co.jwebgate.jlibrary.service.SearchBookService;

@Controller
@RequestMapping(UrlConsts.SEARCH_BOOK)
public class SearchBookController {

	@Autowired
	private SearchBookService searchBookService;
	
	@Autowired
	private MessageSource messageSource;
	
	private final String VIEW = "searchBook";
	private final String VIEW2 = "searchBookResult";
	
	@GetMapping()
	public ModelAndView show() {
		
		ModelAndView mav = new ModelAndView(VIEW);
		
		mav.addObject("form", new SearchBookForm());
		mav.addObject("message", messageSource.getMessage("hello.welcome", new String[] {}, Locale.getDefault()));
		return mav;
	}
	
	@PostMapping("/search")
	public ModelAndView search(@ModelAttribute("form") SearchBookForm form) {
		List<BookDto> bookDtoList = searchBookService.searchBook(form);
		ModelAndView mav = new ModelAndView(VIEW2);
		mav.addObject("result", bookDtoList);
		mav.addObject("form", form);
		return mav;
	}
}
