//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for ScheduledJobProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledJobProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Synonym" type="{http://v8.1c.ru/8.1/data/core}LocalStringType"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ObjectBelonging" type="{http://v8.1c.ru/8.3/xcf/enums}ObjectBelonging"/&gt;
 *         &lt;element name="MethodName" type="{http://v8.1c.ru/8.3/xcf/readable}MDMethodRef"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Schedule" type="{http://v8.1c.ru/8.3/xcf/readable}ExternalProperty"/&gt;
 *         &lt;element name="Use" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Predefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RestartCountOnFailure" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RestartIntervalOnFailure" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledJobProperties", propOrder = {
    "name",
    "synonym",
    "comment",
    "objectBelonging",
    "methodName",
    "description",
    "key",
    "schedule",
    "use",
    "predefined",
    "restartCountOnFailure",
    "restartIntervalOnFailure"
})
public class ScheduledJobProperties {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Synonym", required = true)
    protected LocalStringType synonym;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "ObjectBelonging", required = true)
    @XmlSchemaType(name = "string")
    protected ObjectBelonging objectBelonging;
    @XmlElement(name = "MethodName", required = true)
    protected String methodName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Key", required = true)
    protected String key;
    @XmlElement(name = "Schedule", required = true)
    protected String schedule;
    @XmlElement(name = "Use")
    protected boolean use;
    @XmlElement(name = "Predefined")
    protected boolean predefined;
    @XmlElement(name = "RestartCountOnFailure", required = true)
    protected BigDecimal restartCountOnFailure;
    @XmlElement(name = "RestartIntervalOnFailure", required = true)
    protected BigDecimal restartIntervalOnFailure;

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

    /**
     * Gets the value of the synonym property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStringType }
     *     
     */
    public LocalStringType getSynonym() {
        return synonym;
    }

    /**
     * Sets the value of the synonym property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStringType }
     *     
     */
    public void setSynonym(LocalStringType value) {
        this.synonym = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the objectBelonging property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectBelonging }
     *     
     */
    public ObjectBelonging getObjectBelonging() {
        return objectBelonging;
    }

    /**
     * Sets the value of the objectBelonging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectBelonging }
     *     
     */
    public void setObjectBelonging(ObjectBelonging value) {
        this.objectBelonging = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedule(String value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the use property.
     * 
     */
    public boolean isUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     */
    public void setUse(boolean value) {
        this.use = value;
    }

    /**
     * Gets the value of the predefined property.
     * 
     */
    public boolean isPredefined() {
        return predefined;
    }

    /**
     * Sets the value of the predefined property.
     * 
     */
    public void setPredefined(boolean value) {
        this.predefined = value;
    }

    /**
     * Gets the value of the restartCountOnFailure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRestartCountOnFailure() {
        return restartCountOnFailure;
    }

    /**
     * Sets the value of the restartCountOnFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRestartCountOnFailure(BigDecimal value) {
        this.restartCountOnFailure = value;
    }

    /**
     * Gets the value of the restartIntervalOnFailure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRestartIntervalOnFailure() {
        return restartIntervalOnFailure;
    }

    /**
     * Sets the value of the restartIntervalOnFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRestartIntervalOnFailure(BigDecimal value) {
        this.restartIntervalOnFailure = value;
    }

}