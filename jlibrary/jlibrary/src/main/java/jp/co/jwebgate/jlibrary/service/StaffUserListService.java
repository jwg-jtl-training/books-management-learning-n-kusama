package jp.co.jwebgate.jlibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.jwebgate.jlibrary.dto.StaffUserDto;
import jp.co.jwebgate.jlibrary.repository.UserRepository;

@Service
public class StaffUserListService {

	@Autowired
	private UserRepository userRepository;
	
	public List<StaffUserDto> getStaffUserDtoList(){
		return userRepository.selectStaffUserAll().stream().map(e -> new StaffUserDto(e)).toList();
	} 
}
