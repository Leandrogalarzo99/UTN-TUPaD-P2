package Ejercicio3;

public class Libro {
    private String titulo;
    private String isbn;

    // 3a. Asociación Unidireccional: Referencia al Autor
    private Autor autor; 

    // 3b. Agregación: Referencia a la Editorial
    private Editorial editorial; 

    // Constructor que recibe objetos existentes (Agregación y Asociación)
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        
        // Asociación Unidireccional (Solo el Libro tiene la referencia)
        this.autor = autor; 
        
        // Agregación (Se recibe una Editorial preexistente)
        this.editorial = editorial; 
    }

    // Getters
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }

    String getTitulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
