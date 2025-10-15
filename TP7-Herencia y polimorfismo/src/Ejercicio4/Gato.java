package Ejercicio4;

public class Gato extends Animal {
    
    public Gato() {
        super("Gato");
    }
    
    // Sobrescritura: Define un comportamiento específico para Gato
    @Override
    public void hacerSonido() {
        System.out.println("Miau.");
    }
}



