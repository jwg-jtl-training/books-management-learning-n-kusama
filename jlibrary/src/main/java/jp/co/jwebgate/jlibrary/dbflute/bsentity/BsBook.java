package jp.co.jwebgate.jlibrary.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import jp.co.jwebgate.jlibrary.dbflute.allcommon.EntityDefinedCommonColumn;
import jp.co.jwebgate.jlibrary.dbflute.allcommon.DBMetaInstanceHandler;
import jp.co.jwebgate.jlibrary.dbflute.exentity.*;

/**
 * The entity of book as TABLE. <br>
 * 図書
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBook extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _id;

    /** TITLE: {NotNull, VARCHAR(255)} */
    protected String _title;

    /** AUTHOR: {NotNull, VARCHAR(50)} */
    protected String _author;

    /** ISBN_10: {VARCHAR(10)} */
    protected String _isbn10;

    /** ISBN_13: {VARCHAR(13)} */
    protected String _isbn13;

    /** PUBLISHER: {NotNull, VARCHAR(25)} */
    protected String _publisher;

    /** GENRE_ID: {IX, INT(10), FK to genre} */
    protected Integer _genreId;

    /** SHELF_NUMBER: {VARCHAR(3)} */
    protected String _shelfNumber;

    /** CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)} */
    protected String _controlNumber;

    /** REMARKS: {VARCHAR(255)} */
    protected String _remarks;

    /** DELETE_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _deleteFlg;

    /** VERSION: {INT(10), default=[0]} */
    protected Integer _version;

    /** CREATED: {DATETIME(19), default=[current_timestamp()]} */
    protected java.time.LocalDateTime _created;

    /** MODIFIED: {DATETIME(19), default=[current_timestamp()]} */
    protected java.time.LocalDateTime _modified;

    /** MODIFIED_BY: {VARCHAR(255)} */
    protected String _modifiedBy;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "book";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        if (_controlNumber == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** genre by my GENRE_ID, named 'genre'. */
    protected OptionalEntity<Genre> _genre;

    /**
     * [get] genre by my GENRE_ID, named 'genre'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'genre'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Genre> getGenre() {
        if (_genre == null) { _genre = OptionalEntity.relationEmpty(this, "genre"); }
        return _genre;
    }

    /**
     * [set] genre by my GENRE_ID, named 'genre'.
     * @param genre The entity of foreign property 'genre'. (NullAllowed)
     */
    public void setGenre(OptionalEntity<Genre> genre) {
        _genre = genre;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBook) {
            BsBook other = (BsBook)obj;
            if (!xSV(_id, other._id)) { return false; }
            if (!xSV(_controlNumber, other._controlNumber)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        hs = xCH(hs, _controlNumber);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_genre != null && _genre.isPresent())
        { sb.append(li).append(xbRDS(_genre, "genre")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_title));
        sb.append(dm).append(xfND(_author));
        sb.append(dm).append(xfND(_isbn10));
        sb.append(dm).append(xfND(_isbn13));
        sb.append(dm).append(xfND(_publisher));
        sb.append(dm).append(xfND(_genreId));
        sb.append(dm).append(xfND(_shelfNumber));
        sb.append(dm).append(xfND(_controlNumber));
        sb.append(dm).append(xfND(_remarks));
        sb.append(dm).append(xfND(_deleteFlg));
        sb.append(dm).append(xfND(_version));
        sb.append(dm).append(xfND(_created));
        sb.append(dm).append(xfND(_modified));
        sb.append(dm).append(xfND(_modifiedBy));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_genre != null && _genre.isPresent())
        { sb.append(dm).append("genre"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Book clone() {
        return (Book)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] TITLE: {NotNull, VARCHAR(255)} <br>
     * タイトル
     * @return The value of the column 'TITLE'. (basically NotNull if selected: for the constraint)
     */
    public String getTitle() {
        checkSpecifiedProperty("title");
        return _title;
    }

    /**
     * [set] TITLE: {NotNull, VARCHAR(255)} <br>
     * タイトル
     * @param title The value of the column 'TITLE'. (basically NotNull if update: for the constraint)
     */
    public void setTitle(String title) {
        registerModifiedProperty("title");
        _title = title;
    }

    /**
     * [get] AUTHOR: {NotNull, VARCHAR(50)} <br>
     * 著者
     * @return The value of the column 'AUTHOR'. (basically NotNull if selected: for the constraint)
     */
    public String getAuthor() {
        checkSpecifiedProperty("author");
        return _author;
    }

    /**
     * [set] AUTHOR: {NotNull, VARCHAR(50)} <br>
     * 著者
     * @param author The value of the column 'AUTHOR'. (basically NotNull if update: for the constraint)
     */
    public void setAuthor(String author) {
        registerModifiedProperty("author");
        _author = author;
    }

    /**
     * [get] ISBN_10: {VARCHAR(10)} <br>
     * ISBN-10
     * @return The value of the column 'ISBN_10'. (NullAllowed even if selected: for no constraint)
     */
    public String getIsbn10() {
        checkSpecifiedProperty("isbn10");
        return _isbn10;
    }

    /**
     * [set] ISBN_10: {VARCHAR(10)} <br>
     * ISBN-10
     * @param isbn10 The value of the column 'ISBN_10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIsbn10(String isbn10) {
        registerModifiedProperty("isbn10");
        _isbn10 = isbn10;
    }

    /**
     * [get] ISBN_13: {VARCHAR(13)} <br>
     * ISBN-13
     * @return The value of the column 'ISBN_13'. (NullAllowed even if selected: for no constraint)
     */
    public String getIsbn13() {
        checkSpecifiedProperty("isbn13");
        return _isbn13;
    }

    /**
     * [set] ISBN_13: {VARCHAR(13)} <br>
     * ISBN-13
     * @param isbn13 The value of the column 'ISBN_13'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIsbn13(String isbn13) {
        registerModifiedProperty("isbn13");
        _isbn13 = isbn13;
    }

    /**
     * [get] PUBLISHER: {NotNull, VARCHAR(25)} <br>
     * 出版社
     * @return The value of the column 'PUBLISHER'. (basically NotNull if selected: for the constraint)
     */
    public String getPublisher() {
        checkSpecifiedProperty("publisher");
        return _publisher;
    }

    /**
     * [set] PUBLISHER: {NotNull, VARCHAR(25)} <br>
     * 出版社
     * @param publisher The value of the column 'PUBLISHER'. (basically NotNull if update: for the constraint)
     */
    public void setPublisher(String publisher) {
        registerModifiedProperty("publisher");
        _publisher = publisher;
    }

    /**
     * [get] GENRE_ID: {IX, INT(10), FK to genre} <br>
     * ジャンルID
     * @return The value of the column 'GENRE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getGenreId() {
        checkSpecifiedProperty("genreId");
        return _genreId;
    }

    /**
     * [set] GENRE_ID: {IX, INT(10), FK to genre} <br>
     * ジャンルID
     * @param genreId The value of the column 'GENRE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGenreId(Integer genreId) {
        registerModifiedProperty("genreId");
        _genreId = genreId;
    }

    /**
     * [get] SHELF_NUMBER: {VARCHAR(3)} <br>
     * 棚番号
     * @return The value of the column 'SHELF_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public String getShelfNumber() {
        checkSpecifiedProperty("shelfNumber");
        return _shelfNumber;
    }

    /**
     * [set] SHELF_NUMBER: {VARCHAR(3)} <br>
     * 棚番号
     * @param shelfNumber The value of the column 'SHELF_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShelfNumber(String shelfNumber) {
        registerModifiedProperty("shelfNumber");
        _shelfNumber = shelfNumber;
    }

    /**
     * [get] CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)} <br>
     * 管理番号
     * @return The value of the column 'CONTROL_NUMBER'. (basically NotNull if selected: for the constraint)
     */
    public String getControlNumber() {
        checkSpecifiedProperty("controlNumber");
        return _controlNumber;
    }

    /**
     * [set] CONTROL_NUMBER: {PK, NotNull, VARCHAR(10)} <br>
     * 管理番号
     * @param controlNumber The value of the column 'CONTROL_NUMBER'. (basically NotNull if update: for the constraint)
     */
    public void setControlNumber(String controlNumber) {
        registerModifiedProperty("controlNumber");
        _controlNumber = controlNumber;
    }

    /**
     * [get] REMARKS: {VARCHAR(255)} <br>
     * 備考
     * @return The value of the column 'REMARKS'. (NullAllowed even if selected: for no constraint)
     */
    public String getRemarks() {
        checkSpecifiedProperty("remarks");
        return _remarks;
    }

    /**
     * [set] REMARKS: {VARCHAR(255)} <br>
     * 備考
     * @param remarks The value of the column 'REMARKS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRemarks(String remarks) {
        registerModifiedProperty("remarks");
        _remarks = remarks;
    }

    /**
     * [get] DELETE_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 削除フラグ
     * @return The value of the column 'DELETE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDeleteFlg() {
        checkSpecifiedProperty("deleteFlg");
        return _deleteFlg;
    }

    /**
     * [set] DELETE_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 削除フラグ
     * @param deleteFlg The value of the column 'DELETE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDeleteFlg(String deleteFlg) {
        registerModifiedProperty("deleteFlg");
        _deleteFlg = deleteFlg;
    }

    /**
     * [get] VERSION: {INT(10), default=[0]} <br>
     * バージョン
     * @return The value of the column 'VERSION'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getVersion() {
        checkSpecifiedProperty("version");
        return _version;
    }

    /**
     * [set] VERSION: {INT(10), default=[0]} <br>
     * バージョン
     * @param version The value of the column 'VERSION'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersion(Integer version) {
        registerModifiedProperty("version");
        _version = version;
    }

    /**
     * [get] CREATED: {DATETIME(19), default=[current_timestamp()]} <br>
     * 登録日時
     * @return The value of the column 'CREATED'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getCreated() {
        checkSpecifiedProperty("created");
        return _created;
    }

    /**
     * [set] CREATED: {DATETIME(19), default=[current_timestamp()]} <br>
     * 登録日時
     * @param created The value of the column 'CREATED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreated(java.time.LocalDateTime created) {
        registerModifiedProperty("created");
        _created = created;
    }

    /**
     * [get] MODIFIED: {DATETIME(19), default=[current_timestamp()]} <br>
     * 更新日時
     * @return The value of the column 'MODIFIED'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getModified() {
        checkSpecifiedProperty("modified");
        return _modified;
    }

    /**
     * [set] MODIFIED: {DATETIME(19), default=[current_timestamp()]} <br>
     * 更新日時
     * @param modified The value of the column 'MODIFIED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setModified(java.time.LocalDateTime modified) {
        registerModifiedProperty("modified");
        _modified = modified;
    }

    /**
     * [get] MODIFIED_BY: {VARCHAR(255)} <br>
     * 更新者
     * @return The value of the column 'MODIFIED_BY'. (NullAllowed even if selected: for no constraint)
     */
    public String getModifiedBy() {
        checkSpecifiedProperty("modifiedBy");
        return _modifiedBy;
    }

    /**
     * [set] MODIFIED_BY: {VARCHAR(255)} <br>
     * 更新者
     * @param modifiedBy The value of the column 'MODIFIED_BY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setModifiedBy(String modifiedBy) {
        registerModifiedProperty("modifiedBy");
        _modifiedBy = modifiedBy;
    }
}
