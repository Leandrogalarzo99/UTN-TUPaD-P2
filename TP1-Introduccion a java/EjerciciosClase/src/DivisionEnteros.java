import java.util.Scanner;

public class DivisionEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero entero: ");
        int num2 = scanner.nextInt();
        int resultado = num1 / num2; // La división de enteros descarta el residuo
        System.out.println("El resultado de la division entera es: " + resultado);
        scanner.close();
    }
}