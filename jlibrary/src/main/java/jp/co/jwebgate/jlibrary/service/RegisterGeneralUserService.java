package jp.co.jwebgate.jlibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.UserRoleMap;
import jp.co.jwebgate.jlibrary.enums.EnumRoles;
import jp.co.jwebgate.jlibrary.form.RegisterGeneralUserForm;
import jp.co.jwebgate.jlibrary.repository.UserRepository;
import jp.co.jwebgate.jlibrary.util.LocalDateUtil;

@Service
public class RegisterGeneralUserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void registerGeneralUser(RegisterGeneralUserForm form) {
		
		GeneralUser generalUser = new GeneralUser();
		
		generalUser.setGeneralUserId(form.getGeneralUserId());
		generalUser.setPassword(passwordEncoder.encode("unavailable"));
		generalUser.setName(form.getName());
		generalUser.setNameKana(form.getNameKana());
		generalUser.setBirthday(LocalDateUtil.convert01StringToLocalDate(form.getBirthday()));
		generalUser.setPhoneNumber(form.getPhoneNumber());
		generalUser.setAddress(form.getAddress());
		userRepository.insertGeneralUser(generalUser);
		
		UserRoleMap userRoleMap = new UserRoleMap();
		
		userRoleMap.setGeneralUserId(generalUser.getGeneralUserId());
		userRoleMap.setRoleId(EnumRoles.GENERAL.getId());
		
		userRepository.insertUserRoleMap(userRoleMap);
		
	}
	
	public String getNewGeneralUserId() {
		return userRepository.getNewGeneralUserId();
	}

}
