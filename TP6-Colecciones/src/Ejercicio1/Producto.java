package Ejercicio1;

// Producto.java
public class Producto {
     // Atributos privados (Encapsulamiento) 
     private String id; // Identificador único del producto.  
    private String nombre; // Nombre del producto.
    private double precio; // Precio del producto.
    private int cantidad; // Cantidad en stock.
    private CategoriaProducto categoria; // Categoría del producto.
    
    
    // Constructor para inicializar todos los atributos
    public Producto(String id, String  nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    } 
    
     // Getters y Setters para Encapsulamiento ---
    // ( Se Debe implementar para permitir el acceso controlado a los atributos,
    // por ejemplo, para actualizar la cantidad o leer el precio)
    
    public String getId() {return id;}
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public CategoriaProducto getCategoria() { return categoria; }
    
    // Setter para actualizar la cantidad (requerido para el método actualizarStock)
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // --- Métodos de la clase ---
    
    // Muestra en consola la información completa del producto
    public void mostrarInfo() {
        System.out.println("----------------------------------------------");
        System.out.println("ID: "+  id);
        System.out.println("Nombre: " + nombre);
        System.out.printf("Precio: $%.2f%n", precio);
        System.out.println("Stock: " + cantidad);
        System.out.println("Categoria: " + categoria.name() + "(" + categoria.getDescripcion() + ")" );
        
    }
}