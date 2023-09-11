package jp.co.jwebgate.jlibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jp.co.jwebgate.jlibrary.consts.UrlConsts;
import jp.co.jwebgate.jlibrary.dto.GenreDto;
import jp.co.jwebgate.jlibrary.form.RegisterBookForm;
import jp.co.jwebgate.jlibrary.service.RegisterBookService;

@Controller
@RequestMapping(UrlConsts.REGISTER_BOOK)
public class RegisterBookController {

	@Autowired
	private RegisterBookService registerBookService;
	
	private final String VIEW = "registerBook";
	
	@GetMapping()
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView(VIEW);
		mav.addObject("form", new RegisterBookForm());
		return mav;
	}
	
	@PostMapping()
	public ModelAndView regist(@ModelAttribute("form") RegisterBookForm form) {
		
		registerBookService.registBook(form);
		
		return new ModelAndView(UrlConsts.REDIRECT + UrlConsts.SEARCH_BOOK);
	}
	
	@GetMapping("/generate")
	@ResponseBody
	public String generateControlNumber() {
		return registerBookService.generateControlNumber();
	}
	
	@ModelAttribute("genreDtoList")
	public List<GenreDto> getGenreList(){
		return registerBookService.getGenreDtoList();
	}
	
}
