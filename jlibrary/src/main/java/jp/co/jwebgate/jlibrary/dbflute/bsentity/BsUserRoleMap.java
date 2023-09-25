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
 * The entity of USER_ROLE_MAP as TABLE. <br>
 * ユーザー権限マップ
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserRoleMap extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

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

    /** STAFF_USER_ID: {UQ+, VARCHAR(10), FK to STAFF_USER} */
    protected String _staffUserId;

    /** GENERAL_USER_ID: {+UQ, IX, VARCHAR(10), FK to GENERAL_USER} */
    protected String _generalUserId;

    /** ROLE_ID: {+UQ, IX, NotNull, INT(10), FK to ROLE} */
    protected Integer _roleId;

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
        return "USER_ROLE_MAP";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param staffUserId : UQ+, VARCHAR(10), FK to STAFF_USER. (NotNull)
     * @param generalUserId : +UQ, IX, VARCHAR(10), FK to GENERAL_USER. (NotNull)
     * @param roleId : +UQ, IX, NotNull, INT(10), FK to ROLE. (NotNull)
     */
    public void uniqueBy(String staffUserId, String generalUserId, Integer roleId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("staffUserId");
        __uniqueDrivenProperties.addPropertyName("generalUserId");
        __uniqueDrivenProperties.addPropertyName("roleId");
        setStaffUserId(staffUserId);setGeneralUserId(generalUserId);setRoleId(roleId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** GENERAL_USER by my GENERAL_USER_ID, named 'generalUser'. */
    protected OptionalEntity<GeneralUser> _generalUser;

    /**
     * [get] GENERAL_USER by my GENERAL_USER_ID, named 'generalUser'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'generalUser'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<GeneralUser> getGeneralUser() {
        if (_generalUser == null) { _generalUser = OptionalEntity.relationEmpty(this, "generalUser"); }
        return _generalUser;
    }

    /**
     * [set] GENERAL_USER by my GENERAL_USER_ID, named 'generalUser'.
     * @param generalUser The entity of foreign property 'generalUser'. (NullAllowed)
     */
    public void setGeneralUser(OptionalEntity<GeneralUser> generalUser) {
        _generalUser = generalUser;
    }

    /** ROLE by my ROLE_ID, named 'role'. */
    protected OptionalEntity<Role> _role;

    /**
     * [get] ROLE by my ROLE_ID, named 'role'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'role'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Role> getRole() {
        if (_role == null) { _role = OptionalEntity.relationEmpty(this, "role"); }
        return _role;
    }

    /**
     * [set] ROLE by my ROLE_ID, named 'role'.
     * @param role The entity of foreign property 'role'. (NullAllowed)
     */
    public void setRole(OptionalEntity<Role> role) {
        _role = role;
    }

    /** STAFF_USER by my STAFF_USER_ID, named 'staffUser'. */
    protected OptionalEntity<StaffUser> _staffUser;

    /**
     * [get] STAFF_USER by my STAFF_USER_ID, named 'staffUser'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'staffUser'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<StaffUser> getStaffUser() {
        if (_staffUser == null) { _staffUser = OptionalEntity.relationEmpty(this, "staffUser"); }
        return _staffUser;
    }

    /**
     * [set] STAFF_USER by my STAFF_USER_ID, named 'staffUser'.
     * @param staffUser The entity of foreign property 'staffUser'. (NullAllowed)
     */
    public void setStaffUser(OptionalEntity<StaffUser> staffUser) {
        _staffUser = staffUser;
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
        if (obj instanceof BsUserRoleMap) {
            BsUserRoleMap other = (BsUserRoleMap)obj;
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
        if (_generalUser != null && _generalUser.isPresent())
        { sb.append(li).append(xbRDS(_generalUser, "generalUser")); }
        if (_role != null && _role.isPresent())
        { sb.append(li).append(xbRDS(_role, "role")); }
        if (_staffUser != null && _staffUser.isPresent())
        { sb.append(li).append(xbRDS(_staffUser, "staffUser")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_staffUserId));
        sb.append(dm).append(xfND(_generalUserId));
        sb.append(dm).append(xfND(_roleId));
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
        if (_generalUser != null && _generalUser.isPresent())
        { sb.append(dm).append("generalUser"); }
        if (_role != null && _role.isPresent())
        { sb.append(dm).append("role"); }
        if (_staffUser != null && _staffUser.isPresent())
        { sb.append(dm).append("staffUser"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public UserRoleMap clone() {
        return (UserRoleMap)super.clone();
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
     * [get] STAFF_USER_ID: {UQ+, VARCHAR(10), FK to STAFF_USER} <br>
     * 職員ID
     * @return The value of the column 'STAFF_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getStaffUserId() {
        checkSpecifiedProperty("staffUserId");
        return _staffUserId;
    }

    /**
     * [set] STAFF_USER_ID: {UQ+, VARCHAR(10), FK to STAFF_USER} <br>
     * 職員ID
     * @param staffUserId The value of the column 'STAFF_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStaffUserId(String staffUserId) {
        registerModifiedProperty("staffUserId");
        _staffUserId = staffUserId;
    }

    /**
     * [get] GENERAL_USER_ID: {+UQ, IX, VARCHAR(10), FK to GENERAL_USER} <br>
     * 利用者ID
     * @return The value of the column 'GENERAL_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getGeneralUserId() {
        checkSpecifiedProperty("generalUserId");
        return _generalUserId;
    }

    /**
     * [set] GENERAL_USER_ID: {+UQ, IX, VARCHAR(10), FK to GENERAL_USER} <br>
     * 利用者ID
     * @param generalUserId The value of the column 'GENERAL_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGeneralUserId(String generalUserId) {
        registerModifiedProperty("generalUserId");
        _generalUserId = generalUserId;
    }

    /**
     * [get] ROLE_ID: {+UQ, IX, NotNull, INT(10), FK to ROLE} <br>
     * 権限ID
     * @return The value of the column 'ROLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRoleId() {
        checkSpecifiedProperty("roleId");
        return _roleId;
    }

    /**
     * [set] ROLE_ID: {+UQ, IX, NotNull, INT(10), FK to ROLE} <br>
     * 権限ID
     * @param roleId The value of the column 'ROLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRoleId(Integer roleId) {
        registerModifiedProperty("roleId");
        _roleId = roleId;
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
