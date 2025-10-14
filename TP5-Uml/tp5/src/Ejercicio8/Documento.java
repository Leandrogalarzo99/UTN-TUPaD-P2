package Ejercicio8;

public class Documento {
    private String titulo; // titulo [cite: 104]
    private String contenido; // contenido [cite: 104]

    // 8a. Composición: La FirmaDigital se crea DENTRO del Documento
    private final FirmaDigital firmaDigital; 

    // El Documento necesita los datos de la Firma y el objeto Usuario para crear su componente.
    public Documento(String titulo, String contenido, String hashFirma, String fechaFirma, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        
        // Composición: La FirmaDigital nace con el Documento.
        // Recibe el Usuario para su Agregación interna.
        this.firmaDigital = new FirmaDigital(hashFirma, fechaFirma, usuario); 
    }
    
    public FirmaDigital getFirmaDigital() { return firmaDigital; }
    public String getTitulo() { return titulo; }
    // Getters
    
    @Override
    public String toString() {
        return "Documento [Título: " + titulo + "]";
    }
}