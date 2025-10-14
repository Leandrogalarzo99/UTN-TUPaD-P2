package Ejercicio4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    
    // 4b. Agregación: Tarjeta tiene un Banco
    private Banco banco; 

    // 4a. Asociación Bidireccional: Tarjeta tiene un Cliente
    private Cliente cliente; 

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        
        // Agregación: Se asigna el Banco preexistente
        this.banco = banco; 
        
        // Asociación Bidireccional: Asigna el Cliente
        this.cliente = cliente;
        
        // ¡Establece el enlace de vuelta para la Bidireccionalidad!
        // (Similar al error que tenías, pero necesario para la relación)
        if (cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }
    
    public Banco getBanco() { return banco; }
    public Cliente getCliente() { return cliente; }
    public String getNumero() { return numero; }
    // Getters
}
