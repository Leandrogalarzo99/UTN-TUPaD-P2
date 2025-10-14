package Ejercicio14;

public class EditorVideo {
    
    // 14b. Dependencia de Creación:
    // La clase Render es creada (instanciada) dentro de este método.
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println("\n[EditorVideo] Iniciando exportación...");
        
        // ¡Creación de una nueva instancia de Render!
        // La dependencia es la CREACIÓN de Render DENTRO del método exportar.
        Render renderFinal = new Render(formato, proyecto); 
        
        // Uso del objeto recién creado
        renderFinal.procesar();
    }
}


