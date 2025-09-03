public class Libro {

// 1. Atributos privados: la palabra 'private' protege los datos
private String titulo;
private String autor;
private int anioPublicacion;

// 2. Constructor para inicializar el objeto libro.
public Libro(String titulo, String autor, int anioPublicacion) {
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;
}

// 3. Métodos Getters: permiten acceder a los atributos privados.
public String getTitulo() {
    return titulo;
}
public String getAutor() {
    return autor;
}
public int getAnioPublicacion() {
    return anioPublicacion;
}

// 4. Método Setter con validación para el año de publicación.
public void setAnioPublicacion(int anio) {
   // Validación: El año debe ser mayor a 0 y no debe ser posterior a 2025.
    if (anio > 0 &&  anio<= 2025) { // Se uso 2025 como anio limite.
        this.anioPublicacion = anio;
        System.out.println("El anio de publicacion ha sido actualizado a" + anio + ".");
    } else {
        System.out.println("Error anio de publicacion invalida. El anio no se ha modificado. ");
    }
}

// Método adicional para mostrar la información, útil para las pruebas.
public void mostrarInfo() {
      System.out.println("Informacion de libro: ");
      System.out.println("Titulo: " + this.getTitulo());
      System.out.println("Autor: " + this.getAutor());
      System.out.println("Anio de publicacion: " + this.getAnioPublicacion());
      System.out.println("------------------------------------------------");
}

}

 // Se quita el modificador "public" de la clase main para evitar error de copilacion,
class Main {
    public static  void main(String[] args ) {
        // Tarea: Crear un libro.
        System.out.println("Creando un nuevo libro...");
        Libro libro1 = new Libro  ("La metamorfosis","Franz Kafka", 1915 );
        
        // Mostrar información inicial
        libro1.mostrarInfo();
        
       // Tarea: Intentar modificar el año con un valor inválido.
        System.out.println("Intentando modificar el anio con un valor invalido (2028)...");
        libro1.setAnioPublicacion(2028);
        libro1.mostrarInfo();
        
        // Tarea: Intentar modificar el año con un valor válido.
        System.out.println("Intentando modificar el anio con un valor valido(1920)...");
        libro1.setAnioPublicacion(1920);
        libro1.mostrarInfo();
        
    }
}
