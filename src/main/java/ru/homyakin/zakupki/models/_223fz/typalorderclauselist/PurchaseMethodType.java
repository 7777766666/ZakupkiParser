//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:19:56 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.typalorderclauselist;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о способах закупки
 * 
 * <p>Java class for purchaseMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseMethodCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="purchaseMethodName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="digitalPurchase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="phasesNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="submissionApplicationDate" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="workDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="conditionsOfUse" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseMethodType", propOrder = {
    "purchaseMethodCode",
    "purchaseMethodName",
    "digitalPurchase",
    "phasesNumber",
    "submissionApplicationDate",
    "workDays",
    "conditionsOfUse"
})
public class PurchaseMethodType {

    protected long purchaseMethodCode;
    @XmlElement(required = true)
    protected String purchaseMethodName;
    protected Boolean digitalPurchase;
    protected Integer phasesNumber;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger submissionApplicationDate;
    protected Boolean workDays;
    protected String conditionsOfUse;

    /**
     * Gets the value of the purchaseMethodCode property.
     * 
     */
    public long getPurchaseMethodCode() {
        return purchaseMethodCode;
    }

    /**
     * Sets the value of the purchaseMethodCode property.
     * 
     */
    public void setPurchaseMethodCode(long value) {
        this.purchaseMethodCode = value;
    }

    /**
     * Gets the value of the purchaseMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseMethodName() {
        return purchaseMethodName;
    }

    /**
     * Sets the value of the purchaseMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseMethodName(String value) {
        this.purchaseMethodName = value;
    }

    /**
     * Gets the value of the digitalPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDigitalPurchase() {
        return digitalPurchase;
    }

    /**
     * Sets the value of the digitalPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDigitalPurchase(Boolean value) {
        this.digitalPurchase = value;
    }

    /**
     * Gets the value of the phasesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhasesNumber() {
        return phasesNumber;
    }

    /**
     * Sets the value of the phasesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhasesNumber(Integer value) {
        this.phasesNumber = value;
    }

    /**
     * Gets the value of the submissionApplicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubmissionApplicationDate() {
        return submissionApplicationDate;
    }

    /**
     * Sets the value of the submissionApplicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubmissionApplicationDate(BigInteger value) {
        this.submissionApplicationDate = value;
    }

    /**
     * Gets the value of the workDays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorkDays() {
        return workDays;
    }

    /**
     * Sets the value of the workDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorkDays(Boolean value) {
        this.workDays = value;
    }

    /**
     * Gets the value of the conditionsOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionsOfUse() {
        return conditionsOfUse;
    }

    /**
     * Sets the value of the conditionsOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionsOfUse(String value) {
        this.conditionsOfUse = value;
    }

}
