//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:09:56 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.stopcommodity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for stopCommodityItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stopCommodityItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="stopCommodityData" type="{http://zakupki.gov.ru/223fz/stopCommodity/1}stopCommodityData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stopCommodityItemType", propOrder = {
    "stopCommodityData"
})
public class StopCommodityItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected StopCommodityData stopCommodityData;

    /**
     * Gets the value of the stopCommodityData property.
     * 
     * @return
     *     possible object is
     *     {@link StopCommodityData }
     *     
     */
    public StopCommodityData getStopCommodityData() {
        return stopCommodityData;
    }

    /**
     * Sets the value of the stopCommodityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopCommodityData }
     *     
     */
    public void setStopCommodityData(StopCommodityData value) {
        this.stopCommodityData = value;
    }

}