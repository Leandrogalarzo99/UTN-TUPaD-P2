package Ejercicio11;

public class Main{
    public static void main(String[] args) {
        // 1. Crear el objeto Artista
        Artista queen = new Artista("Queen", "Rock");
        
        // 2. Crear el objeto Canción, asociándolo al Artista
        Cancion bohemianRhapsody = new Cancion("Bohemian Rhapsody", queen);

        // 3. Crear el objeto Reproductor
        Reproductor miReproductor = new Reproductor("SoundMax Pro");
        
        // 4. Iniciar la Dependencia de Uso
        // El Reproductor necesita el objeto Canción para ejecutar el método reproducir.
        miReproductor.reproducir(bohemianRhapsody);
    }
}

