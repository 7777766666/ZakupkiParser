//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:20:17 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Расположение поля
 * 
 * <p>Java class for templateFieldPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="templateFieldPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tabOrdinal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="tabName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="130"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sectionOrdinal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sectionName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="130"/>
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
@XmlType(name = "templateFieldPositionType", propOrder = {
    "tabOrdinal",
    "tabName",
    "sectionOrdinal",
    "sectionName"
})
public class TemplateFieldPositionType {

    protected long tabOrdinal;
    protected String tabName;
    protected long sectionOrdinal;
    protected String sectionName;

    /**
     * Gets the value of the tabOrdinal property.
     * 
     */
    public long getTabOrdinal() {
        return tabOrdinal;
    }

    /**
     * Sets the value of the tabOrdinal property.
     * 
     */
    public void setTabOrdinal(long value) {
        this.tabOrdinal = value;
    }

    /**
     * Gets the value of the tabName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabName() {
        return tabName;
    }

    /**
     * Sets the value of the tabName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabName(String value) {
        this.tabName = value;
    }

    /**
     * Gets the value of the sectionOrdinal property.
     * 
     */
    public long getSectionOrdinal() {
        return sectionOrdinal;
    }

    /**
     * Sets the value of the sectionOrdinal property.
     * 
     */
    public void setSectionOrdinal(long value) {
        this.sectionOrdinal = value;
    }

    /**
     * Gets the value of the sectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Sets the value of the sectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionName(String value) {
        this.sectionName = value;
    }

}
