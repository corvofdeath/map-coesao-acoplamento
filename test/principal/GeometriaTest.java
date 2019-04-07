/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import builders.CirculoBuilder;
import builders.QuadradoBuilder;
import builders.RetanguloBuilder;
import main.Geometria;
import main.erros.NegativeNumberException;
import main.figuras.Circulo;
import main.figuras.Quadrado;
import main.figuras.Retangulo;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Rasputuim
 */
public class GeometriaTest {
    // Add as bibliotecas JUnit 4.12 (ou superior) e Hamcrest 1.3 (ou superior) para os testes rodarem.
    private Quadrado quadradoBuilder;
    private Circulo circuloBuilder;
    private Retangulo retanguloBuilder;
    
    @Before
    public void setUp(){
        this.quadradoBuilder =  QuadradoBuilder.mockQuadrado().getQuadrado();
        this.circuloBuilder = CirculoBuilder.mockCirculo().getCirculo();
        this.retanguloBuilder = RetanguloBuilder.mockRetangulo().getRetangulo();
    }
    
    @Test
    public void testCriarQuadrado(){
        Quadrado quadrado = Geometria.criarQuadrado(5);
        assertEquals(quadrado.area(), this.quadradoBuilder.area());
        assertEquals(quadrado.perimetro(), this.quadradoBuilder.perimetro());
    }
    
    @Test(expected = NegativeNumberException.class)
    public void testCriarQuadradoException(){
        Quadrado quadrado = Geometria.criarQuadrado(-5);
    }
    
    @Test
    public void testCriarRetangulo(){
        Retangulo retangulo = Geometria.criarRetangulo(5, 3);
        assertEquals(retangulo.area(), this.retanguloBuilder.area());
        assertEquals(retangulo.perimetro(), this.retanguloBuilder.perimetro());
    }
    
    @Test(expected = NegativeNumberException.class)
    public void testCriarRetanguloException(){
        Retangulo retangulo = Geometria.criarRetangulo(5, -3);
    }
    
    @Test
    public void testCriarCirculo(){
        Circulo circulo = Geometria.criarCirculo(5);
        assertEquals(circulo.area(), this.circuloBuilder.area());
        assertEquals(circulo.perimetro(), this.circuloBuilder.perimetro());
    }
    
    @Test(expected = NegativeNumberException.class)
    public void testCriarCirculoException(){
        Circulo circulo = Geometria.criarCirculo(-5);
    }
}
