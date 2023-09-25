package jp.co.jwebgate.jlibrary.dbflute.cbean.nss;

import jp.co.jwebgate.jlibrary.dbflute.cbean.cq.BookCQ;

/**
 * The nest select set-upper of book.
 * @author DBFlute(AutoGenerator)
 */
public class BookNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BookCQ _query;
    public BookNss(BookCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * genre by my GENRE_ID, named 'genre'.
     */
    public void withGenre() {
        _query.xdoNss(() -> _query.queryGenre());
    }
}
