package Ejercicio7;

public class Conductor {
    private String nombre; // nombre [cite: 97]
    private String licencia; // licencia [cite: 97]
    
    // Asociación Bidireccional: Un Conductor tiene un Vehículo
    private Vehiculo vehiculo; 

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    // Setter clave para el enlace bidireccional
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre() { return nombre; }
    public Vehiculo getVehiculo() { return vehiculo; }
    // Getters
}

