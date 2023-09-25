package jp.co.jwebgate.jlibrary.dbflute.cbean.nss;

import jp.co.jwebgate.jlibrary.dbflute.cbean.cq.UserRoleMapCQ;

/**
 * The nest select set-upper of user_role_map.
 * @author DBFlute(AutoGenerator)
 */
public class UserRoleMapNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final UserRoleMapCQ _query;
    public UserRoleMapNss(UserRoleMapCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * general_user by my GENERAL_USER_ID, named 'generalUser'.
     */
    public void withGeneralUser() {
        _query.xdoNss(() -> _query.queryGeneralUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * role by my ROLE_ID, named 'role'.
     */
    public void withRole() {
        _query.xdoNss(() -> _query.queryRole());
    }
    /**
     * With nested relation columns to select clause. <br>
     * staff_user by my STAFF_USER_ID, named 'staffUser'.
     */
    public void withStaffUser() {
        _query.xdoNss(() -> _query.queryStaffUser());
    }
}
