package Ejercicio13;

public class CodigoQR {
    private String valor; // valor
    
    // 13a. Asociación Unidireccional: CodigoQR tiene una referencia a Usuario
    private Usuario usuario; 

    // Este constructor será llamado por GeneradorQR
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    
    // Método para simular el uso
    public void mostrar() {
        System.out.println("Código QR: " + this.valor.toUpperCase());
        System.out.println("Perteneciente a: " + this.usuario.getNombre());
    }
}

