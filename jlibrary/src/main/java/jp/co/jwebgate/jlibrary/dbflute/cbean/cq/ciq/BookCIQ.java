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
 * The condition-query for in-line of book.
 * @author DBFlute(AutoGenerator)
 */
public class BookCIQ extends AbstractBsBookCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBookCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BookCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBookCQ myCQ) {
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
    protected ConditionValue xgetCValueTitle() { return _myCQ.xdfgetTitle(); }
    protected ConditionValue xgetCValueAuthor() { return _myCQ.xdfgetAuthor(); }
    protected ConditionValue xgetCValueIsbn10() { return _myCQ.xdfgetIsbn10(); }
    protected ConditionValue xgetCValueIsbn13() { return _myCQ.xdfgetIsbn13(); }
    protected ConditionValue xgetCValuePublisher() { return _myCQ.xdfgetPublisher(); }
    protected ConditionValue xgetCValueGenreId() { return _myCQ.xdfgetGenreId(); }
    protected ConditionValue xgetCValueShelfNumber() { return _myCQ.xdfgetShelfNumber(); }
    protected ConditionValue xgetCValueControlNumber() { return _myCQ.xdfgetControlNumber(); }
    protected ConditionValue xgetCValueRemarks() { return _myCQ.xdfgetRemarks(); }
    protected ConditionValue xgetCValueDeleteFlg() { return _myCQ.xdfgetDeleteFlg(); }
    protected ConditionValue xgetCValueVersion() { return _myCQ.xdfgetVersion(); }
    protected ConditionValue xgetCValueCreated() { return _myCQ.xdfgetCreated(); }
    protected ConditionValue xgetCValueModified() { return _myCQ.xdfgetModified(); }
    protected ConditionValue xgetCValueModifiedBy() { return _myCQ.xdfgetModifiedBy(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(BookCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BookCB.class.getName(); }
    protected String xinCQ() { return BookCQ.class.getName(); }
}
