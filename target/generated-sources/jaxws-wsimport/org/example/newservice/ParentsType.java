
package org.example.newservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MotherName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FatherName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentsType", propOrder = {
    "motherName",
    "fatherName"
})
public class ParentsType {

    @XmlElement(name = "MotherName", required = true)
    protected String motherName;
    @XmlElement(name = "FatherName", required = true)
    protected String fatherName;

    /**
     * Gets the value of the motherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * Sets the value of the motherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherName(String value) {
        this.motherName = value;
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

}
