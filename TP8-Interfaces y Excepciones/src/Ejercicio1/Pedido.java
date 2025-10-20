package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private final List<Producto> productos;
    private final Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }


    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificarCambioEstado(nuevoEstado);
    }

    public String getEstado() {
        return estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}

