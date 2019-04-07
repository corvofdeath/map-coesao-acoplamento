/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builders;

import main.figuras.Quadrado;

/**
 *
 * @author Rasputuim
 */
public class QuadradoBuilder {
    private Quadrado quadrado;
    
    public static QuadradoBuilder mockQuadrado() {
        QuadradoBuilder builder = new QuadradoBuilder();
        builder.quadrado = new Quadrado(5);
        
        return builder;
    }
    
    public Quadrado getQuadrado(){
        return this.quadrado;
    }
}
