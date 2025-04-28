Sistema de Gestión de Compras ERP

Descripción

Este proyecto tiene como objetivo la creación de un sistema de gestión de compras para una empresa que desea automatizar sus procesos de adquisición de productos, gestión de proveedores y seguimiento de solicitudes de compra. El sistema es desarrollado en Java aplicando los principios de Programación Orientada a Objetos (POO) y otras prácticas esenciales de software como la herencia, polimorfismo, interfaces y enumeraciones.

En este sistema, los usuarios pueden registrar proveedores, productos y solicitudes de compra, buscar elementos por criterios sencillos (como ID o nombre) y calcular totales de compras. Todo esto es gestionado a través de un menú interactivo en la consola que permite navegar por las diferentes funcionalidades del sistema.

Tecnologías Utilizadas
	•	Lenguaje: Java
	•	POO (Programación Orientada a Objetos): Aplicación de principios como herencia, encapsulamiento, polimorfismo y abstracción.
	•	Enumeraciones: Para representar estados de las solicitudes de compra.
	•	Interfaces: Para la implementación de comportamientos comunes.
	•	Git & GitHub: Para el control de versiones y colaboración en equipo.

Objetivos del Proyecto

Este proyecto busca:
	•	Aplicar los principios de Programación Orientada a Objetos (POO), creando clases que representen las entidades clave del sistema.
	•	Implementar herencia para reutilizar atributos comunes entre diferentes clases.
	•	Utilizar interfaces para establecer comportamientos comunes, como la capacidad de calcular el total de una solicitud de compra.
	•	Emplear enumeraciones para manejar los estados de las solicitudes (por ejemplo: SOLICITADA, EN_REVISIÓN, APROBADA, RECHAZADA).
	•	Desarrollar un sistema modular, escalable y mantenible para el futuro.

Funcionalidades

El sistema permite realizar las siguientes tareas:
	1.	Registrar Proveedores: Añadir proveedores con sus respectivos datos como nombre, dirección y teléfono.
	2.	Registrar Productos: Registrar productos asociados a proveedores con detalles como nombre, precio y cantidad en stock.
	3.	Registrar Solicitudes de Compra: Crear solicitudes de compra que incluyen productos, cantidades, precios y estado de la solicitud.
	4.	Buscar Proveedores y Productos: Buscar proveedores por ID o nombre, y productos por nombre.
	5.	Aprobar o Rechazar Solicitudes: Cambiar el estado de una solicitud a APROBADA o RECHAZADA.
	6.	Calcular el Total de una Solicitud de Compra: El sistema calcula el total de una solicitud multiplicando la cantidad de productos por el precio unitario.

Diagrama UML

El sistema está representado mediante un diagrama UML que muestra las relaciones entre las clases, incluyendo la herencia entre Persona y Proveedor, la implementación de la interfaz OperacionSolicitud por SolicitudCompra, y las enumeraciones para los estados de las solicitudes.

Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

src/
│
├── controllers/
│   └── Controller.java         # Lógica principal del sistema
├── enums/
│   └── Estado.java            # Enumeración para los estados de solicitud
├── models/
│   ├── Calculable.java        # Interfaz para clases que implementan cálculo
│   ├── Persona.java           # Clase base para Proveedor
│   ├── Producto.java          # Clase para productos
│   ├── Proveedor.java         # Clase que hereda de Persona
│   └── SolicitudCompra.java   # Clase para las solicitudes de compra
├── views/
│   └── View.java              # Clase para mostrar el menú y resultados
└── Main.java                  # Punto de entrada para ejecutar el sistema


Contribuciones

Este proyecto fue desarrollado como parte de una práctica de programación orientada a objetos. 

⸻
