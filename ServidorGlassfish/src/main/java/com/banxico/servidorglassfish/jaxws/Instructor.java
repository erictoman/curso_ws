package com.banxico.servidorglassfish.jaxws;

import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author D14993
 */
@WebService(
        targetNamespace = "http://servicios.samarteaga.com",
        name = "Maestro",
        serviceName = "Miservicio"
)
public class Instructor {
    @WebResult(name = "respuestaInstructor")
    public String respondePreguntao(String preguntao) {
        return "La respuesta para todos son los JAX-WS a";
    }
}
