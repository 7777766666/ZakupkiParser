//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:17 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация о закупке
 * 
 * <p>Java class for purchaseInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType" minOccurs="0"/>
 *         &lt;element name="purchaseNoticeNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11Type"/>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="purchaseMethod" type="{http://zakupki.gov.ru/223fz/types/1}purchaseMethodClassType"/>
 *           &lt;sequence>
 *             &lt;element name="purchaseMethodCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *             &lt;element name="purchaseCodeName" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                   &lt;maxLength value="2000"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="emergency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseInfoType", propOrder = {
    "guid",
    "purchaseNoticeNumber",
    "publicationDateTime",
    "name",
    "purchaseMethod",
    "purchaseMethodCode",
    "purchaseCodeName",
    "emergency"
})
@XmlSeeAlso({
    PurchaseInfo2Type.class
})
public class PurchaseInfoType {

    protected String guid;
    @XmlElement(required = true)
    protected String purchaseNoticeNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    @XmlElement(required = true)
    protected String name;
    @XmlSchemaType(name = "string")
    protected PurchaseMethodClassType purchaseMethod;
    protected Long purchaseMethodCode;
    protected String purchaseCodeName;
    protected Boolean emergency;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the purchaseNoticeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseNoticeNumber() {
        return purchaseNoticeNumber;
    }

    /**
     * Sets the value of the purchaseNoticeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseNoticeNumber(String value) {
        this.purchaseNoticeNumber = value;
    }

    /**
     * Gets the value of the publicationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDateTime() {
        return publicationDateTime;
    }

    /**
     * Sets the value of the publicationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDateTime(XMLGregorianCalendar value) {
        this.publicationDateTime = value;
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
     * Gets the value of the purchaseMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseMethodClassType }
     *     
     */
    public PurchaseMethodClassType getPurchaseMethod() {
        return purchaseMethod;
    }

    /**
     * Sets the value of the purchaseMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseMethodClassType }
     *     
     */
    public void setPurchaseMethod(PurchaseMethodClassType value) {
        this.purchaseMethod = value;
    }

    /**
     * Gets the value of the purchaseMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseMethodCode() {
        return purchaseMethodCode;
    }

    /**
     * Sets the value of the purchaseMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseMethodCode(Long value) {
        this.purchaseMethodCode = value;
    }

    /**
     * Gets the value of the purchaseCodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseCodeName() {
        return purchaseCodeName;
    }

    /**
     * Sets the value of the purchaseCodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseCodeName(String value) {
        this.purchaseCodeName = value;
    }

    /**
     * Gets the value of the emergency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmergency() {
        return emergency;
    }

    /**
     * Sets the value of the emergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmergency(Boolean value) {
        this.emergency = value;
    }

}
