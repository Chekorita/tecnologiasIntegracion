package com.example.sw;

import org.example.calculadorap.DividirRequest;
import org.example.calculadorap.DividirResponse;
import org.example.calculadorap.MultiplicarRequest;
import org.example.calculadorap.MultiplicarResponse;
import org.example.calculadorap.RestarRequest;
import org.example.calculadorap.RestarResponse;
import org.example.calculadorap.SumarRequest;
import org.example.calculadorap.SumarResponse;
import org.example.calculadorap.ExponenteRequest;
import org.example.calculadorap.ExponenteResponse;
import org.example.calculadorap.RaizCuaRequest;
import org.example.calculadorap.RaizCuaResponse;
import org.example.calculadorap.FormulaRequest;
import org.example.calculadorap.FormulaResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

//aqui se haran todas las operaciones
@Endpoint
public class CalculadoraEndPoint {
    @PayloadRoot (namespace = "http://www.example.org/calculadoraP", localPart = "SumarRequest")

    @ResponsePayload
    public SumarResponse dameSuma(@RequestPayload SumarRequest peticion){
        SumarResponse respuesta = new SumarResponse();
        respuesta.setResultado(String.valueOf(
            Integer.parseInt(peticion.getA()) + Integer.parseInt(peticion.getB()))
        );
        return respuesta;
    }

    @PayloadRoot (namespace = "http://www.example.org/calculadoraP", localPart = "RestarRequest")

    @ResponsePayload
    public RestarResponse dameResta(@RequestPayload RestarRequest peticion){
        RestarResponse respuesta = new RestarResponse();
        respuesta.setResultado(String.valueOf(
            Integer.parseInt(peticion.getA()) - Integer.parseInt(peticion.getB()))
        );
        return respuesta;
    }

    @PayloadRoot (namespace = "http://www.example.org/calculadoraP", localPart = "MultiplicarRequest")

    @ResponsePayload
    public MultiplicarResponse dameMultiplicacion(@RequestPayload MultiplicarRequest peticion){
        MultiplicarResponse respuesta = new MultiplicarResponse();
        respuesta.setResultado(String.valueOf(
            Integer.parseInt(peticion.getA()) * Integer.parseInt(peticion.getB()))
        );
        return respuesta;
    }

    @PayloadRoot (namespace = "http://www.example.org/calculadoraP", localPart = "DividirRequest")

    @ResponsePayload
    public DividirResponse dameDivision(@RequestPayload DividirRequest peticion){
        DividirResponse respuesta = new DividirResponse();
        respuesta.setResultado(String.valueOf(
            Integer.parseInt(peticion.getA()) / Integer.parseInt(peticion.getB()))
        );
        return respuesta;
    }

    @PayloadRoot (namespace = "http://www.example.org/calculadoraP", localPart = "ExponenteRequest")

    @ResponsePayload
    public ExponenteResponse dameExponente(@RequestPayload ExponenteRequest peticion){
        ExponenteResponse respuesta = new ExponenteResponse();
        int expone=1;
        int a=0;
        while(a < Integer.parseInt(peticion.getB())){
            expone = expone * Integer.parseInt(peticion.getA());
            a++;
        }
        respuesta.setResultado(String.valueOf(expone));
        return respuesta;
    }

    @PayloadRoot (namespace = "http://www.example.org/calculadoraP", localPart = "RaizCuaRequest")

    @ResponsePayload
    public RaizCuaResponse dameRaiz(@RequestPayload RaizCuaRequest peticion){
        RaizCuaResponse respuesta = new RaizCuaResponse();
        double raiz=Math.sqrt(Integer.parseInt(peticion.getA()));
        respuesta.setResultado(String.valueOf(raiz));
        return respuesta;
    }

    @PayloadRoot (namespace = "http://www.example.org/calculadoraP", localPart = "FormulaRequest")

    @ResponsePayload
    public FormulaResponse dameFormula(@RequestPayload FormulaRequest peticion){
        FormulaResponse respuesta = new FormulaResponse();
        double p1 = (-1) * (Integer.parseInt(peticion.getB()));
        double potencia = Math.pow(Integer.parseInt(peticion.getB()), 2);
        double multiplica = (-4) * Integer.parseInt(peticion.getA()) * Integer.parseInt(peticion.getC());
        double suma = potencia + multiplica;
        double divi = 2 * Integer.parseInt(peticion.getA());
        if(suma <= 0){
            respuesta.setResultado1(String.valueOf("Es imposible"));
            respuesta.setResultado2(String.valueOf("Es imposible"));
        }
        if(suma>0){
            if(divi <= 0){
                respuesta.setResultado1(String.valueOf("Es imposible"));
                respuesta.setResultado2(String.valueOf("Es imposible"));
            }else{
                double xmas = (p1 + Math.sqrt(suma))/divi;
                double xmenos = (p1 - Math.sqrt(suma))/divi;
                respuesta.setResultado1(String.valueOf(xmas));
                respuesta.setResultado2(String.valueOf(xmenos));
            }
        }
        return respuesta;
    }
}