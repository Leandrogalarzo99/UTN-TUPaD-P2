
package Ejercicio3;


public class Main {
    public static void main(String[] args) {
        // 1. Crear objetos independientes (Autor y Editorial)
        Autor jorge = new Autor("Jorge Luis Borges", "Argentina");
        Editorial sudamericana = new Editorial("Sudamericana", "Av. 9 de Julio 100");

        // 2. Crear el Libro, inyectando las dependencias
        Libro ficciones = new Libro(
            "Ficciones", 
            "978-9875661642", 
            jorge,           // Asociación Unidireccional
            sudamericana     // Agregación
        );

        // Verificación:
        System.out.println("--- Verificación de Asociación Unidireccional y Agregación ---");
        
        // 1. Libro -> Autor (Funciona)
        System.out.println("El libro: " + ficciones.getTitulo() + " fue escrito por: " + ficciones.getAutor().getNombre()); 
        
        // 2. Autor -> Libro (FALLARÍA si intentamos: jorge.getLibro() porque Autor no tiene ese atributo)
        // La relación es unidireccional.
        
        // 3. Libro -> Editorial (Agregación)
        System.out.println("El libro fue publicado por: " + ficciones.getEditorial().getNombre());
    }
}
