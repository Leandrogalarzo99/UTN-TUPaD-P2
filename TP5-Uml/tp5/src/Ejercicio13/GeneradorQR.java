package Ejercicio13;

public class GeneradorQR {
    
    // 13b. Dependencia de Creación:
    // El CodigoQR es creado (instanciado con 'new') dentro de este método.
    public CodigoQR generar(String valor, Usuario usuario) {
        System.out.println("\n[GeneradorQR] Solicitud de generación recibida.");
        
        // ¡Implementación de la Dependencia de Creación!
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario); 
        
        System.out.println("Creación exitosa para el usuario: " + usuario.getNombre());
        
        // El método retorna el objeto, que podría ser usado fuera del método.
        return nuevoCodigo; 
    }
}


