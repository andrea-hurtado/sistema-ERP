package controllers;

import Enums.Estado;
import models.Proveedor;
import models.Producto;
import models.SolicitudCompra;
import views.View;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private View view;
    private List<Proveedor> proveedores;
    private List<Producto> productos;

    public Controller(View view) {
        this.view = view;
        this.proveedores = new ArrayList<>();  // Inicializamos la lista de proveedores
        this.productos = new ArrayList<>();  // Inicializamos la lista de productos
    }

    // Registrar proveedor
    public void registrarProveedor(int id, String nombre, String direccion, String telefono) {
        Proveedor proveedor = new Proveedor(id, nombre, direccion, telefono);
        proveedores.add(proveedor);
        System.out.printf("Proveedor '%s' registrado con ID %d\n", proveedor.getNombre(), proveedor.getId());
    }

    // Registrar producto
    public void registrarProducto(String nombre, double precioUnitario, int cantidadStock, int idProveedor) {
        Producto producto = new Producto(1, nombre, precioUnitario, cantidadStock, idProveedor);
        productos.add(producto);
        System.out.printf("Producto '%s' registrado con ID %d y estado '%s'\n", producto.getNombre(), producto.getId());
    }

    //Registrar solicitud de compra
    public void registrarSolicitudCompra(int idProveedor, int idProducto, int cantidad, double precioUnitario, Estado estado) {
        SolicitudCompra solicitud = new SolicitudCompra(1, idProveedor, idProducto, cantidad, precioUnitario, estado);
        System.out.printf("Solicitud de compra registrada con ID %d, total: %.2f\n", solicitud.getId(), solicitud.getTotal());
    }
    // Mostrar proveedores
    public void mostrarProveedores() {
        if (proveedores.isEmpty()) {
            System.out.println("No hay proveedores registrados.");
        } else {
            for (Proveedor proveedor : proveedores) {
                view.mostrarProveedor(proveedor);
            }
        }
    }

    // Mostrar productos
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto producto : productos) {
                view.mostrarProducto(producto);
            }
        }
    }
}
