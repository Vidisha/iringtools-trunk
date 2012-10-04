
package org.iringtools.mapping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rdl_Template_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}role" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}ordinal" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}roleList" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "rdlTemplateId",
    "name",
    "type",
    "roleid",
    "ordi",
    "rolelist"
})
@XmlRootElement(name = "template")
public class Template
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "rdl_Template_id", required = true)
    protected String rdlTemplateId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "role", required = true)
    protected List<Role> roleid;
    @XmlElement(name = "ordinal", required = true)
    protected List<Ordinal> ordi;
    @XmlElement(name = "roleList", required = true)
    protected List<RoleList> rolelist;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the rdlTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRdlTemplateId() {
        return rdlTemplateId;
    }

    /**
     * Sets the value of the rdlTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRdlTemplateId(String value) {
        this.rdlTemplateId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the roleid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Role }
     * 
     * 
     */
    public List<Role> getRoleid() {
        if (roleid == null) {
            roleid = new ArrayList<Role>();
        }
        return this.roleid;
    }

    /**
     * Gets the value of the ordi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ordinal }
     * 
     * 
     */
    public List<Ordinal> getOrdi() {
        if (ordi == null) {
            ordi = new ArrayList<Ordinal>();
        }
        return this.ordi;
    }

    /**
     * Gets the value of the rolelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolelist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleList }
     * 
     * 
     */
    public List<RoleList> getRolelist() {
        if (rolelist == null) {
            rolelist = new ArrayList<RoleList>();
        }
        return this.rolelist;
    }

    /**
     * Sets the value of the roleid property.
     * 
     * @param roleid
     *     allowed object is
     *     {@link Role }
     *     
     */
    public void setRoleid(List<Role> roleid) {
        this.roleid = roleid;
    }

    /**
     * Sets the value of the ordi property.
     * 
     * @param ordi
     *     allowed object is
     *     {@link Ordinal }
     *     
     */
    public void setOrdi(List<Ordinal> ordi) {
        this.ordi = ordi;
    }

    /**
     * Sets the value of the rolelist property.
     * 
     * @param rolelist
     *     allowed object is
     *     {@link RoleList }
     *     
     */
    public void setRolelist(List<RoleList> rolelist) {
        this.rolelist = rolelist;
    }

}