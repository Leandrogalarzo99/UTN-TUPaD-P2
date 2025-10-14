package Ejercicio7;

public class Vehiculo {
    private String patente; // patente [cite: 94]
    private String modelo; // modelo [cite: 94]
    
    // 7a. Agregación: Vehículo tiene un Motor preexistente
    private Motor motor; 

    // 7b. Asociación Bidireccional: Vehículo tiene un Conductor
    private Conductor conductor; 

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        
        // Agregación: Se asigna el Motor preexistente
        this.motor = motor; 
        
        // Asociación Bidireccional: Asigna el Conductor
        this.conductor = conductor;
        
        // ¡Establece el enlace de vuelta para la Bidireccionalidad!
        if (conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }
    public String getPatente() { return patente; }
    // Getters

    String getModelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
