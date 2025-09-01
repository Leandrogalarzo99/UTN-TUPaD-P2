import java.util.Scanner;

public class CalculoCompra {

public static void main(String[] args) {
    
 // 1. Declaramos el objeto Scanner.
 Scanner scanner = new Scanner(System.in);
 
 // 2. Solicitamos y leemos el total de la compra.
 System.out.print("Ingrese el total de la compra: $");
 double totalCompra = scanner.nextDouble();
 
 // 3. Llamamos al método para calcular el costo de envío.
 double costoEnvio = calcularCostoEnvio(totalCompra);
 
 // 4. Llamamos al método para calcular el total final
 double totalFinal = calcularTotalCompra(totalCompra, costoEnvio);
 
 // 5. Mostramos los resultados.
 System.out.println("Costo de envio: $" + costoEnvio);
 System.out.println("Total final de la compra: $" + totalFinal);
 
 
 // 6. Cerramos el objeto scanner.
  scanner.close();
}

// Funcion 1: Calcula el costo de envio segun el total de la compra.
// Retorna un valor de tipo double.
public static double calcularCostoEnvio(double total) {
    if (total > 5000) {
        return 0.0; // Envio gratis
    } else {
        return 250.0; // Costo de envio
    }
}

// Funcion 2: Calcula el total final sumando el total de la compra y el envio.
// Retorna un valor de tipo double.
public static double calcularTotalCompra(double total, double costoEnvio) {
    return total + costoEnvio;
}
    
}
