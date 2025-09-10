// Empleado.Java
public class Empleado {
 
     // Atributos de la clase
     private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributo estático para contar el total de empleados
    private static int totalEmpleados = 0;
    
    // Constructores de la clase
    // Constructor 1: Recibe todos los datos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador cada vez que se crea un empleado
    }
    
    // Constructor 2: Recibe solo nombre y puesto (sobrecarga de constructores)
    public Empleado(String nombre, String puesto) {
      // En este caso, podemos asignar valores por defecto o dejar los otros atributos
        // para ser asignados más tarde si es necesario.
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = totalEmpleados +1; // Asigna un ID automático
        totalEmpleados++; // Incrementa el contador
    }
    
        // Métodos (comportamientos del objeto)
        
        // Método para actualizar el salario (sobrecarga de métodos)
       // Getter para obtener el salario.
    public double getSalario(){
        return salario;
    }
       
    
// Opción 1: Aumento por porcentaje
        public void actualizarSalario(double porcentajeAumento) {
            this.salario = this.salario * (1 + porcentajeAumento / 100);
    }
        // Opción 2: Aumento por cantidad fija
        public void actualizarSalario(int cantidadFija) {
            this.salario += cantidadFija;
        }
        
        // Método para mostrar la información del empleado
        @Override
        public String toString() {
            return "Empleado [ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario + "]";
        }
        
        // Método estático para mostrar el total de empleados
        public static int mostrarTotalEmpleados() {
            return totalEmpleados;
        }
    }

//
class Main {  // Se quita el modificador "public" de la clase main para evitar error de copilacion,
    public static void main(String[] args) {

      // Instanciar objetos de la clase Empleados.
        System.out.println("--- Creando empleados: ---");
        Empleado empleado1 = new Empleado(1, "Ana Perez", "Desarrolladora", 50000.0);
        Empleado empleado2 = new Empleado("Juan Garcia", "Gerente de Proyecto");
        Empleado empleado3 = new Empleado(3, "Carla Gomez", "Diseñadora", 45000.0);
        
        // Mostrar el total de empleados creados
        System.out.println("--- Total de empleados ---");
        System.out.println("El total de empleados creados es: " + Empleado.mostrarTotalEmpleados());
        
        System.out.println("\n--- Informacion de los empleados ---");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
        // Probar el método de actualización de salario
        System.out.println("\n--- Actualizando salarios ---");
         System.out.println("Salario de Ana Pérez antes del aumento: $" + empleado1.getSalario());
        empleado1.actualizarSalario(10.0); // Aumento del 10%
        System.out.println("Salario de ana perez despues del aumento(10%): $" + empleado1.getSalario());
        
        
        System.out.println ("\nSalario de Juan Garcia antes ddel aumento: $" + empleado2.getSalario());
        empleado1.actualizarSalario(5000); // Aumento del $5000
        System.out.println("Salario de Juan Garcia despues del aumento($5000): $" + empleado2.getSalario());
    }
}