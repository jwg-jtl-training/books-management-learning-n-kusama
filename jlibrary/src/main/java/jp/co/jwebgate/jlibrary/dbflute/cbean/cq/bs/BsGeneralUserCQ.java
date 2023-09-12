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
 * The base condition-query of GENERAL_USER.
 * @author DBFlute(AutoGenerator)
 */
public class BsGeneralUserCQ extends AbstractBsGeneralUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected GeneralUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsGeneralUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from GENERAL_USER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public GeneralUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected GeneralUserCIQ xcreateCIQ() {
        GeneralUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected GeneralUserCIQ xnewCIQ() {
        return new GeneralUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join GENERAL_USER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public GeneralUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        GeneralUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsGeneralUserCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _generalUserId;
    public ConditionValue xdfgetGeneralUserId()
    { if (_generalUserId == null) { _generalUserId = nCV(); }
      return _generalUserId; }
    protected ConditionValue xgetCValueGeneralUserId() { return xdfgetGeneralUserId(); }

    public Map<String, UserRoleMapCQ> xdfgetGeneralUserId_ExistsReferrer_UserRoleMapList() { return xgetSQueMap("generalUserId_ExistsReferrer_UserRoleMapList"); }
    public String keepGeneralUserId_ExistsReferrer_UserRoleMapList(UserRoleMapCQ sq) { return xkeepSQue("generalUserId_ExistsReferrer_UserRoleMapList", sq); }

    public Map<String, UserRoleMapCQ> xdfgetGeneralUserId_NotExistsReferrer_UserRoleMapList() { return xgetSQueMap("generalUserId_NotExistsReferrer_UserRoleMapList"); }
    public String keepGeneralUserId_NotExistsReferrer_UserRoleMapList(UserRoleMapCQ sq) { return xkeepSQue("generalUserId_NotExistsReferrer_UserRoleMapList", sq); }

    public Map<String, UserRoleMapCQ> xdfgetGeneralUserId_SpecifyDerivedReferrer_UserRoleMapList() { return xgetSQueMap("generalUserId_SpecifyDerivedReferrer_UserRoleMapList"); }
    public String keepGeneralUserId_SpecifyDerivedReferrer_UserRoleMapList(UserRoleMapCQ sq) { return xkeepSQue("generalUserId_SpecifyDerivedReferrer_UserRoleMapList", sq); }

    public Map<String, UserRoleMapCQ> xdfgetGeneralUserId_QueryDerivedReferrer_UserRoleMapList() { return xgetSQueMap("generalUserId_QueryDerivedReferrer_UserRoleMapList"); }
    public String keepGeneralUserId_QueryDerivedReferrer_UserRoleMapList(UserRoleMapCQ sq) { return xkeepSQue("generalUserId_QueryDerivedReferrer_UserRoleMapList", sq); }
    public Map<String, Object> xdfgetGeneralUserId_QueryDerivedReferrer_UserRoleMapListParameter() { return xgetSQuePmMap("generalUserId_QueryDerivedReferrer_UserRoleMapList"); }
    public String keepGeneralUserId_QueryDerivedReferrer_UserRoleMapListParameter(Object pm) { return xkeepSQuePm("generalUserId_QueryDerivedReferrer_UserRoleMapList", pm); }

    /**
     * Add order-by as ascend. <br>
     * GENERAL_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_GeneralUserId_Asc() { regOBA("GENERAL_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERAL_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_GeneralUserId_Desc() { regOBD("GENERAL_USER_ID"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /**
     * Add order-by as ascend. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    protected ConditionValue _nameKana;
    public ConditionValue xdfgetNameKana()
    { if (_nameKana == null) { _nameKana = nCV(); }
      return _nameKana; }
    protected ConditionValue xgetCValueNameKana() { return xdfgetNameKana(); }

    /**
     * Add order-by as ascend. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_NameKana_Asc() { regOBA("NAME_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_NameKana_Desc() { regOBD("NAME_KANA"); return this; }

    protected ConditionValue _name;
    public ConditionValue xdfgetName()
    { if (_name == null) { _name = nCV(); }
      return _name; }
    protected ConditionValue xgetCValueName() { return xdfgetName(); }

    /**
     * Add order-by as ascend. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Name_Asc() { regOBA("NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Name_Desc() { regOBD("NAME"); return this; }

    protected ConditionValue _birthday;
    public ConditionValue xdfgetBirthday()
    { if (_birthday == null) { _birthday = nCV(); }
      return _birthday; }
    protected ConditionValue xgetCValueBirthday() { return xdfgetBirthday(); }

    /**
     * Add order-by as ascend. <br>
     * BIRTHDAY: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Birthday_Asc() { regOBA("BIRTHDAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * BIRTHDAY: {NotNull, DATE(10)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Birthday_Desc() { regOBD("BIRTHDAY"); return this; }

    protected ConditionValue _phoneNumber;
    public ConditionValue xdfgetPhoneNumber()
    { if (_phoneNumber == null) { _phoneNumber = nCV(); }
      return _phoneNumber; }
    protected ConditionValue xgetCValuePhoneNumber() { return xdfgetPhoneNumber(); }

    /**
     * Add order-by as ascend. <br>
     * PHONE_NUMBER: {NotNull, VARCHAR(11)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_PhoneNumber_Asc() { regOBA("PHONE_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * PHONE_NUMBER: {NotNull, VARCHAR(11)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_PhoneNumber_Desc() { regOBD("PHONE_NUMBER"); return this; }

    protected ConditionValue _address;
    public ConditionValue xdfgetAddress()
    { if (_address == null) { _address = nCV(); }
      return _address; }
    protected ConditionValue xgetCValueAddress() { return xdfgetAddress(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Address_Asc() { regOBA("ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Address_Desc() { regOBD("ADDRESS"); return this; }

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
    public BsGeneralUserCQ addOrderBy_Remarks_Asc() { regOBA("REMARKS"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARKS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Remarks_Desc() { regOBD("REMARKS"); return this; }

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
    public BsGeneralUserCQ addOrderBy_DeleteFlg_Asc() { regOBA("DELETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_DeleteFlg_Desc() { regOBD("DELETE_FLG"); return this; }

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
    public BsGeneralUserCQ addOrderBy_Version_Asc() { regOBA("VERSION"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Version_Desc() { regOBD("VERSION"); return this; }

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
    public BsGeneralUserCQ addOrderBy_Created_Asc() { regOBA("CREATED"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Created_Desc() { regOBD("CREATED"); return this; }

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
    public BsGeneralUserCQ addOrderBy_Modified_Asc() { regOBA("MODIFIED"); return this; }

    /**
     * Add order-by as descend. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_Modified_Desc() { regOBD("MODIFIED"); return this; }

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
    public BsGeneralUserCQ addOrderBy_ModifiedBy_Asc() { regOBA("MODIFIED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsGeneralUserCQ addOrderBy_ModifiedBy_Desc() { regOBD("MODIFIED_BY"); return this; }

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
    public BsGeneralUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsGeneralUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, GeneralUserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(GeneralUserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return GeneralUserCB.class.getName(); }
    protected String xCQ() { return GeneralUserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
