package com.mycompany.sistemagestionproductos.repository;

import com.mycompany.sistemagestionproductos.model.Producto;
import java.util.ArrayList;

public class ProductoRepository {

    // 1. Instancia única y global
    private static ProductoRepository instancia;

    // Lista donde se guardarán los productos en memoria
    private final ArrayList<Producto> productos;

    // 2. Constructor privado (¡Nadie fuera de esta clase puede usar 'new' aquí!)
    private ProductoRepository() {
        this.productos = new ArrayList<>();
    }

    // 3. Método global para obtener la única instancia (crea una si no existe)
    public static synchronized ProductoRepository getInstancia() {
        if (instancia == null) {
            instancia = new ProductoRepository();
        }
        return instancia;
    }

    // ---------- Tus métodos de repositorio habituales ----------
    public void agregar(Producto producto) {
        productos.add(producto);
    }

    public ArrayList<Producto> listarTodos() {
        return productos;
    }

    public boolean existeCodigo(String codigo) {
        return buscarPorCodigo(codigo) != null;
    }

    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminar(String codigo) {
        Producto producto = buscarPorCodigo(codigo);
        if (producto != null) {
            productos.remove(producto);
            return true;
        }
        return false;
    }

    public int contarProductos() {
        return productos.size();
    }
}
