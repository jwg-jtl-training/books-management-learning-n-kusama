package jp.co.jwebgate.jlibrary.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
public class RegisterBookController extends BaseController{

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
	public ModelAndView regist(@Valid @ModelAttribute("form") RegisterBookForm form, BindingResult bindingResult) {
		
		ModelAndView mav = new ModelAndView();
		
		if(bindingResult.hasErrors()) {
			mav.addObject("failureMsgs", this.getFieldErrorMsgList(bindingResult));
			mav.setViewName(VIEW);
			return mav;
		}
		
		registerBookService.registBook(form);
		mav.setViewName(UrlConsts.REDIRECT + UrlConsts.SEARCH_BOOK);
		return mav;
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
