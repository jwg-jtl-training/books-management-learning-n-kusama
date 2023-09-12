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
 * The DB meta of NewGeneralUserId. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class NewGeneralUserIdDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final NewGeneralUserIdDbm _instance = new NewGeneralUserIdDbm();
    private NewGeneralUserIdDbm() {}
    public static NewGeneralUserIdDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((NewGeneralUserId)et).getNewGeneralUserId(), (et, vl) -> ((NewGeneralUserId)et).setNewGeneralUserId((String)vl), "newGeneralUserId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "NewGeneralUserId";
    protected final String _tableDispName = "NewGeneralUserId";
    protected final String _tablePropertyName = "newGeneralUserId";
    protected final TableSqlName _tableSqlName = new TableSqlName("NewGeneralUserId", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNewGeneralUserId = cci("NEW_GENERAL_USER_ID", "NEW_GENERAL_USER_ID", null, null, String.class, "newGeneralUserId", null, false, false, false, "VARCHAR", 6, 0, null, null, false, null, null, null, null, null, false);

    /**
     * NEW_GENERAL_USER_ID: {VARCHAR(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNewGeneralUserId() { return _columnNewGeneralUserId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNewGeneralUserId());
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
    public String getEntityTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exentity.customize.NewGeneralUserId"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<NewGeneralUserId> getEntityType() { return NewGeneralUserId.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public NewGeneralUserId newEntity() { return new NewGeneralUserId(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((NewGeneralUserId)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((NewGeneralUserId)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
