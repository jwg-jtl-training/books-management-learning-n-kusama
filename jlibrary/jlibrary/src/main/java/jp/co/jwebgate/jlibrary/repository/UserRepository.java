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


@Repository
public class UserRepository {

	@Autowired
	private UserRoleMapBhv userRoleMapBhv;
	
	@Autowired
	private StaffUserBhv staffUserBhv;
	
	@Autowired
	private GeneralUserBhv generalUserBhv;

	public OptionalEntity<StaffUser> selectStaffUserRole(String userId) {
		return staffUserBhv.selectEntity(cb->{
			cb.query().setStaffUserId_Equal(userId);
		});
	}
	
	public OptionalEntity<GeneralUser> selectGeneralUserRole(String userId) {
		return generalUserBhv.selectEntity(cb->{
			cb.query().setGeneralUserId_Equal(userId);
		});
	}
	
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
	
	public void insertStaffUser(StaffUser staffUser) {
		staffUserBhv.insert(staffUser);
	}
	
	public void insertGeneralUser(GeneralUser generalUser) {
		generalUserBhv.insert(generalUser);
	}
	
	public void insertUserRoleMap(UserRoleMap userRoleMap) {
		userRoleMapBhv.insert(userRoleMap);
	}
	
	public List<StaffUser> selectStaffUserAll(){
		return staffUserBhv.selectList(cb->{}).getSelectedList();
	}
	
	public List<GeneralUser> selectGeneralUserAll(){
		return generalUserBhv.selectList(cb->{}).getSelectedList();
	}
	
	public String getNewGeneralUserId() {
		return generalUserBhv.outsideSql()
				.selectEntity(new NewGeneralUserIdPmb()).get().getNewGeneralUserId();
	}
	
	public String getNewStaffUserId() {
		return staffUserBhv.outsideSql()
				.selectEntity(new NewStaffUserIdPmb()).get().getNewStaffUserId();
	}
}
