package Ejercicio5;

public class Computadora {
    private String marca; // marca
    private String numeroSerie; // numeroSerie

    // 5a. Implementación de la Composición: 
    // La PlacaMadre se crea DENTRO de la Computadora.
    private final PlacaMadre placaMadre; // Multiplicidad 1 a 1

    // 5b. Implementación de la Asociación Bidireccional:
    private Propietario propietario; // Multiplicidad 1 a 1

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;

        // Composición: La PlacaMadre nace con la Computadora
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); 
        
        // Asociación Bidireccional: Se establece la referencia al Propietario.
        this.propietario = propietario;
        
        // Para asegurar la bidireccionalidad: 
        // Se establece la referencia de vuelta en el objeto Propietario.
        if (propietario.getComputadora() != this) {
             propietario.setComputadora(this);
        }
    }

    // Getters
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    @Override
    public String toString() {
        return "Computadora [Marca: " + marca + ", Serie: " + numeroSerie + "]";
    }

    String getMarca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNumeroSerie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
