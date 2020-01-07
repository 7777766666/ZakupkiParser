//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:10:09 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Участник совместной закупки
 * 
 * <p>Java class for lotCustomerBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotCustomerBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="deliveryPlaceIndication" type="{http://zakupki.gov.ru/223fz/types/1}deliveryPlaceIndicationType" minOccurs="0"/>
 *         &lt;element name="lotCustomerEditEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lotCustomerData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
 *                   &lt;element name="exchangeInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="exchangeRate" type="{http://zakupki.gov.ru/223fz/types/1}money6"/>
 *                             &lt;element name="exchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;sequence>
 *                       &lt;element name="initialSum" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *                       &lt;element name="startingContractPriceRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *                     &lt;/sequence>
 *                     &lt;sequence>
 *                       &lt;choice minOccurs="0">
 *                         &lt;element name="priceFormula">
 *                           &lt;simpleType>
 *                             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                               &lt;maxLength value="2000"/>
 *                             &lt;/restriction>
 *                           &lt;/simpleType>
 *                         &lt;/element>
 *                         &lt;sequence>
 *                           &lt;element name="price" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
 *                           &lt;element name="priceRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *                         &lt;/sequence>
 *                       &lt;/choice>
 *                       &lt;element name="maxContractPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *                       &lt;element name="maxContractPriceRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *                     &lt;/sequence>
 *                   &lt;/choice>
 *                   &lt;element name="excludePurchaseFromPlan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="orderPricing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/223fz/types/1}deliveryPlaceType" minOccurs="0"/>
 *                   &lt;element name="lotItems" type="{http://zakupki.gov.ru/223fz/types/1}lotItemListType" minOccurs="0"/>
 *                   &lt;element name="notInLaw223" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lotPlanInfo" type="{http://zakupki.gov.ru/223fz/types/1}planInfoType" minOccurs="0"/>
 *         &lt;element name="extendFields" type="{http://zakupki.gov.ru/223fz/types/1}noticeExtendFieldValueListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lotCustomerBaseType", propOrder = {
    "additionalInfo",
    "deliveryPlaceIndication",
    "lotCustomerEditEnabled",
    "lotCustomerData",
    "lotPlanInfo",
    "extendFields"
})
@XmlSeeAlso({
    LotCustomerShortType.class,
    LotCustomerType.class
})
public abstract class LotCustomerBaseType {

    protected String additionalInfo;
    @XmlSchemaType(name = "string")
    protected DeliveryPlaceIndicationType deliveryPlaceIndication;
    protected boolean lotCustomerEditEnabled;
    @XmlElement(required = true)
    protected LotCustomerBaseType.LotCustomerData lotCustomerData;
    protected PlanInfoType lotPlanInfo;
    protected NoticeExtendFieldValueListType extendFields;

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
     * Gets the value of the lotCustomerEditEnabled property.
     * 
     */
    public boolean isLotCustomerEditEnabled() {
        return lotCustomerEditEnabled;
    }

    /**
     * Sets the value of the lotCustomerEditEnabled property.
     * 
     */
    public void setLotCustomerEditEnabled(boolean value) {
        this.lotCustomerEditEnabled = value;
    }

    /**
     * Gets the value of the lotCustomerData property.
     * 
     * @return
     *     possible object is
     *     {@link LotCustomerBaseType.LotCustomerData }
     *     
     */
    public LotCustomerBaseType.LotCustomerData getLotCustomerData() {
        return lotCustomerData;
    }

    /**
     * Sets the value of the lotCustomerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotCustomerBaseType.LotCustomerData }
     *     
     */
    public void setLotCustomerData(LotCustomerBaseType.LotCustomerData value) {
        this.lotCustomerData = value;
    }

    /**
     * Gets the value of the lotPlanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlanInfoType }
     *     
     */
    public PlanInfoType getLotPlanInfo() {
        return lotPlanInfo;
    }

    /**
     * Sets the value of the lotPlanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanInfoType }
     *     
     */
    public void setLotPlanInfo(PlanInfoType value) {
        this.lotPlanInfo = value;
    }

    /**
     * Gets the value of the extendFields property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeExtendFieldValueListType }
     *     
     */
    public NoticeExtendFieldValueListType getExtendFields() {
        return extendFields;
    }

    /**
     * Sets the value of the extendFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeExtendFieldValueListType }
     *     
     */
    public void setExtendFields(NoticeExtendFieldValueListType value) {
        this.extendFields = value;
    }


    /**
     * Данные лота совместной закупки
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="currency" type="{http://zakupki.gov.ru/223fz/types/1}currencyType"/>
     *         &lt;element name="exchangeInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="exchangeRate" type="{http://zakupki.gov.ru/223fz/types/1}money6"/>
     *                   &lt;element name="exchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;sequence>
     *             &lt;element name="initialSum" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
     *             &lt;element name="startingContractPriceRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
     *           &lt;/sequence>
     *           &lt;sequence>
     *             &lt;choice minOccurs="0">
     *               &lt;element name="priceFormula">
     *                 &lt;simpleType>
     *                   &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *                     &lt;maxLength value="2000"/>
     *                   &lt;/restriction>
     *                 &lt;/simpleType>
     *               &lt;/element>
     *               &lt;sequence>
     *                 &lt;element name="price" type="{http://zakupki.gov.ru/223fz/types/1}money2"/>
     *                 &lt;element name="priceRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
     *               &lt;/sequence>
     *             &lt;/choice>
     *             &lt;element name="maxContractPrice" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
     *             &lt;element name="maxContractPriceRub" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
     *           &lt;/sequence>
     *         &lt;/choice>
     *         &lt;element name="excludePurchaseFromPlan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="orderPricing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="deliveryPlace" type="{http://zakupki.gov.ru/223fz/types/1}deliveryPlaceType" minOccurs="0"/>
     *         &lt;element name="lotItems" type="{http://zakupki.gov.ru/223fz/types/1}lotItemListType" minOccurs="0"/>
     *         &lt;element name="notInLaw223" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "currency",
        "exchangeInfo",
        "initialSum",
        "startingContractPriceRub",
        "priceFormula",
        "price",
        "priceRub",
        "maxContractPrice",
        "maxContractPriceRub",
        "excludePurchaseFromPlan",
        "orderPricing",
        "deliveryPlace",
        "lotItems",
        "notInLaw223"
    })
    public static class LotCustomerData {

        @XmlElement(required = true)
        protected CurrencyType currency;
        protected LotCustomerBaseType.LotCustomerData.ExchangeInfo exchangeInfo;
        protected BigDecimal initialSum;
        protected BigDecimal startingContractPriceRub;
        protected String priceFormula;
        protected BigDecimal price;
        protected BigDecimal priceRub;
        protected BigDecimal maxContractPrice;
        protected BigDecimal maxContractPriceRub;
        protected Boolean excludePurchaseFromPlan;
        protected String orderPricing;
        protected DeliveryPlaceType deliveryPlace;
        protected LotItemListType lotItems;
        protected Boolean notInLaw223;

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
         * Gets the value of the exchangeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link LotCustomerBaseType.LotCustomerData.ExchangeInfo }
         *     
         */
        public LotCustomerBaseType.LotCustomerData.ExchangeInfo getExchangeInfo() {
            return exchangeInfo;
        }

        /**
         * Sets the value of the exchangeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link LotCustomerBaseType.LotCustomerData.ExchangeInfo }
         *     
         */
        public void setExchangeInfo(LotCustomerBaseType.LotCustomerData.ExchangeInfo value) {
            this.exchangeInfo = value;
        }

        /**
         * Gets the value of the initialSum property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInitialSum() {
            return initialSum;
        }

        /**
         * Sets the value of the initialSum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setInitialSum(BigDecimal value) {
            this.initialSum = value;
        }

        /**
         * Gets the value of the startingContractPriceRub property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getStartingContractPriceRub() {
            return startingContractPriceRub;
        }

        /**
         * Sets the value of the startingContractPriceRub property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setStartingContractPriceRub(BigDecimal value) {
            this.startingContractPriceRub = value;
        }

        /**
         * Gets the value of the priceFormula property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceFormula() {
            return priceFormula;
        }

        /**
         * Sets the value of the priceFormula property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceFormula(String value) {
            this.priceFormula = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrice(BigDecimal value) {
            this.price = value;
        }

        /**
         * Gets the value of the priceRub property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPriceRub() {
            return priceRub;
        }

        /**
         * Sets the value of the priceRub property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPriceRub(BigDecimal value) {
            this.priceRub = value;
        }

        /**
         * Gets the value of the maxContractPrice property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxContractPrice() {
            return maxContractPrice;
        }

        /**
         * Sets the value of the maxContractPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxContractPrice(BigDecimal value) {
            this.maxContractPrice = value;
        }

        /**
         * Gets the value of the maxContractPriceRub property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxContractPriceRub() {
            return maxContractPriceRub;
        }

        /**
         * Sets the value of the maxContractPriceRub property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxContractPriceRub(BigDecimal value) {
            this.maxContractPriceRub = value;
        }

        /**
         * Gets the value of the excludePurchaseFromPlan property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExcludePurchaseFromPlan() {
            return excludePurchaseFromPlan;
        }

        /**
         * Sets the value of the excludePurchaseFromPlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExcludePurchaseFromPlan(Boolean value) {
            this.excludePurchaseFromPlan = value;
        }

        /**
         * Gets the value of the orderPricing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderPricing() {
            return orderPricing;
        }

        /**
         * Sets the value of the orderPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderPricing(String value) {
            this.orderPricing = value;
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
         * Gets the value of the lotItems property.
         * 
         * @return
         *     possible object is
         *     {@link LotItemListType }
         *     
         */
        public LotItemListType getLotItems() {
            return lotItems;
        }

        /**
         * Sets the value of the lotItems property.
         * 
         * @param value
         *     allowed object is
         *     {@link LotItemListType }
         *     
         */
        public void setLotItems(LotItemListType value) {
            this.lotItems = value;
        }

        /**
         * Gets the value of the notInLaw223 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotInLaw223() {
            return notInLaw223;
        }

        /**
         * Sets the value of the notInLaw223 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNotInLaw223(Boolean value) {
            this.notInLaw223 = value;
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
         *         &lt;element name="exchangeRate" type="{http://zakupki.gov.ru/223fz/types/1}money6"/>
         *         &lt;element name="exchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "exchangeRate",
            "exchangeRateDate"
        })
        public static class ExchangeInfo {

            @XmlElement(required = true)
            protected BigDecimal exchangeRate;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar exchangeRateDate;

            /**
             * Gets the value of the exchangeRate property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getExchangeRate() {
                return exchangeRate;
            }

            /**
             * Sets the value of the exchangeRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setExchangeRate(BigDecimal value) {
                this.exchangeRate = value;
            }

            /**
             * Gets the value of the exchangeRateDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExchangeRateDate() {
                return exchangeRateDate;
            }

            /**
             * Sets the value of the exchangeRateDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setExchangeRateDate(XMLGregorianCalendar value) {
                this.exchangeRateDate = value;
            }

        }

    }

}
