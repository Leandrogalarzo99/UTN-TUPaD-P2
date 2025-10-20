package Ejercicio2;

import java.io.BufferedReader; // 1. Usamos BufferedReader 
import java.io.FileReader;
import java.io.IOException; // 2. La excepción general de I/O 
import java.io.FileNotFoundException; // para un mensaje más específico)


public class LecturaConRecursos {

    public static void main(String[] args) {
        
        String nombreArchivo = "archivo.txt";
        
        System.out.println("Intentando leer el archivo con try-with-resources...");

        // 3. Esta es la sintaxis "try-with-resources".
        // El BufferedReader (y el FileReader que envuelve) se declaran
        // DENTRO de los paréntesis ().
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("--- Contenido del archivo ---");
            String linea;
            
            // 4. Leemos el archivo línea por línea
            // br.readLine() devuelve 'null' cuando llega al final del archivo
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("-----------------------------");
            System.out.println("Lectura completada.");

        } catch (FileNotFoundException e) {
            // 5. Capturamos un error específico (buena práctica)
            System.out.println("Error: El archivo '" + nombreArchivo + "' no fue encontrado.");

        } catch (IOException e) {
            // 6. Capturamos cualquier otro error de lectura 
            System.out.println("Error de E/S (I/O): Ocurrio un problema al leer el archivo.");
            System.out.println("Detalle: " + e.getMessage());
        }
        
        // 7. Nota la AUSENCIA de un bloque 'finally'.
        // Java cierra 'br' y 'FileReader' automáticamente.
        
        System.out.println("Programa terminado.");
    }
}


