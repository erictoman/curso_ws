package com.banxico.servidorglassfish.jaxws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://servicios.samarteaga.com")
public class Instructor3 implements InstructorInterfaz{
    @Override
    public String respondePregunta(String pregunta,String tema) {
        System.out.println("Pregunta jaja: "+pregunta);
        System.out.println("Tema jaja: "+tema);
        return "La respuesta para todos son los JAX-WS jaja: "+pregunta+" ** "+tema;
    }
}
