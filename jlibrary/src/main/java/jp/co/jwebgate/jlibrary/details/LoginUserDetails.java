package jp.co.jwebgate.jlibrary.details;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import jp.co.jwebgate.jlibrary.dto.UserDto;

@SuppressWarnings("serial")
public class LoginUserDetails implements UserDetails {

	private final UserDto userDto;
	
	private final Collection<? extends GrantedAuthority> authorities;
	
	public LoginUserDetails(StaffUser staffUser, List<String> roleCdList) {
		this.userDto = new UserDto(staffUser, roleCdList);
		this.authorities = roleCdList.stream().map(cd -> new SimpleGrantedAuthority(cd)).toList();
	}
	
	public LoginUserDetails(GeneralUser generalUser, List<String> roleCdList) {
		this.userDto = new UserDto(generalUser, roleCdList);
		this.authorities = roleCdList.stream().map(cd -> new SimpleGrantedAuthority(cd)).toList();
	}
	
	public UserDto getLoginUser() {
		return userDto;
	}

	@Override
	// ハッシュ化済みのパスワードを返す
	public String getPassword() {
		return userDto.getPassword();
	}
	
	@Override
	// ログインで利用するログインIDを返す
	public String getUsername() {
		return userDto.getUserId();
	}
	
	@Override // ロールのコレクションを返す 
	public Collection<? extends GrantedAuthority> getAuthorities() { 
		return authorities; //権限を返します。
		} 
	
	@Override //ユーザーが期限切れ契約trueを返す 
	public boolean isAccountNonExpired() {
		return true;
	} 
	
	@Override //ユーザーがロックされていなければtrueを返す 
	public boolean isAccountNonLocked() {
		return true;
	} 
	
	@Override // ユーザーのパスワードが期限切れtrueを返す 
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override //ユーザーが有効であればtrueを返す 
	public boolean isEnabled() {
		return true;
	} 
}
