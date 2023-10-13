package jp.co.jwebgate.jlibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.co.jwebgate.jlibrary.consts.UrlConsts;


/**
 * ログイン画面
 * @author j_user
 *
 */
@Controller
@RequestMapping(UrlConsts.LOGIN)
public class LoginController {
	
	private final String VIEW = "login";
	
	/**
	 * 初期表示
	 * @return
	 */
	@GetMapping()
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView(VIEW);
		return mav;
	}
	
}
