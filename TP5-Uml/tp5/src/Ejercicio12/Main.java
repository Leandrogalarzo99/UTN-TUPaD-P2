package Ejercicio12;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto Contribuyente
        Contribuyente ana = new Contribuyente("Ana Pérez", "27-30456789-5");
        
        // 2. Crear el objeto Impuesto, asociándolo al Contribuyente
        Impuesto luz = new Impuesto(1000.00, ana);

        // 3. Crear el objeto Calculadora
        Calculadora miCalculadora = new Calculadora();
        
        // 4. Iniciar la Dependencia de Uso
        // La Calculadora USA el objeto Impuesto como entrada, pero no lo guarda.
        miCalculadora.calcular(luz);
    }
}