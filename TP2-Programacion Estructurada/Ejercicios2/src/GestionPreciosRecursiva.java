
public class GestionPreciosRecursiva {
    
    public static void main(String[] args) {
        
        // 1. Declaramos e inicializamos un array de tipo double con los precios de los productos.
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
    
    // 2. Imprimimos el encabezado para los precios originales.
    System.out.println("Precios originales: ");
    // Llamamos a la función recursiva para mostrar el array.
    // Le pasamos el array y el indice inicial (0).
    mostrarPreciosRecursivo(precios, 0);
    
    // 3. Modificamos el precio de un producto especifico.
    // por ejemplo, modificamos el precio del tercer producto (indice 2).
  precios[2] = 129.99;
    
    // 4. Imprimimos el encabezado para los precios modificados.
System.out.println("\nPrecios modificados:");
        // Llamamos de nuevo a la función recursiva para mostrar el array actualizado.
        mostrarPreciosRecursivo(precios, 0);
    }
    
    /**
     * Función recursiva para mostrar los elementos de un array de precios.
     * @param precios El array de precios a mostrar.
     * @param indice El índice actual en el array.
     */
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        // a. Condición de parada (caso base): 
        // Si el índice es igual o mayor que el tamaño del array, la recursión termina.
        if (indice >= precios.length) {
            return;
        }

        // b. Proceso recursivo:
        // Imprimimos el precio actual.
        System.out.println("Precio: $" + precios[indice]);

        // Llamamos a la función de nuevo con el siguiente índice.
        mostrarPreciosRecursivo(precios, indice + 1);
    }
}