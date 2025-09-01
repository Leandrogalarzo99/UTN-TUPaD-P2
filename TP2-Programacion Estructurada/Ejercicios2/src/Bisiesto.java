import java.util.Scanner;
public class Bisiesto {
 
public static void main(String[] args) {
    
    // 1. Declaramos un objeto Scanner para leer la entrada del usuario.
    Scanner scanner = new Scanner(System.in);
    
    // 2. Solicitamos al usuario que ingrese un año.
    System.out.print("Ingrese un anio: ");
    
    // 3. Leemos el año que ingresó el usuario
    int anio = scanner.nextInt();
    
    // 4. Aplicamos la lógica para determinar si es un año bisíesto.
    // La condicion se traduce directamente de la regla:
    // (divisible por 4 y no divisible por 100) o (divisible por 400).
   boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    
    
    // 5. Usamos una estructura condicional (if-else) para mostrar el resultado.
    if (esBisiesto) {
        System.out.println("El anio " + anio + "es bisiesto.");
    } else {
        System.out.println("El anio" + anio +"no es bisiesto.");
    }
    // 6. Cerramos el objeto Scanner para liberar los recursos.
    scanner.close();
}
}