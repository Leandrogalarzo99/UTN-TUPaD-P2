package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // --- 1. Agregación: Crear Bateria (La parte existe independientemente) ---
        Bateria miBateria = new Bateria("Li-ion-3000", 3000);
        
        // --- 2. Asociación: Crear Usuario ---
        Usuario Santiago = new Usuario("Santiago Perez", "20.123.456");

        // --- 3. Crear Celular, AGREGANDO los objetos existentes ---
        Celular miCelular = new Celular(
            "990000123456789", 
            "XTech", 
            "S10", 
            miBateria, // Se pasa el objeto Bateria existente (Agregación)
            Santiago       // Se pasa el objeto Usuario existente (Asociación)
        );

        // Verificación de las relaciones:

        // 1. Agregación Celular -> Batería
        System.out.println("--- Verificación de Agregación ---");
        System.out.println("El Celular tiene una batería de: " + miCelular.getBateria().getCapacidad() + "mAh."); 
        // Si el Celular se destruye, la Batería (miBateria) sigue existiendo en el main.

        // 2. Asociación Bidireccional
        System.out.println("\n--- Verificación de Asociación Bidireccional ---");
        System.out.println(miCelular.getMarca() + " pertenece a: " + miCelular.getUsuario().getNombre());
        System.out.println(Santiago.getNombre() + " tiene el celular: " + Santiago.getCelular().getModelo());
    }
}