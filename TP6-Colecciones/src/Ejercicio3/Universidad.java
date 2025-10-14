package Ejercicio3;

// Universidad.java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Universidad {
    private String nombre; // 
    private List<Profesor> profesores; 
    private List<Curso> cursos; 

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Métodos de Búsqueda (útiles para la gestión)
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) { 
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) { 
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    // Métodos Requeridos
    public void agregarProfesor(Profesor p) {
        this.profesores.add(p); 
    }

    public void agregarCurso(Curso c) {
        this.cursos.add(c); 
    }
    
    // Usa setProfesor del curso para sincronizar la bidireccionalidad
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor); // Sincroniza ambos lados
            System.out.println("✅ Asignación exitosa: " + profesor.getNombre() + " -> " + curso.getNombre());
            return true;
        }
        System.out.println("❌ Error de asignación: Curso o Profesor no encontrado.");
        return false;
    }

    public void listarProfesores() {
        System.out.println("\n--- LISTADO DE PROFESORES en " + nombre + " ---");
        for (Profesor p : profesores) { 
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        System.out.println("\n--- LISTADO DE CURSOS en " + nombre + " ---");
        for (Curso c : cursos) { 
            c.mostrarInfo();
        }
    }

    // Debe romper la relación con su profesor si la hubiera
    public boolean eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        if (cursoAEliminar != null) {
            Profesor p = cursoAEliminar.getProfesor();
            
            // Romper la relación bidireccional ANTES de eliminar el curso
            if (p != null) {
                // Removemos el curso de la lista del profesor. 
                // No usamos eliminarCurso() del profesor para evitar un bucle de setProfesor(null)
                p.getCursos().remove(cursoAEliminar); 
            }
            
            this.cursos.remove(cursoAEliminar);
            System.out.println("🗑️ Curso eliminado: " + cursoAEliminar.getNombre());
            return true;
        }
        System.out.println("❌ Curso con código " + codigo + " no encontrado.");
        return false;
    }
    
    // Antes de remover, dejar null los cursos que dictaba
    public boolean eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        if (profesorAEliminar != null) {
            
            // Tarea 7: Dejar profesor = null en todos sus cursos ANTES de eliminarlo.
            // Copiamos la lista para evitar ConcurrentModificationException al modificarla
            List<Curso> cursosDictados = new ArrayList<>(profesorAEliminar.getCursos());
            for (Curso c : cursosDictados) {
                // setProfesor(null) rompe la relación bidireccional correctamente
                c.setProfesor(null); 
            }
            
            this.profesores.remove(profesorAEliminar);
            System.out.println("🗑️ Profesor eliminado: " + profesorAEliminar.getNombre());
            return true;
        }
        System.out.println("❌ Profesor con ID " + id + " no encontrado.");
        return false;
    }

    // Tarea 8: Mostrar un reporte: cantidad de cursos por profesor.
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n--- REPORTE: Cantidad de Cursos por Profesor ---");
        for (Profesor p : profesores) {
            System.out.println("🧑‍🏫 " + p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
        System.out.println("-------------------------------------------------");
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}