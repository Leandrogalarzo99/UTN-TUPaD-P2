package Ejercicio12;

public class Contribuyente {
    private String nombre; // nombre 
    private String cuil; // cuil 

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }
    
    public String getNombre() { return nombre; }
    // Getters
}