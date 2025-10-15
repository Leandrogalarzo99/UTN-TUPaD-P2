package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tarea: Crear lista de empleados (Upcasting implícito)
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new EmpleadoPlanta("Juan Pérez"));
        listaEmpleados.add(new EmpleadoTemporal("Ana Gómez", 160));
        listaEmpleados.add(new EmpleadoPlanta("Luis Diaz"));
        listaEmpleados.add(new EmpleadoTemporal("Marta Roca", 80));

        System.out.println("--- Reporte de Sueldos y Clasificación ---");

        for (Empleado empleado : listaEmpleados) {
            
            // Tarea: Invocar calcularSueldo() polimórficamente
            double sueldo = empleado.calcularSueldo();
            
            String tipoEmpleado = "";
            
            // Tarea: Usar instanceof para clasificar
            if (empleado instanceof EmpleadoPlanta) {
                tipoEmpleado = "Empleado de Planta";
            } else if (empleado instanceof EmpleadoTemporal) {
                tipoEmpleado = "Empleado Temporal";
                
                // Opcional: Downcasting (conversión segura) para acceder a métodos específicos
                EmpleadoTemporal temp = (EmpleadoTemporal) empleado;
                // System.out.println("Horas trabajadas: " + temp.horasTrabajadas); 
            }
            
            System.out.printf("Nombre: %s (%s) | Sueldo: $%.2f%n", 
                                empleado.getNombre(), 
                                tipoEmpleado, 
                                sueldo);
        }
        
        /* * Salida esperada (Aproximada):
         * --- Reporte de Sueldos y Clasificación ---
         * Nombre: Juan Pérez (Empleado de Planta) | Sueldo: $50000.00
         * Nombre: Ana Gómez (Empleado Temporal) | Sueldo: $240000.00 (160 * 1500)
         * Nombre: Luis Diaz (Empleado de Planta) | Sueldo: $50000.00
         * Nombre: Marta Roca (Empleado Temporal) | Sueldo: $120000.00 (80 * 1500)
         */
    }
}