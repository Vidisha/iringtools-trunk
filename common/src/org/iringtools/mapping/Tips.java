
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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}commodity_Tip" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}patterns" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}patternsList" maxOccurs="unbounded"/>
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
    "description",
    "level",
    "commo",
    "patId",
    "patt"
})
@XmlRootElement(name = "tips")
public class Tips
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String level;
    @XmlElement(name = "commodity_Tip", required = true)
    protected List<CommodityTip> commo;
    @XmlElement(name = "patterns", required = true)
    protected List<Patterns> patId;
    @XmlElement(name = "patternsList", required = true)
    protected List<PatternsList> patt;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
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
     * Gets the value of the patId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Patterns }
     * 
     * 
     */
    public List<Patterns> getPatId() {
        if (patId == null) {
            patId = new ArrayList<Patterns>();
        }
        return this.patId;
    }

    /**
     * Gets the value of the patt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatternsList }
     * 
     * 
     */
    public List<PatternsList> getPatt() {
        if (patt == null) {
            patt = new ArrayList<PatternsList>();
        }
        return this.patt;
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

    /**
     * Sets the value of the patId property.
     * 
     * @param patId
     *     allowed object is
     *     {@link Patterns }
     *     
     */
    public void setPatId(List<Patterns> patId) {
        this.patId = patId;
    }

    /**
     * Sets the value of the patt property.
     * 
     * @param patt
     *     allowed object is
     *     {@link PatternsList }
     *     
     */
    public void setPatt(List<PatternsList> patt) {
        this.patt = patt;
    }

}
