package Ejercicio11;

public class Reproductor {
    private String marca;

    public Reproductor(String marca) {
        this.marca = marca;
    }

    // 11b. Dependencia de Uso: 
    // La clase Cancion se usa SOLAMENTE como parámetro en este método.
    public void reproducir(Cancion cancion) {
        // Se usa la clase Canción dentro del método
        System.out.println("----------------------------------------");
        System.out.println("Reproduciendo en " + this.marca + "...");
        System.out.println("Título: " + cancion.getTitulo());
        System.out.println("Autor: " + cancion.getArtista().getNombre());
        System.out.println("----------------------------------------");
    }
}

