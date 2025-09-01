import java.util.Scanner;
public class SumaPares {
    
  public static void main(String[] args) {
      
      // 1. Declaramos un objeto Sxanner para leer la entrada del usuario.
         Scanner scanner = new Scanner(System.in);
      
      
      // 2.  Inicializamos una variable para la suma de los numeros pares.
      int sumaPares = 0;
      
      

// 3 . Declaramos una variable para almacenar el número que el usuario ingresa.
int numero;

// 4. Usamos un bucle do-while para garantizar que el programa pida un número al  menos una vez.
// El bucle se repite mientras el número ingresado no sea 0.
do {
    System.out.print("Ingrese un numero (0 para terminar): ");
    numero = scanner.nextInt();
    
    // 5. Verificamos si el numero es par.
    // Un número es par si el residuo de la división por 2 es 0.
    if (numero %2 == 0 && numero !=0) {
        sumaPares = sumaPares + numero; // También puedes usar sumaPares += numero;
    }
} while (numero != 0); // El bucle continúa mientras el número no sea 0.

// 6. Cuando el bucle termina, mostramos el resultado.
      System.out.println("La suma de los numeros pares es:" + sumaPares);
      
      // 7. Cerramos el objeto Scanner.
      scanner.close();
  }
}
