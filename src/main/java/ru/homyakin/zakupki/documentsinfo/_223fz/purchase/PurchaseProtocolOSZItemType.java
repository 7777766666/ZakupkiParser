//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.29 at 05:25:54 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.purchase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for purchaseProtocolOSZItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolOSZItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolOSZData" type="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolOSZDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolOSZItemType", propOrder = {
    "purchaseProtocolOSZData"
})
public class PurchaseProtocolOSZItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolOSZDataType purchaseProtocolOSZData;

    /**
     * Gets the value of the purchaseProtocolOSZData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolOSZDataType }
     *     
     */
    public PurchaseProtocolOSZDataType getPurchaseProtocolOSZData() {
        return purchaseProtocolOSZData;
    }

    /**
     * Sets the value of the purchaseProtocolOSZData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolOSZDataType }
     *     
     */
    public void setPurchaseProtocolOSZData(PurchaseProtocolOSZDataType value) {
        this.purchaseProtocolOSZData = value;
    }

}