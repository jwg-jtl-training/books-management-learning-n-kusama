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
 * The DB meta of GENERAL_USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class GeneralUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final GeneralUserDbm _instance = new GeneralUserDbm();
    private GeneralUserDbm() {}
    public static GeneralUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((GeneralUser)et).getId(), (et, vl) -> ((GeneralUser)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getGeneralUserId(), (et, vl) -> ((GeneralUser)et).setGeneralUserId((String)vl), "generalUserId");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getPassword(), (et, vl) -> ((GeneralUser)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getNameKana(), (et, vl) -> ((GeneralUser)et).setNameKana((String)vl), "nameKana");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getName(), (et, vl) -> ((GeneralUser)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getBirthday(), (et, vl) -> ((GeneralUser)et).setBirthday(ctld(vl)), "birthday");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getPhoneNumber(), (et, vl) -> ((GeneralUser)et).setPhoneNumber((String)vl), "phoneNumber");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getAddress(), (et, vl) -> ((GeneralUser)et).setAddress((String)vl), "address");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getRemarks(), (et, vl) -> ((GeneralUser)et).setRemarks((String)vl), "remarks");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getDeleteFlg(), (et, vl) -> ((GeneralUser)et).setDeleteFlg((String)vl), "deleteFlg");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getVersion(), (et, vl) -> ((GeneralUser)et).setVersion(cti(vl)), "version");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getCreated(), (et, vl) -> ((GeneralUser)et).setCreated(ctldt(vl)), "created");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getModified(), (et, vl) -> ((GeneralUser)et).setModified(ctldt(vl)), "modified");
        setupEpg(_epgMap, et -> ((GeneralUser)et).getModifiedBy(), (et, vl) -> ((GeneralUser)et).setModifiedBy((String)vl), "modifiedBy");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "GENERAL_USER";
    protected final String _tableDispName = "GENERAL_USER";
    protected final String _tablePropertyName = "generalUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("GENERAL_USER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGeneralUserId = cci("GENERAL_USER_ID", "GENERAL_USER_ID", null, null, String.class, "generalUserId", null, true, false, true, "VARCHAR", 10, 0, null, null, false, null, null, null, "userRoleMapList", null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, null, String.class, "password", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNameKana = cci("NAME_KANA", "NAME_KANA", null, null, String.class, "nameKana", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("NAME", "NAME", null, null, String.class, "name", null, false, false, true, "VARCHAR", 25, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBirthday = cci("BIRTHDAY", "BIRTHDAY", null, null, java.time.LocalDate.class, "birthday", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhoneNumber = cci("PHONE_NUMBER", "PHONE_NUMBER", null, null, String.class, "phoneNumber", null, false, false, true, "VARCHAR", 11, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress = cci("ADDRESS", "ADDRESS", null, null, String.class, "address", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * GENERAL_USER_ID: {PK, UQ, NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGeneralUserId() { return _columnGeneralUserId; }
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
     * BIRTHDAY: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBirthday() { return _columnBirthday; }
    /**
     * PHONE_NUMBER: {NotNull, VARCHAR(11)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhoneNumber() { return _columnPhoneNumber; }
    /**
     * ADDRESS: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress() { return _columnAddress; }
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
        ls.add(columnGeneralUserId());
        ls.add(columnPassword());
        ls.add(columnNameKana());
        ls.add(columnName());
        ls.add(columnBirthday());
        ls.add(columnPhoneNumber());
        ls.add(columnAddress());
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
        ls.add(columnGeneralUserId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnGeneralUserId()); }

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
     * USER_ROLE_MAP by GENERAL_USER_ID, named 'userRoleMapList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserRoleMapList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGeneralUserId(), UserRoleMapDbm.getInstance().columnGeneralUserId());
        return cri("user_role_map_ibfk_2", "userRoleMapList", this, UserRoleMapDbm.getInstance(), mp, false, "generalUser");
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
    public String getEntityTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exentity.GeneralUser"; }
    public String getConditionBeanTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.cbean.GeneralUserCB"; }
    public String getBehaviorTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exbhv.GeneralUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<GeneralUser> getEntityType() { return GeneralUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public GeneralUser newEntity() { return new GeneralUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((GeneralUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((GeneralUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
