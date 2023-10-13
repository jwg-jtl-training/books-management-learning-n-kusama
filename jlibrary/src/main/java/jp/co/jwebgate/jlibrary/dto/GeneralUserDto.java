package jp.co.jwebgate.jlibrary.dto;

import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.util.LocalDateUtil;
import lombok.Data;

/**
 * 一般利用者データ
 * @author j_user
 */
@Data
public class GeneralUserDto {

	/**
     * 利用者ID
     */
	private String generalUserId;

	/**
     * 氏名
     */
	private String name;

	/**
     * フリガナ
     */
	private String nameKana;

	/**
     * 生年月日
     */
	private String birthday;

	/**
     * 電話番号
     */
	private String phoneNumber;

	/**
     * 住所
     */
	private String address;
	

	/**
     * GeneralUserDtoメソッド
     * 一般利用者の情報取得
     */
	public GeneralUserDto(GeneralUser generalUser) {
		this.generalUserId = generalUser.getGeneralUserId();
		this.name = generalUser.getName();
		this.nameKana = generalUser.getNameKana();
		this.birthday = LocalDateUtil.convert02LocalDateToString(generalUser.getBirthday());
		this.phoneNumber = generalUser.getPhoneNumber();
		this.address = generalUser.getAddress();
		
	}
}
