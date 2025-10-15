package Ejercicio1;

public class Auto extends Vehiculo {
    // Atributo adicional de la subclase
    private final int cantidadPuertas;

    // Constructor de la subclase
    // Debe invocar al constructor de la superclase (Vehiculo) usando 'super(...)' 
    public Auto(String marca, String modelo, int cantidadPuertas) {
        // Llama al constructor de Vehiculo
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas;
    }

    // Sobrescritura del método mostrarInfo() de la superclase 
    @Override
    public void mostrarInfo() {
        // Llamada al método mostrarInfo() de la superclase para reutilizar código
        super.mostrarInfo(); 
        
        // Agrega la información específica del Auto
        System.out.println("Puertas: " + cantidadPuertas);
    }
}

