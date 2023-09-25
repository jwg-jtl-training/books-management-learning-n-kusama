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
 * The base condition-query of genre.
 * @author DBFlute(AutoGenerator)
 */
public class BsGenreCQ extends AbstractBsGenreCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected GenreCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsGenreCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from genre) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public GenreCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected GenreCIQ xcreateCIQ() {
        GenreCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected GenreCIQ xnewCIQ() {
        return new GenreCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join genre on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public GenreCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        GenreCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    public Map<String, BookCQ> xdfgetId_ExistsReferrer_BookList() { return xgetSQueMap("id_ExistsReferrer_BookList"); }
    public String keepId_ExistsReferrer_BookList(BookCQ sq) { return xkeepSQue("id_ExistsReferrer_BookList", sq); }

    public Map<String, BookCQ> xdfgetId_NotExistsReferrer_BookList() { return xgetSQueMap("id_NotExistsReferrer_BookList"); }
    public String keepId_NotExistsReferrer_BookList(BookCQ sq) { return xkeepSQue("id_NotExistsReferrer_BookList", sq); }

    public Map<String, BookCQ> xdfgetId_SpecifyDerivedReferrer_BookList() { return xgetSQueMap("id_SpecifyDerivedReferrer_BookList"); }
    public String keepId_SpecifyDerivedReferrer_BookList(BookCQ sq) { return xkeepSQue("id_SpecifyDerivedReferrer_BookList", sq); }

    public Map<String, BookCQ> xdfgetId_QueryDerivedReferrer_BookList() { return xgetSQueMap("id_QueryDerivedReferrer_BookList"); }
    public String keepId_QueryDerivedReferrer_BookList(BookCQ sq) { return xkeepSQue("id_QueryDerivedReferrer_BookList", sq); }
    public Map<String, Object> xdfgetId_QueryDerivedReferrer_BookListParameter() { return xgetSQuePmMap("id_QueryDerivedReferrer_BookList"); }
    public String keepId_QueryDerivedReferrer_BookListParameter(Object pm) { return xkeepSQuePm("id_QueryDerivedReferrer_BookList", pm); }

    /**
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _genreName;
    public ConditionValue xdfgetGenreName()
    { if (_genreName == null) { _genreName = nCV(); }
      return _genreName; }
    protected ConditionValue xgetCValueGenreName() { return xdfgetGenreName(); }

    /**
     * Add order-by as ascend. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_GenreName_Asc() { regOBA("GENRE_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_GenreName_Desc() { regOBD("GENRE_NAME"); return this; }

    protected ConditionValue _genreCode;
    public ConditionValue xdfgetGenreCode()
    { if (_genreCode == null) { _genreCode = nCV(); }
      return _genreCode; }
    protected ConditionValue xgetCValueGenreCode() { return xdfgetGenreCode(); }

    /**
     * Add order-by as ascend. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_GenreCode_Asc() { regOBA("GENRE_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_GenreCode_Desc() { regOBD("GENRE_CODE"); return this; }

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
    public BsGenreCQ addOrderBy_Remarks_Asc() { regOBA("REMARKS"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARKS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_Remarks_Desc() { regOBD("REMARKS"); return this; }

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
    public BsGenreCQ addOrderBy_DeleteFlg_Asc() { regOBA("DELETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_DeleteFlg_Desc() { regOBD("DELETE_FLG"); return this; }

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
    public BsGenreCQ addOrderBy_Version_Asc() { regOBA("VERSION"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_Version_Desc() { regOBD("VERSION"); return this; }

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
    public BsGenreCQ addOrderBy_Created_Asc() { regOBA("CREATED"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_Created_Desc() { regOBD("CREATED"); return this; }

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
    public BsGenreCQ addOrderBy_Modified_Asc() { regOBA("MODIFIED"); return this; }

    /**
     * Add order-by as descend. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_Modified_Desc() { regOBD("MODIFIED"); return this; }

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
    public BsGenreCQ addOrderBy_ModifiedBy_Asc() { regOBA("MODIFIED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsGenreCQ addOrderBy_ModifiedBy_Desc() { regOBD("MODIFIED_BY"); return this; }

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
    public BsGenreCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsGenreCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, GenreCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(GenreCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return GenreCB.class.getName(); }
    protected String xCQ() { return GenreCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
