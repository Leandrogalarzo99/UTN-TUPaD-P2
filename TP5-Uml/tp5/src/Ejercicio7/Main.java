package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        
        // --- 1. Agregación: Crear el Motor (existe independientemente) ---
        Motor motorDiesel = new Motor("Diesel V8", "MTR-18945");
        
        // --- 2. Asociación: Crear el Conductor ---
        Conductor laura = new Conductor("Laura Gómez", "A-345678");

        // --- 3. Crear el Vehículo, AGREGANDO el Motor y ASOCIANDO el Conductor ---
        Vehiculo camioneta = new Vehiculo(
            "ABC 123", 
            "Ford Ranger", 
            motorDiesel, // Agregación
            laura        // Asociación Bidireccional
        );

        // Verificación de las relaciones:

        // 1. Agregación Vehículo -> Motor
        System.out.println("--- Verificación de Agregación ---");
        System.out.println("El Vehículo (" + camioneta.getModelo() + ") tiene un motor tipo: " + camioneta.getMotor().getTipo()); 
        
        // 2. Asociación Bidireccional Conductor <-> Vehículo
        System.out.println("\n--- Verificación de Asociación Bidireccional ---");
        // Enlace Vehículo -> Conductor
        System.out.println("El conductor del vehículo es: " + camioneta.getConductor().getNombre());
        // Enlace Conductor -> Vehículo
        System.out.println(laura.getNombre() + " conduce el vehículo patente N°: " + laura.getVehiculo().getPatente());
    }
}