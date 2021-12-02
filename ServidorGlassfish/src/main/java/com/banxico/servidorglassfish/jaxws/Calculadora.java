
package com.banxico.servidorglassfish.jaxws;

public class Calculadora {
    public Integer suma (Integer x, Integer y){
        return x + y;
    }
    
    public Integer resta (Integer x, Integer y){
        return x - y;
    }
    
    public Integer multi (Integer x, Integer y){
        return x * y;
    }
    
    public double div (Integer x, Integer y){
        return (double)x / y;
    }
}
