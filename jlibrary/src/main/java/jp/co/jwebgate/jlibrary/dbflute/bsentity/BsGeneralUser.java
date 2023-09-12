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
 * The entity of GENERAL_USER as TABLE. <br>
 * 一般利用者
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsGeneralUser extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** GENERAL_USER_ID: {PK, UQ, NotNull, VARCHAR(10)} */
    protected String _generalUserId;

    /** PASSWORD: {NotNull, VARCHAR(255)} */
    protected String _password;

    /** NAME_KANA: {NotNull, VARCHAR(50)} */
    protected String _nameKana;

    /** NAME: {NotNull, VARCHAR(25)} */
    protected String _name;

    /** BIRTHDAY: {NotNull, DATE(10)} */
    protected java.time.LocalDate _birthday;

    /** PHONE_NUMBER: {NotNull, VARCHAR(11)} */
    protected String _phoneNumber;

    /** ADDRESS: {NotNull, VARCHAR(255)} */
    protected String _address;

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
        return "GENERAL_USER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        if (_generalUserId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param generalUserId : PK, UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueBy(String generalUserId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("generalUserId");
        setGeneralUserId(generalUserId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** USER_ROLE_MAP by GENERAL_USER_ID, named 'userRoleMapList'. */
    protected List<UserRoleMap> _userRoleMapList;

    /**
     * [get] USER_ROLE_MAP by GENERAL_USER_ID, named 'userRoleMapList'.
     * @return The entity list of referrer property 'userRoleMapList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserRoleMap> getUserRoleMapList() {
        if (_userRoleMapList == null) { _userRoleMapList = newReferrerList(); }
        return _userRoleMapList;
    }

    /**
     * [set] USER_ROLE_MAP by GENERAL_USER_ID, named 'userRoleMapList'.
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
        if (obj instanceof BsGeneralUser) {
            BsGeneralUser other = (BsGeneralUser)obj;
            if (!xSV(_id, other._id)) { return false; }
            if (!xSV(_generalUserId, other._generalUserId)) { return false; }
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
        hs = xCH(hs, _generalUserId);
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
        sb.append(dm).append(xfND(_generalUserId));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_nameKana));
        sb.append(dm).append(xfND(_name));
        sb.append(dm).append(xfND(_birthday));
        sb.append(dm).append(xfND(_phoneNumber));
        sb.append(dm).append(xfND(_address));
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
    public GeneralUser clone() {
        return (GeneralUser)super.clone();
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
     * [get] GENERAL_USER_ID: {PK, UQ, NotNull, VARCHAR(10)} <br>
     * 利用者ID
     * @return The value of the column 'GENERAL_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getGeneralUserId() {
        checkSpecifiedProperty("generalUserId");
        return _generalUserId;
    }

    /**
     * [set] GENERAL_USER_ID: {PK, UQ, NotNull, VARCHAR(10)} <br>
     * 利用者ID
     * @param generalUserId The value of the column 'GENERAL_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGeneralUserId(String generalUserId) {
        registerModifiedProperty("generalUserId");
        _generalUserId = generalUserId;
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
     * フリガナ
     * @return The value of the column 'NAME_KANA'. (basically NotNull if selected: for the constraint)
     */
    public String getNameKana() {
        checkSpecifiedProperty("nameKana");
        return _nameKana;
    }

    /**
     * [set] NAME_KANA: {NotNull, VARCHAR(50)} <br>
     * フリガナ
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
     * [get] BIRTHDAY: {NotNull, DATE(10)} <br>
     * 生年月日
     * @return The value of the column 'BIRTHDAY'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getBirthday() {
        checkSpecifiedProperty("birthday");
        return _birthday;
    }

    /**
     * [set] BIRTHDAY: {NotNull, DATE(10)} <br>
     * 生年月日
     * @param birthday The value of the column 'BIRTHDAY'. (basically NotNull if update: for the constraint)
     */
    public void setBirthday(java.time.LocalDate birthday) {
        registerModifiedProperty("birthday");
        _birthday = birthday;
    }

    /**
     * [get] PHONE_NUMBER: {NotNull, VARCHAR(11)} <br>
     * 電話番号
     * @return The value of the column 'PHONE_NUMBER'. (basically NotNull if selected: for the constraint)
     */
    public String getPhoneNumber() {
        checkSpecifiedProperty("phoneNumber");
        return _phoneNumber;
    }

    /**
     * [set] PHONE_NUMBER: {NotNull, VARCHAR(11)} <br>
     * 電話番号
     * @param phoneNumber The value of the column 'PHONE_NUMBER'. (basically NotNull if update: for the constraint)
     */
    public void setPhoneNumber(String phoneNumber) {
        registerModifiedProperty("phoneNumber");
        _phoneNumber = phoneNumber;
    }

    /**
     * [get] ADDRESS: {NotNull, VARCHAR(255)} <br>
     * 住所
     * @return The value of the column 'ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getAddress() {
        checkSpecifiedProperty("address");
        return _address;
    }

    /**
     * [set] ADDRESS: {NotNull, VARCHAR(255)} <br>
     * 住所
     * @param address The value of the column 'ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setAddress(String address) {
        registerModifiedProperty("address");
        _address = address;
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
