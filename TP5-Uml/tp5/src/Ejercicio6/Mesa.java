package Ejercicio6;

public class Mesa {
    private int numero; // numero 
    private int capacidad; // capacidad 

    // Se asume que las mesas se crean al iniciar el sistema
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    public int getNumero() { return numero; }
    // Getters
    
    @Override
    public String toString() {
        return "Mesa N°" + numero + " (Capacidad: " + capacidad + ")";
    }

    String getCapacidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
