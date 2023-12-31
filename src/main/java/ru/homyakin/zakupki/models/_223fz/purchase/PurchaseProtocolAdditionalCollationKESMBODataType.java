//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:08 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.purchase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Протокол подачи дополнительных ценовых предложений конкурса в электронной форме, участниками которого могут являться только субъекты малого и среднего предпринимательства
 * 
 * <p>Java class for purchaseProtocolAdditionalCollationKESMBODataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolAdditionalCollationKESMBODataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolDataType">
 *       &lt;sequence>
 *         &lt;element name="protocolRZ2RegistryNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *         &lt;element name="protocolZRPZRegistryNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *         &lt;element name="protocolFKVORegistryNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *         &lt;element name="protocolRZ1RegistryNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolAdditionalCollationKESMBODataType", propOrder = {
    "protocolRZ2RegistryNumber",
    "protocolZRPZRegistryNumber",
    "protocolFKVORegistryNumber",
    "protocolRZ1RegistryNumber"
})
public class PurchaseProtocolAdditionalCollationKESMBODataType
    extends PurchaseProtocolDataType
{

    protected String protocolRZ2RegistryNumber;
    protected String protocolZRPZRegistryNumber;
    protected String protocolFKVORegistryNumber;
    protected String protocolRZ1RegistryNumber;

    /**
     * Gets the value of the protocolRZ2RegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolRZ2RegistryNumber() {
        return protocolRZ2RegistryNumber;
    }

    /**
     * Sets the value of the protocolRZ2RegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolRZ2RegistryNumber(String value) {
        this.protocolRZ2RegistryNumber = value;
    }

    /**
     * Gets the value of the protocolZRPZRegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolZRPZRegistryNumber() {
        return protocolZRPZRegistryNumber;
    }

    /**
     * Sets the value of the protocolZRPZRegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolZRPZRegistryNumber(String value) {
        this.protocolZRPZRegistryNumber = value;
    }

    /**
     * Gets the value of the protocolFKVORegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolFKVORegistryNumber() {
        return protocolFKVORegistryNumber;
    }

    /**
     * Sets the value of the protocolFKVORegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolFKVORegistryNumber(String value) {
        this.protocolFKVORegistryNumber = value;
    }

    /**
     * Gets the value of the protocolRZ1RegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolRZ1RegistryNumber() {
        return protocolRZ1RegistryNumber;
    }

    /**
     * Sets the value of the protocolRZ1RegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolRZ1RegistryNumber(String value) {
        this.protocolRZ1RegistryNumber = value;
    }

}
