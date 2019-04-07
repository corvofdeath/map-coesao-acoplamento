package main.figuras;

import main.erros.NumeroNegativoException;

public abstract class FiguraBase implements Figura {

    private final String name;
    private final String field_name;
    private final int field_value;

    public FiguraBase(String name, String field, int value) {
        if(value < 0) { throw new NumeroNegativoException("O valor do " + field + " do " + name + " não pode ser negativo"); }
        this.name = name;
        this.field_name = field;
        this.field_value = value;
    }

    @Override
    public String toString() {
        return "O " + name + " criado tem " + field_name + " de tamanho: " + field_value;
    }

    protected String getPerimetroMessage(double perimetro) {
        return "O perímetro do " + name + " é: " + perimetro;
    }

    protected String getAreaMessage(double area) {
        return "A área deste " + name + " é: " + area;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field_name;
    }

    public int getValue() {
        return field_value;
    }
}
