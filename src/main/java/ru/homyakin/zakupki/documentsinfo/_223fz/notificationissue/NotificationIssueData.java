//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:09:15 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.notificationissue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.homyakin.zakupki.documentsinfo._223fz.types.CustomerInfoType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.DocumentListType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.PlanInformationType;


/**
 * Уведомление о выдаче отрицательного заключения
 * 
 * <p>Java class for notificationIssueData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationIssueData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="urlEIS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="urlVSRZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="controlAgency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="supervisorAgency" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="customer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="notificationReceiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="conclusionComplianceInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conclusionRegNumber" type="{http://zakupki.gov.ru/223fz/notificationIssue/1}conclusionRegNumberType"/>
 *                   &lt;element name="planRegNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType"/>
 *                   &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="planInformationType" type="{http://zakupki.gov.ru/223fz/types/1}planInformationType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stopCommodityItems" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="contractSubject" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/223fz/types/1}documentListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationIssueData", propOrder = {
    "guid",
    "urlEIS",
    "urlVSRZ",
    "controlAgency",
    "supervisorAgency",
    "customer",
    "placer",
    "notificationReceiptDate",
    "additionalInfo",
    "conclusionComplianceInfo",
    "stopCommodityItems",
    "attachments"
})
public class NotificationIssueData {

    @XmlElement(required = true)
    protected String guid;
    protected String urlEIS;
    protected String urlVSRZ;
    @XmlElement(required = true)
    protected CustomerInfoType controlAgency;
    @XmlElement(required = true)
    protected CustomerInfoType supervisorAgency;
    @XmlElement(required = true)
    protected CustomerInfoType customer;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notificationReceiptDate;
    protected String additionalInfo;
    @XmlElement(required = true)
    protected NotificationIssueData.ConclusionComplianceInfo conclusionComplianceInfo;
    @XmlElement(required = true)
    protected List<NotificationIssueData.StopCommodityItems> stopCommodityItems;
    protected DocumentListType attachments;

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
     * Gets the value of the urlEIS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlEIS() {
        return urlEIS;
    }

    /**
     * Sets the value of the urlEIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlEIS(String value) {
        this.urlEIS = value;
    }

    /**
     * Gets the value of the urlVSRZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlVSRZ() {
        return urlVSRZ;
    }

    /**
     * Sets the value of the urlVSRZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlVSRZ(String value) {
        this.urlVSRZ = value;
    }

    /**
     * Gets the value of the controlAgency property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getControlAgency() {
        return controlAgency;
    }

    /**
     * Sets the value of the controlAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setControlAgency(CustomerInfoType value) {
        this.controlAgency = value;
    }

    /**
     * Gets the value of the supervisorAgency property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getSupervisorAgency() {
        return supervisorAgency;
    }

    /**
     * Sets the value of the supervisorAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setSupervisorAgency(CustomerInfoType value) {
        this.supervisorAgency = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setCustomer(CustomerInfoType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the placer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getPlacer() {
        return placer;
    }

    /**
     * Sets the value of the placer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setPlacer(CustomerInfoType value) {
        this.placer = value;
    }

    /**
     * Gets the value of the notificationReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotificationReceiptDate() {
        return notificationReceiptDate;
    }

    /**
     * Sets the value of the notificationReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotificationReceiptDate(XMLGregorianCalendar value) {
        this.notificationReceiptDate = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the conclusionComplianceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationIssueData.ConclusionComplianceInfo }
     *     
     */
    public NotificationIssueData.ConclusionComplianceInfo getConclusionComplianceInfo() {
        return conclusionComplianceInfo;
    }

    /**
     * Sets the value of the conclusionComplianceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationIssueData.ConclusionComplianceInfo }
     *     
     */
    public void setConclusionComplianceInfo(NotificationIssueData.ConclusionComplianceInfo value) {
        this.conclusionComplianceInfo = value;
    }

    /**
     * Gets the value of the stopCommodityItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopCommodityItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopCommodityItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationIssueData.StopCommodityItems }
     * 
     * 
     */
    public List<NotificationIssueData.StopCommodityItems> getStopCommodityItems() {
        if (stopCommodityItems == null) {
            stopCommodityItems = new ArrayList<NotificationIssueData.StopCommodityItems>();
        }
        return this.stopCommodityItems;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentListType }
     *     
     */
    public DocumentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentListType }
     *     
     */
    public void setAttachments(DocumentListType value) {
        this.attachments = value;
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
     *         &lt;element name="conclusionRegNumber" type="{http://zakupki.gov.ru/223fz/notificationIssue/1}conclusionRegNumberType"/>
     *         &lt;element name="planRegNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType"/>
     *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="planInformationType" type="{http://zakupki.gov.ru/223fz/types/1}planInformationType"/>
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
        "conclusionRegNumber",
        "planRegNumber",
        "issueDate",
        "planInformationType"
    })
    public static class ConclusionComplianceInfo {

        @XmlElement(required = true)
        protected String conclusionRegNumber;
        @XmlElement(required = true)
        protected String planRegNumber;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar issueDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected PlanInformationType planInformationType;

        /**
         * Gets the value of the conclusionRegNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConclusionRegNumber() {
            return conclusionRegNumber;
        }

        /**
         * Sets the value of the conclusionRegNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConclusionRegNumber(String value) {
            this.conclusionRegNumber = value;
        }

        /**
         * Gets the value of the planRegNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlanRegNumber() {
            return planRegNumber;
        }

        /**
         * Sets the value of the planRegNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlanRegNumber(String value) {
            this.planRegNumber = value;
        }

        /**
         * Gets the value of the issueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getIssueDate() {
            return issueDate;
        }

        /**
         * Sets the value of the issueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setIssueDate(XMLGregorianCalendar value) {
            this.issueDate = value;
        }

        /**
         * Gets the value of the planInformationType property.
         * 
         * @return
         *     possible object is
         *     {@link PlanInformationType }
         *     
         */
        public PlanInformationType getPlanInformationType() {
            return planInformationType;
        }

        /**
         * Sets the value of the planInformationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlanInformationType }
         *     
         */
        public void setPlanInformationType(PlanInformationType value) {
            this.planInformationType = value;
        }

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
     *         &lt;element name="ordinalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="contractSubject" minOccurs="0">
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
    @XmlType(name = "", propOrder = {
        "ordinalNumber",
        "contractSubject"
    })
    public static class StopCommodityItems {

        protected int ordinalNumber;
        protected String contractSubject;

        /**
         * Gets the value of the ordinalNumber property.
         * 
         */
        public int getOrdinalNumber() {
            return ordinalNumber;
        }

        /**
         * Sets the value of the ordinalNumber property.
         * 
         */
        public void setOrdinalNumber(int value) {
            this.ordinalNumber = value;
        }

        /**
         * Gets the value of the contractSubject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractSubject() {
            return contractSubject;
        }

        /**
         * Sets the value of the contractSubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContractSubject(String value) {
            this.contractSubject = value;
        }

    }

}
