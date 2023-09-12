package jp.co.jwebgate.jlibrary.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import jp.co.jwebgate.jlibrary.dbflute.allcommon.*;
import jp.co.jwebgate.jlibrary.dbflute.exentity.customize.*;

/**
 * The DB meta of NewStaffUserId. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class NewStaffUserIdDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NewStaffUserIdDbm _instance = new NewStaffUserIdDbm();
    private NewStaffUserIdDbm() {}
    public static NewStaffUserIdDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((NewStaffUserId)et).getNewStaffUserId(), (et, vl) -> ((NewStaffUserId)et).setNewStaffUserId((String)vl), "newStaffUserId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NewStaffUserId";
    protected final String _tableDispName = "NewStaffUserId";
    protected final String _tablePropertyName = "newStaffUserId";
    protected final TableSqlName _tableSqlName = new TableSqlName("NewStaffUserId", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNewStaffUserId = cci("NEW_STAFF_USER_ID", "NEW_STAFF_USER_ID", null, null, String.class, "newStaffUserId", null, false, false, false, "VARCHAR", 6, 0, null, null, false, null, null, null, null, null, false);

    /**
     * NEW_STAFF_USER_ID: {VARCHAR(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNewStaffUserId() { return _columnNewStaffUserId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNewStaffUserId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exentity.customize.NewStaffUserId"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NewStaffUserId> getEntityType() { return NewStaffUserId.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public NewStaffUserId newEntity() { return new NewStaffUserId(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NewStaffUserId)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NewStaffUserId)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
