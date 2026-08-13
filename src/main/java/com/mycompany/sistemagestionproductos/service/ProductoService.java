package com.mycompany.sistemagestionproductos.service;

import com.mycompany.sistemagestionproductos.factory.ProductoFactory;
import com.mycompany.sistemagestionproductos.model.Producto;
import com.mycompany.sistemagestionproductos.repository.ProductoRepository;
import java.util.ArrayList;

public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    // ---------- Registrar (Usando el Factory Method) ----------
    /**
     * Un único método de registro que maneja cualquier tipo de producto.
     */
    public String registrarProducto(String tipo, String codigo, String nombre,
            double precioBase, int cantidadDisponible,
            double peso, double costoEnvio,
            double tamanioArchivo, String formato) {

        // 1. Validaciones de negocio (comunes a todos)
        String error = validarDatosComunes(codigo, nombre, precioBase, cantidadDisponible);
        if (error != null) {
            return error;
        }

        try {
            // 2. Delegar la creación a la Fábrica
            Producto nuevoProducto = ProductoFactory.fabricarProducto(
                    tipo, codigo, nombre, precioBase, cantidadDisponible,
                    peso, costoEnvio, tamanioArchivo, formato
            );

            // 3. Guardar en el Repositorio
            repository.agregar(nuevoProducto);
            return null; // Éxito

        } catch (IllegalArgumentException e) {
            // Si la fábrica falla (por un tipo desconocido o datos inválidos específicos), 
            // devolvemos el mensaje de error.
            return e.getMessage();
        }
    }

    private String validarDatosComunes(String codigo, String nombre, double precioBase, int cantidadDisponible) {
        if (codigo == null || codigo.trim().isEmpty()) {
            return "El código no puede estar vacío.";
        }
        if (repository.existeCodigo(codigo)) {
            return "Ya existe un producto registrado con el código: " + codigo;
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            return "El nombre no puede estar vacío.";
        }
        if (precioBase < 0) {
            return "El precio base no puede ser negativo.";
        }
        if (cantidadDisponible < 0) {
            return "La cantidad disponible no puede ser negativa.";
        }
        return null;
    }

    // ---------- Consultar ----------
    public Producto buscarProducto(String codigo) {
        return repository.buscarPorCodigo(codigo);
    }

    public ArrayList<Producto> listarProductos() {
        return repository.listarTodos();
    }

    /**
     * Determina el tipo de producto. Aunque `instanceof` funciona, una forma
     * más limpia orientada a objetos sería agregar un método abstracto
     * `getTipo()` en la clase Producto.
     */
    public String obtenerTipoProducto(Producto producto) {
        // Asumiendo que tu método se llama getTipo en la clase Producto
        return producto.getClass().getSimpleName().replace("Producto", "");
        // Si la clase es "ProductoFisico", devuelve "Fisico"
    }

    // ---------- Eliminar ----------
    public boolean eliminarProducto(String codigo) {
        return repository.eliminar(codigo);
    }

    // ---------- Actualizar ----------
    public String actualizarProducto(String codigo, String nombre, double nuevoPrecioBase, int nuevaCantidad) {
        Producto producto = repository.buscarPorCodigo(codigo);
        if (producto == null) {
            return "No existe un producto con el código: " + codigo;
        }

        try {
            // Utilizamos los setters del modelo (que ahora lanzan excepciones si son inválidos)
            producto.setNombre(nombre);
            producto.setPrecioBase(nuevoPrecioBase);
            producto.setCantidadDisponible(nuevaCantidad);
            return null;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    // ---------- Resumen de inventario ----------
    public int obtenerCantidadProductos() {
        return repository.contarProductos();
    }

    public double calcularValorTotalInventario() {
        return repository.listarTodos().stream()
                .mapToDouble(Producto::calcularValorEnInventario)
                .sum(); // Forma moderna (Java 8+) de sumar
    }
}
