/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.erros;

/**
 *
 * @author Rasputuim
 */
public class NumeroNegativoException extends RuntimeException {
    
    public NumeroNegativoException(String mensage){
        super(mensage);
    }
}
