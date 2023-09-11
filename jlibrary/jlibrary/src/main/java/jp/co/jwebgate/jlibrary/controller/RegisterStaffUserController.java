package jp.co.jwebgate.jlibrary.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.co.jwebgate.jlibrary.consts.UrlConsts;
import jp.co.jwebgate.jlibrary.form.RegisterStaffUserForm;
import jp.co.jwebgate.jlibrary.service.RegisterStaffUserService;

@Controller
@RequestMapping(UrlConsts.REGISTER_STAFF_USER)
public class RegisterStaffUserController {

	@Autowired
	private RegisterStaffUserService registerStaffUserService;
	
	private final String VIEW = "registerStaff";
	
	@GetMapping()
	public ModelAndView show() {
		
		ModelAndView mav = new ModelAndView(VIEW);
		mav.addObject("form"
				, new RegisterStaffUserForm(registerStaffUserService.getNewStaffUserId()));
		return mav;
	}
	
	@PostMapping()
	public ModelAndView regist(@Valid @ModelAttribute("form") RegisterStaffUserForm form, BindingResult bindingResult) {
		
		ModelAndView mav = new ModelAndView();
		
		if(bindingResult.hasErrors()) {
			mav.setViewName(VIEW);
		}
		
		registerStaffUserService.registerStaffUser(form);
		
		mav.setViewName(UrlConsts.REDIRECT + UrlConsts.LOGIN);
		
		return mav;
	}
}

