package controllers;

import models.Producto;
import models.Proveedor;
import models.SolicitudCompra;
import Enums.Estado;

import java.util.ArrayList;

public class Controller {
    private ArrayList<Proveedor> proveedores = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<SolicitudCompra> solicitudesCompra = new ArrayList<>();

    // Constructor sencillo
    public Controller() {
    }

    // Métodos básicos para tu Main:

    public void registrarProveedor(int id, String nombre, String direccion, String telefono) {
        Proveedor proveedor = new Proveedor(id, nombre, direccion, telefono);
        proveedores.add(proveedor);
        System.out.println("Proveedor registrado.");
    }

    public void registrarProducto(String nombre, double precioUnitario, int cantidadStock, int idProveedor) {
        Producto producto = new Producto(nombre, precioUnitario, cantidadStock, idProveedor);
        productos.add(producto);
        System.out.println("Producto registrado.");
    }

    public void registrarSolicitudCompra(int idProveedor, int idProducto, int cantidad, double precioUnitario, Estado estado) {
        int numeroSolicitud = solicitudesCompra.size() + 1; // Número automático
        SolicitudCompra solicitud = new SolicitudCompra(numeroSolicitud, idProveedor, idProducto, cantidad, precioUnitario, estado);
        solicitudesCompra.add(solicitud);
        System.out.println("Solicitud de compra registrada.");
    }

    public void mostrarSolicitudesCompra() {
        for (SolicitudCompra solicitud : solicitudesCompra) {
            System.out.println(solicitud);
        }
    }

    public void mostrarProveedores() {
        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor);
        }
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void buscarProveedorPorId(int id) {
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getId() == id) {
                System.out.println(proveedor);
                return;
            }
        }
        System.out.println("Proveedor no encontrado.");
    }

    public void buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(producto);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public SolicitudCompra buscarSolicitudPorNumero(int numero) {
        for (SolicitudCompra solicitud : solicitudesCompra) {
            if (solicitud.getNumeroSolicitud() == numero) {
                return solicitud;
            }
        }
        return null;
    }

    public void aprobarRechazarSolicitud(int numeroSolicitud, String decision) {
        SolicitudCompra solicitud = buscarSolicitudPorNumero(numeroSolicitud);
        if (solicitud != null) {
            if (decision.equalsIgnoreCase("APROBADA")) {
                solicitud.aprobar();
                System.out.println("Solicitud aprobada.");
            } else if (decision.equalsIgnoreCase("RECHAZADA")) {
                solicitud.rechazar();
                System.out.println("Solicitud rechazada.");
            } else {
                System.out.println("Decisión inválida.");
            }
        } else {
            System.out.println("Solicitud no encontrada.");
        }
    }

    public void calcularTotalSolicitud(int numeroSolicitud) {
        SolicitudCompra solicitud = buscarSolicitudPorNumero(numeroSolicitud);
        if (solicitud != null) {
            double total = solicitud.calcularTotal();
            System.out.println("Total de la solicitud: $" + total);
        } else {
            System.out.println("Solicitud no encontrada.");
        }
    }
}
