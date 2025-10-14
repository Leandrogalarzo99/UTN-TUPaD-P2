package Ejercicio12;

public class Calculadora {
    
    // 12b. Dependencia de Uso: 
    // La clase Impuesto se usa SOLAMENTE como parámetro en este método. 
    public void calcular(Impuesto impuesto) {
        // Se realiza un cálculo, usando el objeto Impuesto
        double monto = impuesto.getMonto();
        double iva = monto * 0.21;
        double total = monto + iva;
        
        System.out.println("----------------------------------------");
        System.out.println("Calculando Impuesto para: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto Base: $" + String.format("%.2f", monto));
        System.out.println("IVA (21%):  $" + String.format("%.2f", iva));
        System.out.println("Monto Total a Pagar: $" + String.format("%.2f", total));
        System.out.println("----------------------------------------");
    }
}

