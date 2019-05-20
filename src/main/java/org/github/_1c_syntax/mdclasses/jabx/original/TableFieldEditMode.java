//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TableFieldEditMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TableFieldEditMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Directly"/&gt;
 *     &lt;enumeration value="Enter"/&gt;
 *     &lt;enumeration value="EnterOnInput"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TableFieldEditMode", namespace = "http://v8.1c.ru/8.2/managed-application/logform")
@XmlEnum
public enum TableFieldEditMode {

    @XmlEnumValue("Directly")
    DIRECTLY("Directly"),
    @XmlEnumValue("Enter")
    ENTER("Enter"),
    @XmlEnumValue("EnterOnInput")
    ENTER_ON_INPUT("EnterOnInput");
    private final String value;

    TableFieldEditMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableFieldEditMode fromValue(String v) {
        for (TableFieldEditMode c: TableFieldEditMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}