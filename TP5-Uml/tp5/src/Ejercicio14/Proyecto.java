package Ejercicio14;

public class Proyecto {
    private String nombre; // nombre 
    private int duracionMin; // duracion Min 

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
    
    public String getNombre() { return nombre; }
    public int getDuracionMin() { return duracionMin; }
    // Getters
}

