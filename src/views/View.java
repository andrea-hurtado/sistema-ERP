package views;
import models.Producto;
import models.Proveedor;

public class View {
    public void mostrarMenu() {
        System.out.println("===== SISTEMA DE GESTIÓN DE COMPRAS =====");
        System.out.println("1. Registrar proveedor");
        System.out.println("2. Registrar producto");
        System.out.println("3. Registrar solicitud de compra");
        System.out.println("4. Listar proveedores");
        System.out.println("5. Listar productos");
        System.out.println("6. Listar solicitudes de compra");
        System.out.println("7. Buscar proveedor por ID");
        System.out.println("8. Buscar producto por nombre");
        System.out.println("9. Buscar solicitud de compra por número");
        System.out.println("10. Aprobar/Rechazar solicitud de compra");
        System.out.println("11. Calcular total de una solicitud");
        System.out.println("12. Salir");
        System.out.println("======================================");
        System.out.println("Seleccione una opción: ");
    }

    // Mostrar información de Proveedor (heredando de Persona)
    public void mostrarProveedor(Proveedor proveedor) {
        System.out.println("Proveedor: ");
        System.out.println("ID: " + proveedor.getId());
        System.out.println("Nombre: " + proveedor.getNombre());  // Se accede a través de herencia
        System.out.println("Dirección: " + proveedor.getDireccion()); // Se accede a través de herencia
        System.out.println("Teléfono: " + proveedor.getTelefono()); // Se accede a través de herencia
    }

    // Mostrar Producto (sin cambios)
    public void mostrarProducto(Producto producto) {
        System.out.println("Producto: ");
        System.out.println("ID: " + producto.getId());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio unitario: " + producto.getPrecioUnitario());
        System.out.println("Cantidad en stock: " + producto.getCantidadStock());
        System.out.println("ID Proveedor: " + producto.getIdProveedor());
    }
}
