
package org.example.newservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeartRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Coordinates" type="{http://www.example.org/NewService/}CoordinatesType"/>
 *         &lt;element name="Mood" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HealthState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VaccinationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthParametersType", propOrder = {
    "heartRate",
    "coordinates",
    "mood",
    "healthState",
    "vaccinationRequired"
})
public class HealthParametersType {

    @XmlElement(name = "HeartRate")
    protected int heartRate;
    @XmlElement(name = "Coordinates", required = true)
    protected CoordinatesType coordinates;
    @XmlElement(name = "Mood", required = true)
    protected String mood;
    @XmlElement(name = "HealthState", required = true)
    protected String healthState;
    @XmlElement(name = "VaccinationRequired")
    protected boolean vaccinationRequired;

    /**
     * Gets the value of the heartRate property.
     * 
     */
    public int getHeartRate() {
        return heartRate;
    }

    /**
     * Sets the value of the heartRate property.
     * 
     */
    public void setHeartRate(int value) {
        this.heartRate = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the mood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMood() {
        return mood;
    }

    /**
     * Sets the value of the mood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMood(String value) {
        this.mood = value;
    }

    /**
     * Gets the value of the healthState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthState() {
        return healthState;
    }

    /**
     * Sets the value of the healthState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthState(String value) {
        this.healthState = value;
    }

    /**
     * Gets the value of the vaccinationRequired property.
     * 
     */
    public boolean isVaccinationRequired() {
        return vaccinationRequired;
    }

    /**
     * Sets the value of the vaccinationRequired property.
     * 
     */
    public void setVaccinationRequired(boolean value) {
        this.vaccinationRequired = value;
    }

}
