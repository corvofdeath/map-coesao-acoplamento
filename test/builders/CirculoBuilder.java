/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import main.figuras.Circulo;

/**
 *
 * @author Rasputuim
 */
public class CirculoBuilder {
    private Circulo circulo;
    
    public static CirculoBuilder mockCirculo() {
        CirculoBuilder builder = new CirculoBuilder();
        builder.circulo = new Circulo(5);
        
        return builder;
    }
    
    public Circulo getCirculo(){
        return this.circulo;
    }
}
