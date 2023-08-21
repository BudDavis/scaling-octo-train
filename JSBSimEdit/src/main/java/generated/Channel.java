//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.21 at 03:19:58 PM UTC 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}actuator"/&gt;
 *         &lt;element ref="{}aerosurface_scale"/&gt;
 *         &lt;element ref="{}integrator"/&gt;
 *         &lt;element ref="{}kinematic"/&gt;
 *         &lt;element ref="{}lag_filter"/&gt;
 *         &lt;element ref="{}lead_lag_filter"/&gt;
 *         &lt;element ref="{}pid"/&gt;
 *         &lt;element ref="{}pure_gain"/&gt;
 *         &lt;element ref="{}scheduled_gain"/&gt;
 *         &lt;element ref="{}second_order_filter"/&gt;
 *         &lt;element ref="{}sensor"/&gt;
 *         &lt;element ref="{}summer"/&gt;
 *         &lt;element ref="{}switch"/&gt;
 *         &lt;element ref="{}washout_filter"/&gt;
 *         &lt;element ref="{}deadband"/&gt;
 *         &lt;element ref="{}fcs_function"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "actuatorOrAerosurfaceScaleOrIntegrator"
})
@XmlRootElement(name = "channel")
public class Channel {

    @XmlElements({
        @XmlElement(name = "actuator", type = Actuator.class),
        @XmlElement(name = "aerosurface_scale", type = AerosurfaceScale.class),
        @XmlElement(name = "integrator", type = Integrator.class),
        @XmlElement(name = "kinematic", type = Kinematic.class),
        @XmlElement(name = "lag_filter", type = LagFilter.class),
        @XmlElement(name = "lead_lag_filter", type = LeadLagFilter.class),
        @XmlElement(name = "pid", type = Pid.class),
        @XmlElement(name = "pure_gain", type = PureGain.class),
        @XmlElement(name = "scheduled_gain", type = ScheduledGain.class),
        @XmlElement(name = "second_order_filter", type = SecondOrderFilter.class),
        @XmlElement(name = "sensor", type = Sensor.class),
        @XmlElement(name = "summer", type = Summer.class),
        @XmlElement(name = "switch", type = Switch.class),
        @XmlElement(name = "washout_filter", type = WashoutFilter.class),
        @XmlElement(name = "deadband", type = Deadband.class),
        @XmlElement(name = "fcs_function", type = FcsFunction.class)
    })
    protected List<Object> actuatorOrAerosurfaceScaleOrIntegrator;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the actuatorOrAerosurfaceScaleOrIntegrator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actuatorOrAerosurfaceScaleOrIntegrator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActuatorOrAerosurfaceScaleOrIntegrator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Actuator }
     * {@link AerosurfaceScale }
     * {@link Integrator }
     * {@link Kinematic }
     * {@link LagFilter }
     * {@link LeadLagFilter }
     * {@link Pid }
     * {@link PureGain }
     * {@link ScheduledGain }
     * {@link SecondOrderFilter }
     * {@link Sensor }
     * {@link Summer }
     * {@link Switch }
     * {@link WashoutFilter }
     * {@link Deadband }
     * {@link FcsFunction }
     * 
     * 
     */
    public List<Object> getActuatorOrAerosurfaceScaleOrIntegrator() {
        if (actuatorOrAerosurfaceScaleOrIntegrator == null) {
            actuatorOrAerosurfaceScaleOrIntegrator = new ArrayList<Object>();
        }
        return this.actuatorOrAerosurfaceScaleOrIntegrator;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
