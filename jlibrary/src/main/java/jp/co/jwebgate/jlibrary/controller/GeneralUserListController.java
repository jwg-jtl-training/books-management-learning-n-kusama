package jp.co.jwebgate.jlibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.co.jwebgate.jlibrary.consts.UrlConsts;
import jp.co.jwebgate.jlibrary.service.GeneralUserListService;

@Controller
@RequestMapping(UrlConsts.GENERAL_USER_LIST)
public class GeneralUserListController {

	@Autowired
	private GeneralUserListService generalUserListService;
	
	private final String VIEW = "generalUserList";
	
	@GetMapping()
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView(VIEW);
		mav.addObject("result", generalUserListService.getGeneralUserDtoList());
		return mav;
	}
}
