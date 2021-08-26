//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.25 at 09:33:15 AM CEST 
//


package generated.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T_mivconfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_mivconfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}tijd_laatste_config_wijziging" minOccurs="0"/&gt;
 *         &lt;element ref="{}meetpunt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_mivconfig", propOrder = {
    "tijdLaatsteConfigWijziging",
    "meetpunt"
})
public class TMivconfig {

    @XmlElement(name = "tijd_laatste_config_wijziging")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tijdLaatsteConfigWijziging;
    protected List<TMeetpunt> meetpunt;
    @XmlAttribute(name = "schemaVersion", required = true)
    protected String schemaVersion;

    /**
     * Gets the value of the tijdLaatsteConfigWijziging property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTijdLaatsteConfigWijziging() {
        return tijdLaatsteConfigWijziging;
    }

    /**
     * Sets the value of the tijdLaatsteConfigWijziging property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTijdLaatsteConfigWijziging(XMLGregorianCalendar value) {
        this.tijdLaatsteConfigWijziging = value;
    }

    /**
     * Gets the value of the meetpunt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the meetpunt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetpunt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMeetpunt }
     * 
     * 
     */
    public List<TMeetpunt> getMeetpunt() {
        if (meetpunt == null) {
            meetpunt = new ArrayList<TMeetpunt>();
        }
        return this.meetpunt;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
