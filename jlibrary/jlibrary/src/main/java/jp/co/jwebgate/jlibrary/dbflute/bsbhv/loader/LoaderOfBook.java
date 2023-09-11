package jp.co.jwebgate.jlibrary.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import jp.co.jwebgate.jlibrary.dbflute.exbhv.*;
import jp.co.jwebgate.jlibrary.dbflute.exentity.*;

/**
 * The referrer loader of BOOK as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBook {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Book> _selectedList;
    protected BehaviorSelector _selector;
    protected BookBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBook ready(List<Book> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BookBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BookBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfGenre _foreignGenreLoader;
    public LoaderOfGenre pulloutGenre() {
        if (_foreignGenreLoader == null)
        { _foreignGenreLoader = new LoaderOfGenre().ready(myBhv().pulloutGenre(_selectedList), _selector); }
        return _foreignGenreLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Book> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
