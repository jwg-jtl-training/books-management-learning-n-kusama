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
 * The DB meta of BOOK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BookDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BookDbm _instance = new BookDbm();
    private BookDbm() {}
    public static BookDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Book)et).getId(), (et, vl) -> ((Book)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Book)et).getTitle(), (et, vl) -> ((Book)et).setTitle((String)vl), "title");
        setupEpg(_epgMap, et -> ((Book)et).getAuthor(), (et, vl) -> ((Book)et).setAuthor((String)vl), "author");
        setupEpg(_epgMap, et -> ((Book)et).getIsbn10(), (et, vl) -> ((Book)et).setIsbn10((String)vl), "isbn10");
        setupEpg(_epgMap, et -> ((Book)et).getIsbn13(), (et, vl) -> ((Book)et).setIsbn13((String)vl), "isbn13");
        setupEpg(_epgMap, et -> ((Book)et).getPublisher(), (et, vl) -> ((Book)et).setPublisher((String)vl), "publisher");
        setupEpg(_epgMap, et -> ((Book)et).getGenreId(), (et, vl) -> ((Book)et).setGenreId(cti(vl)), "genreId");
        setupEpg(_epgMap, et -> ((Book)et).getShelfNumber(), (et, vl) -> ((Book)et).setShelfNumber((String)vl), "shelfNumber");
        setupEpg(_epgMap, et -> ((Book)et).getControlNumber(), (et, vl) -> ((Book)et).setControlNumber((String)vl), "controlNumber");
        setupEpg(_epgMap, et -> ((Book)et).getRemarks(), (et, vl) -> ((Book)et).setRemarks((String)vl), "remarks");
        setupEpg(_epgMap, et -> ((Book)et).getDeleteFlg(), (et, vl) -> ((Book)et).setDeleteFlg((String)vl), "deleteFlg");
        setupEpg(_epgMap, et -> ((Book)et).getVersion(), (et, vl) -> ((Book)et).setVersion(cti(vl)), "version");
        setupEpg(_epgMap, et -> ((Book)et).getCreated(), (et, vl) -> ((Book)et).setCreated(ctldt(vl)), "created");
        setupEpg(_epgMap, et -> ((Book)et).getModified(), (et, vl) -> ((Book)et).setModified(ctldt(vl)), "modified");
        setupEpg(_epgMap, et -> ((Book)et).getModifiedBy(), (et, vl) -> ((Book)et).setModifiedBy((String)vl), "modifiedBy");
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
        setupEfpg(_efpgMap, et -> ((Book)et).getGenre(), (et, vl) -> ((Book)et).setGenre((OptionalEntity<Genre>)vl), "genre");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BOOK";
    protected final String _tableDispName = "BOOK";
    protected final String _tablePropertyName = "book";
    protected final TableSqlName _tableSqlName = new TableSqlName("BOOK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTitle = cci("TITLE", "TITLE", null, null, String.class, "title", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAuthor = cci("AUTHOR", "AUTHOR", null, null, String.class, "author", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsbn10 = cci("ISBN_10", "ISBN_10", null, null, String.class, "isbn10", null, false, false, false, "VARCHAR", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsbn13 = cci("ISBN_13", "ISBN_13", null, null, String.class, "isbn13", null, false, false, false, "VARCHAR", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPublisher = cci("PUBLISHER", "PUBLISHER", null, null, String.class, "publisher", null, false, false, true, "VARCHAR", 25, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGenreId = cci("GENRE_ID", "GENRE_ID", null, null, Integer.class, "genreId", null, false, false, false, "INT", 10, 0, null, null, false, null, null, "genre", null, null, false);
    protected final ColumnInfo _columnShelfNumber = cci("SHELF_NUMBER", "SHELF_NUMBER", null, null, String.class, "shelfNumber", null, false, false, false, "VARCHAR", 3, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnControlNumber = cci("CONTROL_NUMBER", "CONTROL_NUMBER", null, null, String.class, "controlNumber", null, true, false, true, "VARCHAR", 10, 0, null, null, false, null, null, null, null, null, false);
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
     * TITLE: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTitle() { return _columnTitle; }
    /**
     * AUTHOR: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuthor() { return _columnAuthor; }
    /**
     * ISBN_10: {VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsbn10() { return _columnIsbn10; }
    /**
     * ISBN_13: {VARCHAR(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsbn13() { return _columnIsbn13; }
    /**
     * PUBLISHER: {NotNull, VARCHAR(25)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPublisher() { return _columnPublisher; }
    /**
     * GENRE_ID: {IX, INT(10), FK to GENRE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenreId() { return _columnGenreId; }
    /**
     * SHELF_NUMBER: {VARCHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShelfNumber() { return _columnShelfNumber; }
    /**
     * CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNumber() { return _columnControlNumber; }
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
        ls.add(columnTitle());
        ls.add(columnAuthor());
        ls.add(columnIsbn10());
        ls.add(columnIsbn13());
        ls.add(columnPublisher());
        ls.add(columnGenreId());
        ls.add(columnShelfNumber());
        ls.add(columnControlNumber());
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
        ls.add(columnControlNumber());
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
    /**
     * GENRE by my GENRE_ID, named 'genre'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGenre() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGenreId(), GenreDbm.getInstance().columnId());
        return cfi("book_ibfk_1", "genre", this, GenreDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "bookList", false);
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
    public String getEntityTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exentity.Book"; }
    public String getConditionBeanTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.cbean.BookCB"; }
    public String getBehaviorTypeName() { return "jp.co.jwebgate.jlibrary.dbflute.exbhv.BookBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Book> getEntityType() { return Book.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Book newEntity() { return new Book(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Book)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Book)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
