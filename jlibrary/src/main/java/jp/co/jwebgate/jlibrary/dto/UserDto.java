package jp.co.jwebgate.jlibrary.dto;

import java.time.LocalDate;
import java.util.List;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import lombok.Data;

/**
 * 利用者データ
 * @author j_user
 */
@Data
public class UserDto {

	/**
     * 利用者タイプ
     */
	private String userType;

	/**
     * 利用者ID
     */
	private String userId;

	/**
     * パスワード
     */
	private String password;

	/**
     * フリガナ
     */
	private String nameKana;

	/**
     * 氏名
     */
	private String name;

	/**
     * 生年月日
     */
	private LocalDate birthday;

	/**
     * 電話番号
     */
	private String phoneNumber;

	/**
     * 住所
     */
	private String address;

	/**
     * メールアドレス
     */
	private String email;

	/**
     * 権限コードリスト
     */
	private List<String> roleCdList;
	

	/**
     * UserDtoメソッド
     * 利用者タイプが職員（１）の場合の場合の情報取得
     */
	public UserDto(StaffUser entity, List<String> roleCdList) {
		this.userType = "1";
		this.userId = entity.getStaffUserId();
		this.password = entity.getPassword();
		this.nameKana = entity.getNameKana();
		this.name = entity.getName();
		this.birthday = null;
		this.phoneNumber = null;
		this.address = null;
		this.email = entity.getEmail();
		this.roleCdList = roleCdList;
	}
	/**
     * UserDtoメソッド
     * 利用者タイプが一般（２）の場合の情報取得
     */
	public UserDto(GeneralUser entity, List<String> roleCdList) {
		this.userType = "2";
		this.userId = entity.getGeneralUserId();
		this.password = entity.getPassword();
		this.nameKana = entity.getNameKana();
		this.name = entity.getName();
		this.birthday = entity.getBirthday();
		this.phoneNumber = entity.getPhoneNumber();
		this.address = entity.getAddress();
		this.email = null;
		this.roleCdList = roleCdList;
	}
}
