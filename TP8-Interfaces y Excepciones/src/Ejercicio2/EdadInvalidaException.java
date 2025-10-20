package Ejercicio2;


public class EdadInvalidaException extends Exception {

    /**
     * Constructor que acepta un mensaje de error.
     * @param mensaje El mensaje que describe por qué se lanzó la excepción.
     */
    public EdadInvalidaException(String mensaje) {
        // 'super(mensaje)' llama al constructor de la clase padre (Exception)
        // y le pasa el mensaje de error.
        super(mensaje);
    }
}


