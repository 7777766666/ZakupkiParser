//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 08:19:56 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.typalorderclauselist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.models._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for typalOrderClauseItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typalOrderClauseItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="typalOrderClauseData" type="{http://zakupki.gov.ru/223fz/typalOrderClauseList/1}typalOrderClauseDataType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typalOrderClauseItemType", propOrder = {
    "typalOrderClauseData"
})
public class TypalOrderClauseItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected TypalOrderClauseDataType typalOrderClauseData;

    /**
     * Gets the value of the typalOrderClauseData property.
     * 
     * @return
     *     possible object is
     *     {@link TypalOrderClauseDataType }
     *     
     */
    public TypalOrderClauseDataType getTypalOrderClauseData() {
        return typalOrderClauseData;
    }

    /**
     * Sets the value of the typalOrderClauseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypalOrderClauseDataType }
     *     
     */
    public void setTypalOrderClauseData(TypalOrderClauseDataType value) {
        this.typalOrderClauseData = value;
    }

}
