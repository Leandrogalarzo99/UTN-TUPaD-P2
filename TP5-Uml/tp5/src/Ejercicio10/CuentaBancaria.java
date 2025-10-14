package Ejercicio10;

public class CuentaBancaria {
    // Atributos: cbu, saldo [cite: 133]
    private String cbu; 
    double saldo; 

    // 10a. Composición: La ClaveSeguridad se crea DENTRO de la Cuenta
    private final ClaveSeguridad claveSeguridad; 

    // 10b. Asociación Bidireccional: Cuenta tiene un Titular
    private Titular titular; 

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;

        // Composición: La ClaveSeguridad nace con la Cuenta
        this.claveSeguridad = new ClaveSeguridad(codigoClave, fechaModificacion); 
        
        // Asociación Bidireccional: Asigna el Titular
        this.titular = titular;
        
        // ¡Establece el enlace de vuelta para la Bidireccionalidad!
        if (titular.getCuentaBancaria() != this) {
             titular.setCuentaBancaria(this);
        }
    }

    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    public Titular getTitular() { return titular; }
    public String getCbu() { return cbu; }
    // Getters
}

