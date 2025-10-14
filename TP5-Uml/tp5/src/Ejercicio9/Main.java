package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        
        // 1. Crear el Paciente
        Paciente luis = new Paciente("Luis Fernández", "OSDE 210");
        
        // 2. Crear el Profesional
        Profesional draAna = new Profesional("Dra. Ana Torres", "Pediatría");

        // 3. Crear la Cita Médica, asociando ambos objetos existentes
        CitaMedica cita1 = new CitaMedica(
            "2025-10-25", 
            "10:00", 
            luis,     // Asociación a Paciente
            draAna    // Asociación a Profesional
        );

        // Verificación de las relaciones:

        System.out.println("--- Verificación de Asociaciones Unidireccionales ---");
        
        // CitaMédica -> Paciente (Funciona)
        System.out.println("Cita para: " + cita1.getPaciente().getNombre() + " (Obra Social: " + cita1.getPaciente().getObraSocial() + ")"); 
        
        // CitaMédica -> Profesional (Funciona)
        System.out.println("Con el profesional: " + cita1.getProfesional().getNombre() + " (" + cita1.getProfesional().getEspecialidad() + ")");
        
        // Paciente -> CitaMédica (FALLARÍA, es unidireccional)
    }
}


