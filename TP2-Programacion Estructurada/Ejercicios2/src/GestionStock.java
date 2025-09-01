import java.util.Scanner;

public class GestionStock {
 
  public static void main(String[] args) {
      
      
      // 1. Declaramos un objeto Scanner para leer la entrada del usuario.
         Scanner scanner = new Scanner(System.in);
      
      // 2. Solicitamos y leemos los valores.
     System.out.print("Ingrese el stock actual del producto: ");
      int stockActual = scanner.nextInt();
      
     System.out.print("Ingrese la cantidad vendida: ");
     int cantidadVendida = scanner.nextInt();
      
     System.out.print("Ingrese la cantidad recibida: ");
    int cantidadRecibida = scanner.nextInt();
    
    // 3. Llamamos al método actualizarStock y guardamos el resultado.
    int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
    
    // 4. Mostramos el resultado.
    System.out.println("El nuevo stock del producto es: " + nuevoStock);
    
    // 5. Cerramos el objeto Scanner.
    scanner.close();
  }
  
  // Metodo que calcula el nuevo stock.
  // Recibe el stock actual, la cantidad vendida y  la cantidad recibida como parametros.
  // Retorna el nuevo stock.
  public static int actualizarStock(int stockActual, int cantidadVendida, int  cantidadRecibida) {
      int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
      return nuevoStock;
  }
    
}
