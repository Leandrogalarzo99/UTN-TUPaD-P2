package Ejercicio3;

// Clase abstracta que no puede ser instanciada directamente
public abstract class Empleado {
    protected String nombre;
    
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto: cada subclase definirá su propia lógica de cálculo.
    public abstract double calcularSueldo();
    
    public String getNombre() {
        return nombre;
    }
}


