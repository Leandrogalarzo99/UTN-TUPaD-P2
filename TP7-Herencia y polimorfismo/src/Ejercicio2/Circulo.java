package Ejercicio2;

public class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    // Implementación obligatoria del método abstracto
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}