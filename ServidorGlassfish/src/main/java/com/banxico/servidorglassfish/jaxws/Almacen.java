
package com.banxico.servidorglassfish.jaxws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(
        targetNamespace = "http://servicios.samarteaga.com"
)
public interface Almacen {
        
    void almacena();
        
    int obtieneTotalAlmacenado();
    
}
