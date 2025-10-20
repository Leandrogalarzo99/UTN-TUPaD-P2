package Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisionSegura {

    public static void main(String[] args) {
        
        // 1. Declaramos el Scanner fuera del try para que sea accesible en el finally
        Scanner scanner = new Scanner(System.in);
        
        try {
            // 2. Solicitamos los números al usuario
            System.out.print("Introduce el numerador (el numero a dividir): ");
            int numerador = scanner.nextInt();
            
            System.out.print("Introduce el denominador (el numero por el que dividir): ");
            int denominador = scanner.nextInt();
            
            // 3. Intentamos realizar la división
            // Esta línea es la que puede lanzar ArithmeticException
            int resultado = numerador / denominador;
            
            // 4. Si la división fue exitosa, mostramos el resultado
            System.out.println("El resultado de la division es: " + resultado);
            
        } catch (ArithmeticException e) {
            // 5. Capturamos el error específico de división por cero 
            System.out.println("-------------------------------------------------");
            System.out.println("Error: ¡No se puede dividir por cero!");
            System.out.println("Detalle del error: " + e.getMessage());
            System.out.println("-------------------------------------------------");

        } catch (InputMismatchException e) {
            // 6. (Bonus) Capturamos si el usuario no introduce un número entero
            // Esto se relaciona con el ejercicio 2.2, pero es vital para que
            // este programa no falle si el usuario escribe "hola".
            System.out.println("-------------------------------------------------");
            System.out.println("Error: Debes introducir numeros enteros validos.");
            System.out.println("-------------------------------------------------");
        } finally {
            // 7. El bloque finally se ejecuta siempre (con o sin error)
            // Es el lugar ideal para cerrar recursos.
            System.out.println("...Cerrando recursos.");
            scanner.close();
        }
        
        System.out.println("Programa terminado.");
    }
}


