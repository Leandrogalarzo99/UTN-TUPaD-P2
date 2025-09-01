import java.util.Scanner;


public class ClasificacionEdad {
    
public static void main(String[] args) {
    
    //1. Declaramos un objeto scanner para leer la entrada del usuario.
    Scanner scanner = new Scanner(System.in);
    
    
    //2. Solicitamos la edad al usuario.
    System.out.print("Ingrese su edad: ");
    
    
    //3. Leemos la edad que ingresó el usuario.
    int edad = scanner.nextInt();
    
    
    // 4.Usamos una cadena de if-else para clasificar la edad.
    if (edad <12) {
        System.out.println("Eres un niño.");
    } else if (edad >=12 && edad <= 17) {
        System.out.println("Eres un adolecente.");
    } else if (edad >= 18 && edad <= 59) {
        System.out.println("Eres un adulto.");
    } else { // Si no cumple ninguna de las condiciones anteriores, debe ser "Adulto mayor".
        System.out.println("Eres un Adulto mayor. ");
        }
    // 5. Cerramos el objeto Scanner para liberar recursos.
    scanner.close();
    }
}

