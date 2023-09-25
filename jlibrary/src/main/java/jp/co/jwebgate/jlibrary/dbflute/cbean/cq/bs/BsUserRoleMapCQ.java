package jp.co.jwebgate.jlibrary.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import jp.co.jwebgate.jlibrary.dbflute.cbean.cq.ciq.*;
import jp.co.jwebgate.jlibrary.dbflute.cbean.*;
import jp.co.jwebgate.jlibrary.dbflute.cbean.cq.*;

/**
 * The base condition-query of user_role_map.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserRoleMapCQ extends AbstractBsUserRoleMapCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserRoleMapCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserRoleMapCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from user_role_map) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserRoleMapCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserRoleMapCIQ xcreateCIQ() {
        UserRoleMapCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserRoleMapCIQ xnewCIQ() {
        return new UserRoleMapCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join user_role_map on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserRoleMapCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserRoleMapCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /**
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _staffUserId;
    public ConditionValue xdfgetStaffUserId()
    { if (_staffUserId == null) { _staffUserId = nCV(); }
      return _staffUserId; }
    protected ConditionValue xgetCValueStaffUserId() { return xdfgetStaffUserId(); }

    /**
     * Add order-by as ascend. <br>
     * STAFF_USER_ID: {UQ+, VARCHAR(10), FK to staff_user}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_StaffUserId_Asc() { regOBA("STAFF_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STAFF_USER_ID: {UQ+, VARCHAR(10), FK to staff_user}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_StaffUserId_Desc() { regOBD("STAFF_USER_ID"); return this; }

    protected ConditionValue _generalUserId;
    public ConditionValue xdfgetGeneralUserId()
    { if (_generalUserId == null) { _generalUserId = nCV(); }
      return _generalUserId; }
    protected ConditionValue xgetCValueGeneralUserId() { return xdfgetGeneralUserId(); }

    /**
     * Add order-by as ascend. <br>
     * GENERAL_USER_ID: {+UQ, IX, VARCHAR(10), FK to general_user}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_GeneralUserId_Asc() { regOBA("GENERAL_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERAL_USER_ID: {+UQ, IX, VARCHAR(10), FK to general_user}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_GeneralUserId_Desc() { regOBD("GENERAL_USER_ID"); return this; }

    protected ConditionValue _roleId;
    public ConditionValue xdfgetRoleId()
    { if (_roleId == null) { _roleId = nCV(); }
      return _roleId; }
    protected ConditionValue xgetCValueRoleId() { return xdfgetRoleId(); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_ID: {+UQ, IX, NotNull, INT(10), FK to role}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_RoleId_Asc() { regOBA("ROLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_ID: {+UQ, IX, NotNull, INT(10), FK to role}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_RoleId_Desc() { regOBD("ROLE_ID"); return this; }

    protected ConditionValue _remarks;
    public ConditionValue xdfgetRemarks()
    { if (_remarks == null) { _remarks = nCV(); }
      return _remarks; }
    protected ConditionValue xgetCValueRemarks() { return xdfgetRemarks(); }

    /**
     * Add order-by as ascend. <br>
     * REMARKS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_Remarks_Asc() { regOBA("REMARKS"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARKS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_Remarks_Desc() { regOBD("REMARKS"); return this; }

    protected ConditionValue _deleteFlg;
    public ConditionValue xdfgetDeleteFlg()
    { if (_deleteFlg == null) { _deleteFlg = nCV(); }
      return _deleteFlg; }
    protected ConditionValue xgetCValueDeleteFlg() { return xdfgetDeleteFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_DeleteFlg_Asc() { regOBA("DELETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_DeleteFlg_Desc() { regOBD("DELETE_FLG"); return this; }

    protected ConditionValue _version;
    public ConditionValue xdfgetVersion()
    { if (_version == null) { _version = nCV(); }
      return _version; }
    protected ConditionValue xgetCValueVersion() { return xdfgetVersion(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_Version_Asc() { regOBA("VERSION"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_Version_Desc() { regOBD("VERSION"); return this; }

    protected ConditionValue _created;
    public ConditionValue xdfgetCreated()
    { if (_created == null) { _created = nCV(); }
      return _created; }
    protected ConditionValue xgetCValueCreated() { return xdfgetCreated(); }

    /**
     * Add order-by as ascend. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_Created_Asc() { regOBA("CREATED"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_Created_Desc() { regOBD("CREATED"); return this; }

    protected ConditionValue _modified;
    public ConditionValue xdfgetModified()
    { if (_modified == null) { _modified = nCV(); }
      return _modified; }
    protected ConditionValue xgetCValueModified() { return xdfgetModified(); }

    /**
     * Add order-by as ascend. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_Modified_Asc() { regOBA("MODIFIED"); return this; }

    /**
     * Add order-by as descend. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_Modified_Desc() { regOBD("MODIFIED"); return this; }

    protected ConditionValue _modifiedBy;
    public ConditionValue xdfgetModifiedBy()
    { if (_modifiedBy == null) { _modifiedBy = nCV(); }
      return _modifiedBy; }
    protected ConditionValue xgetCValueModifiedBy() { return xdfgetModifiedBy(); }

    /**
     * Add order-by as ascend. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_ModifiedBy_Asc() { regOBA("MODIFIED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addOrderBy_ModifiedBy_Desc() { regOBD("MODIFIED_BY"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsUserRoleMapCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        UserRoleMapCQ bq = (UserRoleMapCQ)bqs;
        UserRoleMapCQ uq = (UserRoleMapCQ)uqs;
        if (bq.hasConditionQueryGeneralUser()) {
            uq.queryGeneralUser().reflectRelationOnUnionQuery(bq.queryGeneralUser(), uq.queryGeneralUser());
        }
        if (bq.hasConditionQueryRole()) {
            uq.queryRole().reflectRelationOnUnionQuery(bq.queryRole(), uq.queryRole());
        }
        if (bq.hasConditionQueryStaffUser()) {
            uq.queryStaffUser().reflectRelationOnUnionQuery(bq.queryStaffUser(), uq.queryStaffUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * general_user by my GENERAL_USER_ID, named 'generalUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public GeneralUserCQ queryGeneralUser() {
        return xdfgetConditionQueryGeneralUser();
    }
    public GeneralUserCQ xdfgetConditionQueryGeneralUser() {
        String prop = "generalUser";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGeneralUser()); xsetupOuterJoinGeneralUser(); }
        return xgetQueRlMap(prop);
    }
    protected GeneralUserCQ xcreateQueryGeneralUser() {
        String nrp = xresolveNRP("user_role_map", "generalUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new GeneralUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "generalUser", nrp);
    }
    protected void xsetupOuterJoinGeneralUser() { xregOutJo("generalUser"); }
    public boolean hasConditionQueryGeneralUser() { return xhasQueRlMap("generalUser"); }

    /**
     * Get the condition-query for relation table. <br>
     * role by my ROLE_ID, named 'role'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoleCQ queryRole() {
        return xdfgetConditionQueryRole();
    }
    public RoleCQ xdfgetConditionQueryRole() {
        String prop = "role";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryRole()); xsetupOuterJoinRole(); }
        return xgetQueRlMap(prop);
    }
    protected RoleCQ xcreateQueryRole() {
        String nrp = xresolveNRP("user_role_map", "role"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoleCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "role", nrp);
    }
    protected void xsetupOuterJoinRole() { xregOutJo("role"); }
    public boolean hasConditionQueryRole() { return xhasQueRlMap("role"); }

    /**
     * Get the condition-query for relation table. <br>
     * staff_user by my STAFF_USER_ID, named 'staffUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public StaffUserCQ queryStaffUser() {
        return xdfgetConditionQueryStaffUser();
    }
    public StaffUserCQ xdfgetConditionQueryStaffUser() {
        String prop = "staffUser";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryStaffUser()); xsetupOuterJoinStaffUser(); }
        return xgetQueRlMap(prop);
    }
    protected StaffUserCQ xcreateQueryStaffUser() {
        String nrp = xresolveNRP("user_role_map", "staffUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new StaffUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "staffUser", nrp);
    }
    protected void xsetupOuterJoinStaffUser() { xregOutJo("staffUser"); }
    public boolean hasConditionQueryStaffUser() { return xhasQueRlMap("staffUser"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, UserRoleMapCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserRoleMapCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserRoleMapCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserRoleMapCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserRoleMapCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserRoleMapCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserRoleMapCQ> _myselfExistsMap;
    public Map<String, UserRoleMapCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserRoleMapCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserRoleMapCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserRoleMapCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserRoleMapCB.class.getName(); }
    protected String xCQ() { return UserRoleMapCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
