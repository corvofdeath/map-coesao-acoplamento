package main;

import main.figuras.Circulo;
import main.figuras.Figura;
import main.figuras.Quadrado;
import main.figuras.Retangulo;

import java.util.ArrayList;
import java.util.List;

public class BrincandoComAsFigurasGeometricas {

    public static void main(String[] args) {

        Retangulo retangulo = Geometria.criarRetangulo(10, 5);
        Quadrado quadrado = Geometria.criarQuadrado(7);
        Circulo circulo = Geometria.criarCirculo(25);

        List<Figura> figuras = new ArrayList<Figura>() {
            {
                add(retangulo);
                add(quadrado);
                add(circulo);
            }
        };

        for (Figura figura : figuras) {
            printf(figura.perimetro());
            printf(figura.area());
            printf(figura.toString());
            printf("");
        }

        /* FigurasGeometricas fig = new FigurasGeometricas(10, 5, 7,
                25);
        int per = fig.p(FigurasGeometricas.R);
        if (per == -234 || per == -2658) {
            System.out.println("ERRO");
        }

        per = fig.p(FigurasGeometricas.C);
        if (per == -234 || per == -2658) {
            System.out.println("ERRO");
        }

        per = fig.p(-2);
        if (per == -234 || per == -2658) {
            System.out.println("ERRO");
        }

        per = fig.p(0);
        if (per == -234 || per == -2658) {
            System.out.println("ERRO");
        }

        fig.a(0);
        fig.a(-1);
        fig.a(2);
        fig.a(1);
        fig.a(-2);

        String inf = fig.toStringDaFigura(-1);

        inf = fig.toStringDaFigura(1);
        System.out.println(inf);
        inf = fig.toStringDaFigura(0);
        System.out.println(inf);
        inf = fig.toStringDaFigura(4);
        System.out.println(inf);
        inf = fig.toStringDaFigura(2);
        System.out.println(inf); */
    }

    public static void printf(String msg) {
        System.out.println(msg);
    }
}
