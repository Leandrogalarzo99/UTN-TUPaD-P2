
public class Estudiante {
    
 // 1. Atributos de la clase: representan las propiedades del estudiante.
   String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    // 2. Constructor: método especial para crear un nuevo objeto Estudiante.
    public Estudiante (String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    // 3. Método para mostrar la información del estudiante.
    public void mostrarInfo() {
        System.out.println("Informacion del estudiante: ");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("----------------------------------");
    }
    
    // 4. Método para subir la calificación.
    public void subirCalificacion(double puntos) {
        this.calificacion += puntos;
        System.out.println("La calificacion de " + nombre + "ha subido" + puntos + "puntos." );
        System.out.println("Nueva calificacion:" + this.calificacion);
    }
    
    // 5. Método para bajar la calificación.
    public void bajarCalificacion(double puntos) {
        this.calificacion -= puntos;
        System.out.println("La calificacion de " + nombre + "ha bajado" + puntos + "puntos.");
        System.out.println("Nueva calificacion: " + this.calificacion);
    }
}
class Main {   // Se quita el modificador "public" de la clase main para evitar error de copilacion,
    public static void main(String[] args) {
        // Tarea: Instanciar a un estudiante.
        // Creamos un nuevo objeto 'estudiante1' de la clase Estudiante.
        System.out.println("Creando un nuevo estudiante...");
        Estudiante estudiante1 = new Estudiante("Juan", "Diaz", "programacion 2", 78.6);
        
       // Tarea: Mostrar su información.
        estudiante1.mostrarInfo();
        
        // Tarea: Aumentar la calificación.
        estudiante1.subirCalificacion(6.0);
        System.out.println(); // Salto de línea para mayor claridad
        
        // Tarea: Disminuir la calificación.
        estudiante1.bajarCalificacion(10.0);
    }
}