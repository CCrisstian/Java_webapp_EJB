package org.CCristian.webapp.ejb.models;

public class Producto {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto() {
    }

    @Override
    public String toString() {
        return "nombre: "+nombre;
    }
}
