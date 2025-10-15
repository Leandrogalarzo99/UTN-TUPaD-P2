package Ejercicio4;

public class Animal {
    protected String especie;
    
    public Animal(String especie) {
        this.especie = especie;
    }
    
    // Método a sobrescribir
    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
    
    // Método común (no sobrescrito en este ejemplo)
    public void describirAnimal() {
        System.out.println("Soy un animal de especie: " + especie);
    }
}


