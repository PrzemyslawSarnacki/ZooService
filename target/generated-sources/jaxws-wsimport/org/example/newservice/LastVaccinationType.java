
package org.example.newservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LastVaccinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastVaccinationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VaccinationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="VaccineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastVaccinationType", propOrder = {
    "vaccinationDate",
    "vaccineName"
})
public class LastVaccinationType {

    @XmlElement(name = "VaccinationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vaccinationDate;
    @XmlElement(name = "VaccineName", required = true)
    protected String vaccineName;

    /**
     * Gets the value of the vaccinationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVaccinationDate() {
        return vaccinationDate;
    }

    /**
     * Sets the value of the vaccinationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVaccinationDate(XMLGregorianCalendar value) {
        this.vaccinationDate = value;
    }

    /**
     * Gets the value of the vaccineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVaccineName() {
        return vaccineName;
    }

    /**
     * Sets the value of the vaccineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaccineName(String value) {
        this.vaccineName = value;
    }

}
