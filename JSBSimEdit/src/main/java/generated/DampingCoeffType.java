//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.19 at 11:37:03 PM UTC 
//


package generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DampingCoeffType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DampingCoeffType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LBS/FT/SEC"/&gt;
 *     &lt;enumeration value="N/M/SEC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DampingCoeffType")
@XmlEnum
public enum DampingCoeffType {

    @XmlEnumValue("LBS/FT/SEC")
    LBS_FT_SEC("LBS/FT/SEC"),
    @XmlEnumValue("N/M/SEC")
    N_M_SEC("N/M/SEC");
    private final String value;

    DampingCoeffType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DampingCoeffType fromValue(String v) {
        for (DampingCoeffType c: DampingCoeffType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
