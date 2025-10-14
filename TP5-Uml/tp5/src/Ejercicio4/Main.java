package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        
        // --- 1. Agregación: Crear el Banco (existe independientemente) ---
        Banco bancoNacional = new Banco("Banco Nacional S.A.", "30-12345678-9");
        
        // --- 2. Asociación: Crear el Cliente ---
        Cliente sofia = new Cliente("Sofía Rodríguez", "35.987.654");

        // --- 3. Crear la TarjetaDeCredito, AGREGANDO el Banco y ASOCIANDO el Cliente ---
        TarjetaDeCredito miTarjeta = new TarjetaDeCredito(
            "4567-8901-2345-6789", 
            "12/2026", 
            bancoNacional, // Agregación
            sofia          // Asociación Bidireccional
        );

        // Verificación de las relaciones:

        // 1. Agregación Tarjeta -> Banco
        System.out.println("--- Verificación de Agregación ---");
        System.out.println("La tarjeta N° " + miTarjeta.getNumero() + " es de: " + miTarjeta.getBanco().getNombre()); 
        
        // 2. Asociación Bidireccional Cliente <-> Tarjeta
        System.out.println("\n--- Verificación de Asociación Bidireccional ---");
        // Enlace Tarjeta -> Cliente
        System.out.println("El titular de la tarjeta es: " + miTarjeta.getCliente().getNombre());
        // Enlace Cliente -> Tarjeta
        System.out.println(sofia.getNombre() + " tiene la tarjeta N°: " + sofia.getTarjeta().getNumero());
    }
}