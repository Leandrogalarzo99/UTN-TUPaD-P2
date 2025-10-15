package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Tarea: Crear un array de figuras.
        // Usamos Upcasting: Los objetos Círculo y Rectángulo se tratan como Figura.
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Rectangulo(4.0, 6.0);
        figuras[2] = new Circulo(3.0); 

        System.out.println("--- Cálculo de Áreas Polimórfico ---");
        
        // Tarea: Mostrar el área de cada una usando polimorfismo.
        for (Figura figura : figuras) {
            // Polimorfismo: En tiempo de ejecución, Java sabe qué versión de
            // calcularArea() debe llamar (la de Círculo o la de Rectángulo).
            double area = figura.calcularArea();
            
            System.out.printf("%s con área: %.2f%n", figura.getNombre(), area);
        }
        
        /* * Salida esperada (Aproximada):
         * --- Cálculo de Áreas Polimórfico ---
         * Círculo con área: 78.54
         * Rectángulo con área: 24.00
         * Círculo con área: 28.27
         */
    }
}

