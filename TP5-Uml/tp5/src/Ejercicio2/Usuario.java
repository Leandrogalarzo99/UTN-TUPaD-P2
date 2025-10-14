
package Ejercicio2;


public class Usuario {
    private String nombre;
    private String dni;
    
    // Asociación Bidireccional
    private Celular celular; // Multiplicidad 1 a 1

    // Constructor simple
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Setter para la bidireccionalidad
    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public Celular getCelular() {
        return celular;
    }
    
    @Override
    public String toString() {
        return "Usuario [Nombre: " + nombre + ", DNI: " + dni + "]";
    }
}