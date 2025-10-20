package Ejercicio1;

public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Leandro");

        Producto p1 = new Producto("Teclado", 15000);
        Producto p2 = new Producto("Mouse", 8000);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        PagoConDescuento pagoTarjeta = new TarjetaCredito();
        double totalConDescuento = pagoTarjeta.aplicarDescuento(total);
        pagoTarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Enviado");
    }
}

