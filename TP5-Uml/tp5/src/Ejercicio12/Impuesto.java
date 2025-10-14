package Ejercicio12;


public class Impuesto {
    private double monto; // monto 
    
    // 12a. Asociación Unidireccional: Impuesto tiene un Contribuyente
    private Contribuyente contribuyente; 

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    
    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }
    // Getters
}

