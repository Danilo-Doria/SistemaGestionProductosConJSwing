package com.mycompany.sistemagestionproductos.factory;

import com.mycompany.sistemagestionproductos.model.Producto;
import com.mycompany.sistemagestionproductos.model.ProductoFisico;
import com.mycompany.sistemagestionproductos.model.ProductoDigital;

public class ProductoFactory {

    /**
     * Este es el Factory Method estático. Toma los datos de entrada y devuelve
     * la abstracción (Producto).
     */
    public static Producto fabricarProducto(String tipo, String codigo, String nombre,
            double precioBase, int cantidadDisponible,
            double peso, double costoEnvio,
            double tamanioArchivo, String formato) {

        return switch (tipo.toLowerCase()) {

            case "fisico" ->
                new ProductoFisico(codigo, nombre, precioBase, cantidadDisponible, peso, costoEnvio);

            case "digital" ->
                new ProductoDigital(codigo, nombre, precioBase, cantidadDisponible, tamanioArchivo, formato);

            default ->
                throw new IllegalArgumentException("Error en la fábrica: Tipo de producto no soportado (" + tipo + ")");
        };
    }
}
