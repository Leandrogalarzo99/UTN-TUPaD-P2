import java.util.Scanner;


public class MayorDeTres {
 
public static void main(String[] args) {

// 1. Declaramos un objeto Scanner para leer la entrada del usuario
Scanner scanner = new Scanner(System.in);

// 2. Solicitamos y leemos los tres números.
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int numero3 = scanner.nextInt();


//3. Utilizamos una variable para almacenar el número mayor.
int mayor = numero1;

//4. Comparamos el segundo  y el tercer numero con el numero actual mayor.
// Si el segundo numero es mayor que el actual mayor, lo actualizamos.
 if (numero2 > mayor) {
            mayor = numero2;
        }

// Si el tercer numero es mayor que el actual mayor, lo actualizamos.
  if (numero3 > mayor) {
            mayor = numero3;
        }

// 5. Imprimimos el resultado
System.out.println("El mayor es: " + mayor);


// 6. Cerramos con el objeto Scanner.
scanner.close();

        
    
}
}
