import java.util.Scanner;

public class CapturaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ahora, ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " anios.");
        
        scanner.close(); // Es buena práctica cerrar el scanner
    }
}