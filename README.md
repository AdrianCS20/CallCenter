Call Center Management System
Este proyecto es una implementación de un sistema de gestión para un call center, desarrollado en Java. El sistema permite gestionar administradores, clientes, digitadores, productos y solicitudes. Además, incorpora diversas estructuras de datos, como árboles binarios, pilas y colas, para manejar la información y las solicitudes de manera eficiente.

Características principales
Gestión de Clientes y Administradores: Permite registrar y gestionar clientes y administradores.
Gestión de Productos: Se puede añadir y gestionar una lista de productos disponibles.
Cola de Solicitudes: Las solicitudes se organizan en una cola, permitiendo un acceso eficiente por orden de llegada.
Estructuras de Datos: Implementación de listas simples, colas, pilas y árboles binarios de búsqueda para el almacenamiento y manejo de datos.
Menú Interactivo: Ofrece un menú en consola que permite interactuar con el sistema y ejecutar las distintas funciones.
Estructura del Proyecto
El proyecto contiene las siguientes clases clave:

Administrador.java: Clase que define los atributos y métodos de los administradores en el sistema.
Cliente.java: Clase que define a los clientes del call center.
Producto.java: Representa los productos disponibles para los clientes.
Solicitud.java: Clase que define una solicitud en el sistema, administrada a través de una cola.
CallCenter.java: Clase principal que gestiona las operaciones y coordina la interacción entre los componentes.

Estructuras de Datos:
ArbolBinarioBusqueda.java y NodoArbol.java: Implementación de un árbol binario de búsqueda para almacenar datos jerárquicos.
ColaSolicitud.java y NodoCola.java: Estructura de cola para gestionar solicitudes.
ListaSimpleXXX.java y NodoListaSimpleXXX.java: Listas simples para la gestión de clientes, administradores, y otros componentes.
Pila.java y NodoPila.java: Implementación de una pila para almacenamiento de datos temporal.

Requisitos previos
Java 8 o superior: Asegúrate de tener instalado Java para ejecutar el proyecto.
Ejecución del Proyecto
Clona este repositorio en tu máquina local.
Navega al directorio raíz del proyecto.
Compila los archivos con el siguiente comando:

javac -d bin src/main/java/com/semana4/callcenterv2/*.java

Ejecuta la clase Menu para interactuar con el sistema:

java -cp bin com.semana4.callcenterv2.Menu

Uso del Sistema

Registrar Clientes y Administradores: A través del menú, puedes añadir nuevos clientes y administradores.
Añadir Productos: Accede a la opción en el menú para añadir productos al sistema.
Gestión de Solicitudes: Puedes crear y gestionar solicitudes de clientes, las cuales se organizarán en una cola.
Estructuras de Datos: Utiliza el menú para visualizar y gestionar los datos en diferentes estructuras.

Estructuras y Organización del Código
La lógica de cada componente se distribuye en clases independientes, lo que facilita la gestión del código y la implementación de nuevas funciones o ajustes en las estructuras de datos. Cada estructura de datos y entidad del sistema cuenta con clases específicas, incluyendo nodos personalizados según las necesidades de cada estructura.
Registrar Clientes y Administradores: A través del menú, puedes añadir nuevos clientes y administradores.
Añadir Productos: Accede a la opción en el menú para añadir productos al sistema.
Gestión de Solicitudes: Puedes crear y gestionar solicitudes de clientes, las cuales se organizarán en una cola.
Estructuras de Datos: Utiliza el menú para visualizar y gestionar los datos en diferentes estructuras.
Estructuras y Organización del Código
La lógica de cada componente se distribuye en clases independientes, lo que facilita la gestión del código y la implementación de nuevas funciones o ajustes en las estructuras de datos. Cada estructura de datos y entidad del sistema cuenta con clases específicas, incluyendo nodos personalizados según las necesidades de cada estructura.
