//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:08 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.purchase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.models._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for protocolLotAllocationItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="protocolLotAllocationItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="protocolLotAllocationData" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolLotAllocationData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "protocolLotAllocationItemType", propOrder = {
    "protocolLotAllocationData"
})
public class ProtocolLotAllocationItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected ProtocolLotAllocationData protocolLotAllocationData;

    /**
     * Gets the value of the protocolLotAllocationData property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolLotAllocationData }
     *     
     */
    public ProtocolLotAllocationData getProtocolLotAllocationData() {
        return protocolLotAllocationData;
    }

    /**
     * Sets the value of the protocolLotAllocationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolLotAllocationData }
     *     
     */
    public void setProtocolLotAllocationData(ProtocolLotAllocationData value) {
        this.protocolLotAllocationData = value;
    }

}
