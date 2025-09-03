public class Gallina {
    
    // 1. Atributos de la clase: Representar las propiedades de la gallina.
    int idGallina;
    int edad;
    int huevosPuestos;
    
    // 2. Constructor para inicializar el objeto Gallina
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;  // Al crearse, una gallina no tiene huevos puestos
    }
    
    // 3. Método para que la gallina ponga un huevo
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina " + idGallina + "ha puesto un huevo.");
    }
    
    // 4. Método para que la gallina envejezca
    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + idGallina + "ha envejecido. Ahora tiene" + this.edad + "anios.");
 }
    
    // 5.Método para mostrar el estado actual de la gallina.
    public void mostrarEstado() {
        System.out.println("--- Estado de la gallina" + idGallina + "---");
        System.out.println("Edad:" + this.edad + "anios");
        System.out.println("Huevos puestos: " + this.huevosPuestos);
        System.out.println("---------------------------------------------------");
    }
}

class Main {   // Se quita el modificador "public" de la clase main para evitar error de copilacion,
    public static void main(String[] args) {
        // Tarea: Crear dos gallinas
        System.out.println("Creando dos gallinas...");
        Gallina gallina1 = new Gallina(1, 1);
        Gallina gallina2 = new Gallina (2, 2);
        
        // Mostrar el estado inicial de ambas
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        // Tarea: Simular algunas acciones
        System.out.println("\n--- Simulando acciones ---");
        gallina1.envejecer();
        gallina1.ponerHuevo();
        
        gallina2.envejecer();
        gallina2.ponerHuevo();
        
        
        // Tarea: Mostrar el estado final de ambas gallinas.
        System.out.println("\n--- Mostrando el estado final ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
