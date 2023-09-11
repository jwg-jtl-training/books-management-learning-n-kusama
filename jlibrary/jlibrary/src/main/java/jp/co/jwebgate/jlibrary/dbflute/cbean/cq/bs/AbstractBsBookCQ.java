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
 * The abstract condition-query of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBookCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBookCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BOOK";
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
     * TITLE: {NotNull, VARCHAR(255)}
     * @param title The value of title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_Equal(String title) {
        doSetTitle_Equal(fRES(title));
    }

    protected void doSetTitle_Equal(String title) {
        regTitle(CK_EQ, title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @param title The value of title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotEqual(String title) {
        doSetTitle_NotEqual(fRES(title));
    }

    protected void doSetTitle_NotEqual(String title) {
        regTitle(CK_NES, title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @param title The value of title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterThan(String title) {
        regTitle(CK_GT, fRES(title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @param title The value of title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessThan(String title) {
        regTitle(CK_LT, fRES(title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @param title The value of title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterEqual(String title) {
        regTitle(CK_GE, fRES(title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @param title The value of title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessEqual(String title) {
        regTitle(CK_LE, fRES(title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @param titleList The collection of title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_InScope(Collection<String> titleList) {
        doSetTitle_InScope(titleList);
    }

    protected void doSetTitle_InScope(Collection<String> titleList) {
        regINS(CK_INS, cTL(titleList), xgetCValueTitle(), "TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @param titleList The collection of title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotInScope(Collection<String> titleList) {
        doSetTitle_NotInScope(titleList);
    }

    protected void doSetTitle_NotInScope(Collection<String> titleList) {
        regINS(CK_NINS, cTL(titleList), xgetCValueTitle(), "TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTitle_LikeSearch(String title, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTitle_LikeSearch(title, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTitle_LikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(title), xgetCValueTitle(), "TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTitle_NotLikeSearch(String title, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTitle_NotLikeSearch(title, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {NotNull, VARCHAR(255)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTitle_NotLikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(title), xgetCValueTitle(), "TITLE", likeSearchOption);
    }

    protected void regTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTitle(), "TITLE"); }
    protected abstract ConditionValue xgetCValueTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @param author The value of author as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthor_Equal(String author) {
        doSetAuthor_Equal(fRES(author));
    }

    protected void doSetAuthor_Equal(String author) {
        regAuthor(CK_EQ, author);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @param author The value of author as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthor_NotEqual(String author) {
        doSetAuthor_NotEqual(fRES(author));
    }

    protected void doSetAuthor_NotEqual(String author) {
        regAuthor(CK_NES, author);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @param author The value of author as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthor_GreaterThan(String author) {
        regAuthor(CK_GT, fRES(author));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @param author The value of author as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthor_LessThan(String author) {
        regAuthor(CK_LT, fRES(author));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @param author The value of author as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthor_GreaterEqual(String author) {
        regAuthor(CK_GE, fRES(author));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @param author The value of author as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthor_LessEqual(String author) {
        regAuthor(CK_LE, fRES(author));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @param authorList The collection of author as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthor_InScope(Collection<String> authorList) {
        doSetAuthor_InScope(authorList);
    }

    protected void doSetAuthor_InScope(Collection<String> authorList) {
        regINS(CK_INS, cTL(authorList), xgetCValueAuthor(), "AUTHOR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @param authorList The collection of author as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAuthor_NotInScope(Collection<String> authorList) {
        doSetAuthor_NotInScope(authorList);
    }

    protected void doSetAuthor_NotInScope(Collection<String> authorList) {
        regINS(CK_NINS, cTL(authorList), xgetCValueAuthor(), "AUTHOR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setAuthor_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param author The value of author as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAuthor_LikeSearch(String author, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAuthor_LikeSearch(author, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setAuthor_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param author The value of author as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAuthor_LikeSearch(String author, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(author), xgetCValueAuthor(), "AUTHOR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @param author The value of author as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAuthor_NotLikeSearch(String author, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAuthor_NotLikeSearch(author, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @param author The value of author as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAuthor_NotLikeSearch(String author, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(author), xgetCValueAuthor(), "AUTHOR", likeSearchOption);
    }

    protected void regAuthor(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAuthor(), "AUTHOR"); }
    protected abstract ConditionValue xgetCValueAuthor();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     * @param isbn10 The value of isbn10 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn10_Equal(String isbn10) {
        doSetIsbn10_Equal(fRES(isbn10));
    }

    protected void doSetIsbn10_Equal(String isbn10) {
        regIsbn10(CK_EQ, isbn10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     * @param isbn10 The value of isbn10 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn10_NotEqual(String isbn10) {
        doSetIsbn10_NotEqual(fRES(isbn10));
    }

    protected void doSetIsbn10_NotEqual(String isbn10) {
        regIsbn10(CK_NES, isbn10);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     * @param isbn10 The value of isbn10 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn10_GreaterThan(String isbn10) {
        regIsbn10(CK_GT, fRES(isbn10));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     * @param isbn10 The value of isbn10 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn10_LessThan(String isbn10) {
        regIsbn10(CK_LT, fRES(isbn10));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     * @param isbn10 The value of isbn10 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn10_GreaterEqual(String isbn10) {
        regIsbn10(CK_GE, fRES(isbn10));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     * @param isbn10 The value of isbn10 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn10_LessEqual(String isbn10) {
        regIsbn10(CK_LE, fRES(isbn10));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     * @param isbn10List The collection of isbn10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn10_InScope(Collection<String> isbn10List) {
        doSetIsbn10_InScope(isbn10List);
    }

    protected void doSetIsbn10_InScope(Collection<String> isbn10List) {
        regINS(CK_INS, cTL(isbn10List), xgetCValueIsbn10(), "ISBN_10");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     * @param isbn10List The collection of isbn10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn10_NotInScope(Collection<String> isbn10List) {
        doSetIsbn10_NotInScope(isbn10List);
    }

    protected void doSetIsbn10_NotInScope(Collection<String> isbn10List) {
        regINS(CK_NINS, cTL(isbn10List), xgetCValueIsbn10(), "ISBN_10");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ISBN_10: {VARCHAR(10)} <br>
     * <pre>e.g. setIsbn10_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param isbn10 The value of isbn10 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIsbn10_LikeSearch(String isbn10, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIsbn10_LikeSearch(isbn10, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ISBN_10: {VARCHAR(10)} <br>
     * <pre>e.g. setIsbn10_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param isbn10 The value of isbn10 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setIsbn10_LikeSearch(String isbn10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(isbn10), xgetCValueIsbn10(), "ISBN_10", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     * @param isbn10 The value of isbn10 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIsbn10_NotLikeSearch(String isbn10, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIsbn10_NotLikeSearch(isbn10, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     * @param isbn10 The value of isbn10 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setIsbn10_NotLikeSearch(String isbn10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(isbn10), xgetCValueIsbn10(), "ISBN_10", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     */
    public void setIsbn10_IsNull() { regIsbn10(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     */
    public void setIsbn10_IsNullOrEmpty() { regIsbn10(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ISBN_10: {VARCHAR(10)}
     */
    public void setIsbn10_IsNotNull() { regIsbn10(CK_ISNN, DOBJ); }

    protected void regIsbn10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsbn10(), "ISBN_10"); }
    protected abstract ConditionValue xgetCValueIsbn10();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     * @param isbn13 The value of isbn13 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn13_Equal(String isbn13) {
        doSetIsbn13_Equal(fRES(isbn13));
    }

    protected void doSetIsbn13_Equal(String isbn13) {
        regIsbn13(CK_EQ, isbn13);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     * @param isbn13 The value of isbn13 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn13_NotEqual(String isbn13) {
        doSetIsbn13_NotEqual(fRES(isbn13));
    }

    protected void doSetIsbn13_NotEqual(String isbn13) {
        regIsbn13(CK_NES, isbn13);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     * @param isbn13 The value of isbn13 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn13_GreaterThan(String isbn13) {
        regIsbn13(CK_GT, fRES(isbn13));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     * @param isbn13 The value of isbn13 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn13_LessThan(String isbn13) {
        regIsbn13(CK_LT, fRES(isbn13));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     * @param isbn13 The value of isbn13 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn13_GreaterEqual(String isbn13) {
        regIsbn13(CK_GE, fRES(isbn13));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     * @param isbn13 The value of isbn13 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn13_LessEqual(String isbn13) {
        regIsbn13(CK_LE, fRES(isbn13));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     * @param isbn13List The collection of isbn13 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn13_InScope(Collection<String> isbn13List) {
        doSetIsbn13_InScope(isbn13List);
    }

    protected void doSetIsbn13_InScope(Collection<String> isbn13List) {
        regINS(CK_INS, cTL(isbn13List), xgetCValueIsbn13(), "ISBN_13");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     * @param isbn13List The collection of isbn13 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIsbn13_NotInScope(Collection<String> isbn13List) {
        doSetIsbn13_NotInScope(isbn13List);
    }

    protected void doSetIsbn13_NotInScope(Collection<String> isbn13List) {
        regINS(CK_NINS, cTL(isbn13List), xgetCValueIsbn13(), "ISBN_13");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ISBN_13: {VARCHAR(13)} <br>
     * <pre>e.g. setIsbn13_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param isbn13 The value of isbn13 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIsbn13_LikeSearch(String isbn13, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIsbn13_LikeSearch(isbn13, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ISBN_13: {VARCHAR(13)} <br>
     * <pre>e.g. setIsbn13_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param isbn13 The value of isbn13 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setIsbn13_LikeSearch(String isbn13, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(isbn13), xgetCValueIsbn13(), "ISBN_13", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     * @param isbn13 The value of isbn13 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setIsbn13_NotLikeSearch(String isbn13, ConditionOptionCall<LikeSearchOption> opLambda) {
        setIsbn13_NotLikeSearch(isbn13, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     * @param isbn13 The value of isbn13 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setIsbn13_NotLikeSearch(String isbn13, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(isbn13), xgetCValueIsbn13(), "ISBN_13", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     */
    public void setIsbn13_IsNull() { regIsbn13(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     */
    public void setIsbn13_IsNullOrEmpty() { regIsbn13(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ISBN_13: {VARCHAR(13)}
     */
    public void setIsbn13_IsNotNull() { regIsbn13(CK_ISNN, DOBJ); }

    protected void regIsbn13(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIsbn13(), "ISBN_13"); }
    protected abstract ConditionValue xgetCValueIsbn13();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @param publisher The value of publisher as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublisher_Equal(String publisher) {
        doSetPublisher_Equal(fRES(publisher));
    }

    protected void doSetPublisher_Equal(String publisher) {
        regPublisher(CK_EQ, publisher);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @param publisher The value of publisher as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublisher_NotEqual(String publisher) {
        doSetPublisher_NotEqual(fRES(publisher));
    }

    protected void doSetPublisher_NotEqual(String publisher) {
        regPublisher(CK_NES, publisher);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @param publisher The value of publisher as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublisher_GreaterThan(String publisher) {
        regPublisher(CK_GT, fRES(publisher));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @param publisher The value of publisher as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublisher_LessThan(String publisher) {
        regPublisher(CK_LT, fRES(publisher));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @param publisher The value of publisher as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublisher_GreaterEqual(String publisher) {
        regPublisher(CK_GE, fRES(publisher));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @param publisher The value of publisher as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublisher_LessEqual(String publisher) {
        regPublisher(CK_LE, fRES(publisher));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @param publisherList The collection of publisher as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublisher_InScope(Collection<String> publisherList) {
        doSetPublisher_InScope(publisherList);
    }

    protected void doSetPublisher_InScope(Collection<String> publisherList) {
        regINS(CK_INS, cTL(publisherList), xgetCValuePublisher(), "PUBLISHER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @param publisherList The collection of publisher as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPublisher_NotInScope(Collection<String> publisherList) {
        doSetPublisher_NotInScope(publisherList);
    }

    protected void doSetPublisher_NotInScope(Collection<String> publisherList) {
        regINS(CK_NINS, cTL(publisherList), xgetCValuePublisher(), "PUBLISHER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)} <br>
     * <pre>e.g. setPublisher_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param publisher The value of publisher as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPublisher_LikeSearch(String publisher, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPublisher_LikeSearch(publisher, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)} <br>
     * <pre>e.g. setPublisher_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param publisher The value of publisher as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPublisher_LikeSearch(String publisher, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(publisher), xgetCValuePublisher(), "PUBLISHER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @param publisher The value of publisher as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPublisher_NotLikeSearch(String publisher, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPublisher_NotLikeSearch(publisher, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @param publisher The value of publisher as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPublisher_NotLikeSearch(String publisher, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(publisher), xgetCValuePublisher(), "PUBLISHER", likeSearchOption);
    }

    protected void regPublisher(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePublisher(), "PUBLISHER"); }
    protected abstract ConditionValue xgetCValuePublisher();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @param genreId The value of genreId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_Equal(Integer genreId) {
        doSetGenreId_Equal(genreId);
    }

    protected void doSetGenreId_Equal(Integer genreId) {
        regGenreId(CK_EQ, genreId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @param genreId The value of genreId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_NotEqual(Integer genreId) {
        doSetGenreId_NotEqual(genreId);
    }

    protected void doSetGenreId_NotEqual(Integer genreId) {
        regGenreId(CK_NES, genreId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @param genreId The value of genreId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_GreaterThan(Integer genreId) {
        regGenreId(CK_GT, genreId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @param genreId The value of genreId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_LessThan(Integer genreId) {
        regGenreId(CK_LT, genreId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @param genreId The value of genreId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_GreaterEqual(Integer genreId) {
        regGenreId(CK_GE, genreId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @param genreId The value of genreId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGenreId_LessEqual(Integer genreId) {
        regGenreId(CK_LE, genreId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @param minNumber The min number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setGenreId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setGenreId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @param minNumber The min number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of genreId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setGenreId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGenreId(), "GENRE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @param genreIdList The collection of genreId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreId_InScope(Collection<Integer> genreIdList) {
        doSetGenreId_InScope(genreIdList);
    }

    protected void doSetGenreId_InScope(Collection<Integer> genreIdList) {
        regINS(CK_INS, cTL(genreIdList), xgetCValueGenreId(), "GENRE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @param genreIdList The collection of genreId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGenreId_NotInScope(Collection<Integer> genreIdList) {
        doSetGenreId_NotInScope(genreIdList);
    }

    protected void doSetGenreId_NotInScope(Collection<Integer> genreIdList) {
        regINS(CK_NINS, cTL(genreIdList), xgetCValueGenreId(), "GENRE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     */
    public void setGenreId_IsNull() { regGenreId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     */
    public void setGenreId_IsNotNull() { regGenreId(CK_ISNN, DOBJ); }

    protected void regGenreId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGenreId(), "GENRE_ID"); }
    protected abstract ConditionValue xgetCValueGenreId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @param shelfNumber The value of shelfNumber as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShelfNumber_Equal(String shelfNumber) {
        doSetShelfNumber_Equal(fRES(shelfNumber));
    }

    protected void doSetShelfNumber_Equal(String shelfNumber) {
        regShelfNumber(CK_EQ, shelfNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @param shelfNumber The value of shelfNumber as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShelfNumber_NotEqual(String shelfNumber) {
        doSetShelfNumber_NotEqual(fRES(shelfNumber));
    }

    protected void doSetShelfNumber_NotEqual(String shelfNumber) {
        regShelfNumber(CK_NES, shelfNumber);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @param shelfNumber The value of shelfNumber as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShelfNumber_GreaterThan(String shelfNumber) {
        regShelfNumber(CK_GT, fRES(shelfNumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @param shelfNumber The value of shelfNumber as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShelfNumber_LessThan(String shelfNumber) {
        regShelfNumber(CK_LT, fRES(shelfNumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @param shelfNumber The value of shelfNumber as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShelfNumber_GreaterEqual(String shelfNumber) {
        regShelfNumber(CK_GE, fRES(shelfNumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @param shelfNumber The value of shelfNumber as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShelfNumber_LessEqual(String shelfNumber) {
        regShelfNumber(CK_LE, fRES(shelfNumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @param shelfNumberList The collection of shelfNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShelfNumber_InScope(Collection<String> shelfNumberList) {
        doSetShelfNumber_InScope(shelfNumberList);
    }

    protected void doSetShelfNumber_InScope(Collection<String> shelfNumberList) {
        regINS(CK_INS, cTL(shelfNumberList), xgetCValueShelfNumber(), "SHELF_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @param shelfNumberList The collection of shelfNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShelfNumber_NotInScope(Collection<String> shelfNumberList) {
        doSetShelfNumber_NotInScope(shelfNumberList);
    }

    protected void doSetShelfNumber_NotInScope(Collection<String> shelfNumberList) {
        regINS(CK_NINS, cTL(shelfNumberList), xgetCValueShelfNumber(), "SHELF_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)} <br>
     * <pre>e.g. setShelfNumber_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shelfNumber The value of shelfNumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShelfNumber_LikeSearch(String shelfNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShelfNumber_LikeSearch(shelfNumber, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)} <br>
     * <pre>e.g. setShelfNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shelfNumber The value of shelfNumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShelfNumber_LikeSearch(String shelfNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shelfNumber), xgetCValueShelfNumber(), "SHELF_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @param shelfNumber The value of shelfNumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShelfNumber_NotLikeSearch(String shelfNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShelfNumber_NotLikeSearch(shelfNumber, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     * @param shelfNumber The value of shelfNumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShelfNumber_NotLikeSearch(String shelfNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shelfNumber), xgetCValueShelfNumber(), "SHELF_NUMBER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     */
    public void setShelfNumber_IsNull() { regShelfNumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     */
    public void setShelfNumber_IsNullOrEmpty() { regShelfNumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHELF_NUMBER: {VARCHAR(3)}
     */
    public void setShelfNumber_IsNotNull() { regShelfNumber(CK_ISNN, DOBJ); }

    protected void regShelfNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShelfNumber(), "SHELF_NUMBER"); }
    protected abstract ConditionValue xgetCValueShelfNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @param controlNumber The value of controlNumber as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setControlNumber_Equal(String controlNumber) {
        doSetControlNumber_Equal(fRES(controlNumber));
    }

    protected void doSetControlNumber_Equal(String controlNumber) {
        regControlNumber(CK_EQ, controlNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @param controlNumber The value of controlNumber as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setControlNumber_NotEqual(String controlNumber) {
        doSetControlNumber_NotEqual(fRES(controlNumber));
    }

    protected void doSetControlNumber_NotEqual(String controlNumber) {
        regControlNumber(CK_NES, controlNumber);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @param controlNumber The value of controlNumber as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setControlNumber_GreaterThan(String controlNumber) {
        regControlNumber(CK_GT, fRES(controlNumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @param controlNumber The value of controlNumber as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setControlNumber_LessThan(String controlNumber) {
        regControlNumber(CK_LT, fRES(controlNumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @param controlNumber The value of controlNumber as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setControlNumber_GreaterEqual(String controlNumber) {
        regControlNumber(CK_GE, fRES(controlNumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @param controlNumber The value of controlNumber as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setControlNumber_LessEqual(String controlNumber) {
        regControlNumber(CK_LE, fRES(controlNumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @param controlNumberList The collection of controlNumber as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setControlNumber_InScope(Collection<String> controlNumberList) {
        doSetControlNumber_InScope(controlNumberList);
    }

    protected void doSetControlNumber_InScope(Collection<String> controlNumberList) {
        regINS(CK_INS, cTL(controlNumberList), xgetCValueControlNumber(), "CONTROL_NUMBER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @param controlNumberList The collection of controlNumber as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setControlNumber_NotInScope(Collection<String> controlNumberList) {
        doSetControlNumber_NotInScope(controlNumberList);
    }

    protected void doSetControlNumber_NotInScope(Collection<String> controlNumberList) {
        regINS(CK_NINS, cTL(controlNumberList), xgetCValueControlNumber(), "CONTROL_NUMBER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setControlNumber_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param controlNumber The value of controlNumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setControlNumber_LikeSearch(String controlNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setControlNumber_LikeSearch(controlNumber, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setControlNumber_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param controlNumber The value of controlNumber as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setControlNumber_LikeSearch(String controlNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(controlNumber), xgetCValueControlNumber(), "CONTROL_NUMBER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @param controlNumber The value of controlNumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setControlNumber_NotLikeSearch(String controlNumber, ConditionOptionCall<LikeSearchOption> opLambda) {
        setControlNumber_NotLikeSearch(controlNumber, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @param controlNumber The value of controlNumber as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setControlNumber_NotLikeSearch(String controlNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(controlNumber), xgetCValueControlNumber(), "CONTROL_NUMBER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     */
    public void setControlNumber_IsNull() { regControlNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     */
    public void setControlNumber_IsNotNull() { regControlNumber(CK_ISNN, DOBJ); }

    protected void regControlNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueControlNumber(), "CONTROL_NUMBER"); }
    protected abstract ConditionValue xgetCValueControlNumber();

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
    public HpSLCFunction<BookCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BookCB.class);
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
    public HpSLCFunction<BookCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BookCB.class);
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
    public HpSLCFunction<BookCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BookCB.class);
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
    public HpSLCFunction<BookCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BookCB.class);
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
    public HpSLCFunction<BookCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BookCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BookCB&gt;() {
     *     public void query(BookCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BookCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BookCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BookCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BookCQ sq);

    protected BookCB xcreateScalarConditionCB() {
        BookCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BookCB xcreateScalarConditionPartitionByCB() {
        BookCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected BookCB newMyCB() {
        return new BookCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BookCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
