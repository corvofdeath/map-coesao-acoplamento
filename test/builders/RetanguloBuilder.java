/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import main.figuras.Retangulo;

/**
 *
 * @author Rasputuim
 */
public class RetanguloBuilder {
    private Retangulo retangulo;
    
    public static RetanguloBuilder mockRetangulo() {
        RetanguloBuilder builder = new RetanguloBuilder();
        builder.retangulo = new Retangulo(5, 3);
        
        return builder;
    }
    
    public Retangulo getRetangulo(){
        return this.retangulo;
    }
}
