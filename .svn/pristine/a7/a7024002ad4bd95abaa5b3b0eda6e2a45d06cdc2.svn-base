
package org.iringtools.mapping;

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
 *         &lt;element name="type" type="{http://www.iringtools.org/mapping}TemplateType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.iringtools.org/mapping}roleMaps"/>
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
   "templateid",
   "Patternid",
   "seqrole"
   
})
@XmlRootElement(name = "tipTest")
public class TipsTest {

    @XmlElement(required = false)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    protected String templateid;
    protected String Patternid;
//    protected RoleMap seqrole;
//
//        
//        public RoleMap getSeqrole()
//        {
//          return seqrole;
//        }
//    
//        public void setSeqrole(RoleMap seqrole)
//        {
//          this.seqrole = seqrole;
//        }

   public String getPatternid()
    {
      return Patternid;
    }

    public void setPatternid(String patternid)
    {
      Patternid = patternid;
    }

  public String getTemplateid()
    {
      return templateid;
    }

    public void setTemplateid(String templateid)
    {
      this.templateid = templateid;
    }

  protected List<TestRole> seqrole;

    
   public List<TestRole> getSeqrole()
    {
      return seqrole;
    }

    public void setSeqrole(List<TestRole>  seqrole)
    {
      this.seqrole = seqrole;
    }

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

    

}
