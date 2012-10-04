
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
 *         &lt;element name="typical_Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tip_Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}ordinal" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}ordinalList" maxOccurs="unbounded"/>
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
    "typicalValue",
    "tipId",
    "patternId",
    "ord"
})
@XmlRootElement(name = "patterns")
public class Patterns
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "typical_Value", required = true)
    protected String typicalValue;
    @XmlElement(name = "tip_Id", required = true)
    protected String tipId;
    @XmlElement(name = "ordinal", required = true)
    protected List<Ordinal> patternId;
    @XmlElement(name = "ordinalList", required = true)
    protected List<OrdinalList> ord;

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
     * Gets the value of the typicalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypicalValue() {
        return typicalValue;
    }

    /**
     * Sets the value of the typicalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypicalValue(String value) {
        this.typicalValue = value;
    }

    /**
     * Gets the value of the tipId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipId() {
        return tipId;
    }

    /**
     * Sets the value of the tipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipId(String value) {
        this.tipId = value;
    }

    /**
     * Gets the value of the patternId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patternId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatternId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ordinal }
     * 
     * 
     */
    public List<Ordinal> getPatternId() {
        if (patternId == null) {
            patternId = new ArrayList<Ordinal>();
        }
        return this.patternId;
    }

    /**
     * Gets the value of the ord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdinalList }
     * 
     * 
     */
    public List<OrdinalList> getOrd() {
        if (ord == null) {
            ord = new ArrayList<OrdinalList>();
        }
        return this.ord;
    }

    /**
     * Sets the value of the patternId property.
     * 
     * @param patternId
     *     allowed object is
     *     {@link Ordinal }
     *     
     */
    public void setPatternId(List<Ordinal> patternId) {
        this.patternId = patternId;
    }

    /**
     * Sets the value of the ord property.
     * 
     * @param ord
     *     allowed object is
     *     {@link OrdinalList }
     *     
     */
    public void setOrd(List<OrdinalList> ord) {
        this.ord = ord;
    }

}
