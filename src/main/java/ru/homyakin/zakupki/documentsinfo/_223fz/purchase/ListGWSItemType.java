//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:09:47 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.purchase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.homyakin.zakupki.documentsinfo._223fz.types.ItemType;


/**
 * Данные позиции в пакете
 * 
 * <p>Java class for listGWSItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listGWSItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/types/1}itemType">
 *       &lt;sequence>
 *         &lt;element name="listGWSData" type="{http://zakupki.gov.ru/223fz/purchase/1}listGWSData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listGWSItemType", propOrder = {
    "listGWSData"
})
public class ListGWSItemType
    extends ItemType
{

    @XmlElement(required = true)
    protected ListGWSData listGWSData;

    /**
     * Gets the value of the listGWSData property.
     * 
     * @return
     *     possible object is
     *     {@link ListGWSData }
     *     
     */
    public ListGWSData getListGWSData() {
        return listGWSData;
    }

    /**
     * Sets the value of the listGWSData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListGWSData }
     *     
     */
    public void setListGWSData(ListGWSData value) {
        this.listGWSData = value;
    }

}
