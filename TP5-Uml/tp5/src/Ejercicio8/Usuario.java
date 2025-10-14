package Ejercicio8;

public class Usuario {
    private String nombre; // nombre [cite: 108]
    private String email; // email [cite: 108]

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    public String getNombre() { return nombre; }
    // Getters y toString
    @Override
    public String toString() {
        return "Usuario [Nombre: " + nombre + ", Email: " + email + "]";
    }
}

