//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.14 at 01:38:34 PM EDT 
//


package gov.nc.ncidng.ncidngwebservice.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttrName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AttrVal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SearchOp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appID",
    "appPassword",
    "attrName",
    "attrVal",
    "searchOp"
})
@XmlRootElement(name = "searchDivisionsRequest")
public class SearchDivisionsRequest {

    @XmlElement(name = "AppID", required = true)
    protected String appID;
    @XmlElement(name = "AppPassword", required = true)
    protected String appPassword;
    @XmlElement(name = "AttrName", required = true)
    protected String attrName;
    @XmlElement(name = "AttrVal", required = true)
    protected String attrVal;
    @XmlElement(name = "SearchOp", required = true)
    protected String searchOp;

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * Gets the value of the appPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppPassword() {
        return appPassword;
    }

    /**
     * Sets the value of the appPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPassword(String value) {
        this.appPassword = value;
    }

    /**
     * Gets the value of the attrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * Sets the value of the attrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrName(String value) {
        this.attrName = value;
    }

    /**
     * Gets the value of the attrVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrVal() {
        return attrVal;
    }

    /**
     * Sets the value of the attrVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrVal(String value) {
        this.attrVal = value;
    }

    /**
     * Gets the value of the searchOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchOp() {
        return searchOp;
    }

    /**
     * Sets the value of the searchOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchOp(String value) {
        this.searchOp = value;
    }

}