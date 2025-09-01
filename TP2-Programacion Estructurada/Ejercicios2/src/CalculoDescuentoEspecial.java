import java.util.Scanner;

public class CalculoDescuentoEspecial {
    
    // 1. Declaramos la variable global (Constante).
   // Usamos 'satic final' para que sea una constante accesible en toda la clase,
    public static final double PORCENTAJE_DESCUENTO = 0.10;
    
  public static void main(String[] args) {
      
      // 2. Declaramos el objeto Scanner.
      Scanner scanner = new Scanner(System.in);
      
      // 3. Solicitamos y leemos el precio del producto.
      System.out.println("Ingrse el precio del producto: ");
      double precio = scanner.nextDouble();
      
      // 4. Llamamos al metodo que calcula y muestra el descuento y el precio Final.
      calcularDescuentoEspecial(precio);
      
      // 5. Cerramos el objeto scanner.
      scanner.close();
  }
  
  /**
   * Metodo que calcula y muestra el descuento y el precio final.
   *@param precio El precio original del producto.
   */
  public static void calcularDescuentoEspecial(double precio) {
   // 6. Usamos la variable global para calcular el descuento.
   double descuentoAplicado = precio *  PORCENTAJE_DESCUENTO;
   
   
   // 7. Calculamos el pecio final.
   double precioFinal = precio - descuentoAplicado;
   
   // 8. Mostramos los resultados.
   // Usamos String.format para redondear a dos decimales.
      System.out.println("El descuento especial aplicado es: " + String.format("%.2f", descuentoAplicado));
      System.out.println("El precio final con descuento es: " + String.format("%.2f", precioFinal));
  }
}
