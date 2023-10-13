package jp.co.jwebgate.jlibrary.service;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mysql.cj.util.StringUtils;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import jp.co.jwebgate.jlibrary.details.LoginUserDetails;
import jp.co.jwebgate.jlibrary.repository.UserRepository;

/**
 * ログインユーザーの詳細
 * @author j_user
 *
 */
@Service
public class LoginUserDetailsService implements UserDetailsService{

	@Autowired
	private final UserRepository userRepository;
	
	public LoginUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	/**
	 * ユーザーIDからユーザー情報を読み込む
	 *
	 */
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException{
		
		if(!StringUtils.isNullOrEmpty(userId) && userId.startsWith("G")) {
			// 一般利用者でログインできないようにExceptionを設定
			throw new UsernameNotFoundException("not found user.");
		}
		
		try {
			
			OptionalEntity<StaffUser> staffUserOpt = userRepository.selectStaffUserRole(userId);
			OptionalEntity<GeneralUser> generalUserOpt = userRepository.selectGeneralUserRole(userId);
		
			if(staffUserOpt.isPresent()) {
				return new LoginUserDetails(staffUserOpt.get(), userRepository.selectRoleCdList(userId));
			}else if(generalUserOpt.isPresent()) {
				return new LoginUserDetails(generalUserOpt.get(), userRepository.selectRoleCdList(userId));
			}else {
				throw new UsernameNotFoundException("not found user.");
			}
		
		}catch(Exception e) {
			throw new UsernameNotFoundException("not found user.");
		}
	}
}
