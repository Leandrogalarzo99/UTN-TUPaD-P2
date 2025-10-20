package Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ValidarEdad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Introduce tu edad: ");
            int edad = scanner.nextInt();
            
            // 3. Intentamos validar la edad. Esta llamada puede lanzar
            // nuestra excepción personalizada.
            validarEdad(edad);
            
            // Si el programa llega aquí, la excepción no fue lanzada
            System.out.println("Edad valida. Has introducido: " + edad);
            
        } catch (EdadInvalidaException e) {
            // 4. Capturamos NUESTRA excepción específica
            System.out.println("-------------------------------------------------");
            System.out.println("Error de validacion: " + e.getMessage());
            System.out.println("-------------------------------------------------");
            
        } catch (InputMismatchException e) {
            // (Bonus) También manejamos si no escriben un número
            System.out.println("Error: Debes introducir un número entero.");
            
        } finally {
            scanner.close();
        }
        
        System.out.println("Programa terminado.");
    }

    /**
     * Método que valida una edad.
     * 1. Comprueba la regla de negocio.
     * 2. 'throws EdadInvalidaException' avisa a Java que este método
     * PUEDE lanzar esta excepción comprobada.
     */
    public static void validarEdad(int edad) throws EdadInvalidaException {
        // Esta es la lógica de validación pedida 
        if (edad < 0 || edad > 120) {
            // 2. Usamos 'throw' para lanzar una nueva instancia de nuestra excepción
            throw new EdadInvalidaException("La edad debe estar en el rango de 0 a 120.");
        }
        // Si no es inválida, el método simplemente termina sin hacer nada.
    }
}

