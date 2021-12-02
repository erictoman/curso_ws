/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banxico.servidorglassfish.jaxws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author G17244
 */
//@WebService(targetNamespace = "http://servicios.samarteaga.com")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, 
        use = SOAPBinding.Use.LITERAL,
        parameterStyle = SOAPBinding.ParameterStyle.WRAPPED
)
public interface InstructorInterfaz {
    public String respondePregunta(String pregunta,String tema);
}
