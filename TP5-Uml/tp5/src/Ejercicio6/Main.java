package Ejercicio6;


public class Main {
    public static void main(String[] args) {
        
        // --- 1. Agregación: Crear la Mesa (preexistente) ---
        Mesa mesa10 = new Mesa(10, 4);
        
        // --- 2. Asociación: Crear el Cliente ---
        Cliente carlos = new Cliente("Carlos Vives", "300-123-4567");

        // --- 3. Crear la Reserva, usando ambos objetos existentes ---
        Reserva reservaCarlos = new Reserva(
            "2025-10-20", 
            "21:30", 
            carlos,     // Asociación Unidireccional
            mesa10      // Agregación
        );

        // Verificación de las relaciones:

        // 1. Asociación Reserva -> Cliente (Funciona)
        System.out.println("--- Verificación de Asociación Unidireccional ---");
        System.out.println("Reserva de: " + reservaCarlos.getCliente().getNombre()); 
        
        // 2. Cliente -> Reserva (FALLARÍA, la relación es unidireccional)

        // 3. Agregación Reserva -> Mesa (Funciona)
        System.out.println("\n--- Verificación de Agregación ---");
        System.out.println("Mesa asignada: " + reservaCarlos.getMesa().getNumero() + " (" + reservaCarlos.getMesa().getCapacidad() + " personas)");
    }
}