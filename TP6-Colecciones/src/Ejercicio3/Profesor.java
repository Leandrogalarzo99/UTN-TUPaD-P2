package Ejercicio3;

// Profesor.java
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // List<Curso> cursos que dicta

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id; // Identificador único
        this.nombre = nombre; // Nombre completo
        this.especialidad = especialidad; // Área principal
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }

    // Método sugerido: Agrega el curso a su lista si no está y SINCRONIZA el lado del curso
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            // Sincroniza el lado del curso: Llama al setProfesor, 
            // pero solo si el profesor del curso no es ya este profesor, para evitar recursión infinita.
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    // Método sugerido: Quita el curso y SINCRONIZA el lado del curso (dejar profesor en null si corresponde)
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            // Sincroniza el lado del curso: Si el curso me tenía como profesor, me quita.
            if (c.getProfesor() == this) {
                // Aquí usamos setProfesor(null) para romper la relación bidireccional.
                c.setProfesor(null); 
            }
        }
    }

    // Muestra códigos y nombres
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("   No dicta cursos actualmente.");
            return;
        }
        System.out.println("   Cursos dictados (" + cursos.size() + "):");
        for (Curso curso : cursos) {
            System.out.println("    - [" + curso.getCodigo() + "] " + curso.getNombre());
        }
    }

    // Imprime datos del profesor y cantidad de cursos
    public void mostrarInfo() {
        System.out.println("------------------------------------");
        System.out.println("Profesor ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos a cargo: " + cursos.size());
        listarCursos();
        System.out.println("------------------------------------");
    }
}


