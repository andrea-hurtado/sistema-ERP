package controllers;

import Enums.Estado;
import models.Proveedor;
import models.Producto;
import models.SolicitudCompra;
import views.View;

public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    // Registrar proveedor
    public void registrarProveedor(int id, String nombre, String direccion, String telefono) {
        Proveedor proveedor = new Proveedor(id, nombre, direccion, telefono);
        System.out.printf("Proveedor '%s' registrado con ID %d\n", proveedor.getNombre(), proveedor.getId());
    }

    // Registrar producto
    public void registrarProducto(String nombre, double precioUnitario, int cantidadStock, int idProveedor) {
        Producto producto = new Producto(1, nombre, precioUnitario, cantidadStock, idProveedor);
        System.out.printf("Producto '%s' registrado con ID %d y estado '%s'\n", producto.getNombre(), producto.getId());
    }

    //Registrar solicitud de compra
    public void registrarSolicitudCompra(int idProveedor, int idProducto, int cantidad, double precioUnitario, Estado estado) {
        SolicitudCompra solicitud = new SolicitudCompra(1, idProveedor, idProducto, cantidad, precioUnitario, estado);
        System.out.printf("Solicitud de compra registrada con ID %d, total: %.2f\n", solicitud.getId(), solicitud.getTotal());
    }


    // Métodos para mostrar información, etc.
    public void mostrarProveedor(Proveedor proveedor) {
        view.mostrarProveedor(proveedor);
    }


}
