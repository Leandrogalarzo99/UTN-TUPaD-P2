package Ejercicio1;

public class Vehiculo {
    // Atributos de la clase base
    private final String marca;
    private final String modelo;

    // Constructor de la clase base
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("--- Información del Vehículo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

