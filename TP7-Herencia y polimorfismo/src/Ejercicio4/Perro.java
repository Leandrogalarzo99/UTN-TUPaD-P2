package Ejercicio4;

public class Perro extends Animal {
    
    public Perro() {
        super("Perro");
    }
    
    // Sobrescritura: Define un comportamiento específico para Perro
    @Override
    public void hacerSonido() {
        System.out.println("Guau! Guau!");
    }
}