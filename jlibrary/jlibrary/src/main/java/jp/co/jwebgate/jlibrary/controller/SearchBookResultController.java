package jp.co.jwebgate.jlibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(UrlConsts.SEARCH_BOOK_RESULT)
public class SearchBookResultController {
	
	private final String VIEW = "searchBookResult";

	@Autowired
	private SearchBookService searchBookService;
	
	@GetMapping()
	public ModelAndView show(@ModelAttribute("form") SearchBookForm form
			, @ModelAttribute("result") List<BookDto> bookDtoList) {
		ModelAndView mav = new ModelAndView(VIEW);
		
		mav.addObject("result", bookDtoList);
		mav.addObject("form", form);
		
		return mav;
	}
	
	@PostMapping("/search")
	public ModelAndView search(@ModelAttribute("form") SearchBookForm form) {
		List<BookDto> bookDtoList = searchBookService.searchBook(form);
		ModelAndView mav = new ModelAndView(VIEW);
		mav.addObject("result", bookDtoList);
		mav.addObject("form", form);
		return mav;
	}
}
