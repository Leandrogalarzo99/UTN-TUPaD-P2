package Ejercicio2;

import java.io.File;
import java.io.FileNotFoundException; // 1. Importamos la excepción específica
import java.util.Scanner;


public class LecturaArchivo {

    public static void main(String[] args) {
        
        String nombreArchivo = "archivo.txt";
        
        // 2. Declaramos el Scanner aquí como null
        // para que sea visible en el bloque 'finally'.
        Scanner lectorArchivo = null;
        
        System.out.println("Intentando leer el archivo: " + nombreArchivo);

        try {
            // 3. Creamos el objeto File
            File miArchivo = new File(nombreArchivo);
            
            // 4. Creamos el Scanner para leer el archivo.
            // Esta línea es la que puede lanzar FileNotFoundException
            lectorArchivo = new Scanner(miArchivo);
            
            System.out.println("--- Contenido del archivo ---");
            // 5. Leemos el archivo línea por línea
            while (lectorArchivo.hasNextLine()) {
                String linea = lectorArchivo.nextLine();
                System.out.println(linea);
            }
            System.out.println("-----------------------------");
            System.out.println("Lectura completada.");
            
        } catch (FileNotFoundException e) {
            // 6. Capturamos el error si el archivo no se encuentra
            System.out.println("-------------------------------------------------");
            System.out.println("Error: ¡Archivo no encontrado!");
            System.out.println("No se pudo localizar el archivo '" + nombreArchivo + "' en la carpeta del proyecto.");
            System.out.println("-------------------------------------------------");
            
        } finally {
            // 7. El bloque finally se usa para cerrar recursos.
            // Debemos comprobar si lectorArchivo es 'null',
            // ya que si el archivo no se encontró, la variable nunca se inicializó.
            if (lectorArchivo != null) {
                System.out.println("...Cerrando el lector de archivo.");
                lectorArchivo.close();
            } else {
                System.out.println("...No hay recursos de archivo que cerrar.");
            }
        }
        
        System.out.println("Programa terminado.");
    }
}

