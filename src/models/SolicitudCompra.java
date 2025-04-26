package models;

import Enums.Estado;

public class SolicitudCompra extends Calculable {
    private int id;
    private int idProveedor;
    private int idProducto;
    private int cantidad;
    private double precioUnitario;
    private Estado estado;
    private double total;

    public SolicitudCompra(int id, int idProveedor, int idProducto, int cantidad, double precioUnitario, Estado estado, double total) {
        this.id = id;
        this.idProveedor = idProveedor;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.estado = estado;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", idProveedor=" + idProveedor +
                ", idProducto=" + idProducto +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", estado=" + estado +
                ", total=" + total +
                '}';
    }
    public void calcularTotal() {
        this.total = calcular();
        System.out.printf("Total de la solicitud de compra es: " + this.total);
    }

    public void registrar(){
        System.out.printf("Solicitud de compra registrada con ID:"+id);
    }
    public void actualizarEstado(){
        System.out.printf("Solicitud de compra actualizada"+estado);
    }
    public void eliminar(){
        System.out.printf("Solicitud de compra eliminada con ID:"+id);
    }
        @Override
        public double calcular() {
            return this.precioUnitario * this.cantidad;
        }
    }