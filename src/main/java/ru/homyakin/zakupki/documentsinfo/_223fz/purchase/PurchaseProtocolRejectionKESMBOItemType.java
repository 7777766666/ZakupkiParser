//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:09:47 PM MSK 
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
 * <p>Java class for purchaseProtocolRejectionKESMBOItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolRejectionKESMBOItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="purchaseProtocolRejectionKESMBOData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRejectionDataType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolRejectionKESMBOItemType", propOrder = {
    "purchaseProtocolRejectionKESMBOData"
})
public class PurchaseProtocolRejectionKESMBOItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected PurchaseProtocolRejectionKESMBOItemType.PurchaseProtocolRejectionKESMBOData purchaseProtocolRejectionKESMBOData;

    /**
     * Gets the value of the purchaseProtocolRejectionKESMBOData property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolRejectionKESMBOItemType.PurchaseProtocolRejectionKESMBOData }
     *     
     */
    public PurchaseProtocolRejectionKESMBOItemType.PurchaseProtocolRejectionKESMBOData getPurchaseProtocolRejectionKESMBOData() {
        return purchaseProtocolRejectionKESMBOData;
    }

    /**
     * Sets the value of the purchaseProtocolRejectionKESMBOData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolRejectionKESMBOItemType.PurchaseProtocolRejectionKESMBOData }
     *     
     */
    public void setPurchaseProtocolRejectionKESMBOData(PurchaseProtocolRejectionKESMBOItemType.PurchaseProtocolRejectionKESMBOData value) {
        this.purchaseProtocolRejectionKESMBOData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolRejectionDataType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PurchaseProtocolRejectionKESMBOData
        extends PurchaseProtocolRejectionDataType
    {


    }

}
