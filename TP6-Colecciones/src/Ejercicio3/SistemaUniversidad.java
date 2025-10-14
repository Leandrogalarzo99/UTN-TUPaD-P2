package Ejercicio3;

// SistemaUniversidad.java
public class SistemaUniversidad {
    public static void main(String[] args) {
        Universidad utn = new Universidad("UTN - Programación a Distancia");
        System.out.println("--- GESTIÓN DE " + utn.getNombre() + " ---");

        // --- Tarea 1 y 2: Crear y agregar profesores y cursos a la universidad. ---
        
        // Profesores
        Profesor p1 = new Profesor("P101", "Dr. López", "POO y Java");
        Profesor p2 = new Profesor("P102", "Ing. Pérez", "Estructuras de Datos");
        Profesor p3 = new Profesor("P103", "Lic. Gómez", "Bases de Datos");
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);

        // Cursos
        Curso c1 = new Curso("C201", "Programación II");
        Curso c2 = new Curso("C202", "Diseño de Sistemas");
        Curso c3 = new Curso("C203", "Algoritmos Avanzados");
        Curso c4 = new Curso("C204", "Ingeniería de Software");
        Curso c5 = new Curso("C205", "Bases de Datos I");
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);
        
        // --- Tarea 3: Asignar profesores a cursos. ---
        System.out.println("\n--- TAREA 3: ASIGNACIÓN INICIAL ---");
        utn.asignarProfesorACurso("C201", "P101"); // Dr. López (c1)
        utn.asignarProfesorACurso("C202", "P101"); // Dr. López (c2)
        utn.asignarProfesorACurso("C203", "P102"); // Ing. Pérez (c3)
        utn.asignarProfesorACurso("C204", "P102"); // Ing. Pérez (c4)

        // --- Tarea 4: Listar cursos con su profesor y profesores con sus cursos. ---
        utn.listarProfesores();
        utn.listarCursos();

        // --- Tarea 5: Cambiar el profesor de un curso (C202) y verificar sincronización. ---
        System.out.println("\n--- TAREA 5: CAMBIAR PROFESOR (C202) ---");
        // El curso C202 cambia de P101 (López) a P103 (Gómez)
        utn.asignarProfesorACurso("C202", "P103"); 
        
        System.out.println("\nVerificación de Sincronización después del cambio:");
        utn.buscarProfesorPorId("P101").mostrarInfo(); // López: Debe tener solo C201
        utn.buscarProfesorPorId("P103").mostrarInfo(); // Gómez: Debe tener C202
        utn.buscarCursoPorCodigo("C202").mostrarInfo(); // C202: Debe tener a P103
        
        // --- Tarea 6: Remover un curso (C201) y confirmar que no está en la lista del profesor. ---
        System.out.println("\n--- TAREA 6: ELIMINAR CURSO (C201) ---");
        utn.eliminarCurso("C201");
        utn.buscarProfesorPorId("P101").mostrarInfo(); // López: Debe aparecer sin cursos

        // --- Tarea 7: Remover un profesor (P102) y dejar profesor = null en sus cursos. ---
        System.out.println("\n--- TAREA 7: ELIMINAR PROFESOR (P102) ---");
        utn.eliminarProfesor("P102");
        utn.buscarCursoPorCodigo("C203").mostrarInfo(); // C203: Debe decir SIN ASIGNAR
        utn.buscarCursoPorCodigo("C204").mostrarInfo(); // C204: Debe decir SIN ASIGNAR

        // --- Tarea 8: Mostrar un reporte: cantidad de cursos por profesor. ---
        utn.mostrarReporteCursosPorProfesor();
    }
}