package Ejercicio8;

public class FirmaDigital {
    private String codigoHash; // codigoHash [cite: 106]
    private String fecha; // fecha [cite: 106]
    
    // 8b. Agregación: FirmaDigital tiene un Usuario preexistente
    private Usuario usuario; 

    // El constructor recibe los datos propios MÁS el Usuario para la Agregación
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        // Agregación: Se asigna el Usuario
        this.usuario = usuario;
    }
    
    public String getCodigoHash() { return codigoHash; }
    public Usuario getUsuario() { return usuario; }
    // Getters
    
    @Override
    public String toString() {
        return "Firma [Hash: " + codigoHash.substring(0, 8) + "..., Fecha: " + fecha + "]";
    }
}


