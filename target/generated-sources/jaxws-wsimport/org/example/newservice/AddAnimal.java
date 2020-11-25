
package org.example.newservice;

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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Parents" type="{http://www.example.org/NewService/}ParentsType"/>
 *         &lt;element name="AnimalDetails" type="{http://www.example.org/NewService/}AnimalDetailsType"/>
 *         &lt;element name="AnimalClassification" type="{http://www.example.org/NewService/}AnimalClassificationType"/>
 *         &lt;element name="LastVaccination" type="{http://www.example.org/NewService/}LastVaccinationType"/>
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
    "name",
    "parents",
    "animalDetails",
    "animalClassification",
    "lastVaccination"
})
@XmlRootElement(name = "AddAnimal")
public class AddAnimal {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Parents", required = true)
    protected ParentsType parents;
    @XmlElement(name = "AnimalDetails", required = true)
    protected AnimalDetailsType animalDetails;
    @XmlElement(name = "AnimalClassification", required = true)
    protected AnimalClassificationType animalClassification;
    @XmlElement(name = "LastVaccination", required = true)
    protected LastVaccinationType lastVaccination;

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
     * Gets the value of the parents property.
     * 
     * @return
     *     possible object is
     *     {@link ParentsType }
     *     
     */
    public ParentsType getParents() {
        return parents;
    }

    /**
     * Sets the value of the parents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentsType }
     *     
     */
    public void setParents(ParentsType value) {
        this.parents = value;
    }

    /**
     * Gets the value of the animalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalDetailsType }
     *     
     */
    public AnimalDetailsType getAnimalDetails() {
        return animalDetails;
    }

    /**
     * Sets the value of the animalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalDetailsType }
     *     
     */
    public void setAnimalDetails(AnimalDetailsType value) {
        this.animalDetails = value;
    }

    /**
     * Gets the value of the animalClassification property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalClassificationType }
     *     
     */
    public AnimalClassificationType getAnimalClassification() {
        return animalClassification;
    }

    /**
     * Sets the value of the animalClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalClassificationType }
     *     
     */
    public void setAnimalClassification(AnimalClassificationType value) {
        this.animalClassification = value;
    }

    /**
     * Gets the value of the lastVaccination property.
     * 
     * @return
     *     possible object is
     *     {@link LastVaccinationType }
     *     
     */
    public LastVaccinationType getLastVaccination() {
        return lastVaccination;
    }

    /**
     * Sets the value of the lastVaccination property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastVaccinationType }
     *     
     */
    public void setLastVaccination(LastVaccinationType value) {
        this.lastVaccination = value;
    }

}
