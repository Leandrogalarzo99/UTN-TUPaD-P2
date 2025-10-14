package Ejercicio10;

public class ClaveSeguridad {
    // Atributos: codigo, ultimaModificacion [cite: 136]
    private String codigo; 
    private String ultimaModificacion; 

    // Constructor, solo con sus atributos propios
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }
    // Getters y toString
    @Override
    public String toString() {
        return "ClaveSeguridad [Código: " + codigo + ", Última Modificación: " + ultimaModificacion + "]";
    }
}

