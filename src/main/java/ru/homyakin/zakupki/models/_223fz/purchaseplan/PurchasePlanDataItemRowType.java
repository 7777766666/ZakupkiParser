//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:12 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.purchaseplan;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.models._223fz.types.OkdpProductType;
import ru.homyakin.zakupki.models._223fz.types.OkeiProductType;
import ru.homyakin.zakupki.models._223fz.types.Okpd2ProductType;
import ru.homyakin.zakupki.models._223fz.types.Okved2ProductType;
import ru.homyakin.zakupki.models._223fz.types.OkvedProductType;


/**
 * Cтрока позиции плана
 * 
 * <p>Java class for purchasePlanDataItemRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanDataItemRowType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchasePlan/1}basePlanDataItemRowType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="okdp" type="{http://zakupki.gov.ru/223fz/types/1}okdpProductType"/>
 *           &lt;element name="okpd2" type="{http://zakupki.gov.ru/223fz/types/1}okpd2ProductType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="okved" type="{http://zakupki.gov.ru/223fz/types/1}okvedProductType"/>
 *           &lt;element name="okved2" type="{http://zakupki.gov.ru/223fz/types/1}okved2ProductType"/>
 *         &lt;/choice>
 *         &lt;element name="okato" type="{http://zakupki.gov.ru/223fz/types/1}codeOkatoType" minOccurs="0"/>
 *         &lt;element name="region" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="impossibleToDetermineAttr" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="okei" type="{http://zakupki.gov.ru/223fz/types/1}okeiProductType"/>
 *           &lt;element name="qty" type="{http://zakupki.gov.ru/223fz/types/1}lotItemQtyType"/>
 *         &lt;/sequence>
 *         &lt;element name="typeObjectPurchase" type="{http://zakupki.gov.ru/223fz/purchasePlan/1}purchaseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanDataItemRowType", propOrder = {
    "okdp",
    "okpd2",
    "okved",
    "okved2",
    "okato",
    "region",
    "impossibleToDetermineAttr",
    "okei",
    "qty",
    "typeObjectPurchase"
})
public class PurchasePlanDataItemRowType
    extends BasePlanDataItemRowType
{

    protected OkdpProductType okdp;
    protected Okpd2ProductType okpd2;
    protected OkvedProductType okved;
    protected Okved2ProductType okved2;
    protected String okato;
    protected String region;
    protected Boolean impossibleToDetermineAttr;
    protected OkeiProductType okei;
    protected BigDecimal qty;
    @XmlSchemaType(name = "string")
    protected PurchaseType typeObjectPurchase;

    /**
     * Gets the value of the okdp property.
     * 
     * @return
     *     possible object is
     *     {@link OkdpProductType }
     *     
     */
    public OkdpProductType getOkdp() {
        return okdp;
    }

    /**
     * Sets the value of the okdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkdpProductType }
     *     
     */
    public void setOkdp(OkdpProductType value) {
        this.okdp = value;
    }

    /**
     * Gets the value of the okpd2 property.
     * 
     * @return
     *     possible object is
     *     {@link Okpd2ProductType }
     *     
     */
    public Okpd2ProductType getOkpd2() {
        return okpd2;
    }

    /**
     * Sets the value of the okpd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Okpd2ProductType }
     *     
     */
    public void setOkpd2(Okpd2ProductType value) {
        this.okpd2 = value;
    }

    /**
     * Gets the value of the okved property.
     * 
     * @return
     *     possible object is
     *     {@link OkvedProductType }
     *     
     */
    public OkvedProductType getOkved() {
        return okved;
    }

    /**
     * Sets the value of the okved property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkvedProductType }
     *     
     */
    public void setOkved(OkvedProductType value) {
        this.okved = value;
    }

    /**
     * Gets the value of the okved2 property.
     * 
     * @return
     *     possible object is
     *     {@link Okved2ProductType }
     *     
     */
    public Okved2ProductType getOkved2() {
        return okved2;
    }

    /**
     * Sets the value of the okved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Okved2ProductType }
     *     
     */
    public void setOkved2(Okved2ProductType value) {
        this.okved2 = value;
    }

    /**
     * Gets the value of the okato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkato() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkato(String value) {
        this.okato = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the impossibleToDetermineAttr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImpossibleToDetermineAttr() {
        return impossibleToDetermineAttr;
    }

    /**
     * Sets the value of the impossibleToDetermineAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImpossibleToDetermineAttr(Boolean value) {
        this.impossibleToDetermineAttr = value;
    }

    /**
     * Gets the value of the okei property.
     * 
     * @return
     *     possible object is
     *     {@link OkeiProductType }
     *     
     */
    public OkeiProductType getOkei() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkeiProductType }
     *     
     */
    public void setOkei(OkeiProductType value) {
        this.okei = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the typeObjectPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseType }
     *     
     */
    public PurchaseType getTypeObjectPurchase() {
        return typeObjectPurchase;
    }

    /**
     * Sets the value of the typeObjectPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseType }
     *     
     */
    public void setTypeObjectPurchase(PurchaseType value) {
        this.typeObjectPurchase = value;
    }

}
