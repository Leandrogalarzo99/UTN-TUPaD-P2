package Ejercicio13;

public class Main {
    public static void main(String[] args) {
        
        // 1. Crear Usuario
        Usuario ana = new Usuario("Ana Gómez", "ana.g@mail.com");

        // 2. Crear GeneradorQR
        GeneradorQR generador = new GeneradorQR();
        
        // 3. Generar el Código QR (Dependencia de Creación)
        // El método 'generar' crea un nuevo objeto CodigoQR.
        CodigoQR ticketQR = generador.generar("ticket-2023-A", ana);
        
        // 4. Mostrar el resultado
        System.out.println("\n--- Uso del Objeto Creado ---");
        ticketQR.mostrar();
    }
}

