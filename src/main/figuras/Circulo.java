package main.figuras;

public class Circulo extends FiguraBase {

    public Circulo(int raio) {
        super("circulo", "raio", raio);
    }

    @Override
    public String perimetro() {
        double perimetro = (3.14 * this.getValue());
        return this.getPerimetroMessage(perimetro);
    }

    @Override
    public String area() {
        double area = (2 * 3.14 * this.getValue());
        return this.getAreaMessage(area);
    }
}
