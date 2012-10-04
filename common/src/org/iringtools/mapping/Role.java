
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
 *         &lt;element name="template_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rdl_Role_Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Individual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}classes" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}classesList" maxOccurs="unbounded"/>
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
    "templateId",
    "rdlRoleId",
    "name",
    "type",
    "individual",
    "clazz",
    "classId",
    "classeslist"
})
@XmlRootElement(name = "role")
public class Role
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "template_id", required = true)
    protected String templateId;
    @XmlElement(name = "rdl_Role_Id", required = true)
    protected String rdlRoleId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "Individual", required = true)
    protected String individual;
    @XmlElement(name = "class", required = true)
    protected String clazz;
    @XmlElement(name = "classes", required = true)
    protected List<Classes> classId;
    @XmlElement(name = "classesList", required = true)
    protected List<ClassesList> classeslist;

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
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the rdlRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRdlRoleId() {
        return rdlRoleId;
    }

    /**
     * Sets the value of the rdlRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRdlRoleId(String value) {
        this.rdlRoleId = value;
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
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividual(String value) {
        this.individual = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the classId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Classes }
     * 
     * 
     */
    public List<Classes> getClassId() {
        if (classId == null) {
            classId = new ArrayList<Classes>();
        }
        return this.classId;
    }

    /**
     * Gets the value of the classeslist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classeslist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClasseslist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassesList }
     * 
     * 
     */
    public List<ClassesList> getClasseslist() {
        if (classeslist == null) {
            classeslist = new ArrayList<ClassesList>();
        }
        return this.classeslist;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param classId
     *     allowed object is
     *     {@link Classes }
     *     
     */
    public void setClassId(List<Classes> classId) {
        this.classId = classId;
    }

    /**
     * Sets the value of the classeslist property.
     * 
     * @param classeslist
     *     allowed object is
     *     {@link ClassesList }
     *     
     */
    public void setClasseslist(List<ClassesList> classeslist) {
        this.classeslist = classeslist;
    }

}
