
public class Mascota {
 
    // 1. Atributos de la clase.
    String nombre;
    String especie;
    int edad;
    
   // 2. Contructor para inicializar el objeto Mascota.
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    // 3. Método para mostrar la informacion de la mascota.
    public void mostrarInfo() {
        System.out.println("Informacion de la mascota: ");
        System.out.println("Nombre: " + nombre );
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + "anios");
        System.out.println("------------------------------");
    }
    
    // 4. Método para simular el paso del tiempo y aumentar la edad.
    public void cumplirAnios() {
        this.edad++; // Incrementar la edad en 1
        System.out.println(nombre + " ha cumplido un anio mas. ¡Ahora tiene " + this.edad + " anios!");
    }
}
    // Se quitó el modificador "public" de la clase Main para evitar el error.
class Main {
    public static void main(String[] args) {
        // Tarea: Crear una mascota.
        System.out.println("Creando una mascota...");
        Mascota mascota1 = new Mascota("Max", "Perro", 3);

        // Tarea: Mostrar su información inicial.
        mascota1.mostrarInfo();

        // Tarea: Simular el paso del tiempo.
        mascota1.cumplirAnios();
        System.out.println();

        // Tarea: Verificar los cambios.
        mascota1.mostrarInfo();
    }
}


