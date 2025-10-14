package Ejercicio6;

public class Cliente {
    private String nombre; // nombre 
    private String telefono; // telefono 

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String getNombre() { return nombre; }
    // Getters
    
    @Override
    public String toString() {
        return "Cliente [Nombre: " + nombre + ", Teléfono: " + telefono + "]";
    }
}

