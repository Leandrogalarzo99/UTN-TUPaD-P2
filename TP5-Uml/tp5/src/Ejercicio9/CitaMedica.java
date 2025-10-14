package Ejercicio9;

public class CitaMedica {
    private String fecha; // fecha [cite: 113]
    private String hora; // hora [cite: 113]

    // 9a. Asociación Unidireccional: Referencia al Paciente
    private Paciente paciente; 

    // 9b. Asociación Unidireccional: Referencia al Profesional
    private Profesional profesional; 

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        
        // Asociación Unidireccional a Paciente
        this.paciente = paciente; 
        
        // Asociación Unidireccional a Profesional
        this.profesional = profesional; 
    }

    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
    // Getters

    @Override
    public String toString() {
        return "Cita Médica [Fecha: " + fecha + ", Hora: " + hora + "]";
    }
}



