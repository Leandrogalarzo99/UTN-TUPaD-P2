package Ejercicio9;

public class Paciente {
    private String nombre; // nombre [cite: 114]
    private String obraSocial; // obra Social [cite: 114]

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    
    public String getNombre() { return nombre; }
    // Getters

    String getObraSocial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

