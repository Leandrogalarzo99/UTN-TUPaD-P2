package Ejercicio1;



public class Cliente implements Notificable {
    private final String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarCambioEstado(String nuevoEstado) {
        System.out.println("Estimado " + nombre + ", su pedido ha cambiado de estado a: " + nuevoEstado);
    }

    public String getNombre() {
        return nombre;
    }
}



