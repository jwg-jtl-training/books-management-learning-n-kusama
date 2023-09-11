package jp.co.jwebgate.jlibrary.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import jp.co.jwebgate.jlibrary.dbflute.exentity.customize.*;

/**
 * The entity of NewGeneralUserId.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsNewGeneralUserId extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NEW_GENERAL_USER_ID: {VARCHAR(6)} */
    protected String _newGeneralUserId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return jp.co.jwebgate.jlibrary.dbflute.bsentity.customize.dbmeta.NewGeneralUserIdDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "NewGeneralUserId";
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
        if (obj instanceof BsNewGeneralUserId) {
            BsNewGeneralUserId other = (BsNewGeneralUserId)obj;
            if (!xSV(_newGeneralUserId, other._newGeneralUserId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _newGeneralUserId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_newGeneralUserId));
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
    public NewGeneralUserId clone() {
        return (NewGeneralUserId)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NEW_GENERAL_USER_ID: {VARCHAR(6)} <br>
     * @return The value of the column 'NEW_GENERAL_USER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getNewGeneralUserId() {
        checkSpecifiedProperty("newGeneralUserId");
        return _newGeneralUserId;
    }

    /**
     * [set] NEW_GENERAL_USER_ID: {VARCHAR(6)} <br>
     * @param newGeneralUserId The value of the column 'NEW_GENERAL_USER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNewGeneralUserId(String newGeneralUserId) {
        registerModifiedProperty("newGeneralUserId");
        _newGeneralUserId = newGeneralUserId;
    }
}
