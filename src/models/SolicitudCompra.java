package models;

import Enums.Estado;

public class SolicitudCompra implements OperacionSolicitud {
    private int numeroSolicitud; // Atributo numeroSolicitud
    private int idProveedor;
    private int idProducto;
    private int cantidad;
    private double precioUnitario;
    private Estado estado;
    private double total;

    public SolicitudCompra(int numeroSolicitud, int idProveedor, int idProducto, int cantidad, double precioUnitario, Estado estado) {
        this.numeroSolicitud = numeroSolicitud;
        this.idProveedor = idProveedor;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.estado = estado;
        this.total = calcular(); // Calcula el total al crear el objeto
    }

    public int getNumeroSolicitud() {
        return numeroSolicitud;  // Aquí estamos devolviendo el número de solicitud
    }

    public void setNumeroSolicitud(int numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "SolicitudCompra{" +
                "numeroSolicitud=" + numeroSolicitud +
                ", idProveedor=" + idProveedor +
                ", idProducto=" + idProducto +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", estado=" + estado +
                ", total=" + total +
                '}';
    }

    public double calcular() {
        return this.precioUnitario * this.cantidad;
    }

    @Override
    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    @Override
    public void aprobar() {
        estado = Estado.TERMINADA;
    }

    @Override
    public void rechazar() {
        estado = Estado.CANCELADA;
    }
}