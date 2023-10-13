package jp.co.jwebgate.jlibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jp.co.jwebgate.jlibrary.consts.UrlConsts;
import jp.co.jwebgate.jlibrary.service.StaffUserListService;

/**
 * 職員一覧画面
 * @author j_user
 *
 */
@Controller
@RequestMapping(UrlConsts.STAFF_USER_LIST)
public class StaffUserListController {

	@Autowired
	private StaffUserListService staffUserListService;
	
	private final String VIEW = "staffUserList";
	
	/**
	 * 初期表示
	 * @return
	 */
	@GetMapping()
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView(VIEW);
		mav.addObject("result", staffUserListService.getStaffUserDtoList());
		return mav;
	}
}
