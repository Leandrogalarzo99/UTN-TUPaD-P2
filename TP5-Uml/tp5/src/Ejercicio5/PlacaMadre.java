package Ejercicio5;

public class PlacaMadre {
    private String modelo; // modelo
    private String chipset; // chipset

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }
    
    // Getters y toString
    @Override
    public String toString() {
        return "Placa Madre [Modelo: " + modelo + ", Chipset: " + chipset + "]";
    }
}



