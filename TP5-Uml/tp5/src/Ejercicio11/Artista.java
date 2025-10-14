package Ejercicio11;

public class Artista {
    // Atributos: nombre, genero [cite: 147]
    private String nombre; 
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    
    @Override
    public String toString() {
        return "Artista: " + nombre + " (" + genero + ")";
    }
}
