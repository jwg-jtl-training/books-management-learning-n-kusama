package jp.co.jwebgate.jlibrary.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import jp.co.jwebgate.jlibrary.dbflute.exbhv.*;
import jp.co.jwebgate.jlibrary.dbflute.exentity.*;
import jp.co.jwebgate.jlibrary.dbflute.cbean.*;

/**
 * The referrer loader of GENRE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfGenre {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Genre> _selectedList;
    protected BehaviorSelector _selector;
    protected GenreBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfGenre ready(List<Genre> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected GenreBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(GenreBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Book> _referrerBook;

    /**
     * Load referrer of bookList by the set-upper of referrer. <br>
     * BOOK by GENRE_ID, named 'bookList'.
     * <pre>
     * <span style="color: #0000C0">genreBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">genreList</span>, <span style="color: #553000">genreLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">genreLoader</span>.<span style="color: #CC4747">loadBook</span>(<span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bookCB</span>.setupSelect...
     *         <span style="color: #553000">bookCB</span>.query().set...
     *         <span style="color: #553000">bookCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bookLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bookLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Genre genre : <span style="color: #553000">genreList</span>) {
     *     ... = genre.<span style="color: #CC4747">getBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGenreId_InScope(pkList);
     * cb.query().addOrderBy_GenreId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfBook> loadBook(ReferrerConditionSetupper<BookCB> refCBLambda) {
        myBhv().loadBook(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerBook = refLs);
        return hd -> hd.handle(new LoaderOfBook().ready(_referrerBook, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Genre> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
