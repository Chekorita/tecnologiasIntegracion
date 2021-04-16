package com.proyecto.empleados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.example.trabajadores.ConsultarRequest;
import com.example.trabajadores.ConsultarResponse;
import com.example.trabajadores.ConsultarNombreRequest;
import com.example.trabajadores.ConsultarNombreResponse;
import com.example.trabajadores.ConsultarPuestoRequest;
import com.example.trabajadores.ConsultarPuestoResponse;
import com.example.trabajadores.ConsultarSucursalRequest;
import com.example.trabajadores.ConsultarSucursalResponse;
import com.example.trabajadores.RegistrarRequest;
import com.example.trabajadores.RegistrarResponse;
import com.example.trabajadores.ModificarRequest;
import com.example.trabajadores.ModificarResponse;
import com.example.trabajadores.EliminarIndividualRequest;
import com.example.trabajadores.EliminarIndividualResponse;
import com.example.trabajadores.EliminarQuiebraRequest;
import com.example.trabajadores.EliminarQuiebraResponse;

@Endpoint
public class TrabajadoresEndpoint {
    @Autowired
    private Iempleados isa;

    @PayloadRoot (namespace = "http://www.example.com/trabajadores", localPart = "RegistrarRequest")

    @ResponsePayload
    public RegistrarResponse RegistrarEmpleados(@RequestPayload RegistrarRequest peticion){
        RegistrarResponse respuesta = new RegistrarResponse();
        Empleados empli = new Empleados();
        empli.setApellidos(peticion.getApellidos());
        empli.setCalle(peticion.getCalle());
        empli.setCiudad(peticion.getCiudad());
        empli.setColonia(peticion.getColonia());
        empli.setEstado(peticion.getColonia());
        empli.setNombre(peticion.getNombre());
        empli.setNombreEmpresa(peticion.getNombreEmpresa());
        empli.setNumCasa(peticion.getNumCasa());
        empli.setNumCelular(peticion.getNumCelular());
        empli.setNumSucursal(peticion.getNumSucursal());
        empli.setPais(peticion.getPais());
        empli.setPuesto(peticion.getPuesto());
        empli.setSalario(peticion.getSalario());
        isa.save(empli);
        respuesta.setMensaje("Empleado guardado");;
        return respuesta;
    }
    
    @PayloadRoot (namespace = "http://www.example.com/trabajadores", localPart = "ConsultarRequest")

    @ResponsePayload
    public ConsultarResponse consultarTodos(@RequestPayload ConsultarRequest peticion){
        ConsultarResponse respuesta = new ConsultarResponse();
        Iterable<Empleados>iempleados = isa.findAllByNombreEmpresa(peticion.getNombreEmpresa());
        for(Empleados ls : iempleados){
            ConsultarResponse.Empleados empli = new ConsultarResponse.Empleados();
            empli.setApellidos(ls.getApellidos());
            empli.setCalle(ls.getCalle());
            empli.setCiudad(ls.getCiudad());
            empli.setColonia(ls.getColonia());
            empli.setEstado(ls.getEstado());
            empli.setNombre(ls.getNombre());
            empli.setNombreEmpresa(ls.getNombreEmpresa());
            empli.setNumCasa(ls.getNumCasa());
            empli.setNumCelular(ls.getNumCelular());
            empli.setNumSucursal(ls.getNumSucursal());
            empli.setPais(ls.getPais());
            empli.setPuesto(ls.getPuesto());
            empli.setSalario(ls.getSalario());
            respuesta.getEmpleados().add(empli);
        }
        return respuesta;
    }

    @PayloadRoot (namespace = "http://www.example.com/trabajadores", localPart = "ConsultarSucursalRequest")

    @ResponsePayload
    public ConsultarSucursalResponse consultarTodosSucursal(@RequestPayload ConsultarSucursalRequest peticion){
        ConsultarSucursalResponse respuesta = new ConsultarSucursalResponse();
        Iterable<Empleados>iempleados = isa.findAllByNombreEmpresaAndNumSucursal(peticion.getNombreEmpresa(), peticion.getNumSucursal());
        for(Empleados ls : iempleados){
            ConsultarSucursalResponse.Empleados empli = new ConsultarSucursalResponse.Empleados();
            empli.setApellidos(ls.getApellidos());
            empli.setCalle(ls.getCalle());
            empli.setCiudad(ls.getCiudad());
            empli.setColonia(ls.getColonia());
            empli.setEstado(ls.getEstado());
            empli.setNombre(ls.getNombre());
            empli.setNombreEmpresa(ls.getNombreEmpresa());
            empli.setNumCasa(ls.getNumCasa());
            empli.setNumCelular(ls.getNumCelular());
            empli.setNumSucursal(ls.getNumSucursal());
            empli.setPais(ls.getPais());
            empli.setPuesto(ls.getPuesto());
            empli.setSalario(ls.getSalario());
            respuesta.getEmpleados().add(empli);
        }
        return respuesta;
    }


    @PayloadRoot (namespace = "http://www.example.com/trabajadores", localPart = "ConsultarPuestoRequest")

    @ResponsePayload
    public ConsultarPuestoResponse consultarTodosSucursalPuesto(@RequestPayload ConsultarPuestoRequest peticion){
        ConsultarPuestoResponse respuesta = new ConsultarPuestoResponse();
        Iterable<Empleados>iempleados = isa.findAllByNombreEmpresaAndNumSucursalAndPuesto(peticion.getNombreEmpresa(), peticion.getNumSucursal(), peticion.getPuesto());
        for(Empleados ls : iempleados){
            ConsultarPuestoResponse.Empleados empli = new ConsultarPuestoResponse.Empleados();
            empli.setApellidos(ls.getApellidos());
            empli.setCalle(ls.getCalle());
            empli.setCiudad(ls.getCiudad());
            empli.setColonia(ls.getColonia());
            empli.setEstado(ls.getEstado());
            empli.setNombre(ls.getNombre());
            empli.setNombreEmpresa(ls.getNombreEmpresa());
            empli.setNumCasa(ls.getNumCasa());
            empli.setNumCelular(ls.getNumCelular());
            empli.setNumSucursal(ls.getNumSucursal());
            empli.setPais(ls.getPais());
            empli.setPuesto(ls.getPuesto());
            empli.setSalario(ls.getSalario());
            respuesta.getEmpleados().add(empli);
        }
        return respuesta;
    }


    @PayloadRoot (namespace = "http://www.example.com/trabajadores", localPart = "ConsultarNombreRequest")

    @ResponsePayload
    public ConsultarNombreResponse consultarTodosSucursalNombre(@RequestPayload ConsultarNombreRequest peticion){
        ConsultarNombreResponse respuesta = new ConsultarNombreResponse();
        Iterable<Empleados>iempleados = isa.findAllByNombreEmpresaAndNumSucursalAndNombre(peticion.getNombreEmpresa(), peticion.getNumSucursal(), peticion.getNombre());
        for(Empleados ls : iempleados){
            ConsultarNombreResponse.Empleados empli = new ConsultarNombreResponse.Empleados();
            empli.setApellidos(ls.getApellidos());
            empli.setCalle(ls.getCalle());
            empli.setCiudad(ls.getCiudad());
            empli.setColonia(ls.getColonia());
            empli.setEstado(ls.getEstado());
            empli.setNombre(ls.getNombre());
            empli.setNombreEmpresa(ls.getNombreEmpresa());
            empli.setNumCasa(ls.getNumCasa());
            empli.setNumCelular(ls.getNumCelular());
            empli.setNumSucursal(ls.getNumSucursal());
            empli.setPais(ls.getPais());
            empli.setPuesto(ls.getPuesto());
            empli.setSalario(ls.getSalario());
            respuesta.getEmpleados().add(empli);
        }
        return respuesta;
    }

    @PayloadRoot (namespace = "http://www.example.com/trabajadores", localPart = "ModificarRequest")

    @ResponsePayload
    public ModificarResponse modificarEmpleados(@RequestPayload ModificarRequest peticion){
        ModificarResponse respuesta = new ModificarResponse();
        Empleados recuperado = isa.findByNombreEmpresaAndNombreAndApellidos(peticion.getNombreEmpresa(), peticion.getNombre(), peticion.getApellidos());
        recuperado.setCalle(peticion.getCalle());
        recuperado.setCiudad(peticion.getCiudad());
        recuperado.setColonia(peticion.getColonia());
        recuperado.setEstado(peticion.getEstado());
        recuperado.setNumCasa(peticion.getNumCasa());
        recuperado.setNumCelular(peticion.getNumCelular());
        recuperado.setNumSucursal(peticion.getNumSucursal());
        recuperado.setPais(peticion.getPais());
        recuperado.setPuesto(peticion.getPuesto());
        recuperado.setSalario(peticion.getSalario());
        isa.save(recuperado);
        respuesta.setMensaje("Ha sido modificado");
        return respuesta;
    }

    @PayloadRoot (namespace = "http://www.example.com/trabajadores", localPart = "EliminarQuiebraRequest")

    @ResponsePayload
    public EliminarQuiebraResponse EliminarEmpleadosQuiebra(@RequestPayload EliminarQuiebraRequest peticion){
        EliminarQuiebraResponse respuesta = new EliminarQuiebraResponse();
        Iterable<Empleados>iempleados = isa.findAllByNombreEmpresaAndNumSucursal(peticion.getNombreEmpresa(), peticion.getNumSucursal());
        for(Empleados ls : iempleados){
            isa.delete(ls);
        }

        respuesta.setMensaje("Empleados de la sucursal eliminados");;
        return respuesta;
    }

    @PayloadRoot (namespace = "http://www.example.com/trabajadores", localPart = "EliminarIndividualRequest")

    @ResponsePayload
    public EliminarIndividualResponse EliminarEmpleados(@RequestPayload EliminarIndividualRequest peticion){
        EliminarIndividualResponse respuesta = new EliminarIndividualResponse();
        Empleados elimi = isa.findByNombreEmpresaAndNumSucursalAndNombreAndApellidos(peticion.getNombreEmpresa(), peticion.getNumSucursal(), peticion.getNombre(), peticion.getApellidos());
        isa.delete(elimi);
        respuesta.setMensaje("Empleado eliminado");
        return respuesta;
    }
}
