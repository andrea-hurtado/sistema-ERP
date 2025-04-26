package views;
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

    public void mostrarProveedor(Proveedor proveedor) {
        System.out.println(proveedor.toString());
    }
}
