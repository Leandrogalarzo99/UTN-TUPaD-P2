import java.util.Scanner;

public class DivisionDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 / num2; // La división de doubles mantiene el residuo
        System.out.println("El resultado de la division con decimales es: " + resultado);
        scanner.close();
    }
}