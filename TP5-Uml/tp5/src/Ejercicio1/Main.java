package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto Titular
        Titular juan = new Titular("Juan Perez", "12.345.678");

        // 2. Crear el objeto Pasaporte, que también crea la Foto
        Pasaporte pasaporteDeJuan = new Pasaporte(
            "ARG987654", 
            "2023-01-15", 
            "data:imagen-base64-del-rostro-de-juan", // Atributo 'imagen' de Foto
            "JPEG",                              // Atributo 'formato' de Foto
            juan                                 // Referencia al Titular
        );

        // Verificación de las relaciones:

        // 1. Composición Pasaporte -> Foto
        System.out.println("--- Verificación de Composición ---");
        System.out.println("Pasaporte contiene Foto: " + pasaporteDeJuan.getFoto().getFormato()); // Acceso desde Pasaporte

        // 2. Asociación Bidireccional:
        System.out.println("\n--- Verificación de Asociación Bidireccional ---");
        
        // Relación Pasaporte -> Titular
        System.out.println(pasaporteDeJuan.getNumero() + " pertenece a: " + pasaporteDeJuan.getTitular().getNombre());
        
        // Relación Titular -> Pasaporte
        System.out.println(juan.getNombre() + " tiene el pasaporte: " + juan.getPasaporte().getNumero());
    }
}
