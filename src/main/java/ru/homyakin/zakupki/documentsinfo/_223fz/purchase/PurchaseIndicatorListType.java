//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:09:47 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.purchase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Значения по показателям отчета
 * 
 * <p>Java class for purchaseIndicatorListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseIndicatorListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseIndicatorType" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseIndicatorType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseIndicatorListType", propOrder = {
    "purchaseIndicatorType"
})
public class PurchaseIndicatorListType {

    @XmlElement(required = true)
    protected List<PurchaseIndicatorType> purchaseIndicatorType;

    /**
     * Gets the value of the purchaseIndicatorType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseIndicatorType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseIndicatorType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseIndicatorType }
     * 
     * 
     */
    public List<PurchaseIndicatorType> getPurchaseIndicatorType() {
        if (purchaseIndicatorType == null) {
            purchaseIndicatorType = new ArrayList<PurchaseIndicatorType>();
        }
        return this.purchaseIndicatorType;
    }

}
