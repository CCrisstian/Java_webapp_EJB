package org.CCristian.webapp.ejb.service;

import jakarta.ejb.Local;
import org.CCristian.webapp.ejb.models.Producto;

import java.util.List;

@Local
public interface ServiceEjbLocal {
    String saludar (String nombre);
    List<Producto> listar();
    Producto crear(Producto producto);
}
