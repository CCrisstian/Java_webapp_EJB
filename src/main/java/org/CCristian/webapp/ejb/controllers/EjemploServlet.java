package org.CCristian.webapp.ejb.controllers;

import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.CCristian.webapp.ejb.models.Producto;
import org.CCristian.webapp.ejb.service.ServiceEjb;
import org.CCristian.webapp.ejb.service.ServiceEjbLocal;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;

@WebServlet("/index")
public class EjemploServlet extends HttpServlet {

//    @Inject
//    private ServiceEjbLocal service;
//
//    @Inject
//    private ServiceEjbLocal service2;

    InitialContext ctx;
    ServiceEjbLocal service = null;
    ServiceEjbLocal service2 = null;

    {
        try {
            ctx = new InitialContext();
            service = (ServiceEjbLocal) ctx.lookup("java:global/webapp-ejb/ServiceEjb!org.CCristian.webapp.ejb.service.ServiceEjbLocal");
            service2 = (ServiceEjbLocal) ctx.lookup("java:global/webapp-ejb/ServiceEjb!org.CCristian.webapp.ejb.service.ServiceEjbLocal");
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("¿service es igual a service2? : " + service.equals(service2));

        Producto p = service.crear(new Producto("uvas"));
        System.out.println("nueva producto "+ p);

        req.setAttribute("saludo", service.saludar("Cristian"));
        req.setAttribute("saludo2", service2.saludar("Alejandro"));
        req.setAttribute("listado", service.listar());
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);

    }
}
