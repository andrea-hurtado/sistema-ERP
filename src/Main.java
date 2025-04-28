    import java.util.Scanner;

    import Enums.Estado;
    import controllers.Controller;
    import views.View;

    public class Main {
        public static void main(String[] args) {
            View view = new View();
            Controller controller = new Controller(view);
            Scanner scanner = new Scanner(System.in);


            int opcion = 0;

            while (opcion != 12) {
                view.mostrarMenu();
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el ID del proveedor:");
                        int idProveedor = scanner.nextInt();
                        System.out.println("Introduce el nombre del proveedor:");
                        String nombreProveedor = scanner.next();
                        System.out.println("Introduce la dirección del proveedor:");
                        String direccionProveedor = scanner.next();
                        System.out.println("Introduce el teléfono del proveedor:");
                        String telefonoProveedor = scanner.next();
                        controller.registrarProveedor(idProveedor, nombreProveedor, direccionProveedor, telefonoProveedor);
                        break;
                    case 2:
                        System.out.println("Introduce el ID del proveedor:");
                        int idProductoProveedor = scanner.nextInt();
                        System.out.println("Introduce el nombre del producto:");
                        String nombreProducto = scanner.next();
                        System.out.println("Introduce el precio unitario del producto:");
                        double precioProducto = scanner.nextDouble();
                        System.out.println("Introduce la cantidad en stock del producto:");
                        int cantidadStock = scanner.nextInt();
                        controller.registrarProducto(nombreProducto, precioProducto, cantidadStock, idProductoProveedor);
                        break;
                    case 3:
                        System.out.println("Introduce el ID del proveedor:");
                        int idProveedorSolicitud = scanner.nextInt();
                        System.out.println("Introduce el ID del producto:");
                        int idProductoSolicitud = scanner.nextInt();
                        System.out.println("Introduce la cantidad de productos:");
                        int cantidadSolicitud = scanner.nextInt();
                        System.out.println("Introduce el precio unitario:");
                        double precioUnitarioSolicitud = scanner.nextDouble();
                        System.out.println("Introduce el estado de la solicitud (SOLICITADA, EN_PROCESO, TERMINADA, CANCELADA):");
                        String estadoSolicitudString = scanner.next();
                        Estado estadoSolicitud = Estado.valueOf(estadoSolicitudString.toUpperCase());
                        controller.registrarSolicitudCompra(idProveedorSolicitud, idProductoSolicitud, cantidadSolicitud, precioUnitarioSolicitud, estadoSolicitud);
                        break;
                    case 4:
                        controller.mostrarProveedores();
                        break;

                    case 5:
                        controller.mostrarProductos();
                        break;
                    case 6:
                        controller.mostrarSolicitudesCompra();
                        break;

                    case 7:
                        System.out.println("Ingrese el Id del proveedor que desea encontrar: ");
                        int idBuscarProveedor = scanner.nextInt();
                        controller.buscarProveedorPorId(idBuscarProveedor);
                        break;

                    case 8:
                        System.out.println("Ingrese nombre del producto que desea encontrar: ");
                        String buscarProductoNombre = scanner.next();
                        controller.buscarProductoPorNombre(buscarProductoNombre);
                        break;

                    case 9:
                        System.out.println("Ingrese el número de solicitud que desea encontrar: ");
                        int buscarSolicitudNumero = scanner.nextInt();
                        controller.buscarSolicitudPorNumero(buscarSolicitudNumero);
                        break;

                    case 10:
                        System.out.println("Ingrese el número de solicitud rechazar o aprobar: ");
                        int numeroAprobarSolicitud = scanner.nextInt();
                        System.out.println("Introduce el nuevo estado (APROBADA o RECHAZADA):");
                        String nuevoEstado = scanner.next();
                        controller.aprobarRechazarSolicitud(numeroAprobarSolicitud, nuevoEstado);
                        break;
                    case 11:
                        System.out.println("Introduce el número de solicitud para calcular su total:");
                        int numeroSolicitudTotal = scanner.nextInt();
                        controller.calcularTotalSolicitud(numeroSolicitudTotal);
                        break;
                    case 12:
                    System.out.println("Saliendo del sistema...");
                    break;
                    default:
                        System.out.println("Opción no válida. Por favor intenta de nuevo.");

                }
            }

            scanner.close();
        }
    }
