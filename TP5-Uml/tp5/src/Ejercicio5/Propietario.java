package Ejercicio5;

public class Propietario {
    private String nombre;
    private String dni;
    
    // Asociación Bidireccional: Un Propietario tiene una Computadora
    private Computadora computadora; 

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Método para establecer la relación (llamado desde Computadora)
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Computadora getComputadora() {
        return computadora;
    }
}


