package Ejercicio2;

// SistemaBiblioteca.java
public class SistemaBiblioteca {
    public static void main(String[] args) {
        
        // --- 1. Creamos una biblioteca. --- 
        Biblioteca biblio = new Biblioteca("Biblioteca Central UTN");

        // --- 2. Crear al menos tres autores. --- 
        Autor autor1 = new Autor("A101", "Gabriel Garcia", "Colombiana");
        Autor autor2 = new Autor("A102", "Jane Austen", "Británica");
        Autor autor3 = new Autor("A103", "Jorge Luis Borges", "Argentina");
        
        // --- 3. Agregar 5 libros asociados a los Autores a la biblioteca. ---
        System.out.println("--- TAREA 3: AGREGAR LIBROS ---");
        biblio.agregarLibro("978-001", "Cien años de soledad", 1967, autor1);
        biblio.agregarLibro("978-002", "Orgullo y Prejuicio", 1813, autor2);
        biblio.agregarLibro("978-003", "El Aleph", 1949, autor3);
        biblio.agregarLibro("978-004", "El amor en los tiempos del cólera", 1985, autor1);
        biblio.agregarLibro("978-005", "Emma", 1815, autor2);
        
        // --- 4. Listar todos los libros con su información y la del autor. --- 
        biblio.listarLibros();
        
        // --- 5. Buscar un libro por su ISBN (Ej: 978-003) y mostrar info. --- 
        System.out.println("\n--- TAREA 5: BUSCAR LIBRO POR ISBN (978-003) ---");
        Libro libroBuscado = biblio.buscarLibroPorIsbn("978-003");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // --- 6. Filtrar y mostrar los libros publicados en un año específico (Ej: 1815). --- 
        biblio.filtrarLibrosPorAnio(1815);

        // --- 7. Eliminar un libro por su ISBN (Ej: 978-004) y listar los restantes. --- 
        System.out.println("\n--- TAREA 7: ELIMINAR LIBRO (978-004) ---");
        biblio.eliminarLibro("978-004");
        biblio.listarLibros();

        // --- 8. Mostrar la cantidad total de libros en la biblioteca. --- 
        System.out.println("\n--- TAREA 8: CANTIDAD TOTAL DE LIBROS ---");
        System.out.println("Total de libros en la biblioteca: " + biblio.obtenerCantidadLibros());

        // --- 9. Listar todos los autores de los libros disponibles en la biblioteca. --- 
        biblio.mostrarAutoresDisponibles();
    }
}


