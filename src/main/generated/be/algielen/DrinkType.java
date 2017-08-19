//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.19 at 08:03:16 PM CEST 
//


package be.algielen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for drinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="drinkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="alcohol"/&gt;
 *     &lt;enumeration value="juice"/&gt;
 *     &lt;enumeration value="soda"/&gt;
 *     &lt;enumeration value="water"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "drinkType")
@XmlEnum
public enum DrinkType {

    @XmlEnumValue("alcohol")
    ALCOHOL("alcohol"),
    @XmlEnumValue("juice")
    JUICE("juice"),
    @XmlEnumValue("soda")
    SODA("soda"),
    @XmlEnumValue("water")
    WATER("water");
    private final String value;

    DrinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrinkType fromValue(String v) {
        for (DrinkType c: DrinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}