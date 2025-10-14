package Ejercicio14;

public class Main {
    public static void main(String[] args) {
        
        // 1. Crear Proyecto (objeto asociado)
        Proyecto documental = new Proyecto("Documental Histórico", 45);

        // 2. Crear EditorVideo
        EditorVideo editor = new EditorVideo();
        
        // 3. Exportar el video (Dependencia de Creación)
        // Se llama al método exportar, que CREA el objeto Render internamente.
        editor.exportar("MP4", documental);
        
        // Nota: La clase Main no tiene acceso al objeto Render creado, 
        // ya que el método exportar() es 'void' (aunque podría devolverlo).
    }
}

