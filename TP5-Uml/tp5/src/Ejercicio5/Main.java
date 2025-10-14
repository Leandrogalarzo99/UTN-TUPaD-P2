package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        
        // 1. Crear el Propietario
        Propietario andres = new Propietario("Andrés Giménez", "30.456.789");

        // 2. Crear la Computadora. Al crearla, automáticamente se crea la PlacaMadre (Composición).
        Computadora miPc = new Computadora(
            "GamerMax", 
            "PC-SERIE-12345", 
            "Asus ROG Z690",     // Atributo 'modelo' de PlacaMadre
            "Intel Z690",        // Atributo 'chipset' de PlacaMadre
            andres               // Referencia al Propietario
        );

        // Verificación de las relaciones:

        // 1. Composición Computadora -> PlacaMadre
        System.out.println("--- Verificación de Composición ---");
        System.out.println(miPc.getMarca() + " usa la placa: " + miPc.getPlacaMadre().getModelo()); 
        
        // 2. Asociación Bidireccional:
        System.out.println("\n--- Verificación de Asociación Bidireccional ---");
        
        // Relación Computadora -> Propietario
        System.out.println("La PC pertenece a: " + miPc.getPropietario().getNombre());
        
        // Relación Propietario -> Computadora
        System.out.println(andres.getNombre() + " tiene la PC con N° de serie: " + andres.getComputadora().getNumeroSerie());
    }
}