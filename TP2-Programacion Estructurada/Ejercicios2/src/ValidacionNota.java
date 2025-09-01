import java.util.Scanner;
public class ValidacionNota {
    
    public static void main(String[] args) {
        
        // 1. Declaramos un objeto Scanner para leer la entrada del usuario.
         Scanner scanner = new Scanner(System.in);
        int nota;
        
        // 2. Usamos un bucle do-while para validar la entrada.
        do {
            System.out.print("Ingrese una nota(0-10): ");
            nota = scanner.nextInt();
            
            // 3. Verificamos si la nota está fuera del rango.
          if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10. ");
            }
            
            // 4. La condición del bucle: se repite si la nota es menor que 0 o mayor que 10.
         } while (nota < 0 || nota > 10);
        
        // 5. Una vez que el bucle termine, significa que se ingresó una nota válida.
        System.out.println("Nota gurdada correctamente. ");
        
        // 5. Cerramos el objeto Scanner.
        scanner.close();
    }
    
}
