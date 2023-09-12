package jp.co.jwebgate.jlibrary.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import jp.co.jwebgate.jlibrary.dbflute.exentity.customize.*;

/**
 * The entity of NewStaffUserId.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNewStaffUserId extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NEW_STAFF_USER_ID: {VARCHAR(6)} */
    protected String _newStaffUserId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return jp.co.jwebgate.jlibrary.dbflute.bsentity.customize.dbmeta.NewStaffUserIdDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "NewStaffUserId";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsNewStaffUserId) {
            BsNewStaffUserId other = (BsNewStaffUserId)obj;
            if (!xSV(_newStaffUserId, other._newStaffUserId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _newStaffUserId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_newStaffUserId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public NewStaffUserId clone() {
        return (NewStaffUserId)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NEW_STAFF_USER_ID: {VARCHAR(6)} <br>
     * @return The value of the column 'NEW_STAFF_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getNewStaffUserId() {
        checkSpecifiedProperty("newStaffUserId");
        return _newStaffUserId;
    }

    /**
     * [set] NEW_STAFF_USER_ID: {VARCHAR(6)} <br>
     * @param newStaffUserId The value of the column 'NEW_STAFF_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNewStaffUserId(String newStaffUserId) {
        registerModifiedProperty("newStaffUserId");
        _newStaffUserId = newStaffUserId;
    }
}
