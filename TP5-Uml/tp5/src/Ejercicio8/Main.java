package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        
        // --- 1. Agregación: Crear el Usuario (existe independientemente) ---
        Usuario pepe = new Usuario("Pepe Sanz", "pepe.sanz@corp.com");
        
        // --- 2. Composición: Crear el Documento, el cual crea la FirmaDigital internamente.
        Documento contrato = new Documento(
            "Contrato de Alquiler", 
            "Detalle del acuerdo...", 
            "A87B2C6D1",  // Código Hash de la FirmaDigital
            "2025-10-14", // Fecha de la FirmaDigital
            pepe          // Objeto Usuario (para la Agregación de FirmaDigital)
        );

        // Verificación de las relaciones:

        // 1. Composición Documento -> FirmaDigital (Acceso a la parte compuesta)
        System.out.println("--- Verificación de Composición ---");
        System.out.println(contrato.getTitulo() + " está firmado con Hash: " + contrato.getFirmaDigital().getCodigoHash()); 
        
        // 2. Agregación FirmaDigital -> Usuario (Acceso al Usuario a través de la Firma)
        System.out.println("\n--- Verificación de Agregación ---");
        System.out.println("La Firma pertenece al usuario: " + contrato.getFirmaDigital().getUsuario().getNombre());
    }
}
