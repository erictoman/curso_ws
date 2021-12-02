/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banxico.servidorglassfish.jaxws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author G17244
 */
@WebService(
        targetNamespace = "http://servicios.samarteaga.com"
)
public class Caja implements Almacen{

    @Override
    @WebMethod
    @Oneway
    public void almacena() {
        System.out.println("El elemento ha sido almacenado en una caja.");
    }

    @Override
    //@WebMethod(exclude = true)
    @WebMethod(exclude = false)
    public int obtieneTotalAlmacenado() {
        return 123;
    }
    
}
