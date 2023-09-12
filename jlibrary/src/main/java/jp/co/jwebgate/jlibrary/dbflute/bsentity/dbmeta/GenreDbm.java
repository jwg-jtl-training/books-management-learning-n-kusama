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
 * The DB meta of GENRE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class GenreDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final GenreDbm _instance = new GenreDbm();
    private GenreDbm() {}
    public static GenreDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Genre)et).getId(), (et, vl) -> ((Genre)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Genre)et).getGenreName(), (et, vl) -> ((Genre)et).setGenreName((String)vl), "genreName");
        setupEpg(_epgMap, et -> ((Genre)et).getGenreCode(), (et, vl) -> ((Genre)et).setGenreCode((String)vl), "genreCode");
        setupEpg(_epgMap, et -> ((Genre)et).getRemarks(), (et, vl) -> ((Genre)et).setRemarks((String)vl), "remarks");
        setupEpg(_epgMap, et -> ((Genre)et).getDeleteFlg(), (et, vl) -> ((Genre)et).setDeleteFlg((String)vl), "deleteFlg");
        setupEpg(_epgMap, et -> ((Genre)et).getVersion(), (et, vl) -> ((Genre)et).setVersion(cti(vl)), "version");
        setupEpg(_epgMap, et -> ((Genre)et).getCreated(), (et, vl) -> ((Genre)et).setCreated(ctldt(vl)), "created");
        setupEpg(_epgMap, et -> ((Genre)et).getModified(), (et, vl) -> ((Genre)et).setModified(ctldt(vl)), "modified");
        setupEpg(_epgMap, et -> ((Genre)et).getModifiedBy(), (et, vl) -> ((Genre)et).setModifiedBy((String)vl), "modifiedBy");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "GENRE";
    protected final String _tableDispName = "GENRE";
    protected final String _tablePropertyName = "genre";
    protected final TableSqlName _tableSqlName = new TableSqlName("GENRE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, "bookList", null, false);
    protected final ColumnInfo _columnGenreName = cci("GENRE_NAME", "GENRE_NAME", null, null, String.class, "genreName", null, false, false, false, "VARCHAR", 25, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGenreCode = cci("GENRE_CODE", "GENRE_CODE", null, null, String.class, "genreCode", null, true, false, true, "VARCHAR", 3, 0, null, null, false, null, null, null, null, null, false);
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
     * GENRE_NAME: {VARCHAR(25)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenreName() { return _columnGenreName; }
    /**
     * GENRE_CODE: {PK, NotNull, VARCHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenreCode() { return _columnGenreCode; }
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
        ls.add(columnGenreName());
        ls.add(columnGenreCode());
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
        ls.add(columnGenreCode());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

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
     * BOOK by GENRE_ID, named 'bookList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerBookList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnId(), BookDbm.getInstance().columnGenreId());
        return cri("book_ibfk_1", "bookList", this, BookDbm.getInstance(), mp, false, "genre");
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
    public String getEntityTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exentity.Genre"; }
    public String getConditionBeanTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.cbean.GenreCB"; }
    public String getBehaviorTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exbhv.GenreBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Genre> getEntityType() { return Genre.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Genre newEntity() { return new Genre(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Genre)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Genre)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
