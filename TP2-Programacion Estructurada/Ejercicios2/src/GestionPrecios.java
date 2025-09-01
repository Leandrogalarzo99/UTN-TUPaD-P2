
public class GestionPrecios {
    
    public static void main(String[] args) {
        
        // 1. Declaramos e inicializamos un array de tipo double con los precios de los productos.
       double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};;
    
    // 2. Muestra los precios originales usando un bucle for-each.
   System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
}
    
    // 3. Modificamos el precio de un producto especifico.
    // Accedemos al tercer elemento del array (el indice es 2, ya que los arrays  se basan en 0).
       precios[2] = 129.99;
    
    // 4. Muestra los precios modificados usando otro bucle for-each
      System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
    System.out.println("Precio: $" + precio);
} 
    }
    
}
