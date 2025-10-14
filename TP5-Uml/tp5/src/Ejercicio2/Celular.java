package Ejercicio2;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;

    // 2a. Implementación de la Agregación:
    // Celular tiene una Bateria que se recibe como parámetro.
    private Bateria bateria; // Multiplicidad 1 a 1

    // 2b. Implementación de la Asociación Bidireccional:
    private Usuario usuario; // Multiplicidad 1 a 1

    // Constructor que recibe objetos preexistentes (Agregación)
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        
        // Agregación: Asigna la batería preexistente
        this.bateria = bateria; 
        
        // Asociación Bidireccional: Asigna el usuario y establece el enlace de vuelta
        this.usuario = usuario;
        if (usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    // Getters
    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Celular [Marca: " + marca + ", Modelo: " + modelo + ", IMEI: " + imei + 
               "\n  -> Batería: " + bateria.getModelo() + 
               ",\n  -> Usuario: " + usuario.getNombre() + "]";
    }

    String getMarca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getModelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}