//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:10:09 PM MSK 
//


package ru.homyakin.zakupki.documentsinfo._223fz.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listGWSStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listGWSStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="M"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listGWSStatusType")
@XmlEnum
public enum ListGWSStatusType {


    /**
     * Редактирование
     * 
     */
    F,

    /**
     * Размещено
     * 
     */
    P,

    /**
     * Недействительно
     * 
     */
    I,

    /**
     * Изменение
     * 
     */
    M;

    public String value() {
        return name();
    }

    public static ListGWSStatusType fromValue(String v) {
        return valueOf(v);
    }

}
