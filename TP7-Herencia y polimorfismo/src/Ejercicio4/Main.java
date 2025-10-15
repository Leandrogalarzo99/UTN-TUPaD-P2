package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tarea: Crear lista de animales (Upcasting)
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro());
        granja.add(new Gato());
        granja.add(new Vaca());
        granja.add(new Perro());

        System.out.println("--- El Gran Concierto Polimórfico ---");

        // Tarea: Mostrar sus sonidos con polimorfismo
        for (Animal animal : granja) {
            animal.describirAnimal();
            
            // Polimorfismo: La misma llamada de método, pero
            // ejecuta el código de la subclase correcta.
            animal.hacerSonido(); 
            System.out.println("--------------------");
        }
        
        /* * Salida esperada:
         * --- El Gran Concierto Polimórfico ---
         * Soy un animal de especie: Perro
         * Guau! Guau!
         * --------------------
         * Soy un animal de especie: Gato
         * Miau.
         * --------------------
         * Soy un animal de especie: Vaca
         * Muuuu.
         * --------------------
         * Soy un animal de especie: Perro
         * Guau! Guau!
         * --------------------
         */
    }
}

