
package wel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnimalClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalClassificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Family" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Genus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimalClassificationType", namespace = "http://www.example.org/NewService/", propOrder = {
    "domain",
    "clazz",
    "order",
    "family",
    "genus"
})
public class AnimalClassificationType {

    @XmlElement(name = "Domain", required = true)
    protected String domain;
    @XmlElement(name = "Class", required = true)
    protected String clazz;
    @XmlElement(name = "Order", required = true)
    protected String order;
    @XmlElement(name = "Family", required = true)
    protected String family;
    @XmlElement(name = "Genus", required = true)
    protected String genus;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
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
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Gets the value of the genus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenus() {
        return genus;
    }

    /**
     * Sets the value of the genus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenus(String value) {
        this.genus = value;
    }

}
