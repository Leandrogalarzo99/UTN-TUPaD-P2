package Ejercicio1;

import java.util.ArrayList; // Necesario para usar ArrayList
import java.util.List;

// Inventario.java
public class Inventario {
    
    // Atributo principal: colección para almacenar los productos
    private List<Producto> productos; 

    // Constructor para inicializar la colección
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // ----------------------------------------------------
    // METODOS REQUERIDOS
    // ----------------------------------------------------

    // 1. Agrega los  Productos
    public void agregarProducto(Producto p) {
        // Lógica: Añadir el producto 'p' a la lista 'productos'.
        this.productos.add(p);
        System.out.println("✅ Producto agregado: " + p.getNombre());
    }

    // 2. Listar llos  Productos
    public void listarProductos() {
        System.out.println("\n--- LISTADO COMPLETO DE PRODUCTOS ---");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        // Usar ciclo for-each
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("-------------------------------------");
    }

    // 3. Buscar Producto por ID
    public Producto buscarProductoPorId(String id) {
        // Lógica: Recorrer la lista y devolver el Producto cuyo ID coincida.
        // Si no se encuentra, devolver 'null'.
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // 4. Eliminar Producto por ID
    public boolean eliminarProducto(String id) {
        // Lógica: Busca  el producto por ID, si existe, usar productos.remove()
        // para quitarlo de la lista.
        Producto productoAEliminar = buscarProductoPorId(id);
        if (productoAEliminar != null) {
            this.productos.remove(productoAEliminar);
            System.out.println("🗑️ Producto eliminado: " + productoAEliminar.getNombre());
            return true;
        }
        System.out.println("❌ Producto con ID " + id + " no encontrado para eliminar.");
        return false;
    }
    
    // 5. Actualiza  Stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("🔄 Stock actualizado para " + p.getNombre() + ". Nuevo Stock: " + nuevaCantidad);
            return true;
        }
        System.out.println("❌ Producto con ID " + id + " no encontrado para actualizar stock.");
        return false;
    }

    // 6. Filtra  por Categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- PRODUCTOS EN LA CATEGORÍA: " + categoria.name() + " ---");
        boolean encontrado = false;
        for (Producto p : productos) { 
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en esta categoría.");
        }
        System.out.println("------------------------------------------");
    }

    // 7. Obtiene  Stock Total
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // 8. Obtiene Producto con Mayor Stock 
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    // 9. Filtra Productos por Precio
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.printf("\n--- PRODUCTOS CON PRECIOS ENTRE $%.2f y $%.2f ---\n", min, max);
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
        System.out.println("-------------------------------------------------------");
    }

    // 10. Mostrar Categorías Disponibles 
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("- " + cat.name() + ": " + cat.getDescripcion());
        }
        System.out.println("------------------------------");
    }
}


