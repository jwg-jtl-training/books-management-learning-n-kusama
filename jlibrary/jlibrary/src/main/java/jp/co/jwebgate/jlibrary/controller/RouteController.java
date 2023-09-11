package jp.co.jwebgate.jlibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.co.jwebgate.jlibrary.consts.UrlConsts;

@Controller
@RequestMapping(UrlConsts.ROOT)
public class RouteController {

	@GetMapping()
	public ModelAndView redirect() {
		return new ModelAndView(UrlConsts.REDIRECT + UrlConsts.SEARCH_BOOK);
	}
}
