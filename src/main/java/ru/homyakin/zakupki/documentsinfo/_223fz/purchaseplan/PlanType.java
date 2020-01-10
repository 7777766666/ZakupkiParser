//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:10:05 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.purchaseplan;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for planType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="planType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMMODITY"/>
 *     &lt;enumeration value="INNOVATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "planType")
@XmlEnum
public enum PlanType {


    /**
     * Позиции плана
     * 
     */
    COMMODITY,

    /**
     * Инновационные позиции плана
     * 
     */
    INNOVATION;

    public String value() {
        return name();
    }

    public static PlanType fromValue(String v) {
        return valueOf(v);
    }

}