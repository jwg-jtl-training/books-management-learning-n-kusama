package jp.co.jwebgate.jlibrary.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import jp.co.jwebgate.jlibrary.dbflute.allcommon.EntityDefinedCommonColumn;
import jp.co.jwebgate.jlibrary.dbflute.allcommon.DBMetaInstanceHandler;
import jp.co.jwebgate.jlibrary.dbflute.exentity.*;

/**
 * The entity of role as TABLE. <br>
 * 権限
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsRole extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** CD: {NotNull, VARCHAR(255)} */
    protected String _cd;

    /** NAME: {NotNull, VARCHAR(255)} */
    protected String _name;

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
        return "role";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** user_role_map by ROLE_ID, named 'userRoleMapList'. */
    protected List<UserRoleMap> _userRoleMapList;

    /**
     * [get] user_role_map by ROLE_ID, named 'userRoleMapList'.
     * @return The entity list of referrer property 'userRoleMapList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserRoleMap> getUserRoleMapList() {
        if (_userRoleMapList == null) { _userRoleMapList = newReferrerList(); }
        return _userRoleMapList;
    }

    /**
     * [set] user_role_map by ROLE_ID, named 'userRoleMapList'.
     * @param userRoleMapList The entity list of referrer property 'userRoleMapList'. (NullAllowed)
     */
    public void setUserRoleMapList(List<UserRoleMap> userRoleMapList) {
        _userRoleMapList = userRoleMapList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsRole) {
            BsRole other = (BsRole)obj;
            if (!xSV(_id, other._id)) { return false; }
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
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userRoleMapList != null) { for (UserRoleMap et : _userRoleMapList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userRoleMapList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_cd));
        sb.append(dm).append(xfND(_name));
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
        if (_userRoleMapList != null && !_userRoleMapList.isEmpty())
        { sb.append(dm).append("userRoleMapList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Role clone() {
        return (Role)super.clone();
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
     * [get] CD: {NotNull, VARCHAR(255)} <br>
     * コード
     * @return The value of the column 'CD'. (basically NotNull if selected: for the constraint)
     */
    public String getCd() {
        checkSpecifiedProperty("cd");
        return _cd;
    }

    /**
     * [set] CD: {NotNull, VARCHAR(255)} <br>
     * コード
     * @param cd The value of the column 'CD'. (basically NotNull if update: for the constraint)
     */
    public void setCd(String cd) {
        registerModifiedProperty("cd");
        _cd = cd;
    }

    /**
     * [get] NAME: {NotNull, VARCHAR(255)} <br>
     * 名称
     * @return The value of the column 'NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] NAME: {NotNull, VARCHAR(255)} <br>
     * 名称
     * @param name The value of the column 'NAME'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
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
