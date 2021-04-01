//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.31 a las 05:01:24 PM CST 
//


package org.example.calculadorap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultado2" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "resultado1",
    "resultado2"
})
@XmlRootElement(name = "FormulaResponse")
public class FormulaResponse {

    @XmlElement(required = true)
    protected String resultado1;
    @XmlElement(required = true)
    protected String resultado2;

    /**
     * Obtiene el valor de la propiedad resultado1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado1() {
        return resultado1;
    }

    /**
     * Define el valor de la propiedad resultado1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado1(String value) {
        this.resultado1 = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado2() {
        return resultado2;
    }

    /**
     * Define el valor de la propiedad resultado2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado2(String value) {
        this.resultado2 = value;
    }

}
