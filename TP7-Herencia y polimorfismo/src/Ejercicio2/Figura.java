package Ejercicio2;

// Clase abstracta: no se pueden crear instancias directamente de esta clase
public abstract class Figura {
    protected String nombre; // Usamos protected para que las subclases puedan acceder

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: debe ser implementado OBLIGATORIAMENTE por las subclases
    public abstract double calcularArea(); 

    // Método concreto (opcional, pero útil)
    public String getNombre() {
        return nombre;
    }
}

