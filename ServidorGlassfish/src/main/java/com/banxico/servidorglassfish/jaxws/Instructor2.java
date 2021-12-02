package com.banxico.servidorglassfish.jaxws;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://servicios.samarteaga.com")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, 
        use = SOAPBinding.Use.LITERAL,
        parameterStyle = SOAPBinding.ParameterStyle.WRAPPED
)
public class Instructor2 {
    //@WebResult(name = "respuestaInstructor")
    public String respondePreguntaJaja(String preguntajaja) {
        return "La respuesta para todos son los JAX-WS b"+preguntajaja;
    } 
}
