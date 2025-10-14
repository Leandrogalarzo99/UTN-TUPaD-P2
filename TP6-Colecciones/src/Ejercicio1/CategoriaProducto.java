package Ejercicio1;

//CategoriaProducto.Java
public enum CategoriaProducto {
 // Valores con su respectiva descripción
    ALIMENTOS (" Productos comestibles "),
    ELECTRONICA (" Dispositivos electrónicos "),
    ROPA (" Prendas de vestir "),
    HOGAR (" Articulos para el hogar ");
    
    // // Valores con su respectiva descripción
    private final String descripcion;
    
    
    // Constructor que asigna la descripción
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Método para obtener la descripción
    public String getDescripcion() {
        return descripcion;
    }
    
}



