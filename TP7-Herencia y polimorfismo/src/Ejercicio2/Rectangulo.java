package Ejercicio2;

public class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    // Implementación obligatoria del método abstracto
    @Override
    public double calcularArea() {
        return base * altura;
    }
}


