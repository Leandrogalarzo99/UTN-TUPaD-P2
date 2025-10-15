package Ejercicio4;

public class Vaca extends Animal {
    
    public Vaca() {
        super("Vaca");
    }
    
    // Sobrescritura: Define un comportamiento específico para Vaca
    @Override
    public void hacerSonido() {
        System.out.println("Muuuu.");
    }
}

