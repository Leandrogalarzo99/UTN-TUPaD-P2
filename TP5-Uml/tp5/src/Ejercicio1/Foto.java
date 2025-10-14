package Ejercicio1;

public class Foto {
    // Atributos de la clase Foto
    private final String imagen; // Por simplicidad, se usa String para la ruta o datos
    private final String formato;

    // Constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    // Getters
    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }

    // Método para demostrar su existencia
    @Override
    public String toString() {
        return "Foto [Formato: " + formato + ", Imagen: " + imagen.substring(0, 10) + "...]";
    }
}