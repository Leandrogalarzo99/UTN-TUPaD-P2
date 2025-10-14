package Ejercicio2;

// Autor.java
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters necesarios para la clase Libro y Biblioteca
    public String getId() { return id; }
    public String getNombre() { return nombre; }

    public void mostrarInfo() { //
        System.out.println("  -> Autor ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
    }
}