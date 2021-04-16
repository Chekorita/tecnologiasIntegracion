package com.proyecto.empleados;

import org.springframework.data.repository.CrudRepository;

public interface Iempleados extends CrudRepository<Empleados,Integer>{
    Iterable<Empleados> findAllByNombreEmpresa(String nombreEmpresa);
    Iterable<Empleados> findAllByNombreEmpresaAndNumSucursalAndPuesto(String nombreEmpresa, int numSucursal, String puesto);
    Iterable<Empleados> findAllByNombreEmpresaAndNumSucursal(String nombreEmpresa, int numSucursal);
    Iterable<Empleados> findAllByNombreEmpresaAndNumSucursalAndNombre(String nombreEmpresa, int numSucursal, String nombre);
    Empleados findByNombreEmpresaAndNombreAndApellidos(String nombreEmpresa, String nombre, String apellidos);

    Empleados findByNombreEmpresaAndNumSucursalAndNombreAndApellidos(String nombreEmpresa, int numSucursal, String nombre, String apellidos);
}
