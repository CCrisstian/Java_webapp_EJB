package org.CCristian.webapp.ejb.service;

import jakarta.ejb.Stateful;
import jakarta.enterprise.context.RequestScoped;
import org.CCristian.webapp.ejb.models.Producto;

import java.util.ArrayList;
import java.util.List;

//@RequestScoped
@Stateful
public class ServiceEjb implements ServiceEjbLocal {

    private int contador;

    public String saludar (String nombre){
        System.out.println("Imprimiendo dentro del EJB con instancia: "+this);
        contador++;
        System.out.println("Valor del contador en el metodo saludar " + contador);
        return "Hola que tal " + nombre;
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("peras"));
        productos.add(new Producto("manzanas"));
        productos.add(new Producto("naranjas"));
        return productos;
    }

    @Override
    public Producto crear(Producto producto) {
        System.out.println("Guardando producto ..." + producto);
        Producto p = new Producto();
        p.setNombre(producto.getNombre());
        return p;
    }
}
