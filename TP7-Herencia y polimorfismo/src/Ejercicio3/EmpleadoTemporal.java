package Ejercicio3;

public class EmpleadoTemporal extends Empleado {
    private final double horasTrabajadas;
    private final double tarifaPorHora = 1500.0; 

    public EmpleadoTemporal(String nombre, double horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del método abstracto para EmpleadoTemporal
    @Override
    public double calcularSueldo() {
        // Lógica de sueldo: Horas trabajadas * Tarifa por hora
        return horasTrabajadas * tarifaPorHora;
    }
}


