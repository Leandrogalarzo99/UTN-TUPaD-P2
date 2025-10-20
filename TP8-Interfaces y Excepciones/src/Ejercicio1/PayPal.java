package Ejercicio1;



public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado mediante PayPal.");
    }
}


