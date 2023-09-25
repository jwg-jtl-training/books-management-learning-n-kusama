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
 * The entity of staff_user as TABLE. <br>
 * 職員
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsStaffUser extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)} */
    protected String _staffUserId;

    /** PASSWORD: {NotNull, VARCHAR(255)} */
    protected String _password;

    /** NAME_KANA: {NotNull, VARCHAR(50)} */
    protected String _nameKana;

    /** NAME: {NotNull, VARCHAR(25)} */
    protected String _name;

    /** EMAIL: {NotNull, VARCHAR(255)} */
    protected String _email;

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
        return "staff_user";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        if (_staffUserId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param staffUserId : PK, UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueBy(String staffUserId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("staffUserId");
        setStaffUserId(staffUserId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** user_role_map by STAFF_USER_ID, named 'userRoleMapList'. */
    protected List<UserRoleMap> _userRoleMapList;

    /**
     * [get] user_role_map by STAFF_USER_ID, named 'userRoleMapList'.
     * @return The entity list of referrer property 'userRoleMapList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserRoleMap> getUserRoleMapList() {
        if (_userRoleMapList == null) { _userRoleMapList = newReferrerList(); }
        return _userRoleMapList;
    }

    /**
     * [set] user_role_map by STAFF_USER_ID, named 'userRoleMapList'.
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
        if (obj instanceof BsStaffUser) {
            BsStaffUser other = (BsStaffUser)obj;
            if (!xSV(_id, other._id)) { return false; }
            if (!xSV(_staffUserId, other._staffUserId)) { return false; }
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
        hs = xCH(hs, _staffUserId);
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
        sb.append(dm).append(xfND(_staffUserId));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_nameKana));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_email));
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
    public StaffUser clone() {
        return (StaffUser)super.clone();
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
     * [get] STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)} <br>
     * 職員ID
     * @return The value of the column 'STAFF_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getStaffUserId() {
        checkSpecifiedProperty("staffUserId");
        return _staffUserId;
    }

    /**
     * [set] STAFF_USER_ID: {PK, UQ, NotNull, VARCHAR(10)} <br>
     * 職員ID
     * @param staffUserId The value of the column 'STAFF_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setStaffUserId(String staffUserId) {
        registerModifiedProperty("staffUserId");
        _staffUserId = staffUserId;
    }

    /**
     * [get] PASSWORD: {NotNull, VARCHAR(255)} <br>
     * パスワード
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] PASSWORD: {NotNull, VARCHAR(255)} <br>
     * パスワード
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] NAME_KANA: {NotNull, VARCHAR(50)} <br>
     * 氏名カナ
     * @return The value of the column 'NAME_KANA'. (basically NotNull if selected: for the constraint)
     */
    public String getNameKana() {
        checkSpecifiedProperty("nameKana");
        return _nameKana;
    }

    /**
     * [set] NAME_KANA: {NotNull, VARCHAR(50)} <br>
     * 氏名カナ
     * @param nameKana The value of the column 'NAME_KANA'. (basically NotNull if update: for the constraint)
     */
    public void setNameKana(String nameKana) {
        registerModifiedProperty("nameKana");
        _nameKana = nameKana;
    }

    /**
     * [get] NAME: {NotNull, VARCHAR(25)} <br>
     * 氏名
     * @return The value of the column 'NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getName() {
        checkSpecifiedProperty("name");
        return _name;
    }

    /**
     * [set] NAME: {NotNull, VARCHAR(25)} <br>
     * 氏名
     * @param name The value of the column 'NAME'. (basically NotNull if update: for the constraint)
     */
    public void setName(String name) {
        registerModifiedProperty("name");
        _name = name;
    }

    /**
     * [get] EMAIL: {NotNull, VARCHAR(255)} <br>
     * メールアドレス
     * @return The value of the column 'EMAIL'. (basically NotNull if selected: for the constraint)
     */
    public String getEmail() {
        checkSpecifiedProperty("email");
        return _email;
    }

    /**
     * [set] EMAIL: {NotNull, VARCHAR(255)} <br>
     * メールアドレス
     * @param email The value of the column 'EMAIL'. (basically NotNull if update: for the constraint)
     */
    public void setEmail(String email) {
        registerModifiedProperty("email");
        _email = email;
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
