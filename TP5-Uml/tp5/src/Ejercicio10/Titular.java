package Ejercicio10;

public class Titular {
    // Atributos: nombre, dni [cite: 137]
    private String nombre; 
    private String dni; 
    
    // Asociación Bidireccional: Referencia a la Cuenta
    private CuentaBancaria cuenta; 

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Setter clave para el enlace bidireccional
    public void setCuentaBancaria(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() { return nombre; }
    public CuentaBancaria getCuentaBancaria() { return cuenta; }
    // Getters
}

