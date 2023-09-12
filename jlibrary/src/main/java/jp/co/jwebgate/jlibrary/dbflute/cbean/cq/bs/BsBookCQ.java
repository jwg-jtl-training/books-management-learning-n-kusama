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
 * The base condition-query of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public class BsBookCQ extends AbstractBsBookCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BookCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBookCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from BOOK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BookCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BookCIQ xcreateCIQ() {
        BookCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BookCIQ xnewCIQ() {
        return new BookCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join BOOK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BookCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BookCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsBookCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _title;
    public ConditionValue xdfgetTitle()
    { if (_title == null) { _title = nCV(); }
      return _title; }
    protected ConditionValue xgetCValueTitle() { return xdfgetTitle(); }

    /**
     * Add order-by as ascend. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Title_Asc() { regOBA("TITLE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Title_Desc() { regOBD("TITLE"); return this; }

    protected ConditionValue _author;
    public ConditionValue xdfgetAuthor()
    { if (_author == null) { _author = nCV(); }
      return _author; }
    protected ConditionValue xgetCValueAuthor() { return xdfgetAuthor(); }

    /**
     * Add order-by as ascend. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Author_Asc() { regOBA("AUTHOR"); return this; }

    /**
     * Add order-by as descend. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Author_Desc() { regOBD("AUTHOR"); return this; }

    protected ConditionValue _isbn10;
    public ConditionValue xdfgetIsbn10()
    { if (_isbn10 == null) { _isbn10 = nCV(); }
      return _isbn10; }
    protected ConditionValue xgetCValueIsbn10() { return xdfgetIsbn10(); }

    /**
     * Add order-by as ascend. <br>
     * ISBN_10: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Isbn10_Asc() { regOBA("ISBN_10"); return this; }

    /**
     * Add order-by as descend. <br>
     * ISBN_10: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Isbn10_Desc() { regOBD("ISBN_10"); return this; }

    protected ConditionValue _isbn13;
    public ConditionValue xdfgetIsbn13()
    { if (_isbn13 == null) { _isbn13 = nCV(); }
      return _isbn13; }
    protected ConditionValue xgetCValueIsbn13() { return xdfgetIsbn13(); }

    /**
     * Add order-by as ascend. <br>
     * ISBN_13: {VARCHAR(13)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Isbn13_Asc() { regOBA("ISBN_13"); return this; }

    /**
     * Add order-by as descend. <br>
     * ISBN_13: {VARCHAR(13)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Isbn13_Desc() { regOBD("ISBN_13"); return this; }

    protected ConditionValue _publisher;
    public ConditionValue xdfgetPublisher()
    { if (_publisher == null) { _publisher = nCV(); }
      return _publisher; }
    protected ConditionValue xgetCValuePublisher() { return xdfgetPublisher(); }

    /**
     * Add order-by as ascend. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Publisher_Asc() { regOBA("PUBLISHER"); return this; }

    /**
     * Add order-by as descend. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Publisher_Desc() { regOBD("PUBLISHER"); return this; }

    protected ConditionValue _genreId;
    public ConditionValue xdfgetGenreId()
    { if (_genreId == null) { _genreId = nCV(); }
      return _genreId; }
    protected ConditionValue xgetCValueGenreId() { return xdfgetGenreId(); }

    /**
     * Add order-by as ascend. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_GenreId_Asc() { regOBA("GENRE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_GenreId_Desc() { regOBD("GENRE_ID"); return this; }

    protected ConditionValue _shelfNumber;
    public ConditionValue xdfgetShelfNumber()
    { if (_shelfNumber == null) { _shelfNumber = nCV(); }
      return _shelfNumber; }
    protected ConditionValue xgetCValueShelfNumber() { return xdfgetShelfNumber(); }

    /**
     * Add order-by as ascend. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_ShelfNumber_Asc() { regOBA("SHELF_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_ShelfNumber_Desc() { regOBD("SHELF_NUMBER"); return this; }

    protected ConditionValue _controlNumber;
    public ConditionValue xdfgetControlNumber()
    { if (_controlNumber == null) { _controlNumber = nCV(); }
      return _controlNumber; }
    protected ConditionValue xgetCValueControlNumber() { return xdfgetControlNumber(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_ControlNumber_Asc() { regOBA("CONTROL_NUMBER"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_ControlNumber_Desc() { regOBD("CONTROL_NUMBER"); return this; }

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
    public BsBookCQ addOrderBy_Remarks_Asc() { regOBA("REMARKS"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARKS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Remarks_Desc() { regOBD("REMARKS"); return this; }

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
    public BsBookCQ addOrderBy_DeleteFlg_Asc() { regOBA("DELETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_DeleteFlg_Desc() { regOBD("DELETE_FLG"); return this; }

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
    public BsBookCQ addOrderBy_Version_Asc() { regOBA("VERSION"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION: {INT(10), default=[0]}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Version_Desc() { regOBD("VERSION"); return this; }

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
    public BsBookCQ addOrderBy_Created_Asc() { regOBA("CREATED"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Created_Desc() { regOBD("CREATED"); return this; }

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
    public BsBookCQ addOrderBy_Modified_Asc() { regOBA("MODIFIED"); return this; }

    /**
     * Add order-by as descend. <br>
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_Modified_Desc() { regOBD("MODIFIED"); return this; }

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
    public BsBookCQ addOrderBy_ModifiedBy_Asc() { regOBA("MODIFIED_BY"); return this; }

    /**
     * Add order-by as descend. <br>
     * MODIFIED_BY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBookCQ addOrderBy_ModifiedBy_Desc() { regOBD("MODIFIED_BY"); return this; }

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
    public BsBookCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBookCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BookCQ bq = (BookCQ)bqs;
        BookCQ uq = (BookCQ)uqs;
        if (bq.hasConditionQueryGenre()) {
            uq.queryGenre().reflectRelationOnUnionQuery(bq.queryGenre(), uq.queryGenre());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * GENRE by my GENRE_ID, named 'genre'.
     * @return The instance of condition-query. (NotNull)
     */
    public GenreCQ queryGenre() {
        return xdfgetConditionQueryGenre();
    }
    public GenreCQ xdfgetConditionQueryGenre() {
        String prop = "genre";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryGenre()); xsetupOuterJoinGenre(); }
        return xgetQueRlMap(prop);
    }
    protected GenreCQ xcreateQueryGenre() {
        String nrp = xresolveNRP("BOOK", "genre"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new GenreCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "genre", nrp);
    }
    protected void xsetupOuterJoinGenre() { xregOutJo("genre"); }
    public boolean hasConditionQueryGenre() { return xhasQueRlMap("genre"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BookCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BookCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BookCB.class.getName(); }
    protected String xCQ() { return BookCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
