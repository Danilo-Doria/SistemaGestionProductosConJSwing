# SistemaGestionProductosConJSwing

Un sistema de gestión de productos de escritorio desarrollado en **Java**. Utiliza **Maven** para la gestión de dependencias y el ciclo de vida de construcción, y **Swing (JFrame)** para la Interfaz Gráfica de Usuario (GUI).

## Características Principales

*   **Interfaz Gráfica Intuitiva:** Ventanas y formularios construidos con JFrame para una experiencia de usuario fluida.
*   **Operaciones CRUD:** Funcionalidad completa para crear, leer, actualizar y eliminar productos del inventario.
*   **Arquitectura Robusta:** Diseño basado en los pilares de la Programación Orientada a Objetos (POO), aprovechando el encapsulamiento, la abstracción, la herencia y el polimorfismo.
*   **Código Limpio y Modular:** Implementación de interfaces claras y uso correcto de anotaciones como `@Override` para garantizar la extensibilidad.
*   **Manejo de Excepciones:** Validación de entradas y control riguroso de errores para evitar cierres inesperados de la aplicación.
*   **Gestión de Estado:** Uso eficiente de estructuras de datos y modificadores (como `static` para variables de clase y utilidades) para manejar la información en memoria.

## Requisitos Previos

Asegúrate de tener instalados los siguientes componentes en tu entorno de desarrollo:

*   [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (Versión 8 o superior, se recomienda 17 o 21).
*   [Apache Maven](https://maven.apache.org/download.cgi) (Asegúrate de que esté configurado en tu variable de entorno `PATH`).

## Instalación y Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/Danilo-Doria/SistemaGestionProductosConJSwing.git
    cd SistemaGestionProductosConJSwing
    ```

2.  **Compilar el proyecto:**
    Navega hasta el directorio raíz del proyecto (donde se encuentra el `pom.xml`) y ejecuta:
    ```bash
    mvn clean install
    ```

3.  **Ejecutar la aplicación:**
    Puedes ejecutar el proyecto directamente a través de Maven con el siguiente comando:
    ```bash
    mvn exec:java
    ```

## Estructura del Proyecto

El proyecto sigue la convención estándar de directorios de Maven, facilitando la separación de responsabilidades, ideal para implementar patrones de diseño como MVC (Modelo-Vista-Controlador):

```text
SistemaGestionProductos/
├── LICENSE
├── pom.xml
├── README.md
├── src
│   ├── main/
|   │   └── java
│   │       └── com
│   │           └── mycompany
│   │               └── sistemagestionproductos
│   │                   ├── controller
│   │                   │   └── ProductoController.java
│   │                   ├── factory
│   │                   │   └── ProductoFactory.java
│   │                   ├── Main.java
│   │                   ├── model
│   │                   │   ├── ProductoDigital.java
│   │                   │   ├── ProductoFisico.java
│   │                   │   └── Producto.java
│   │                   ├── repository
│   │                   │   └── ProductoRepository.java
│   │                   ├── service
│   │                   │   └── ProductoService.java
│   │                   └── view
│   │                       ├── VentanaBuscarProducto.form
│   │                       ├── VentanaBuscarProducto.java
│   │                       ├── VentanaListarProductos.form
│   │                       ├── VentanaListarProductos.java
│   │                       ├── VentanaPrincipal.form
│   │                       ├── VentanaPrincipal.java
│   │                       ├── VentanaRegistrarProducto.form
│   │                       └── VentanaRegistrarProducto.java
│   └── test/
└── target/
```
## 👨‍💻 Author

- GitHub: **[Danilo-Doria](https://github.com/Danilo-Doria)**
- LinkedIn: **[Danilo Doria Diaz](https://www.linkedin.com/in/danilodd)**
- Correo: **danilodoria519@gmail.com**

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
