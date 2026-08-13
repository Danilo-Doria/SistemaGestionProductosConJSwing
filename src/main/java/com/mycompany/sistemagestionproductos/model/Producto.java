package com.mycompany.sistemagestionproductos.model;

import javax.swing.JOptionPane;

public abstract class Producto {

    private String codigo;
    private String nombre;
    private double precioBase;
    private int cantidadDisponible;
    private boolean activo;

    // constructor
    public Producto(String codigo, String nombre, double precioBase, int cantidadDisponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.cantidadDisponible = cantidadDisponible;
        this.activo = true;
    }

    // getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public boolean isActivo() {
        return activo;
    }

    // setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase >= 0) {
            this.precioBase = precioBase;
        } else {
            throw new IllegalArgumentException("La cantidad disponible no puede ser negativa.");
        }
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        if (cantidadDisponible >= 0) {
            this.cantidadDisponible = cantidadDisponible;
        } else {
            throw new IllegalArgumentException("La cantidad disponible no puede ser negativa.");
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String mostrarInformacion() {
        String estado = this.activo ? "Activo" : "Inactivo";
        return "Código: " + codigo
                + " | Nombre: " + nombre
                + " | Precio Final: $" + String.format("%.2f", calcularPrecioFinal())
                + " | Stock: " + cantidadDisponible
                + " | Estado: " + estado;
    }

    // Método abstracto (Obligatorio para las subclases)
    public abstract double calcularPrecioFinal();

    public double calcularValorEnInventario() {
        return calcularPrecioFinal() * this.cantidadDisponible;
    }

}
