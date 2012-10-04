
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
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rdl_Class_Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}commodity_Tip" maxOccurs="unbounded"/>
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
    "name",
    "rdlClassId",
    "commo"
})
@XmlRootElement(name = "commodity")
public class Commodity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "rdl_Class_Id", required = true)
    protected String rdlClassId;
    @XmlElement(name = "commodity_Tip", required = true)
    protected List<CommodityTip> commo;

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
     * Gets the value of the rdlClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRdlClassId() {
        return rdlClassId;
    }

    /**
     * Sets the value of the rdlClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRdlClassId(String value) {
        this.rdlClassId = value;
    }

    /**
     * Gets the value of the commo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityTip }
     * 
     * 
     */
    public List<CommodityTip> getCommo() {
        if (commo == null) {
            commo = new ArrayList<CommodityTip>();
        }
        return this.commo;
    }

    /**
     * Sets the value of the commo property.
     * 
     * @param commo
     *     allowed object is
     *     {@link CommodityTip }
     *     
     */
    public void setCommo(List<CommodityTip> commo) {
        this.commo = commo;
    }

}
