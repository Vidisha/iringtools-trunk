
package org.w3._2007.sparql.results;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.w3.org/2007/SPARQL/results#}uri"/>
 *         &lt;element ref="{http://www.w3.org/2007/SPARQL/results#}bnode"/>
 *         &lt;element ref="{http://www.w3.org/2007/SPARQL/results#}literal"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/2007/SPARQL/results#}nameAttr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "literal",
    "bnode",
    "uri"
})
@XmlRootElement(name = "binding")
public class Binding {

    protected Literal literal;
    protected String bnode;
    protected String uri;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String name;

    /**
     * Gets the value of the literal property.
     * 
     * @return
     *     possible object is
     *     {@link Literal }
     *     
     */
    public Literal getLiteral() {
        return literal;
    }

    /**
     * Sets the value of the literal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Literal }
     *     
     */
    public void setLiteral(Literal value) {
        this.literal = value;
    }

    /**
     * Gets the value of the bnode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnode() {
        return bnode;
    }

    /**
     * Sets the value of the bnode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnode(String value) {
        this.bnode = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
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

}
