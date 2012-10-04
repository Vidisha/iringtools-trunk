
package org.iringtools.mapping;

import java.io.Serializable;
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
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="patternId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ordinal",
    "patternId"
})
@XmlRootElement(name = "OrdinalPk")
public class OrdinalPk
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int ordinal;
    @XmlElement(required = true)
    protected String patternId;

    /**
     * Gets the value of the ordinal property.
     * 
     */
    public int getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     */
    public void setOrdinal(int value) {
        this.ordinal = value;
    }

    /**
     * Gets the value of the patternId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatternId() {
        return patternId;
    }

    /**
     * Sets the value of the patternId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatternId(String value) {
        this.patternId = value;
    }

}
