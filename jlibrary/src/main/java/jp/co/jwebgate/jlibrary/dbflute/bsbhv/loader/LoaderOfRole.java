package jp.co.jwebgate.jlibrary.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import jp.co.jwebgate.jlibrary.dbflute.exbhv.*;
import jp.co.jwebgate.jlibrary.dbflute.exentity.*;
import jp.co.jwebgate.jlibrary.dbflute.cbean.*;

/**
 * The referrer loader of ROLE as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfRole {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Role> _selectedList;
    protected BehaviorSelector _selector;
    protected RoleBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfRole ready(List<Role> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RoleBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RoleBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<UserRoleMap> _referrerUserRoleMap;

    /**
     * Load referrer of userRoleMapList by the set-upper of referrer. <br>
     * USER_ROLE_MAP by ROLE_ID, named 'userRoleMapList'.
     * <pre>
     * <span style="color: #0000C0">roleBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">roleList</span>, <span style="color: #553000">roleLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">roleLoader</span>.<span style="color: #CC4747">loadUserRoleMap</span>(<span style="color: #553000">mapCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">mapCB</span>.setupSelect...
     *         <span style="color: #553000">mapCB</span>.query().set...
     *         <span style="color: #553000">mapCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">mapLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    mapLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Role role : <span style="color: #553000">roleList</span>) {
     *     ... = role.<span style="color: #CC4747">getUserRoleMapList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUserRoleMap> loadUserRoleMap(ReferrerConditionSetupper<UserRoleMapCB> refCBLambda) {
        myBhv().loadUserRoleMap(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserRoleMap = refLs);
        return hd -> hd.handle(new LoaderOfUserRoleMap().ready(_referrerUserRoleMap, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Role> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
