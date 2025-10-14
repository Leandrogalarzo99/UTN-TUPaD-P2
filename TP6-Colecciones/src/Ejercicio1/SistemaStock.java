package Ejercicio1;

// SistemaStock.java
public class SistemaStock {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        // --- 1. Crea 5 productos y agregarlos al inventario.
        System.out.println("--- TAREA 1: CREAR Y AGREGAR PRODUCTOS ---");
        inventario.agregarProducto(new Producto("A001", "Smartphone X", 2500.00, 15, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("A002", "Camiseta Algodón", 1500.00, 50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("A003", "Pack Galletas", 500.00, 120, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("A004", "Licuadora Pro", 3500.00, 8, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("A005", "Pantalón Denim", 2800.00, 30, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("A006", "Cable HDMI", 800.00, 75, CategoriaProducto.ELECTRONICA));

        // --- 2. Listar todos los productos.
        inventario.listarProductos();

        // --- 3. Buscar un producto por ID (Ej: A004) 
        System.out.println("\n--- TAREA 3: BUSCAR PRODUCTO POR ID (A004) ---");
        Producto buscado = inventario.buscarProductoPorId("A004");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto A004 no encontrado.");
        }

        // --- 4. Filtrar por categoría específica  (Ej: A004)
        inventario.filtrarPorCategoria(CategoriaProducto.ROPA);

        // --- 5. Eliminar un producto (Ej: A003) y listar restantes. 
        System.out.println("\n--- TAREA 5: ELIMINAR PRODUCTO (A003) ---");
        inventario.eliminarProducto("A003");
        inventario.listarProductos();

        // --- 6. Actualizar el stock de un producto existente (Ej: A001 a 25)
        System.out.println("\n--- TAREA 6: ACTUALIZAR STOCK (A001) ---");
        inventario.actualizarStock("A001", 25);
        inventario.buscarProductoPorId("A001").mostrarInfo();

        // --- 7. Mostrar el total de stock disponible.
        System.out.println("\n--- TAREA 7: TOTAL DE STOCK DISPONIBLE ---");
        System.out.println("📦 Stock Total: " + inventario.obtenerTotalStock());

        // --- 8. Obtener y mostrar el producto con mayor stock. 
        System.out.println("\n--- TAREA 8: PRODUCTO CON MAYOR STOCK ---");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("🏆 Producto con mayor stock:");
            mayorStock.mostrarInfo();
        }

        // --- 9. Filtrar productos con precios entre $1000 y $3000.
        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);

        // --- 10. Mostrar las categorías disponibles con sus descripciones.
        inventario.mostrarCategoriasDisponibles();
    }
}

