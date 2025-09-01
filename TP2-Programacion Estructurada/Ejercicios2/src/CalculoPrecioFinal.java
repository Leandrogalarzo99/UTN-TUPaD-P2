import java.util.Scanner;

public class CalculoPrecioFinal {

    public static void main(String[] args) {
        
        // 1. Declaramos un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);
        
        // 2. Solicitamos y leemos los valores.
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje(10%):  ");
        double impuestoPorcentaje = scanner.nextDouble();
        
        System.out.print("Ingrese el descuento del porcentaje(5%): " );
        double descuentoPorcentaje = scanner.nextDouble();
        
        // 3. Convertimos los porcentajes a valores decimales para el calculo.
        double impuestoDecimal = impuestoPorcentaje / 100.0;
        double descuentoDecimal = descuentoPorcentaje / 100.0;
        
          // 4. Llamamos al método calcularPrecioFinal y guardamos el resultado.
          double precioFinal = CalcularPrecioFinal(precioBase, impuestoDecimal, descuentoDecimal);
          
          // 5. Mostramos el resultado.
          System.out.println("El precio final del producto es: " + precioFinal);
          
          // 6. Cerramos el objeto Scanner.
          scanner.close();
     }
    
    // Método que realiza el cálculo del precio final.
    // Recibe el precio base, el impuesto y el descuento como parámetros decimales.
    // Retorna un valor de tipo double.
    public static double CalcularPrecioFinal(double precioBase, double impuesto, double descuento ) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    
}
