package Ejercicio14;

public class Render {
    private String formato; // formato 
    
    // 14a. Asociación Unidireccional: Render tiene una referencia a Proyecto
    private Proyecto proyecto; 

    // Este constructor es llamado desde el GeneradorQR (EditorVideo)
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        // Asignación de la Asociación Unidireccional
        this.proyecto = proyecto;
    }
    
    // Método para simular el proceso de renderizado
    public void procesar() {
        System.out.println("--- Proceso de Renderizado ---");
        System.out.println("Proyecto: " + this.proyecto.getNombre());
        System.out.println("Duración: " + this.proyecto.getDuracionMin() + " min");
        System.out.println("Exportando a formato: " + this.formato);
        System.out.println("¡Render finalizado!");
    }
}

