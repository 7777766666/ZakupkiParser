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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Протокол проведения закупки у единственного поставщика
 * 
 * <p>Java class for purchaseProtocolPAEPDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseProtocolPAEPDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseProtocolBaseDataType">
 *       &lt;sequence>
 *         &lt;element name="commissionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commissionName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="commissionResult" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="protocolSignDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lotApplicationsList" type="{http://zakupki.gov.ru/223fz/purchase/1}protocolPAEPLotApplicationListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseProtocolPAEPDataType", propOrder = {
    "commissionNumber",
    "commissionName",
    "commissionResult",
    "protocolSignDate",
    "lotApplicationsList"
})
public class PurchaseProtocolPAEPDataType
    extends PurchaseProtocolBaseDataType
{

    protected String commissionNumber;
    protected String commissionName;
    protected String commissionResult;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolSignDate;
    @XmlElement(required = true)
    protected ProtocolPAEPLotApplicationListType lotApplicationsList;

    /**
     * Gets the value of the commissionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionNumber() {
        return commissionNumber;
    }

    /**
     * Sets the value of the commissionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionNumber(String value) {
        this.commissionNumber = value;
    }

    /**
     * Gets the value of the commissionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionName() {
        return commissionName;
    }

    /**
     * Sets the value of the commissionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionName(String value) {
        this.commissionName = value;
    }

    /**
     * Gets the value of the commissionResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionResult() {
        return commissionResult;
    }

    /**
     * Sets the value of the commissionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionResult(String value) {
        this.commissionResult = value;
    }

    /**
     * Gets the value of the protocolSignDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtocolSignDate() {
        return protocolSignDate;
    }

    /**
     * Sets the value of the protocolSignDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtocolSignDate(XMLGregorianCalendar value) {
        this.protocolSignDate = value;
    }

    /**
     * Gets the value of the lotApplicationsList property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolPAEPLotApplicationListType }
     *     
     */
    public ProtocolPAEPLotApplicationListType getLotApplicationsList() {
        return lotApplicationsList;
    }

    /**
     * Sets the value of the lotApplicationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolPAEPLotApplicationListType }
     *     
     */
    public void setLotApplicationsList(ProtocolPAEPLotApplicationListType value) {
        this.lotApplicationsList = value;
    }

}
