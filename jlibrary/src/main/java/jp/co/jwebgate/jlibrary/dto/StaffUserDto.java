package jp.co.jwebgate.jlibrary.dto;

import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import lombok.Data;

/**
 * 職員データ
 * @author j_user
 */
@Data
public class StaffUserDto {

	/**
     * 職員ID
     */
	private String staffUserId;

	/**
     * 氏名
     */
	private String name;

	/**
     * フリガナ
     */
	private String nameKana;
	
	/**
     * メールアドレス
     */
	private String email;
	

	/**
     * StaffUserDtoメソッド
     * 職員情報の取得
     */
	public StaffUserDto(StaffUser staffUser) {
		this.staffUserId = staffUser.getStaffUserId();
		this.name = staffUser.getName();
		this.nameKana = staffUser.getNameKana();
		this.email = staffUser.getEmail();
	}
}
