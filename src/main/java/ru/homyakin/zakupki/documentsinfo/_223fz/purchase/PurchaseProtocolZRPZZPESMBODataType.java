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


/**
 * Протокол запроса разъяснений положений заявки для запроса предложений в электронной форме, участниками которого могут быть только субъекты малого и среднего предпринимательства
 * 
 * <p>Java class for purchaseProtocolZRPZZPESMBODataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolZRPZZPESMBODataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolDataType">
 *       &lt;sequence>
 *         &lt;element name="protocolRZ1RegistryNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
 *         &lt;element name="protocolRZ2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolRZ2RegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "purchaseProtocolZRPZZPESMBODataType", propOrder = {
    "protocolRZ1RegistryNumber",
    "protocolRZ2"
})
public class PurchaseProtocolZRPZZPESMBODataType
    extends PurchaseProtocolDataType
{

    protected String protocolRZ1RegistryNumber;
    protected PurchaseProtocolZRPZZPESMBODataType.ProtocolRZ2 protocolRZ2;

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

    /**
     * Gets the value of the protocolRZ2 property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseProtocolZRPZZPESMBODataType.ProtocolRZ2 }
     *     
     */
    public PurchaseProtocolZRPZZPESMBODataType.ProtocolRZ2 getProtocolRZ2() {
        return protocolRZ2;
    }

    /**
     * Sets the value of the protocolRZ2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseProtocolZRPZZPESMBODataType.ProtocolRZ2 }
     *     
     */
    public void setProtocolRZ2(PurchaseProtocolZRPZZPESMBODataType.ProtocolRZ2 value) {
        this.protocolRZ2 = value;
    }


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
     *         &lt;element name="protocolRZ2RegistrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type"/>
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
        "protocolRZ2RegistrationNumber"
    })
    public static class ProtocolRZ2 {

        @XmlElement(required = true)
        protected String protocolRZ2RegistrationNumber;

        /**
         * Gets the value of the protocolRZ2RegistrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolRZ2RegistrationNumber() {
            return protocolRZ2RegistrationNumber;
        }

        /**
         * Sets the value of the protocolRZ2RegistrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolRZ2RegistrationNumber(String value) {
            this.protocolRZ2RegistrationNumber = value;
        }

    }

}
