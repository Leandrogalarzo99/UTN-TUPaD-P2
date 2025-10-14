package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        
        // 1. Crear el Titular
        Titular matias = new Titular("Matías López", "25.000.000");

        // 2. Crear la CuentaBancaria. Al crearla, automáticamente se crea la ClaveSeguridad (Composición).
        CuentaBancaria cuentaMatias = new CuentaBancaria(
            "0000000000012345678901", 
            5500.50, 
            "A1B2C3D4",          // Atributo 'codigo' de ClaveSeguridad
            "2025-01-01",        // Atributo 'ultimaModificacion' de ClaveSeguridad
            matias               // Referencia al Titular
        );

        // Verificación de las relaciones:

        // 1. Composición CuentaBancaria -> ClaveSeguridad
        System.out.println("--- Verificación de Composición ---");
        System.out.println("El código de seguridad de la cuenta es: " + cuentaMatias.getClaveSeguridad().getCodigo()); 
        
        // 2. Asociación Bidireccional:
        System.out.println("\n--- Verificación de Asociación Bidireccional ---");
        
        // Relación CuentaBancaria -> Titular
        System.out.println("La cuenta CBU " + cuentaMatias.getCbu() + " pertenece a: " + cuentaMatias.getTitular().getNombre());
        
        // Relación Titular -> CuentaBancaria
        System.out.println(matias.getNombre() + " tiene un saldo de: $" + matias.getCuentaBancaria().saldo);
    }
}