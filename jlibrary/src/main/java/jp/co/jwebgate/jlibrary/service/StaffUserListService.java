package jp.co.jwebgate.jlibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jwebgate.jlibrary.dto.StaffUserDto;
import jp.co.jwebgate.jlibrary.repository.UserRepository;

/**
 * 職員一覧画面
 * @author j_user
 *
 */
@Service
public class StaffUserListService {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * 職員のDTOリストを取得
	 * @return
	 */
	public List<StaffUserDto> getStaffUserDtoList(){
		return userRepository.selectStaffUserAll().stream().map(e -> new StaffUserDto(e)).toList();
	} 
}
