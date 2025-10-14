package Ejercicio11;

public class Cancion {
    // Atributo: titulo [cite: 146]
    private String titulo;
    
    // 11a. Asociación Unidireccional: Canción tiene un Artista
    private Artista artista; 

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    
    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
    // Getters
}

