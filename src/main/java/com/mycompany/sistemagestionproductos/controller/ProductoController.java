package com.mycompany.sistemagestionproductos.controller;

import com.mycompany.sistemagestionproductos.model.Producto;
import com.mycompany.sistemagestionproductos.service.ProductoService;
import java.util.ArrayList;

public class ProductoController {

    private final ProductoService service;

    // Inyección de dependencias a través del constructor
    public ProductoController(ProductoService service) {
        this.service = service;
    }

    // ---------- Registrar producto ----------
    // Usamos el DTO del que hablamos antes, o pasamos los parámetros. 
    // Para simplificar esta refactorización, mantendré los parámetros originales pero con un solo método.
    public void registrarProducto(String tipo, String codigo, String nombre,
            String precioBaseTexto, String cantidadTexto,
            String pesoTexto, String costoEnvioTexto,
            String tamanioArchivoTexto, String formato) throws IllegalArgumentException {

        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Código vacío");
        }

        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Debe seleccionar un tipo de producto");
        }

        double precioBase;
        int cantidadDisponible;

        try {
            precioBase = Double.parseDouble(precioBaseTexto.trim());
            cantidadDisponible = Integer.parseInt(cantidadTexto.trim());
        } catch (NumberFormatException | NullPointerException e) {
            throw new IllegalArgumentException("Precio base y cantidad disponible deben ser numéricos.");
        }

        double peso = 0;
        double costoEnvio = 0;
        double tamanioArchivo = 0;
        String formatoFinal = formato;

        // Parseo condicional de los parámetros específicos
        try {
            if (tipo.equalsIgnoreCase("Fisico")) {
                peso = Double.parseDouble(pesoTexto.trim());
                costoEnvio = Double.parseDouble(costoEnvioTexto.trim());
            } else if (tipo.equalsIgnoreCase("Digital")) {
                tamanioArchivo = Double.parseDouble(tamanioArchivoTexto.trim());
            } else {
                throw new IllegalArgumentException("Tipo de producto no reconocido: " + tipo);
            }
        } catch (NumberFormatException | NullPointerException e) {
            throw new IllegalArgumentException("Los valores específicos del producto deben ser numéricos.");
        }

        // Llamamos al único método del servicio refactorizado
        String error = service.registrarProducto(tipo, codigo, nombre, precioBase, cantidadDisponible,
                peso, costoEnvio, tamanioArchivo, formatoFinal);

        if (error != null) {
            // En lugar de JOptionPane, lanzamos la excepción para que la Vista la capture
            throw new IllegalArgumentException(error);
        }
    }

    // ---------- Buscar producto ----------
    public Producto buscarProducto(String codigo) throws IllegalArgumentException {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Código vacío");
        }

        Producto producto = service.buscarProducto(codigo);
        if (producto == null) {
            throw new IllegalArgumentException("No se encontró ningún producto con el código: " + codigo);
        }
        return producto;
    }

    // ---------- Listar productos ----------
    public ArrayList<Producto> listarProductos() {
        return service.listarProductos();
    }

    public String obtenerTipoProducto(Producto producto) {
        return service.obtenerTipoProducto(producto);
    }

    // ---------- Eliminar producto ----------
    public void eliminarProducto(String codigo) throws IllegalArgumentException {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Código vacío");
        }

        boolean eliminado = service.eliminarProducto(codigo);
        if (!eliminado) {
            throw new IllegalArgumentException("No se encontró ningún producto con el código: " + codigo);
        }
    }

    // ---------- Actualizar producto ----------
    public void actualizarProducto(String codigo, String nombre, String precioBaseTexto, String cantidadTexto) throws IllegalArgumentException {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Código vacío");
        }

        double precioBase;
        int cantidad;
        try {
            precioBase = Double.parseDouble(precioBaseTexto.trim());
            cantidad = Integer.parseInt(cantidadTexto.trim());
        } catch (NumberFormatException | NullPointerException e) {
            throw new IllegalArgumentException("Precio base y cantidad disponible deben ser numéricos.");
        }

        String error = service.actualizarProducto(codigo, nombre, precioBase, cantidad);
        if (error != null) {
            throw new IllegalArgumentException(error);
        }
    }

    // ---------- Resumen de inventario ----------
    // Este método devuelve el String formateado, la Vista se encarga de mostrarlo
    public String obtenerResumenInventario() {
        int totalProductos = service.obtenerCantidadProductos();
        double valorTotal = service.calcularValorTotalInventario();

        return "Resumen de inventario\n"
                + "Total de productos: " + totalProductos + "\n"
                + "Valor total en inventario: $" + String.format("%.2f", valorTotal);
    }
}
