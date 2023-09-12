package jp.co.jwebgate.jlibrary.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import jp.co.jwebgate.jlibrary.dbflute.cbean.*;
import jp.co.jwebgate.jlibrary.dbflute.cbean.cq.bs.*;
import jp.co.jwebgate.jlibrary.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of STAFF_USER.
 * @author DBFlute(AutoGenerator)
 */
public class StaffUserCIQ extends AbstractBsStaffUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsStaffUserCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public StaffUserCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsStaffUserCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueId() { return _myCQ.xdfgetId(); }
    protected ConditionValue xgetCValueStaffUserId() { return _myCQ.xdfgetStaffUserId(); }
    public String keepStaffUserId_ExistsReferrer_UserRoleMapList(UserRoleMapCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStaffUserId_NotExistsReferrer_UserRoleMapList(UserRoleMapCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStaffUserId_SpecifyDerivedReferrer_UserRoleMapList(UserRoleMapCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStaffUserId_QueryDerivedReferrer_UserRoleMapList(UserRoleMapCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStaffUserId_QueryDerivedReferrer_UserRoleMapListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValuePassword() { return _myCQ.xdfgetPassword(); }
    protected ConditionValue xgetCValueNameKana() { return _myCQ.xdfgetNameKana(); }
    protected ConditionValue xgetCValueName() { return _myCQ.xdfgetName(); }
    protected ConditionValue xgetCValueEmail() { return _myCQ.xdfgetEmail(); }
    protected ConditionValue xgetCValueRemarks() { return _myCQ.xdfgetRemarks(); }
    protected ConditionValue xgetCValueDeleteFlg() { return _myCQ.xdfgetDeleteFlg(); }
    protected ConditionValue xgetCValueVersion() { return _myCQ.xdfgetVersion(); }
    protected ConditionValue xgetCValueCreated() { return _myCQ.xdfgetCreated(); }
    protected ConditionValue xgetCValueModified() { return _myCQ.xdfgetModified(); }
    protected ConditionValue xgetCValueModifiedBy() { return _myCQ.xdfgetModifiedBy(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(StaffUserCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return StaffUserCB.class.getName(); }
    protected String xinCQ() { return StaffUserCQ.class.getName(); }
}
