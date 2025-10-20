package Ejercicio2;

import java.util.Scanner;


public class ConversionNumero {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Declaramos la variable 'entrada' fuera del try
        // para que también sea accesible desde el bloque 'catch'
        String entrada = ""; 
        
        try {
            // 1. Solicitamos un texto (que esperamos sea un número)
            System.out.print("Introduce un texto para convertir a numero entero: ");
            entrada = scanner.nextLine();
            
            // 2. Intentamos la conversión.
            // Esta línea es la que puede lanzar NumberFormatException
            int numero = Integer.parseInt(entrada);
            
            // 3. Si tiene éxito, lo mostramos
            System.out.println("¡Conversion exitosa! El numero introducido es: " + numero);
            
        } catch (NumberFormatException e) {
            // 4. Capturamos el error si la conversión falla
            System.out.println("-------------------------------------------------");
            System.out.println("Error: El texto \"" + entrada + "\" no se puede convertir a un numero.");
            System.out.println("Asegurate de introducir solo digitos enteros (sin espacios ni decimales).");
            // System.out.println("Detalle del error: " + e.getMessage());
            System.out.println("-------------------------------------------------");
            
        } finally {
            // 5. Cerramos el recurso
            System.out.println("...Cerrando scanner.");
            scanner.close();
        }
        
        System.out.println("Programa terminado.");
    }
}


