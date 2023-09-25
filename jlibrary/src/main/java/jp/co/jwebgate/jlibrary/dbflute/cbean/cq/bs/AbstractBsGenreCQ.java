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
 * The abstract condition-query of genre.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsGenreCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsGenreCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "genre";
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
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select GENRE_ID from book where ...)} <br>
     * book by GENRE_ID, named 'bookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBook</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BookList for 'exists'. (NotNull)
     */
    public void existsBook(SubQuery<BookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BookCB cb = new BookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_ExistsReferrer_BookList(cb.query());
        registerExistsReferrer(cb.query(), "ID", "GENRE_ID", pp, "bookList");
    }
    public abstract String keepId_ExistsReferrer_BookList(BookCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select GENRE_ID from book where ...)} <br>
     * book by GENRE_ID, named 'bookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBook</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of Id_NotExistsReferrer_BookList for 'not exists'. (NotNull)
     */
    public void notExistsBook(SubQuery<BookCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BookCB cb = new BookCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepId_NotExistsReferrer_BookList(cb.query());
        registerNotExistsReferrer(cb.query(), "ID", "GENRE_ID", pp, "bookList");
    }
    public abstract String keepId_NotExistsReferrer_BookList(BookCQ sq);

    public void xsderiveBookList(String fn, SubQuery<BookCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BookCB cb = new BookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepId_SpecifyDerivedReferrer_BookList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ID", "GENRE_ID", pp, "bookList", al, op);
    }
    public abstract String keepId_SpecifyDerivedReferrer_BookList(BookCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from book where ...)} <br>
     * book by GENRE_ID, named 'bookAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBook()</span>.<span style="color: #CC4747">max</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bookCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bookCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BookCB> derivedBook() {
        return xcreateQDRFunctionBookList();
    }
    protected HpQDRFunction<BookCB> xcreateQDRFunctionBookList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBookList(fn, sq, rd, vl, op));
    }
    public void xqderiveBookList(String fn, SubQuery<BookCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BookCB cb = new BookCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepId_QueryDerivedReferrer_BookList(cb.query()); String prpp = keepId_QueryDerivedReferrer_BookListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ID", "GENRE_ID", sqpp, "bookList", rd, vl, prpp, op);
    }
    public abstract String keepId_QueryDerivedReferrer_BookList(BookCQ sq);
    public abstract String keepId_QueryDerivedReferrer_BookListParameter(Object vl);

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
     * GENRE_NAME: {VARCHAR(25)}
     * @param genreName The value of genreName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_Equal(String genreName) {
        doSetGenreName_Equal(fRES(genreName));
    }

    protected void doSetGenreName_Equal(String genreName) {
        regGenreName(CK_EQ, genreName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @param genreName The value of genreName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_NotEqual(String genreName) {
        doSetGenreName_NotEqual(fRES(genreName));
    }

    protected void doSetGenreName_NotEqual(String genreName) {
        regGenreName(CK_NES, genreName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @param genreName The value of genreName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_GreaterThan(String genreName) {
        regGenreName(CK_GT, fRES(genreName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @param genreName The value of genreName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_LessThan(String genreName) {
        regGenreName(CK_LT, fRES(genreName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @param genreName The value of genreName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_GreaterEqual(String genreName) {
        regGenreName(CK_GE, fRES(genreName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @param genreName The value of genreName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_LessEqual(String genreName) {
        regGenreName(CK_LE, fRES(genreName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @param genreNameList The collection of genreName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_InScope(Collection<String> genreNameList) {
        doSetGenreName_InScope(genreNameList);
    }

    protected void doSetGenreName_InScope(Collection<String> genreNameList) {
        regINS(CK_INS, cTL(genreNameList), xgetCValueGenreName(), "GENRE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @param genreNameList The collection of genreName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreName_NotInScope(Collection<String> genreNameList) {
        doSetGenreName_NotInScope(genreNameList);
    }

    protected void doSetGenreName_NotInScope(Collection<String> genreNameList) {
        regINS(CK_NINS, cTL(genreNameList), xgetCValueGenreName(), "GENRE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)} <br>
     * <pre>e.g. setGenreName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param genreName The value of genreName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenreName_LikeSearch(String genreName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenreName_LikeSearch(genreName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)} <br>
     * <pre>e.g. setGenreName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param genreName The value of genreName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGenreName_LikeSearch(String genreName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genreName), xgetCValueGenreName(), "GENRE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @param genreName The value of genreName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenreName_NotLikeSearch(String genreName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenreName_NotLikeSearch(genreName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     * @param genreName The value of genreName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGenreName_NotLikeSearch(String genreName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genreName), xgetCValueGenreName(), "GENRE_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     */
    public void setGenreName_IsNull() { regGenreName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     */
    public void setGenreName_IsNullOrEmpty() { regGenreName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENRE_NAME: {VARCHAR(25)}
     */
    public void setGenreName_IsNotNull() { regGenreName(CK_ISNN, DOBJ); }

    protected void regGenreName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenreName(), "GENRE_NAME"); }
    protected abstract ConditionValue xgetCValueGenreName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @param genreCode The value of genreCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreCode_Equal(String genreCode) {
        doSetGenreCode_Equal(fRES(genreCode));
    }

    protected void doSetGenreCode_Equal(String genreCode) {
        regGenreCode(CK_EQ, genreCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @param genreCode The value of genreCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreCode_NotEqual(String genreCode) {
        doSetGenreCode_NotEqual(fRES(genreCode));
    }

    protected void doSetGenreCode_NotEqual(String genreCode) {
        regGenreCode(CK_NES, genreCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @param genreCode The value of genreCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreCode_GreaterThan(String genreCode) {
        regGenreCode(CK_GT, fRES(genreCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @param genreCode The value of genreCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreCode_LessThan(String genreCode) {
        regGenreCode(CK_LT, fRES(genreCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @param genreCode The value of genreCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreCode_GreaterEqual(String genreCode) {
        regGenreCode(CK_GE, fRES(genreCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @param genreCode The value of genreCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreCode_LessEqual(String genreCode) {
        regGenreCode(CK_LE, fRES(genreCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @param genreCodeList The collection of genreCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreCode_InScope(Collection<String> genreCodeList) {
        doSetGenreCode_InScope(genreCodeList);
    }

    protected void doSetGenreCode_InScope(Collection<String> genreCodeList) {
        regINS(CK_INS, cTL(genreCodeList), xgetCValueGenreCode(), "GENRE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @param genreCodeList The collection of genreCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreCode_NotInScope(Collection<String> genreCodeList) {
        doSetGenreCode_NotInScope(genreCodeList);
    }

    protected void doSetGenreCode_NotInScope(Collection<String> genreCodeList) {
        regINS(CK_NINS, cTL(genreCodeList), xgetCValueGenreCode(), "GENRE_CODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)} <br>
     * <pre>e.g. setGenreCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param genreCode The value of genreCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenreCode_LikeSearch(String genreCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenreCode_LikeSearch(genreCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)} <br>
     * <pre>e.g. setGenreCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param genreCode The value of genreCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGenreCode_LikeSearch(String genreCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genreCode), xgetCValueGenreCode(), "GENRE_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @param genreCode The value of genreCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGenreCode_NotLikeSearch(String genreCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGenreCode_NotLikeSearch(genreCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @param genreCode The value of genreCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGenreCode_NotLikeSearch(String genreCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genreCode), xgetCValueGenreCode(), "GENRE_CODE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     */
    public void setGenreCode_IsNull() { regGenreCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     */
    public void setGenreCode_IsNotNull() { regGenreCode(CK_ISNN, DOBJ); }

    protected void regGenreCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenreCode(), "GENRE_CODE"); }
    protected abstract ConditionValue xgetCValueGenreCode();

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
    public HpSLCFunction<GenreCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, GenreCB.class);
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
    public HpSLCFunction<GenreCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, GenreCB.class);
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
    public HpSLCFunction<GenreCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, GenreCB.class);
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
    public HpSLCFunction<GenreCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, GenreCB.class);
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
    public HpSLCFunction<GenreCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, GenreCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;GenreCB&gt;() {
     *     public void query(GenreCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GenreCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, GenreCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        GenreCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(GenreCQ sq);

    protected GenreCB xcreateScalarConditionCB() {
        GenreCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected GenreCB xcreateScalarConditionPartitionByCB() {
        GenreCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected GenreCB newMyCB() {
        return new GenreCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return GenreCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
