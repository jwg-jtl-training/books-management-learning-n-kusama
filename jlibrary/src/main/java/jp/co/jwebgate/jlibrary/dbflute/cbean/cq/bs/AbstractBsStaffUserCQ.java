package jp.co.jwebgate.jlibrary.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import jp.co.jwebgate.jlibrary.dbflute.allcommon.*;
import jp.co.jwebgate.jlibrary.dbflute.cbean.*;
import jp.co.jwebgate.jlibrary.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of staff_user.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsStaffUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsStaffUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "staff_user";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "ID"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @param staffUserId The value of staffUserId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffUserId_Equal(String staffUserId) {
        doSetStaffUserId_Equal(fRES(staffUserId));
    }

    protected void doSetStaffUserId_Equal(String staffUserId) {
        regStaffUserId(CK_EQ, staffUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @param staffUserId The value of staffUserId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffUserId_NotEqual(String staffUserId) {
        doSetStaffUserId_NotEqual(fRES(staffUserId));
    }

    protected void doSetStaffUserId_NotEqual(String staffUserId) {
        regStaffUserId(CK_NES, staffUserId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @param staffUserId The value of staffUserId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffUserId_GreaterThan(String staffUserId) {
        regStaffUserId(CK_GT, fRES(staffUserId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @param staffUserId The value of staffUserId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffUserId_LessThan(String staffUserId) {
        regStaffUserId(CK_LT, fRES(staffUserId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @param staffUserId The value of staffUserId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffUserId_GreaterEqual(String staffUserId) {
        regStaffUserId(CK_GE, fRES(staffUserId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @param staffUserId The value of staffUserId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffUserId_LessEqual(String staffUserId) {
        regStaffUserId(CK_LE, fRES(staffUserId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @param staffUserIdList The collection of staffUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffUserId_InScope(Collection<String> staffUserIdList) {
        doSetStaffUserId_InScope(staffUserIdList);
    }

    protected void doSetStaffUserId_InScope(Collection<String> staffUserIdList) {
        regINS(CK_INS, cTL(staffUserIdList), xgetCValueStaffUserId(), "STAFF_USER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @param staffUserIdList The collection of staffUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStaffUserId_NotInScope(Collection<String> staffUserIdList) {
        doSetStaffUserId_NotInScope(staffUserIdList);
    }

    protected void doSetStaffUserId_NotInScope(Collection<String> staffUserIdList) {
        regINS(CK_NINS, cTL(staffUserIdList), xgetCValueStaffUserId(), "STAFF_USER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setStaffUserId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param staffUserId The value of staffUserId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStaffUserId_LikeSearch(String staffUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStaffUserId_LikeSearch(staffUserId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setStaffUserId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param staffUserId The value of staffUserId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStaffUserId_LikeSearch(String staffUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(staffUserId), xgetCValueStaffUserId(), "STAFF_USER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @param staffUserId The value of staffUserId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStaffUserId_NotLikeSearch(String staffUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStaffUserId_NotLikeSearch(staffUserId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @param staffUserId The value of staffUserId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStaffUserId_NotLikeSearch(String staffUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(staffUserId), xgetCValueStaffUserId(), "STAFF_USER_ID", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STAFF_USER_ID from user_role_map where ...)} <br>
     * user_role_map by STAFF_USER_ID, named 'userRoleMapAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUserRoleMap</span>(mapCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mapCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserRoleMapList for 'exists'. (NotNull)
     */
    public void existsUserRoleMap(SubQuery<UserRoleMapCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserRoleMapCB cb = new UserRoleMapCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStaffUserId_ExistsReferrer_UserRoleMapList(cb.query());
        registerExistsReferrer(cb.query(), "STAFF_USER_ID", "STAFF_USER_ID", pp, "userRoleMapList");
    }
    public abstract String keepStaffUserId_ExistsReferrer_UserRoleMapList(UserRoleMapCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STAFF_USER_ID from user_role_map where ...)} <br>
     * user_role_map by STAFF_USER_ID, named 'userRoleMapAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserRoleMap</span>(mapCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mapCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StaffUserId_NotExistsReferrer_UserRoleMapList for 'not exists'. (NotNull)
     */
    public void notExistsUserRoleMap(SubQuery<UserRoleMapCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserRoleMapCB cb = new UserRoleMapCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStaffUserId_NotExistsReferrer_UserRoleMapList(cb.query());
        registerNotExistsReferrer(cb.query(), "STAFF_USER_ID", "STAFF_USER_ID", pp, "userRoleMapList");
    }
    public abstract String keepStaffUserId_NotExistsReferrer_UserRoleMapList(UserRoleMapCQ sq);

    public void xsderiveUserRoleMapList(String fn, SubQuery<UserRoleMapCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserRoleMapCB cb = new UserRoleMapCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStaffUserId_SpecifyDerivedReferrer_UserRoleMapList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STAFF_USER_ID", "STAFF_USER_ID", pp, "userRoleMapList", al, op);
    }
    public abstract String keepStaffUserId_SpecifyDerivedReferrer_UserRoleMapList(UserRoleMapCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from user_role_map where ...)} <br>
     * user_role_map by STAFF_USER_ID, named 'userRoleMapAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUserRoleMap()</span>.<span style="color: #CC4747">max</span>(mapCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     mapCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     mapCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<UserRoleMapCB> derivedUserRoleMap() {
        return xcreateQDRFunctionUserRoleMapList();
    }
    protected HpQDRFunction<UserRoleMapCB> xcreateQDRFunctionUserRoleMapList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserRoleMapList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserRoleMapList(String fn, SubQuery<UserRoleMapCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserRoleMapCB cb = new UserRoleMapCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepStaffUserId_QueryDerivedReferrer_UserRoleMapList(cb.query()); String prpp = keepStaffUserId_QueryDerivedReferrer_UserRoleMapListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STAFF_USER_ID", "STAFF_USER_ID", sqpp, "userRoleMapList", rd, vl, prpp, op);
    }
    public abstract String keepStaffUserId_QueryDerivedReferrer_UserRoleMapList(UserRoleMapCQ sq);
    public abstract String keepStaffUserId_QueryDerivedReferrer_UserRoleMapListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     */
    public void setStaffUserId_IsNull() { regStaffUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     */
    public void setStaffUserId_IsNotNull() { regStaffUserId(CK_ISNN, DOBJ); }

    protected void regStaffUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStaffUserId(), "STAFF_USER_ID"); }
    protected abstract ConditionValue xgetCValueStaffUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @param passwordList The collection of password as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @param passwordList The collection of password as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @param nameKana The value of nameKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNameKana_Equal(String nameKana) {
        doSetNameKana_Equal(fRES(nameKana));
    }

    protected void doSetNameKana_Equal(String nameKana) {
        regNameKana(CK_EQ, nameKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @param nameKana The value of nameKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNameKana_NotEqual(String nameKana) {
        doSetNameKana_NotEqual(fRES(nameKana));
    }

    protected void doSetNameKana_NotEqual(String nameKana) {
        regNameKana(CK_NES, nameKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @param nameKana The value of nameKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNameKana_GreaterThan(String nameKana) {
        regNameKana(CK_GT, fRES(nameKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @param nameKana The value of nameKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNameKana_LessThan(String nameKana) {
        regNameKana(CK_LT, fRES(nameKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @param nameKana The value of nameKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNameKana_GreaterEqual(String nameKana) {
        regNameKana(CK_GE, fRES(nameKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @param nameKana The value of nameKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNameKana_LessEqual(String nameKana) {
        regNameKana(CK_LE, fRES(nameKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @param nameKanaList The collection of nameKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNameKana_InScope(Collection<String> nameKanaList) {
        doSetNameKana_InScope(nameKanaList);
    }

    protected void doSetNameKana_InScope(Collection<String> nameKanaList) {
        regINS(CK_INS, cTL(nameKanaList), xgetCValueNameKana(), "NAME_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @param nameKanaList The collection of nameKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNameKana_NotInScope(Collection<String> nameKanaList) {
        doSetNameKana_NotInScope(nameKanaList);
    }

    protected void doSetNameKana_NotInScope(Collection<String> nameKanaList) {
        regINS(CK_NINS, cTL(nameKanaList), xgetCValueNameKana(), "NAME_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setNameKana_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param nameKana The value of nameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNameKana_LikeSearch(String nameKana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNameKana_LikeSearch(nameKana, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setNameKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nameKana The value of nameKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setNameKana_LikeSearch(String nameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nameKana), xgetCValueNameKana(), "NAME_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @param nameKana The value of nameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNameKana_NotLikeSearch(String nameKana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNameKana_NotLikeSearch(nameKana, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @param nameKana The value of nameKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setNameKana_NotLikeSearch(String nameKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nameKana), xgetCValueNameKana(), "NAME_KANA", likeSearchOption);
    }

    protected void regNameKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNameKana(), "NAME_KANA"); }
    protected abstract ConditionValue xgetCValueNameKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @param name The value of name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @param name The value of name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @param name The value of name as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @param name The value of name as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @param name The value of name as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @param name The value of name as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @param nameList The collection of name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @param nameList The collection of name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_LikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_NotLikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, VARCHAR(25)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "NAME"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)}
     * @param email The value of email as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_Equal(String email) {
        doSetEmail_Equal(fRES(email));
    }

    protected void doSetEmail_Equal(String email) {
        regEmail(CK_EQ, email);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)}
     * @param email The value of email as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_NotEqual(String email) {
        doSetEmail_NotEqual(fRES(email));
    }

    protected void doSetEmail_NotEqual(String email) {
        regEmail(CK_NES, email);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)}
     * @param email The value of email as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_GreaterThan(String email) {
        regEmail(CK_GT, fRES(email));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)}
     * @param email The value of email as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_LessThan(String email) {
        regEmail(CK_LT, fRES(email));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)}
     * @param email The value of email as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_GreaterEqual(String email) {
        regEmail(CK_GE, fRES(email));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)}
     * @param email The value of email as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_LessEqual(String email) {
        regEmail(CK_LE, fRES(email));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)}
     * @param emailList The collection of email as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_InScope(Collection<String> emailList) {
        doSetEmail_InScope(emailList);
    }

    protected void doSetEmail_InScope(Collection<String> emailList) {
        regINS(CK_INS, cTL(emailList), xgetCValueEmail(), "EMAIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)}
     * @param emailList The collection of email as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_NotInScope(Collection<String> emailList) {
        doSetEmail_NotInScope(emailList);
    }

    protected void doSetEmail_NotInScope(Collection<String> emailList) {
        regINS(CK_NINS, cTL(emailList), xgetCValueEmail(), "EMAIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setEmail_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param email The value of email as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmail_LikeSearch(String email, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmail_LikeSearch(email, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setEmail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param email The value of email as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEmail_LikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(email), xgetCValueEmail(), "EMAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)}
     * @param email The value of email as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmail_NotLikeSearch(String email, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmail_NotLikeSearch(email, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {NotNull, VARCHAR(255)}
     * @param email The value of email as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEmail_NotLikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(email), xgetCValueEmail(), "EMAIL", likeSearchOption);
    }

    protected void regEmail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmail(), "EMAIL"); }
    protected abstract ConditionValue xgetCValueEmail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     * @param remarks The value of remarks as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_Equal(String remarks) {
        doSetRemarks_Equal(fRES(remarks));
    }

    protected void doSetRemarks_Equal(String remarks) {
        regRemarks(CK_EQ, remarks);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     * @param remarks The value of remarks as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_NotEqual(String remarks) {
        doSetRemarks_NotEqual(fRES(remarks));
    }

    protected void doSetRemarks_NotEqual(String remarks) {
        regRemarks(CK_NES, remarks);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     * @param remarks The value of remarks as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_GreaterThan(String remarks) {
        regRemarks(CK_GT, fRES(remarks));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     * @param remarks The value of remarks as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_LessThan(String remarks) {
        regRemarks(CK_LT, fRES(remarks));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     * @param remarks The value of remarks as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_GreaterEqual(String remarks) {
        regRemarks(CK_GE, fRES(remarks));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     * @param remarks The value of remarks as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_LessEqual(String remarks) {
        regRemarks(CK_LE, fRES(remarks));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     * @param remarksList The collection of remarks as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_InScope(Collection<String> remarksList) {
        doSetRemarks_InScope(remarksList);
    }

    protected void doSetRemarks_InScope(Collection<String> remarksList) {
        regINS(CK_INS, cTL(remarksList), xgetCValueRemarks(), "REMARKS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     * @param remarksList The collection of remarks as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemarks_NotInScope(Collection<String> remarksList) {
        doSetRemarks_NotInScope(remarksList);
    }

    protected void doSetRemarks_NotInScope(Collection<String> remarksList) {
        regINS(CK_NINS, cTL(remarksList), xgetCValueRemarks(), "REMARKS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARKS: {VARCHAR(255)} <br>
     * <pre>e.g. setRemarks_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param remarks The value of remarks as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRemarks_LikeSearch(String remarks, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRemarks_LikeSearch(remarks, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARKS: {VARCHAR(255)} <br>
     * <pre>e.g. setRemarks_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param remarks The value of remarks as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRemarks_LikeSearch(String remarks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(remarks), xgetCValueRemarks(), "REMARKS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     * @param remarks The value of remarks as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRemarks_NotLikeSearch(String remarks, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRemarks_NotLikeSearch(remarks, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     * @param remarks The value of remarks as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRemarks_NotLikeSearch(String remarks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(remarks), xgetCValueRemarks(), "REMARKS", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     */
    public void setRemarks_IsNull() { regRemarks(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     */
    public void setRemarks_IsNullOrEmpty() { regRemarks(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REMARKS: {VARCHAR(255)}
     */
    public void setRemarks_IsNotNull() { regRemarks(CK_ISNN, DOBJ); }

    protected void regRemarks(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemarks(), "REMARKS"); }
    protected abstract ConditionValue xgetCValueRemarks();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param deleteFlg The value of deleteFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeleteFlg_Equal(String deleteFlg) {
        doSetDeleteFlg_Equal(fRES(deleteFlg));
    }

    protected void doSetDeleteFlg_Equal(String deleteFlg) {
        regDeleteFlg(CK_EQ, deleteFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param deleteFlg The value of deleteFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeleteFlg_NotEqual(String deleteFlg) {
        doSetDeleteFlg_NotEqual(fRES(deleteFlg));
    }

    protected void doSetDeleteFlg_NotEqual(String deleteFlg) {
        regDeleteFlg(CK_NES, deleteFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param deleteFlg The value of deleteFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeleteFlg_GreaterThan(String deleteFlg) {
        regDeleteFlg(CK_GT, fRES(deleteFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param deleteFlg The value of deleteFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeleteFlg_LessThan(String deleteFlg) {
        regDeleteFlg(CK_LT, fRES(deleteFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param deleteFlg The value of deleteFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeleteFlg_GreaterEqual(String deleteFlg) {
        regDeleteFlg(CK_GE, fRES(deleteFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param deleteFlg The value of deleteFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeleteFlg_LessEqual(String deleteFlg) {
        regDeleteFlg(CK_LE, fRES(deleteFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param deleteFlgList The collection of deleteFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeleteFlg_InScope(Collection<String> deleteFlgList) {
        doSetDeleteFlg_InScope(deleteFlgList);
    }

    protected void doSetDeleteFlg_InScope(Collection<String> deleteFlgList) {
        regINS(CK_INS, cTL(deleteFlgList), xgetCValueDeleteFlg(), "DELETE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param deleteFlgList The collection of deleteFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeleteFlg_NotInScope(Collection<String> deleteFlgList) {
        doSetDeleteFlg_NotInScope(deleteFlgList);
    }

    protected void doSetDeleteFlg_NotInScope(Collection<String> deleteFlgList) {
        regINS(CK_NINS, cTL(deleteFlgList), xgetCValueDeleteFlg(), "DELETE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setDeleteFlg_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param deleteFlg The value of deleteFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeleteFlg_LikeSearch(String deleteFlg, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeleteFlg_LikeSearch(deleteFlg, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setDeleteFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deleteFlg The value of deleteFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDeleteFlg_LikeSearch(String deleteFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deleteFlg), xgetCValueDeleteFlg(), "DELETE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param deleteFlg The value of deleteFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDeleteFlg_NotLikeSearch(String deleteFlg, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDeleteFlg_NotLikeSearch(deleteFlg, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @param deleteFlg The value of deleteFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDeleteFlg_NotLikeSearch(String deleteFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deleteFlg), xgetCValueDeleteFlg(), "DELETE_FLG", likeSearchOption);
    }

    protected void regDeleteFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeleteFlg(), "DELETE_FLG"); }
    protected abstract ConditionValue xgetCValueDeleteFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     * @param version The value of version as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersion_Equal(Integer version) {
        doSetVersion_Equal(version);
    }

    protected void doSetVersion_Equal(Integer version) {
        regVersion(CK_EQ, version);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     * @param version The value of version as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersion_NotEqual(Integer version) {
        doSetVersion_NotEqual(version);
    }

    protected void doSetVersion_NotEqual(Integer version) {
        regVersion(CK_NES, version);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     * @param version The value of version as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersion_GreaterThan(Integer version) {
        regVersion(CK_GT, version);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     * @param version The value of version as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersion_LessThan(Integer version) {
        regVersion(CK_LT, version);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     * @param version The value of version as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersion_GreaterEqual(Integer version) {
        regVersion(CK_GE, version);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     * @param version The value of version as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersion_LessEqual(Integer version) {
        regVersion(CK_LE, version);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     * @param minNumber The min number of version. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of version. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersion_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersion_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     * @param minNumber The min number of version. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of version. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersion_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersion(), "VERSION", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     * @param versionList The collection of version as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersion_InScope(Collection<Integer> versionList) {
        doSetVersion_InScope(versionList);
    }

    protected void doSetVersion_InScope(Collection<Integer> versionList) {
        regINS(CK_INS, cTL(versionList), xgetCValueVersion(), "VERSION");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     * @param versionList The collection of version as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersion_NotInScope(Collection<Integer> versionList) {
        doSetVersion_NotInScope(versionList);
    }

    protected void doSetVersion_NotInScope(Collection<Integer> versionList) {
        regINS(CK_NINS, cTL(versionList), xgetCValueVersion(), "VERSION");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     */
    public void setVersion_IsNull() { regVersion(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VERSION: {INT(10), default=[0]}
     */
    public void setVersion_IsNotNull() { regVersion(CK_ISNN, DOBJ); }

    protected void regVersion(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersion(), "VERSION"); }
    protected abstract ConditionValue xgetCValueVersion();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @param created The value of created as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreated_Equal(java.time.LocalDateTime created) {
        regCreated(CK_EQ,  created);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @param created The value of created as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreated_GreaterThan(java.time.LocalDateTime created) {
        regCreated(CK_GT,  created);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @param created The value of created as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreated_LessThan(java.time.LocalDateTime created) {
        regCreated(CK_LT,  created);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @param created The value of created as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreated_GreaterEqual(java.time.LocalDateTime created) {
        regCreated(CK_GE,  created);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @param created The value of created as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreated_LessEqual(java.time.LocalDateTime created) {
        regCreated(CK_LE, created);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * <pre>e.g. setCreated_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of created. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of created. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreated_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreated_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * <pre>e.g. setCreated_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of created. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of created. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreated_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "CREATED"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreated(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     */
    public void setCreated_IsNull() { regCreated(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     */
    public void setCreated_IsNotNull() { regCreated(CK_ISNN, DOBJ); }

    protected void regCreated(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreated(), "CREATED"); }
    protected abstract ConditionValue xgetCValueCreated();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @param modified The value of modified as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setModified_Equal(java.time.LocalDateTime modified) {
        regModified(CK_EQ,  modified);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @param modified The value of modified as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setModified_GreaterThan(java.time.LocalDateTime modified) {
        regModified(CK_GT,  modified);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @param modified The value of modified as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setModified_LessThan(java.time.LocalDateTime modified) {
        regModified(CK_LT,  modified);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @param modified The value of modified as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setModified_GreaterEqual(java.time.LocalDateTime modified) {
        regModified(CK_GE,  modified);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @param modified The value of modified as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setModified_LessEqual(java.time.LocalDateTime modified) {
        regModified(CK_LE, modified);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * <pre>e.g. setModified_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of modified. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of modified. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setModified_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setModified_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * <pre>e.g. setModified_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of modified. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of modified. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setModified_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "MODIFIED"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueModified(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     */
    public void setModified_IsNull() { regModified(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     */
    public void setModified_IsNotNull() { regModified(CK_ISNN, DOBJ); }

    protected void regModified(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueModified(), "MODIFIED"); }
    protected abstract ConditionValue xgetCValueModified();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @param modifiedBy The value of modifiedBy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModifiedBy_Equal(String modifiedBy) {
        doSetModifiedBy_Equal(fRES(modifiedBy));
    }

    protected void doSetModifiedBy_Equal(String modifiedBy) {
        regModifiedBy(CK_EQ, modifiedBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @param modifiedBy The value of modifiedBy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModifiedBy_NotEqual(String modifiedBy) {
        doSetModifiedBy_NotEqual(fRES(modifiedBy));
    }

    protected void doSetModifiedBy_NotEqual(String modifiedBy) {
        regModifiedBy(CK_NES, modifiedBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @param modifiedBy The value of modifiedBy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModifiedBy_GreaterThan(String modifiedBy) {
        regModifiedBy(CK_GT, fRES(modifiedBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @param modifiedBy The value of modifiedBy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModifiedBy_LessThan(String modifiedBy) {
        regModifiedBy(CK_LT, fRES(modifiedBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @param modifiedBy The value of modifiedBy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModifiedBy_GreaterEqual(String modifiedBy) {
        regModifiedBy(CK_GE, fRES(modifiedBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @param modifiedBy The value of modifiedBy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModifiedBy_LessEqual(String modifiedBy) {
        regModifiedBy(CK_LE, fRES(modifiedBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @param modifiedByList The collection of modifiedBy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModifiedBy_InScope(Collection<String> modifiedByList) {
        doSetModifiedBy_InScope(modifiedByList);
    }

    protected void doSetModifiedBy_InScope(Collection<String> modifiedByList) {
        regINS(CK_INS, cTL(modifiedByList), xgetCValueModifiedBy(), "MODIFIED_BY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @param modifiedByList The collection of modifiedBy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModifiedBy_NotInScope(Collection<String> modifiedByList) {
        doSetModifiedBy_NotInScope(modifiedByList);
    }

    protected void doSetModifiedBy_NotInScope(Collection<String> modifiedByList) {
        regINS(CK_NINS, cTL(modifiedByList), xgetCValueModifiedBy(), "MODIFIED_BY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)} <br>
     * <pre>e.g. setModifiedBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param modifiedBy The value of modifiedBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setModifiedBy_LikeSearch(String modifiedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setModifiedBy_LikeSearch(modifiedBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)} <br>
     * <pre>e.g. setModifiedBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param modifiedBy The value of modifiedBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setModifiedBy_LikeSearch(String modifiedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(modifiedBy), xgetCValueModifiedBy(), "MODIFIED_BY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @param modifiedBy The value of modifiedBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setModifiedBy_NotLikeSearch(String modifiedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setModifiedBy_NotLikeSearch(modifiedBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @param modifiedBy The value of modifiedBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setModifiedBy_NotLikeSearch(String modifiedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(modifiedBy), xgetCValueModifiedBy(), "MODIFIED_BY", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     */
    public void setModifiedBy_IsNull() { regModifiedBy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     */
    public void setModifiedBy_IsNullOrEmpty() { regModifiedBy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     */
    public void setModifiedBy_IsNotNull() { regModifiedBy(CK_ISNN, DOBJ); }

    protected void regModifiedBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueModifiedBy(), "MODIFIED_BY"); }
    protected abstract ConditionValue xgetCValueModifiedBy();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StaffUserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, StaffUserCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StaffUserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, StaffUserCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StaffUserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, StaffUserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StaffUserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, StaffUserCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StaffUserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, StaffUserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;StaffUserCB&gt;() {
     *     public void query(StaffUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<StaffUserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, StaffUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        StaffUserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(StaffUserCQ sq);

    protected StaffUserCB xcreateScalarConditionCB() {
        StaffUserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected StaffUserCB xcreateScalarConditionPartitionByCB() {
        StaffUserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected StaffUserCB newMyCB() {
        return new StaffUserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return StaffUserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
