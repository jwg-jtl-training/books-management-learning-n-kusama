package jp.co.jwebgate.jlibrary.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import jp.co.jwebgate.jlibrary.dbflute.allcommon.*;
import jp.co.jwebgate.jlibrary.dbflute.exentity.*;

/**
 * The DB meta of USER_ROLE_MAP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserRoleMapDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserRoleMapDbm _instance = new UserRoleMapDbm();
    private UserRoleMapDbm() {}
    public static UserRoleMapDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((UserRoleMap)et).getId(), (et, vl) -> ((UserRoleMap)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((UserRoleMap)et).getStaffUserId(), (et, vl) -> ((UserRoleMap)et).setStaffUserId((String)vl), "staffUserId");
        setupEpg(_epgMap, et -> ((UserRoleMap)et).getGeneralUserId(), (et, vl) -> ((UserRoleMap)et).setGeneralUserId((String)vl), "generalUserId");
        setupEpg(_epgMap, et -> ((UserRoleMap)et).getRoleId(), (et, vl) -> ((UserRoleMap)et).setRoleId(cti(vl)), "roleId");
        setupEpg(_epgMap, et -> ((UserRoleMap)et).getRemarks(), (et, vl) -> ((UserRoleMap)et).setRemarks((String)vl), "remarks");
        setupEpg(_epgMap, et -> ((UserRoleMap)et).getDeleteFlg(), (et, vl) -> ((UserRoleMap)et).setDeleteFlg((String)vl), "deleteFlg");
        setupEpg(_epgMap, et -> ((UserRoleMap)et).getVersion(), (et, vl) -> ((UserRoleMap)et).setVersion(cti(vl)), "version");
        setupEpg(_epgMap, et -> ((UserRoleMap)et).getCreated(), (et, vl) -> ((UserRoleMap)et).setCreated(ctldt(vl)), "created");
        setupEpg(_epgMap, et -> ((UserRoleMap)et).getModified(), (et, vl) -> ((UserRoleMap)et).setModified(ctldt(vl)), "modified");
        setupEpg(_epgMap, et -> ((UserRoleMap)et).getModifiedBy(), (et, vl) -> ((UserRoleMap)et).setModifiedBy((String)vl), "modifiedBy");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((UserRoleMap)et).getGeneralUser(), (et, vl) -> ((UserRoleMap)et).setGeneralUser((OptionalEntity<GeneralUser>)vl), "generalUser");
        setupEfpg(_efpgMap, et -> ((UserRoleMap)et).getRole(), (et, vl) -> ((UserRoleMap)et).setRole((OptionalEntity<Role>)vl), "role");
        setupEfpg(_efpgMap, et -> ((UserRoleMap)et).getStaffUser(), (et, vl) -> ((UserRoleMap)et).setStaffUser((OptionalEntity<StaffUser>)vl), "staffUser");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "USER_ROLE_MAP";
    protected final String _tableDispName = "USER_ROLE_MAP";
    protected final String _tablePropertyName = "userRoleMap";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER_ROLE_MAP", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStaffUserId = cci("STAFF_USER_ID", "STAFF_USER_ID", null, null, String.class, "staffUserId", null, false, false, false, "VARCHAR", 10, 0, null, null, false, null, null, "staffUser", null, null, false);
    protected final ColumnInfo _columnGeneralUserId = cci("GENERAL_USER_ID", "GENERAL_USER_ID", null, null, String.class, "generalUserId", null, false, false, false, "VARCHAR", 10, 0, null, null, false, null, null, "generalUser", null, null, false);
    protected final ColumnInfo _columnRoleId = cci("ROLE_ID", "ROLE_ID", null, null, Integer.class, "roleId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "role", null, null, false);
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
     * STAFF_USER_ID: {UQ+, VARCHAR(10), FK to STAFF_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStaffUserId() { return _columnStaffUserId; }
    /**
     * GENERAL_USER_ID: {+UQ, IX, VARCHAR(10), FK to GENERAL_USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGeneralUserId() { return _columnGeneralUserId; }
    /**
     * ROLE_ID: {+UQ, IX, NotNull, INT(10), FK to ROLE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleId() { return _columnRoleId; }
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
        ls.add(columnGeneralUserId());
        ls.add(columnRoleId());
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
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnStaffUserId());
        ls.add(columnGeneralUserId());
        ls.add(columnRoleId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * GENERAL_USER by my GENERAL_USER_ID, named 'generalUser'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGeneralUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGeneralUserId(), GeneralUserDbm.getInstance().columnGeneralUserId());
        return cfi("user_role_map_ibfk_2", "generalUser", this, GeneralUserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userRoleMapList", false);
    }
    /**
     * ROLE by my ROLE_ID, named 'role'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignRole() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleId(), RoleDbm.getInstance().columnId());
        return cfi("user_role_map_ibfk_3", "role", this, RoleDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userRoleMapList", false);
    }
    /**
     * STAFF_USER by my STAFF_USER_ID, named 'staffUser'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignStaffUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStaffUserId(), StaffUserDbm.getInstance().columnStaffUserId());
        return cfi("user_role_map_ibfk_1", "staffUser", this, StaffUserDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userRoleMapList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exentity.UserRoleMap"; }
    public String getConditionBeanTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.cbean.UserRoleMapCB"; }
    public String getBehaviorTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exbhv.UserRoleMapBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UserRoleMap> getEntityType() { return UserRoleMap.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UserRoleMap newEntity() { return new UserRoleMap(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UserRoleMap)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UserRoleMap)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
