package jp.co.jwebgate.jlibrary.repository;

import java.util.List;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.jwebgate.jlibrary.dbflute.exbhv.GeneralUserBhv;
import jp.co.jwebgate.jlibrary.dbflute.exbhv.StaffUserBhv;
import jp.co.jwebgate.jlibrary.dbflute.exbhv.UserRoleMapBhv;
import jp.co.jwebgate.jlibrary.dbflute.exbhv.pmbean.NewGeneralUserIdPmb;
import jp.co.jwebgate.jlibrary.dbflute.exbhv.pmbean.NewStaffUserIdPmb;
import jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser;
import jp.co.jwebgate.jlibrary.dbflute.exentity.UserRoleMap;

/**
 * ユーザーリポジトリ
 * 
 * @author j_user 
 */
@Repository
public class UserRepository {

	@Autowired
	private UserRoleMapBhv userRoleMapBhv;
	
	@Autowired
	private StaffUserBhv staffUserBhv;
	
	@Autowired
	private GeneralUserBhv generalUserBhv;

	/**
     * 職員IDから職員情報の取得
     *
     * @param userId 職員ID
     * @return 職員情報
     */
	public OptionalEntity<StaffUser> selectStaffUserRole(String userId) {
		return staffUserBhv.selectEntity(cb->{
			cb.query().setStaffUserId_Equal(userId);
		});
	}
	
	/**
     * 一般利用者IDから一般利用者情報の取得
     *
     * @param userId 一般利用者ID
     * @return 一般利用者情報
     */
	public OptionalEntity<GeneralUser> selectGeneralUserRole(String userId) {
		return generalUserBhv.selectEntity(cb->{
			cb.query().setGeneralUserId_Equal(userId);
		});
	}
	
	/**
     * ユーザーIDから権限コードリストの取得
     *
     * @param userId ユーザーID
     * @return 権限コードリスト
     */
	public List<String> selectRoleCdList(String userId) {
		List<UserRoleMap> userRoleMapList = userRoleMapBhv.selectList(cb -> {
			cb.orScopeQuery(orCb -> {
				orCb.query().queryStaffUser().setStaffUserId_Equal(userId);
				orCb.query().queryGeneralUser().setGeneralUserId_Equal(userId);
			});
			cb.setupSelect_Role();
		}).getSelectedList();
		
		return userRoleMapList.stream().map(e->e.getRole().get().getCd()).toList();
	}
	
	/**
     * 職員情報の挿入
     *
     * @param staffUser 職員情報
     */
	public void insertStaffUser(StaffUser staffUser) {
		staffUserBhv.insert(staffUser);
	}
	
	/**
     * 一般利用者情報の挿入
     *
     * @param generalUser 一般利用者情報
     */
	public void insertGeneralUser(GeneralUser generalUser) {
		generalUserBhv.insert(generalUser);
	}
	
	/**
     * ユーザー権限マップの挿入
     *
     * @param userRoleMap ユーザー権限マップ
     */
	public void insertUserRoleMap(UserRoleMap userRoleMap) {
		userRoleMapBhv.insert(userRoleMap);
	}
	
	/**
     * 職員リストの取得
     *
     * @return 職員リスト
     */
	public List<StaffUser> selectStaffUserAll(){
		return staffUserBhv.selectList(cb->{}).getSelectedList();
	}
	
	/**
     * 一般利用者リストの取得
     *
     * @return 一般利用者リスト
     */
	public List<GeneralUser> selectGeneralUserAll(){
		return generalUserBhv.selectList(cb->{}).getSelectedList();
	}
	
	/**
     * 新規一般利用者IDの取得
     *
     * @return 新規一般利用者ID
     */
	public String getNewGeneralUserId() {
		return generalUserBhv.outsideSql()
				.selectEntity(new NewGeneralUserIdPmb()).get().getNewGeneralUserId();
	}

	/**
     * 新規職員IDの取得
     *
     * @return 新規職員ID
     */
	public String getNewStaffUserId() {
		return staffUserBhv.outsideSql()
				.selectEntity(new NewStaffUserIdPmb()).get().getNewStaffUserId();
	}
}
