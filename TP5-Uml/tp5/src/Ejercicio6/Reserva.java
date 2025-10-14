package Ejercicio6;

public class Reserva {
    private String fecha; // fecha 
    private String hora; // hora 

    // 6a. Asociación Unidireccional: Solo la Reserva tiene referencia al Cliente
    private Cliente cliente; 

    // 6b. Agregación: La Reserva tiene una Mesa preexistente
    private Mesa mesa; 

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        
        // Asociación Unidireccional
        this.cliente = cliente; 
        
        // Agregación
        this.mesa = mesa; 
    }

    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }
    // Getters

    @Override
    public String toString() {
        return "Reserva [Fecha: " + fecha + ", Hora: " + hora + "]";
    }
}