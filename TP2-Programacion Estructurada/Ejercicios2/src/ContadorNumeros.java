import java.util.Scanner;
public class ContadorNumeros {
 
   public static void main(String[] args) {
       
       // 1. Declaramos el objeto Scanner para leer la entrada del usuario.
       Scanner scanner = new Scanner(System.in);
       
       // 2. Inicializamos los contadores en cero.
       int contadorPositivos = 0;
       int contadorNegativos = 0;
       int contadorCeros = 0;
       
       
       // 3. USamos un bucle for para pedir 10 números.
       // La variable 'i' va de 1 a 10.
       for (int i = 1; i <= 10; i++) {
           System.out.print("Ingrese el numero " + i + ": " );
           int numero = scanner.nextInt();
           
           
           // 4 . Usamos una estructura condicional para clasificar el número.
           if (numero > 0) {
               contadorPositivos++; // Equivalente a contadorPositivos = contadorPositivos + 1;
           } else if (numero < 0) {
               contadorNegativos++;  // Equivalente a contadorNegativos = contadorNegativos + 1;
           }  else { // Si no es positivo ni negativo, debe ser cero.
               contadorCeros++;  // Equivalente a contadorCeros = contadorCeros + 1;
           }
           
       }
       
       // 5. Imprimimos los resultados finales.
       System.out.println("Resultados: ");
         System.out.println("Positivos:  "  + contadorPositivos);
          System.out.println("Negativos: "  + contadorNegativos );
             System.out.println("Ceros:  " + contadorCeros);
   }
    
}
