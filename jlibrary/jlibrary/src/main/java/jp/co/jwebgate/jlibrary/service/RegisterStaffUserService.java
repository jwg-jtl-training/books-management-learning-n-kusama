package jp.co.jwebgate.jlibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.UserRoleMap;
import jp.co.jwebgate.jlibrary.enums.EnumRoles;
import jp.co.jwebgate.jlibrary.form.RegisterStaffUserForm;
import jp.co.jwebgate.jlibrary.repository.UserRepository;

@Service
public class RegisterStaffUserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public void registerStaffUser(RegisterStaffUserForm form) {
		
		StaffUser staffUser = new StaffUser();
		
		staffUser.setStaffUserId(form.getStaffUserId());
		staffUser.setPassword(passwordEncoder.encode(form.getPassword()));
		staffUser.setName(form.getName());
		staffUser.setNameKana(form.getNameKana());
		staffUser.setEmail(form.getEmail());
		
		userRepository.insertStaffUser(staffUser);
		
		UserRoleMap userRoleMap = new UserRoleMap();
		
		userRoleMap.setStaffUserId(staffUser.getStaffUserId());
		userRoleMap.setRoleId(EnumRoles.STAFF.getId());
		
		userRepository.insertUserRoleMap(userRoleMap);
		
	}
	
	public String getNewStaffUserId() {
		return userRepository.getNewStaffUserId();
	}

}
