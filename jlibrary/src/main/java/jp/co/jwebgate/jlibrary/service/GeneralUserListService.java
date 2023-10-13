package jp.co.jwebgate.jlibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jwebgate.jlibrary.dto.GeneralUserDto;
import jp.co.jwebgate.jlibrary.repository.UserRepository;

/**
 * 利用者一覧画面
 * @author j_user
 *
 */
@Service
public class GeneralUserListService {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * 利用者のDTOリストを取得
	 * @return
	 */
	public List<GeneralUserDto> getGeneralUserDtoList(){
		return userRepository.selectGeneralUserAll().stream().map(e -> new GeneralUserDto(e)).toList();
	} 
}
