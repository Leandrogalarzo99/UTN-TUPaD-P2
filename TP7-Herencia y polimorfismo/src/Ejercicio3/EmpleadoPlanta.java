package Ejercicio3;

public class EmpleadoPlanta extends Empleado {
    private final double sueldoFijo = 50000.0; // Sueldo base

    public EmpleadoPlanta(String nombre) {
        super(nombre);
    }

    // Implementación del método abstracto para EmpleadoPlanta
    @Override
    public double calcularSueldo() {
        // Lógica de sueldo: Sueldo fijo
        return sueldoFijo;
    }
}

