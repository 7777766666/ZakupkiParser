//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:15 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.complaint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.models._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for complaintVerificationPlanItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complaintVerificationPlanItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="complaintVerificationPlanData" type="{http://zakupki.gov.ru/223fz/complaint/1}complaintVerificationPlanDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complaintVerificationPlanItemType", propOrder = {
    "complaintVerificationPlanData"
})
public class ComplaintVerificationPlanItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected ComplaintVerificationPlanDataType complaintVerificationPlanData;

    /**
     * Gets the value of the complaintVerificationPlanData property.
     * 
     * @return
     *     possible object is
     *     {@link ComplaintVerificationPlanDataType }
     *     
     */
    public ComplaintVerificationPlanDataType getComplaintVerificationPlanData() {
        return complaintVerificationPlanData;
    }

    /**
     * Sets the value of the complaintVerificationPlanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplaintVerificationPlanDataType }
     *     
     */
    public void setComplaintVerificationPlanData(ComplaintVerificationPlanDataType value) {
        this.complaintVerificationPlanData = value;
    }

}
