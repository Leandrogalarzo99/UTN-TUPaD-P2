package Ejercicio1;


public class TarjetaCredito implements PagoConDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90; // 10% de descuento
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println(" procesado con Tarjeta de Credito." + "Pago de $" + monto);
    }
}
