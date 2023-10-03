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
public class RegisterStaffUserController extends BaseController {

	@Autowired
	private RegisterStaffUserService registerStaffUserService;
	
	private final String VIEW = "registerStaff";
	
	/**
	 * 職員登録画面
	 * @return
	 */
	@GetMapping()
	public ModelAndView show() {
		
		ModelAndView mav = new ModelAndView(VIEW);
		mav.addObject("form"
				, new RegisterStaffUserForm(registerStaffUserService.getNewStaffUserId()));
		return mav;
	}
	
	/**
	 * 登録
	 * @param form
	 * @param bindingResult
	 * @return
	 */
	@PostMapping()
	public ModelAndView regist(@Valid @ModelAttribute("form") RegisterStaffUserForm form, BindingResult bindingResult) {
		
		ModelAndView mav = new ModelAndView();
		
		if(bindingResult.hasErrors()) {
			mav.addObject("failureMsgs", this.getFieldErrorMsgList(bindingResult));
			mav.setViewName(VIEW);
			return mav;
		}
		
		registerStaffUserService.registerStaffUser(form);
		mav.setViewName(UrlConsts.REDIRECT + UrlConsts.STAFF_USER_LIST);
		return mav;
		
	}	
}



