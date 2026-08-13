package com.mycompany.sistemagestionproductos.model;

import javax.swing.JOptionPane;

public class ProductoFisico extends Producto {

    private double peso;
    private double costoEnvio;

    public ProductoFisico(String codigo, String nombre, double precioBase, int cantidadDisponible, double peso, double costoEnvio) {
        super(codigo, nombre, precioBase, cantidadDisponible);
        this.peso = peso;
        this.costoEnvio = costoEnvio;
    }

    public double getPeso() {
        return peso;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad disponible no puede ser negativa.");
        }
    }

    public void setCostoEnvio(double costoEnvio) {
        if (costoEnvio >= 0) {
            this.costoEnvio = costoEnvio;
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad disponible no puede ser negativa.");
        }
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = getCantidadDisponible() + this.costoEnvio;

        if (this.peso > 10) {
            double recargo = getPrecioBase() * 0.08;
            precioFinal += recargo;
        }
        return precioFinal;
    }
}
