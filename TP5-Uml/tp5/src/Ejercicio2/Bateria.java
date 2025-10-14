
package Ejercicio2;

public class Bateria {
 private String modelo;
    private int capacidad; // mAh
    
    // Constructor que permite crear una Bateria independiente
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    // Getters
    public String getModelo() {
        return modelo;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
 @Override
    public String toString() {
        return "Bateria ¨[Modelo: " + modelo + ", Capacidad: " + capacidad + "mAh+]"; 
    }
     
}
