package com.mycompany.sistemagestionproductos.model;

import javax.swing.JOptionPane;

public class ProductoDigital extends Producto {

    private double tamanioArchivo;
    private String formato;

    public ProductoDigital(String codigo, String nombre, double precioBase, int cantidadDisponible, double tamanioArchivo, String formato) {
        super(codigo, nombre, precioBase, cantidadDisponible);
        this.tamanioArchivo = tamanioArchivo;
        this.formato = formato;
    }

    public double getTamanioArchivo() {
        return tamanioArchivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setTamanioArchivo(double tamanioArchivo) {
        if (tamanioArchivo >= 0) {
            this.tamanioArchivo = tamanioArchivo;
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad disponible no puede ser negativa.");
        }
    }

    public void setFormato(String formato) {
        if (formato != null && !formato.trim().isEmpty()) {
            this.formato = formato;
        } else {
            JOptionPane.showMessageDialog(null, "El formato no puede estar vacío.");
        }
    }

    @Override
    public double calcularPrecioFinal() {
        double descuento;
        
        if (this.tamanioArchivo > 5) {
            descuento = 0.05;
        } else {
            descuento = 0.10;
        }
        return getPrecioBase() - (getPrecioBase() * descuento);
    }
}
