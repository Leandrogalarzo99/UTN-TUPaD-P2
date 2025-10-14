package Ejercicio4;

public class Cliente {
    private String nombre;
    private String dni;
    
    // Asociación Bidireccional: Referencia a la Tarjeta
    private TarjetaDeCredito tarjeta; 

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Setter clave para el enlace bidireccional
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() { return nombre; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }
    // Getters
}