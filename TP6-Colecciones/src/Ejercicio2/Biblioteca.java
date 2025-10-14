package Ejercicio2;

// Biblioteca.java
import java.util.ArrayList; // Reforza el manejo de colecciones dinámicas (ArrayList)
import java.util.List;

public class Biblioteca {
    private String nombre; 
    private List<Libro> libros; // Colección de libros de la biblioteca.

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        // Inicializar la colección
        this.libros = new ArrayList<>(); 
    }

    // Método para agregar un libro (creando un objeto Libro y añadiéndolo a la lista)
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("✅ Libro agregado a " + nombre + ": " + titulo);
    }

    // Listar todos los libros con su información y la del autor.
    public void listarLibros() {
        System.out.println("\n--- Libros en la Biblioteca: " + nombre + " (" + libros.size() + " total) ---");
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro libro : libros) { 
            libro.mostrarInfo();
        }
        System.out.println("------------------------------------");
    }

    // Buscar un libro por su ISBN 
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) { 
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Eliminar un libro por su ISBN 
    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            this.libros.remove(libroAEliminar);
            System.out.println("🗑️ Libro eliminado: " + libroAEliminar.getTitulo());
            return true;
        }
        System.out.println("❌ Libro con ISBN " + isbn + " no encontrado.");
        return false;
    }

    // Obtener la cantidad total de libros 
    public int obtenerCantidadLibros() {
        return this.libros.size();
    }

    // Filtrar y mostrar los libros publicados en un año específico 
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n--- Libros publicados en el año: " + anio + " ---");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en el año " + anio + ".");
        }
        System.out.println("------------------------------------");
    }

    // Mostrar los autores de los libros disponibles (evitando duplicados) 
    public void mostrarAutoresDisponibles() {
        List<String> autoresVistos = new ArrayList<>();
        System.out.println("\n--- Autores de Libros disponibles ---");
        for (Libro libro : libros) {
            String idAutor = libro.getAutor().getId();
            if (!autoresVistos.contains(idAutor)) {
                libro.getAutor().mostrarInfo();
                autoresVistos.add(idAutor);
            }
        }
        if (autoresVistos.isEmpty()) {
             System.out.println("No hay autores registrados.");
        }
        System.out.println("------------------------------------");
    }
}

