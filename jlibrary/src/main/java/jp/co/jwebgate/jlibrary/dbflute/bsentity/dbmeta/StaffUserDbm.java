package jp.co.jwebgate.jlibrary.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import jp.co.jwebgate.jlibrary.dbflute.allcommon.*;
import jp.co.jwebgate.jlibrary.dbflute.exentity.*;

/**
 * The DB meta of staff_user. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class StaffUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final StaffUserDbm _instance = new StaffUserDbm();
    private StaffUserDbm() {}
    public static StaffUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((StaffUser)et).getId(), (et, vl) -> ((StaffUser)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((StaffUser)et).getStaffUserId(), (et, vl) -> ((StaffUser)et).setStaffUserId((String)vl), "staffUserId");
        setupEpg(_epgMap, et -> ((StaffUser)et).getPassword(), (et, vl) -> ((StaffUser)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((StaffUser)et).getNameKana(), (et, vl) -> ((StaffUser)et).setNameKana((String)vl), "nameKana");
        setupEpg(_epgMap, et -> ((StaffUser)et).getName(), (et, vl) -> ((StaffUser)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((StaffUser)et).getEmail(), (et, vl) -> ((StaffUser)et).setEmail((String)vl), "email");
        setupEpg(_epgMap, et -> ((StaffUser)et).getRemarks(), (et, vl) -> ((StaffUser)et).setRemarks((String)vl), "remarks");
        setupEpg(_epgMap, et -> ((StaffUser)et).getDeleteFlg(), (et, vl) -> ((StaffUser)et).setDeleteFlg((String)vl), "deleteFlg");
        setupEpg(_epgMap, et -> ((StaffUser)et).getVersion(), (et, vl) -> ((StaffUser)et).setVersion(cti(vl)), "version");
        setupEpg(_epgMap, et -> ((StaffUser)et).getCreated(), (et, vl) -> ((StaffUser)et).setCreated(ctldt(vl)), "created");
        setupEpg(_epgMap, et -> ((StaffUser)et).getModified(), (et, vl) -> ((StaffUser)et).setModified(ctldt(vl)), "modified");
        setupEpg(_epgMap, et -> ((StaffUser)et).getModifiedBy(), (et, vl) -> ((StaffUser)et).setModifiedBy((String)vl), "modifiedBy");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "staff_user";
    protected final String _tableDispName = "staff_user";
    protected final String _tablePropertyName = "staffUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("staff_user", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStaffUserId = cci("STAFF_USER_ID", "STAFF_USER_ID", null, null, String.class, "staffUserId", null, true, false, true, "VARCHAR", 10, 0, null, null, false, null, null, null, "userRoleMapList", null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNameKana = cci("NAME_KANA", "NAME_KANA", null, null, String.class, "nameKana", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, true, "VARCHAR", 25, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail = cci("EMAIL", "EMAIL", null, null, String.class, "email", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemarks = cci("REMARKS", "REMARKS", null, null, String.class, "remarks", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlg = cci("DELETE_FLG", "DELETE_FLG", null, null, String.class, "deleteFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersion = cci("VERSION", "VERSION", null, null, Integer.class, "version", null, false, false, false, "INT", 10, 0, null, "0", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreated = cci("CREATED", "CREATED", null, null, java.time.LocalDateTime.class, "created", null, false, false, false, "DATETIME", 19, 0, null, "current_timestamp()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnModified = cci("MODIFIED", "MODIFIED", null, null, java.time.LocalDateTime.class, "modified", null, false, false, false, "DATETIME", 19, 0, null, "current_timestamp()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnModifiedBy = cci("MODIFIED_BY", "MODIFIED_BY", null, null, String.class, "modifiedBy", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStaffUserId() { return _columnStaffUserId; }
    /**
     * PASSWORD: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * NAME_KANA: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNameKana() { return _columnNameKana; }
    /**
     * NAME: {NotNull, VARCHAR(25)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * EMAIL: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail() { return _columnEmail; }
    /**
     * REMARKS: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemarks() { return _columnRemarks; }
    /**
     * DELETE_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeleteFlg() { return _columnDeleteFlg; }
    /**
     * VERSION: {INT(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersion() { return _columnVersion; }
    /**
     * CREATED: {DATETIME(19), default=[current_timestamp()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreated() { return _columnCreated; }
    /**
     * MODIFIED: {DATETIME(19), default=[current_timestamp()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnModified() { return _columnModified; }
    /**
     * MODIFIED_BY: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnModifiedBy() { return _columnModifiedBy; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnStaffUserId());
        ls.add(columnPassword());
        ls.add(columnNameKana());
        ls.add(columnName());
        ls.add(columnEmail());
        ls.add(columnRemarks());
        ls.add(columnDeleteFlg());
        ls.add(columnVersion());
        ls.add(columnCreated());
        ls.add(columnModified());
        ls.add(columnModifiedBy());
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
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnId());
        ls.add(columnStaffUserId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnStaffUserId()); }

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
    /**
     * user_role_map by STAFF_USER_ID, named 'userRoleMapList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserRoleMapList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStaffUserId(), UserRoleMapDbm.getInstance().columnStaffUserId());
        return cri("user_role_map_ibfk_1", "userRoleMapList", this, UserRoleMapDbm.getInstance(), mp, false, "staffUser");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnCreated(), columnModifiedBy(), columnModified(), columnVersion()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnCreated(), columnModifiedBy(), columnModified(), columnVersion()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnModifiedBy(), columnModified(), columnVersion()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exentity.StaffUser"; }
    public String getConditionBeanTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.cbean.StaffUserCB"; }
    public String getBehaviorTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exbhv.StaffUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<StaffUser> getEntityType() { return StaffUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public StaffUser newEntity() { return new StaffUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((StaffUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((StaffUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
