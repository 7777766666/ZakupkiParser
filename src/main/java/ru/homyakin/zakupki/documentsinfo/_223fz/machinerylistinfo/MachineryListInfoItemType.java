//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:09:51 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.machinerylistinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for machineryListInfoItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="machineryListInfoItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="machineryListInfoData" type="{http://zakupki.gov.ru/223fz/machineryListInfo/1}machineryListInfoData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "machineryListInfoItemType", propOrder = {
    "machineryListInfoData"
})
public class MachineryListInfoItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected MachineryListInfoData machineryListInfoData;

    /**
     * Gets the value of the machineryListInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link MachineryListInfoData }
     *     
     */
    public MachineryListInfoData getMachineryListInfoData() {
        return machineryListInfoData;
    }

    /**
     * Sets the value of the machineryListInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineryListInfoData }
     *     
     */
    public void setMachineryListInfoData(MachineryListInfoData value) {
        this.machineryListInfoData = value;
    }

}
