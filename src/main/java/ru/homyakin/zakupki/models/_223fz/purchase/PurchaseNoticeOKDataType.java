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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Извещение о закупке "Открытый конкурс"
 * 
 * <p>Java class for purchaseNoticeOKDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseNoticeOKDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchase/1}purchaseNoticeNonISBaseType">
 *       &lt;sequence>
 *         &lt;element name="examinationPlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="examinationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="envelopeOpeningPlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="envelopeOpeningTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="summingupPlace" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="summingupTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="submissionCloseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="publicationPlannedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseNoticeOKDataType", propOrder = {
    "examinationPlace",
    "examinationDateTime",
    "envelopeOpeningPlace",
    "envelopeOpeningTime",
    "summingupPlace",
    "summingupTime",
    "submissionCloseDateTime",
    "publicationPlannedDate"
})
public class PurchaseNoticeOKDataType
    extends PurchaseNoticeNonISBaseType
{

    protected String examinationPlace;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar examinationDateTime;
    protected String envelopeOpeningPlace;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar envelopeOpeningTime;
    protected String summingupPlace;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar summingupTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionCloseDateTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationPlannedDate;

    /**
     * Gets the value of the examinationPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationPlace() {
        return examinationPlace;
    }

    /**
     * Sets the value of the examinationPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationPlace(String value) {
        this.examinationPlace = value;
    }

    /**
     * Gets the value of the examinationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExaminationDateTime() {
        return examinationDateTime;
    }

    /**
     * Sets the value of the examinationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExaminationDateTime(XMLGregorianCalendar value) {
        this.examinationDateTime = value;
    }

    /**
     * Gets the value of the envelopeOpeningPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvelopeOpeningPlace() {
        return envelopeOpeningPlace;
    }

    /**
     * Sets the value of the envelopeOpeningPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvelopeOpeningPlace(String value) {
        this.envelopeOpeningPlace = value;
    }

    /**
     * Gets the value of the envelopeOpeningTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnvelopeOpeningTime() {
        return envelopeOpeningTime;
    }

    /**
     * Sets the value of the envelopeOpeningTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnvelopeOpeningTime(XMLGregorianCalendar value) {
        this.envelopeOpeningTime = value;
    }

    /**
     * Gets the value of the summingupPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummingupPlace() {
        return summingupPlace;
    }

    /**
     * Sets the value of the summingupPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummingupPlace(String value) {
        this.summingupPlace = value;
    }

    /**
     * Gets the value of the summingupTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSummingupTime() {
        return summingupTime;
    }

    /**
     * Sets the value of the summingupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSummingupTime(XMLGregorianCalendar value) {
        this.summingupTime = value;
    }

    /**
     * Gets the value of the submissionCloseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionCloseDateTime() {
        return submissionCloseDateTime;
    }

    /**
     * Sets the value of the submissionCloseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionCloseDateTime(XMLGregorianCalendar value) {
        this.submissionCloseDateTime = value;
    }

    /**
     * Gets the value of the publicationPlannedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationPlannedDate() {
        return publicationPlannedDate;
    }

    /**
     * Sets the value of the publicationPlannedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationPlannedDate(XMLGregorianCalendar value) {
        this.publicationPlannedDate = value;
    }

}
