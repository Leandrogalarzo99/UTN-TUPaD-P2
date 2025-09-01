import java.util.Scanner;

public class CalculadoraDescuento {
    
    public static void main(String[] args) {
        
        // 1. Declaramos un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);
        
        // 2. Solicitamos y leemos el precio del producto.
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();
        
        
        // 3. Solicitamos y leemos la categoría. Usamos next() para leer una palabra.
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
         String categoria = scanner.next();
        
        
        // 4. Declaramos variables para el decuento y el precio Final.
        double porcentajeDescuento = 0.0;
        double precioFinal = 0.0;
        
        
        //5. Usamos una estructura condicional (if-else) para asignar el descuento.
        if (categoria.equalsIgnoreCase("A")) {
            porcentajeDescuento = 0.10; // 10%
       } else if (categoria.equalsIgnoreCase("B")) {
            porcentajeDescuento = 0.15; // 15%
        } else if (categoria.equalsIgnoreCase("C")) {
            porcentajeDescuento = 0.20; // 20%
        } else {
            System.out.println("Categoria inválida. No se aplicará ningún descuento. ");
        }
      
       // 6. Calculamos el descuento y el precio final.
       double descuentoAplicado = precioOriginal * porcentajeDescuento;
       precioFinal = precioOriginal - descuentoAplicado;
       
       // 7. Imprimimos el resultado con el formato solicitado.
       // Usamos String.format() para redondear el precio final a dos decimales.
       System.out.println("Precio original:" + precioOriginal);
        System.out.println("Descuento aplicado: " + (porcentajeDescuento * 100) + "%");
        System.out.println("Precio final: " + String.format("%.2f", precioFinal));
         
          
         //  8. Cerramos el objeto scanner.
         scanner.close();
       
    }
    
}
