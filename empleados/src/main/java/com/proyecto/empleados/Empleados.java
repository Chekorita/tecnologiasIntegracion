package com.proyecto.empleados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer numCelular;
    private String calle;
    private Integer numCasa;
    private String colonia;
    private String ciudad;
    private String estado;
    private String pais;
    private String nombreEmpresa;
    private String puesto;
    private float salario;
    private Integer numSucursal;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id=id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Integer getNumCelular() {
        return numCelular;
    }
    public void setNumCelular(Integer numCelular) {
        this.numCelular = numCelular;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public Integer getNumCasa() {
        return numCasa;
    }
    public void setNumCasa(Integer numCasa) {
        this.numCasa = numCasa;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Integer getNumSucursal() {
        return numSucursal;
    }
    public void setNumSucursal(Integer numSucursal) {
        this.numSucursal = numSucursal;
    }
}
