package jp.co.jwebgate.jlibrary.dbflute.allcommon;

import org.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of created.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getCreated();

    /**
     * Set the value of created.
     * @param created The instance of the property type. (NullAllowed)
     */
    void setCreated(java.time.LocalDateTime created);

    /**
     * Get the value of modifiedBy.
     * @return The instance of the property type. (NullAllowed)
     */
    String getModifiedBy();

    /**
     * Set the value of modifiedBy.
     * @param modifiedBy The instance of the property type. (NullAllowed)
     */
    void setModifiedBy(String modifiedBy);

    /**
     * Get the value of modified.
     * @return The instance of the property type. (NullAllowed)
     */
    java.time.LocalDateTime getModified();

    /**
     * Set the value of modified.
     * @param modified The instance of the property type. (NullAllowed)
     */
    void setModified(java.time.LocalDateTime modified);

    /**
     * Get the value of version.
     * @return The instance of the property type. (NullAllowed)
     */
    Integer getVersion();

    /**
     * Set the value of version.
     * @param version The instance of the property type. (NullAllowed)
     */
    void setVersion(Integer version);
}
