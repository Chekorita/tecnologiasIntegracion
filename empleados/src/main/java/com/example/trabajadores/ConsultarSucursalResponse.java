//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.16 a las 04:25:18 PM CDT 
//


package com.example.trabajadores;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="empleados" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numCelular" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numCasa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nombreEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="puesto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="salario" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="numSucursal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "empleados"
})
@XmlRootElement(name = "ConsultarSucursalResponse")
public class ConsultarSucursalResponse {

    @XmlElement(required = true)
    protected List<ConsultarSucursalResponse.Empleados> empleados;

    /**
     * Gets the value of the empleados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empleados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpleados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultarSucursalResponse.Empleados }
     * 
     * 
     */
    public List<ConsultarSucursalResponse.Empleados> getEmpleados() {
        if (empleados == null) {
            empleados = new ArrayList<ConsultarSucursalResponse.Empleados>();
        }
        return this.empleados;
    }


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
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numCelular" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numCasa" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nombreEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="puesto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="salario" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="numSucursal" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "nombre",
        "apellidos",
        "numCelular",
        "calle",
        "numCasa",
        "colonia",
        "ciudad",
        "estado",
        "pais",
        "nombreEmpresa",
        "puesto",
        "salario",
        "numSucursal"
    })
    public static class Empleados {

        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String apellidos;
        protected int numCelular;
        @XmlElement(required = true)
        protected String calle;
        protected int numCasa;
        @XmlElement(required = true)
        protected String colonia;
        @XmlElement(required = true)
        protected String ciudad;
        @XmlElement(required = true)
        protected String estado;
        @XmlElement(required = true)
        protected String pais;
        @XmlElement(required = true)
        protected String nombreEmpresa;
        @XmlElement(required = true)
        protected String puesto;
        protected float salario;
        protected int numSucursal;

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad apellidos.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApellidos() {
            return apellidos;
        }

        /**
         * Define el valor de la propiedad apellidos.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApellidos(String value) {
            this.apellidos = value;
        }

        /**
         * Obtiene el valor de la propiedad numCelular.
         * 
         */
        public int getNumCelular() {
            return numCelular;
        }

        /**
         * Define el valor de la propiedad numCelular.
         * 
         */
        public void setNumCelular(int value) {
            this.numCelular = value;
        }

        /**
         * Obtiene el valor de la propiedad calle.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCalle() {
            return calle;
        }

        /**
         * Define el valor de la propiedad calle.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCalle(String value) {
            this.calle = value;
        }

        /**
         * Obtiene el valor de la propiedad numCasa.
         * 
         */
        public int getNumCasa() {
            return numCasa;
        }

        /**
         * Define el valor de la propiedad numCasa.
         * 
         */
        public void setNumCasa(int value) {
            this.numCasa = value;
        }

        /**
         * Obtiene el valor de la propiedad colonia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColonia() {
            return colonia;
        }

        /**
         * Define el valor de la propiedad colonia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColonia(String value) {
            this.colonia = value;
        }

        /**
         * Obtiene el valor de la propiedad ciudad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCiudad() {
            return ciudad;
        }

        /**
         * Define el valor de la propiedad ciudad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCiudad(String value) {
            this.ciudad = value;
        }

        /**
         * Obtiene el valor de la propiedad estado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstado() {
            return estado;
        }

        /**
         * Define el valor de la propiedad estado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstado(String value) {
            this.estado = value;
        }

        /**
         * Obtiene el valor de la propiedad pais.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPais() {
            return pais;
        }

        /**
         * Define el valor de la propiedad pais.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPais(String value) {
            this.pais = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreEmpresa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreEmpresa() {
            return nombreEmpresa;
        }

        /**
         * Define el valor de la propiedad nombreEmpresa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreEmpresa(String value) {
            this.nombreEmpresa = value;
        }

        /**
         * Obtiene el valor de la propiedad puesto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPuesto() {
            return puesto;
        }

        /**
         * Define el valor de la propiedad puesto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPuesto(String value) {
            this.puesto = value;
        }

        /**
         * Obtiene el valor de la propiedad salario.
         * 
         */
        public float getSalario() {
            return salario;
        }

        /**
         * Define el valor de la propiedad salario.
         * 
         */
        public void setSalario(float value) {
            this.salario = value;
        }

        /**
         * Obtiene el valor de la propiedad numSucursal.
         * 
         */
        public int getNumSucursal() {
            return numSucursal;
        }

        /**
         * Define el valor de la propiedad numSucursal.
         * 
         */
        public void setNumSucursal(int value) {
            this.numSucursal = value;
        }

    }

}
