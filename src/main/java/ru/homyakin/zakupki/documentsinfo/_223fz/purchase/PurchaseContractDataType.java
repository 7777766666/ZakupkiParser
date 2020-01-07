//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:09:47 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.purchase;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.homyakin.zakupki.documentsinfo._223fz.types.CurrencyType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.CustomerInfoType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.CustomerMainInfoType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.DeliveryPlaceIndicationType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.DeliveryPlaceType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.DocumentListType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.LotLinkType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.NonResidentInfoType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.PurchaseContractStatusType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.PurchaseContractTypeInfoType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.PurchaseInfoType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.SupplierInfoType;


/**
 * Договор закупки
 * 
 * <p>Java class for purchaseContractDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseContractDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://zakupki.gov.ru/223fz/types/1}guidType"/>
 *         &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumber11-2Type" minOccurs="0"/>
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
 *         &lt;element name="urlKisRmis" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="contractCreateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lot" type="{http://zakupki.gov.ru/223fz/types/1}lotLinkType"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *             &lt;element name="sum" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *           &lt;/sequence>
 *           &lt;element name="sumInfo">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                 &lt;maxLength value="2000"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="fulfillmentDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="purchaseInfo" type="{http://zakupki.gov.ru/223fz/types/1}purchaseInfoType"/>
 *         &lt;element name="placer" type="{http://zakupki.gov.ru/223fz/types/1}customerInfoType"/>
 *         &lt;element name="customerInfo" type="{http://zakupki.gov.ru/223fz/types/1}customerMainInfoType"/>
 *         &lt;choice>
 *           &lt;element name="supplier" type="{http://zakupki.gov.ru/223fz/types/1}supplierInfoType"/>
 *           &lt;element name="nonResidentInfo" type="{http://zakupki.gov.ru/223fz/types/1}nonResidentInfoType"/>
 *         &lt;/choice>
 *         &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/223fz/types/1}deliveryPlaceType" minOccurs="0"/>
 *         &lt;element name="deliveryPlaceIndication" type="{http://zakupki.gov.ru/223fz/types/1}deliveryPlaceIndicationType" minOccurs="0"/>
 *         &lt;element name="contractItems" type="{http://zakupki.gov.ru/223fz/purchase/1}contractItemsListType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://zakupki.gov.ru/223fz/types/1}purchaseContractTypeInfoType"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}purchaseContractStatusType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "purchaseContractDataType", propOrder = {
    "guid",
    "registrationNumber",
    "urlEIS",
    "urlVSRZ",
    "urlKisRmis",
    "createDateTime",
    "contractCreateDate",
    "lot",
    "currency",
    "sum",
    "sumInfo",
    "fulfillmentDate",
    "purchaseInfo",
    "placer",
    "customerInfo",
    "supplier",
    "nonResidentInfo",
    "deliveryPlace",
    "deliveryPlaceIndication",
    "contractItems",
    "type",
    "name",
    "additionalInfo",
    "publicationDateTime",
    "status",
    "version",
    "modificationDescription",
    "attachments"
})
public class PurchaseContractDataType {

    @XmlElement(required = true)
    protected String guid;
    protected String registrationNumber;
    protected String urlEIS;
    protected String urlVSRZ;
    protected String urlKisRmis;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractCreateDate;
    @XmlElement(required = true)
    protected LotLinkType lot;
    protected CurrencyType currency;
    protected BigDecimal sum;
    protected String sumInfo;
    @XmlElement(required = true)
    protected String fulfillmentDate;
    @XmlElement(required = true)
    protected PurchaseInfoType purchaseInfo;
    @XmlElement(required = true)
    protected CustomerInfoType placer;
    @XmlElement(required = true)
    protected CustomerMainInfoType customerInfo;
    protected SupplierInfoType supplier;
    protected NonResidentInfoType nonResidentInfo;
    protected DeliveryPlaceType deliveryPlace;
    @XmlSchemaType(name = "string")
    protected DeliveryPlaceIndicationType deliveryPlaceIndication;
    protected ContractItemsListType contractItems;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PurchaseContractTypeInfoType type;
    @XmlElement(required = true)
    protected String name;
    protected String additionalInfo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    @XmlSchemaType(name = "string")
    protected PurchaseContractStatusType status;
    protected Long version;
    protected String modificationDescription;
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
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
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
     * Gets the value of the urlKisRmis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlKisRmis() {
        return urlKisRmis;
    }

    /**
     * Sets the value of the urlKisRmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlKisRmis(String value) {
        this.urlKisRmis = value;
    }

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the contractCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractCreateDate() {
        return contractCreateDate;
    }

    /**
     * Sets the value of the contractCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractCreateDate(XMLGregorianCalendar value) {
        this.contractCreateDate = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link LotLinkType }
     *     
     */
    public LotLinkType getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotLinkType }
     *     
     */
    public void setLot(LotLinkType value) {
        this.lot = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSum(BigDecimal value) {
        this.sum = value;
    }

    /**
     * Gets the value of the sumInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumInfo() {
        return sumInfo;
    }

    /**
     * Sets the value of the sumInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumInfo(String value) {
        this.sumInfo = value;
    }

    /**
     * Gets the value of the fulfillmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentDate() {
        return fulfillmentDate;
    }

    /**
     * Sets the value of the fulfillmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentDate(String value) {
        this.fulfillmentDate = value;
    }

    /**
     * Gets the value of the purchaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInfoType }
     *     
     */
    public PurchaseInfoType getPurchaseInfo() {
        return purchaseInfo;
    }

    /**
     * Sets the value of the purchaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInfoType }
     *     
     */
    public void setPurchaseInfo(PurchaseInfoType value) {
        this.purchaseInfo = value;
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
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerMainInfoType }
     *     
     */
    public CustomerMainInfoType getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerMainInfoType }
     *     
     */
    public void setCustomerInfo(CustomerMainInfoType value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierInfoType }
     *     
     */
    public SupplierInfoType getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierInfoType }
     *     
     */
    public void setSupplier(SupplierInfoType value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the nonResidentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NonResidentInfoType }
     *     
     */
    public NonResidentInfoType getNonResidentInfo() {
        return nonResidentInfo;
    }

    /**
     * Sets the value of the nonResidentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonResidentInfoType }
     *     
     */
    public void setNonResidentInfo(NonResidentInfoType value) {
        this.nonResidentInfo = value;
    }

    /**
     * Gets the value of the deliveryPlace property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPlaceType }
     *     
     */
    public DeliveryPlaceType getDeliveryPlace() {
        return deliveryPlace;
    }

    /**
     * Sets the value of the deliveryPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPlaceType }
     *     
     */
    public void setDeliveryPlace(DeliveryPlaceType value) {
        this.deliveryPlace = value;
    }

    /**
     * Gets the value of the deliveryPlaceIndication property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPlaceIndicationType }
     *     
     */
    public DeliveryPlaceIndicationType getDeliveryPlaceIndication() {
        return deliveryPlaceIndication;
    }

    /**
     * Sets the value of the deliveryPlaceIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPlaceIndicationType }
     *     
     */
    public void setDeliveryPlaceIndication(DeliveryPlaceIndicationType value) {
        this.deliveryPlaceIndication = value;
    }

    /**
     * Gets the value of the contractItems property.
     * 
     * @return
     *     possible object is
     *     {@link ContractItemsListType }
     *     
     */
    public ContractItemsListType getContractItems() {
        return contractItems;
    }

    /**
     * Sets the value of the contractItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractItemsListType }
     *     
     */
    public void setContractItems(ContractItemsListType value) {
        this.contractItems = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseContractTypeInfoType }
     *     
     */
    public PurchaseContractTypeInfoType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseContractTypeInfoType }
     *     
     */
    public void setType(PurchaseContractTypeInfoType value) {
        this.type = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseContractStatusType }
     *     
     */
    public PurchaseContractStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseContractStatusType }
     *     
     */
    public void setStatus(PurchaseContractStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

    /**
     * Gets the value of the modificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationDescription() {
        return modificationDescription;
    }

    /**
     * Sets the value of the modificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationDescription(String value) {
        this.modificationDescription = value;
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

}
