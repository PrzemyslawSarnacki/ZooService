
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Parents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HealthParameters" type="{http://www.example.org/NewService/}HealthParametersType"/>
 *         &lt;element name="Popularity" type="{http://www.example.org/NewService/}PopularityType"/>
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
    "age",
    "parents",
    "healthParameters",
    "popularity"
})
@XmlRootElement(name = "SearchAnimalResponse")
public class SearchAnimalResponse {

    protected int id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Age")
    protected int age;
    @XmlElement(name = "Parents", required = true)
    protected String parents;
    @XmlElement(name = "HealthParameters", required = true)
    protected HealthParametersType healthParameters;
    @XmlElement(name = "Popularity", required = true)
    protected PopularityType popularity;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
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
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the parents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParents() {
        return parents;
    }

    /**
     * Sets the value of the parents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParents(String value) {
        this.parents = value;
    }

    /**
     * Gets the value of the healthParameters property.
     * 
     * @return
     *     possible object is
     *     {@link HealthParametersType }
     *     
     */
    public HealthParametersType getHealthParameters() {
        return healthParameters;
    }

    /**
     * Sets the value of the healthParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthParametersType }
     *     
     */
    public void setHealthParameters(HealthParametersType value) {
        this.healthParameters = value;
    }

    /**
     * Gets the value of the popularity property.
     * 
     * @return
     *     possible object is
     *     {@link PopularityType }
     *     
     */
    public PopularityType getPopularity() {
        return popularity;
    }

    /**
     * Sets the value of the popularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PopularityType }
     *     
     */
    public void setPopularity(PopularityType value) {
        this.popularity = value;
    }

}
