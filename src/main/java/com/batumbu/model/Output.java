//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 07:16:03 PM IST 
//


package com.batumbu.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Output">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankReffNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txnResponseDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txnData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Output", propOrder = {
    "bankReffNo",
    "statusCode",
    "statusMsg",
    "txnResponseDateTime",
    "txnData"
})
public class Output {

    @XmlElement(required = true, nillable = true)
    protected String bankReffNo;
    @XmlElement(required = true, nillable = true)
    protected String statusCode;
    @XmlElement(required = true, nillable = true)
    protected String statusMsg;
    @XmlElement(required = true, nillable = true)
    protected String txnResponseDateTime;
    @XmlElement(required = true, nillable = true)
    protected String txnData;

    /**
     * Gets the value of the bankReffNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankReffNo() {
        return bankReffNo;
    }

    /**
     * Sets the value of the bankReffNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankReffNo(String value) {
        this.bankReffNo = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMsg() {
        return statusMsg;
    }

    /**
     * Sets the value of the statusMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMsg(String value) {
        this.statusMsg = value;
    }

    /**
     * Gets the value of the txnResponseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnResponseDateTime() {
        return txnResponseDateTime;
    }

    /**
     * Sets the value of the txnResponseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnResponseDateTime(String value) {
        this.txnResponseDateTime = value;
    }

    /**
     * Gets the value of the txnData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnData() {
        return txnData;
    }

    /**
     * Sets the value of the txnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnData(String value) {
        this.txnData = value;
    }

}
