
package wel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addAnimal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addAnimal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parents" type="{http://www.example.org/NewService/}ParentsType" minOccurs="0"/>
 *         &lt;element name="animalDetails" type="{http://www.example.org/NewService/}AnimalDetailsType" minOccurs="0"/>
 *         &lt;element name="animalClassification" type="{http://www.example.org/NewService/}AnimalClassificationType" minOccurs="0"/>
 *         &lt;element name="lastVaccination" type="{http://www.example.org/NewService/}LastVaccinationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAnimal", propOrder = {
    "name",
    "parents",
    "animalDetails",
    "animalClassification",
    "lastVaccination"
})
public class AddAnimal {

    protected String name;
    protected ParentsType parents;
    protected AnimalDetailsType animalDetails;
    protected AnimalClassificationType animalClassification;
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
