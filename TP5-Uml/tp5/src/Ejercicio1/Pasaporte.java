
package Ejercicio1;

public class Pasaporte {
    // Atributos de la clase Pasaporte
    private final String numero;
    private final String fechaEmision;

    // 1a. Implementación de la Composición:
    // La 'Foto' es una parte esencial y su ciclo de vida depende de Pasaporte.
    private final Foto foto; // Multiplicidad 1 a 1

    // 1b. Implementación de la Asociación Bidireccional:
    // Un Pasaporte tiene una referencia a un Titular.
    private Titular titular; // Multiplicidad 1 a 1

    // Constructor que inicializa ambas relaciones
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;

        // Composición: La 'Foto' se crea al mismo tiempo que el 'Pasaporte'.
        // Su existencia está ligada al Pasaporte.
        this.foto = new Foto(imagenFoto, formatoFoto); 
        
        // Asociación Bidireccional: Se establece la referencia al Titular.
        this.titular = titular;
        
        // Para asegurar la bidireccionalidad: 
        // Se establece la referencia de vuelta en el objeto Titular.
        if (titular.getPasaporte() != this) {
             titular.setPasaporte(this);
        }
    }

    // Getters
    public Foto getFoto() {
        return foto; // Devuelve el objeto que fue compuesto
    }

    public Titular getTitular() {
        return titular; // Devuelve el objeto asociado
    }

    // Setter para Titular (para la asociación)
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    // ... otros getters
    
    @Override
    public String toString() {
        return "Pasaporte [Número: " + numero + ", Emisión: " + fechaEmision + 
               ",\n  -> Foto: " + foto.toString() + 
               ",\n  -> Titular: " + titular.getNombre() + "]";
    }

    String getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}