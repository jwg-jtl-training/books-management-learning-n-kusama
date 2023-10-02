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
import jp.co.jwebgate.jlibrary.form.RegisterGeneralUserForm;
import jp.co.jwebgate.jlibrary.service.RegisterGeneralUserService;

/**
 * 利用者登録画面
 * @author j_user
 *
 */
@Controller
@RequestMapping(UrlConsts.REGISTER_GENERAL_USER)
public class RegisterGeneralUserController extends BaseController {

	@Autowired
	private RegisterGeneralUserService registerGeneralUserService;
	
	private final String VIEW = "registerGeneral";
	
	/**
	 * 初期表示
	 * @return ModelAndView
	 */
	@GetMapping()
	public ModelAndView show() {
		
		ModelAndView mav = new ModelAndView(VIEW);
		mav.addObject("form"
				, new RegisterGeneralUserForm(registerGeneralUserService.getNewGeneralUserId()));
		return mav;
	}
	
	/**
	 * 登録
	 * @param form
	 * @param bindingResult
	 * @return　ModelAndView
	 */
	@PostMapping("/regist")
	public ModelAndView regist(@Valid @ModelAttribute("form") RegisterGeneralUserForm form, BindingResult bindingResult) {
		
		ModelAndView mav = new ModelAndView();
		
		if(bindingResult.hasErrors()) {
			mav.addObject("failureMsgs", this.getFieldErrorMsgList(bindingResult));
			mav.setViewName(VIEW);
			return mav;
		}
		
		registerGeneralUserService.registerGeneralUser(form);
		
		mav.setViewName(UrlConsts.REDIRECT + UrlConsts.GENERAL_USER_LIST);
		
		return mav;
	}
}
