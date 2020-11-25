
package org.example.newservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PopularityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PopularityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VisitorsToday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VisitorsYesterday" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MeanVisitorsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PopularityType", propOrder = {
    "visitorsToday",
    "visitorsYesterday",
    "meanVisitorsCount"
})
public class PopularityType {

    @XmlElement(name = "VisitorsToday")
    protected int visitorsToday;
    @XmlElement(name = "VisitorsYesterday")
    protected int visitorsYesterday;
    @XmlElement(name = "MeanVisitorsCount")
    protected int meanVisitorsCount;

    /**
     * Gets the value of the visitorsToday property.
     * 
     */
    public int getVisitorsToday() {
        return visitorsToday;
    }

    /**
     * Sets the value of the visitorsToday property.
     * 
     */
    public void setVisitorsToday(int value) {
        this.visitorsToday = value;
    }

    /**
     * Gets the value of the visitorsYesterday property.
     * 
     */
    public int getVisitorsYesterday() {
        return visitorsYesterday;
    }

    /**
     * Sets the value of the visitorsYesterday property.
     * 
     */
    public void setVisitorsYesterday(int value) {
        this.visitorsYesterday = value;
    }

    /**
     * Gets the value of the meanVisitorsCount property.
     * 
     */
    public int getMeanVisitorsCount() {
        return meanVisitorsCount;
    }

    /**
     * Sets the value of the meanVisitorsCount property.
     * 
     */
    public void setMeanVisitorsCount(int value) {
        this.meanVisitorsCount = value;
    }

}
