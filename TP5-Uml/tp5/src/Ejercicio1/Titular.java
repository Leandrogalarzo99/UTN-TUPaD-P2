package Ejercicio1;

public class Titular {
    // Atributos de la clase Titular
    private final String nombre;
    private final String dni;
    
    // 2b. Implementación de la Asociación Bidireccional:
    // Un Titular tiene una referencia a un Pasaporte
    private Pasaporte pasaporte; // Multiplicidad 1 a 1

    // Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Método para establecer la relación (importante para bidireccionalidad)
    public void setPasaporte(Pasaporte pasaporte) {
        // Establece el pasaporte, asegurando la bidireccionalidad si es necesario
        this.pasaporte = pasaporte;
       
        // if (pasaporte.getTitular() != this) { pasaporte.setTitular(this); }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    // ... otros getters
    
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    @Override
    public String toString() {
        return "Titular [Nombre: " + nombre + ", DNI: " + dni + "]";
    }
}