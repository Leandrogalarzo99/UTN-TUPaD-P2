package Ejercicio3;

// Curso.java
public class Curso {
    private String codigo; // Código único[cite: 185].
    private String nombre; // Nombre del curso[cite: 186].
    private Profesor profesor; // Profesor responsable[cite: 187].

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Inicialmente sin profesor asignado
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    /**
     * Asigna/cambia el profesor sincronizando ambos lados.
     * Mantiene la invariante de asociación[cite: 189, 170].
     */
    public void setProfesor(Profesor nuevoProfesor) {
        // --- Paso 1: Romper la relación con el profesor previo (si existe) ---
        // Si tenía profesor previo, quitarse de su lista[cite: 190].
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            // Llamamos a eliminarCurso() para que rompa la relación desde el lado del Profesor.
            this.profesor.getCursos().remove(this); 
        }

        // --- Paso 2: Establecer el nuevo profesor ---
        this.profesor = nuevoProfesor;

        // --- Paso 3: Sincronizar la relación con el nuevo profesor (si no es null) ---
        if (this.profesor != null) {
            // Llama a agregarCurso(), que se encarga de agregarse y evita la recursión.
            this.profesor.agregarCurso(this); 
        }
    }

    // Muestra código, nombre y nombre del profesor (si tiene)[cite: 191].
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "SIN ASIGNAR";
        System.out.println("------------------------------------");
        System.out.println("Curso Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesor Asignado: " + nombreProfesor);
        System.out.println("------------------------------------");
    }
}


