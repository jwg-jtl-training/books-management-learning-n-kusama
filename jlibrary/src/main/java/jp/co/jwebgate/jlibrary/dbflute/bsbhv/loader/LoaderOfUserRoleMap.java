package jp.co.jwebgate.jlibrary.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import jp.co.jwebgate.jlibrary.dbflute.exbhv.*;
import jp.co.jwebgate.jlibrary.dbflute.exentity.*;

/**
 * The referrer loader of USER_ROLE_MAP as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUserRoleMap {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserRoleMap> _selectedList;
    protected BehaviorSelector _selector;
    protected UserRoleMapBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserRoleMap ready(List<UserRoleMap> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserRoleMapBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserRoleMapBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfGeneralUser _foreignGeneralUserLoader;
    public LoaderOfGeneralUser pulloutGeneralUser() {
        if (_foreignGeneralUserLoader == null)
        { _foreignGeneralUserLoader = new LoaderOfGeneralUser().ready(myBhv().pulloutGeneralUser(_selectedList), _selector); }
        return _foreignGeneralUserLoader;
    }

    protected LoaderOfRole _foreignRoleLoader;
    public LoaderOfRole pulloutRole() {
        if (_foreignRoleLoader == null)
        { _foreignRoleLoader = new LoaderOfRole().ready(myBhv().pulloutRole(_selectedList), _selector); }
        return _foreignRoleLoader;
    }

    protected LoaderOfStaffUser _foreignStaffUserLoader;
    public LoaderOfStaffUser pulloutStaffUser() {
        if (_foreignStaffUserLoader == null)
        { _foreignStaffUserLoader = new LoaderOfStaffUser().ready(myBhv().pulloutStaffUser(_selectedList), _selector); }
        return _foreignStaffUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserRoleMap> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
