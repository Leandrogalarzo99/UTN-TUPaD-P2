
public class NaveEspacial {
    
    // 1. Atributos de la clase
    String nombre;
    double combustible;    // Usamos 'double' para permitir decimales.
    
    // 2.  Constructor para inicializar el objeto NaveEspacial.
    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        // Se valida que el combustible inicial no supere el límite.
        this.combustible = Math.min(combustibleInicial, 100.0);
    }
    
    // 3. Método para despegar.
    public void despegar() {
        if (combustible >= 10) {
            this.combustible -= 10;
            System.out.println("ha despegado. Combustible restante: " + this.combustible);
        } else {
            System.out.println("no tiene suficiente combustible para despegar. ¡Recarga! ");
        }
    }
    
    // 4 Método para avanzar con validación.
    public void Avanzar(double distancia) {
        double combustibleRequerido = distancia * 0.5; // Por ejemplo, 0.5 unidades por km
        if (this.combustible >= combustibleRequerido) {
            this.combustible -= combustibleRequerido;
            System.out.println(nombre + " ha avanzado" + distancia + "km. combustible restante:" + this.combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar" + distancia + "km. se requieren" + combustibleRequerido +"unidades.");
        }
    }
     // 5.Método para recargar combustible con validación
        public void recargarCombustible(double cantidad) {
         if (this.combustible + cantidad <= 100.0) { // Se asume un tanque máximo de 100
            this.combustible += cantidad;
            System.out.println("Combustible de " + nombre + " recargado. Total: " + this.combustible);
        } else {
            System.out.println("Error: No se puede recargar. La cantidad excede el limite del tanque (100 unidades).");
        }
    }
        
        
        // 6. Método para mostrar el estado actual de la nave
    public void mostrarEstado() {
        System.out.println("--- Estado de la nave " + nombre + " ---");
        System.out.println("Combustible: " + this.combustible + " unidades");
        System.out.println("----------------------------------------");
     }
    }

class Main { // Se quitó el modificador "public" de la clase Main para evitar el error.
    public static void main(String[] args) {
        // Tarea: Crear una nave con 50 unidades de combustible
        System.out.println("Creando una nave espacial...");
        NaveEspacial nave1 = new NaveEspacial("f-18", 50.0);

        // Mostrar el estado inicial
        nave1.mostrarEstado();

        // Tarea: Intentar despegar
        System.out.println("\n--- Intentando despegar ---");
        nave1.despegar();
        nave1.mostrarEstado();

        // Tarea: Intentar avanzar sin recargar
        System.out.println("\n--- Intentando avanzar 100 km ---");
        nave1.Avanzar(100.0);
        nave1.mostrarEstado();

        // Tarea: Recargar combustible
        System.out.println("\n--- Recargando combustible ---");
        nave1.recargarCombustible(60.0);
        nave1.mostrarEstado();

        // Tarea: Recargar de nuevo (para ver la validación)
        System.out.println("\n--- Intentando recargar 50 unidades ---");
        nave1.recargarCombustible(50.0);
        nave1.mostrarEstado();

        // Tarea: Avanzar correctamente
        System.out.println("\n--- Avanzando 50 km ---");
        nave1.Avanzar(50.0);
        nave1.mostrarEstado();
    }
}

