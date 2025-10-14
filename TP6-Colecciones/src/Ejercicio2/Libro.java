package Ejercicio2;

// Libro.java
public class Libro {
    private String isbn; // Identificador único del libro.
    private String titulo; // Título del libro.
    private int anioPublicacion; // Año de publicación.
    private Autor autor; // Autor del libro.

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Getters necesarios para las búsquedas y filtrados
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }

    public void mostrarInfo() { 
        System.out.println("------------------------------------");
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.print("Autor: ");
        autor.mostrarInfo(); // Llama al método del objeto Autor
    }
}


