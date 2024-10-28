/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    //menu principal
    private boolean seguir = true;

    //menu cliente
    private Cliente cliente;
    int opcionCliente;
    int cedulaCliente;
    ListaSimpleClientes lsClientes = new ListaSimpleClientes();
    String nombreCliente;
    String apellidoCliente;
    short edadCliente;
    String ubicacionCliente;
    String direccionCliente;
    int numeroCliente;

    //variables de solicitud
    ColaSolicitud colaSolicitudesAnuladas = new ColaSolicitud();
    ArrayList<Solicitud> solicitudes = new ArrayList<>();
    int idSolicitud = 0;
    String descripcion;
    String caracteristicas;
    int cedulaBuscar;
    String observaciones;
    ListaSimpleTiquetes lsTiquetes = new ListaSimpleTiquetes();
    int idBuscar;
    int opc;
    int solicitudesAtendidas = 0;

    //menu digitador
    private Digitador digitador;
    int cedulaDigitador;
    String nombreDigitador;
    String correoDigitador;
    String apellidoDigitador;
    String estadoDigitador;
    String observacionDigitador;
    String tipoDigitador;
    ListaSimpleDigitador lsDigitador = new ListaSimpleDigitador();

    //menu administrador
    private Administrador administrador;
    private int opcionAdministrador;
    ListaSimpleAdministrador lsAdministrador = new ListaSimpleAdministrador();
    private String password;
    String nombreAdmin;
    String apellidoAdmin;
    String estadoAdmin;
    String tipoAdmin;
    String funcionesAdmin;
    int cedulaAdmin;

    //arboles
    ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

    //menu productos
    private Producto producto;
    private int opcionProducto;
    ListaSimpleProducto lsProducto = new ListaSimpleProducto();
    int idProducto;
    String descripcionProducto;
    String estadoProducto;

    public void menu() {
        while (seguir) {
            System.out.println("--------------MENU PRINCIPAL----------------");
            System.out.println("1. Menu clientes");
            System.out.println("2. Menu Digitadores");
            System.out.println("3. Menu Administradores");
            System.out.println("4. Menu producto");
            System.out.println("5. Ver solicitudes en espera");
            System.out.println("6. ver solicitudes anuladas");
            System.out.println("7. Buscar solicitud en arbol por numero de tiquete ");
            System.out.println("8. Eliminar nodo del arbol y enviar a pila");
            System.out.println("9. Salir");
            System.out.println("--------------------------------------------------");
            System.out.println("Digite el numero de opcion que desea inicializar: ");
            int opcion;
            try {
                opcion = input.nextInt();
            } catch (Exception e) {
                System.out.println("Valor no valido. Por favor, ingrese un numero entero.");
                input.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    boolean seguirClientes = true;
                    while (seguirClientes) {
                        System.out.println("--------------MENU CLIENTES---------------");
                        System.out.println("1. Ingresar nuevo cliente");
                        System.out.println("2. Modificar cliente existente");
                        System.out.println("3. Anular cliente existente");
                        System.out.println("4. Crear una nueva solicitud");
                        System.out.println("5. Mostrar datos cliente");
                        System.out.println("6. Consultar tiquetes por cedula");
                        System.out.println("7. Ver lista clientes");
                        System.out.println("9. Salir");
                        System.out.println("-----------------------------------------");
                        System.out.println("Digite el numero de opción que desea inicializar: ");

                        try {
                            opcionCliente = input.nextInt();
                        } catch (Exception e) {
                            System.out.println("Valor no valido. Por favor, ingrese un numero entero.");
                            input.nextLine();
                            continue;
                        }

                        switch (opcionCliente) {
                            case 1:
                                System.out.println("------Ingresar nuevo cliente--------");
                                System.out.println("Ingrese la cedula del cliente: ");
                                try {
                                    cedulaCliente = input.nextInt();
                                } catch (Exception e) {
                                    System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                    input.nextLine();
                                    break;
                                }
                                input.nextLine();

                                if (!lsClientes.ExisteCliente(cedulaCliente)) {

                                    System.out.println("Ingrese el nombre del cliente: ");
                                    nombreCliente = input.nextLine();

                                    System.out.println("Ingrese el apellido del cliente: ");
                                    apellidoCliente = input.nextLine();

                                    System.out.println("Ingrese la edad del cliente: ");
                                    try {
                                        edadCliente = input.nextShort();
                                    } catch (Exception e) {
                                        System.out.println("Valor no válido. Por favor, ingrese un número corto.");
                                        input.nextLine();
                                        break;
                                    }
                                    input.nextLine();

                                    System.out.println("Ingrese la ubicacion de vivienda del cliente: ");
                                    ubicacionCliente = input.nextLine();

                                    System.out.println("Ingrese la direccion exacta del cliente: ");
                                    direccionCliente = input.nextLine();

                                    System.out.println("Ingrese el numero de telefono del cliente: ");
                                    try {
                                        numeroCliente = input.nextInt();
                                    } catch (Exception e) {
                                        System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                        input.nextLine();
                                        break;
                                    }
                                    input.nextLine();

                                    cliente = new Cliente(cedulaCliente, nombreCliente, edadCliente, ubicacionCliente, direccionCliente, numeroCliente, apellidoCliente);
                                    lsClientes.ingresarClienteFinal(cliente);
                                } else {
                                    System.out.println("Ese numero de cedula ya tiene un cliente creado.");
                                }
                                break;

                            case 2:
                                System.out.println("------Modificar cliente--------");

                                System.out.println("Ingrese la cedula del cliente que quiere modificar:");
                                try {
                                    int cedulaClienteBuscar = input.nextInt();
                                    input.nextLine();

                                    cedulaCliente = cliente.getCedula();

                                    System.out.println("Ingrese el nombre del cliente: ");
                                    nombreCliente = input.nextLine();

                                    System.out.println("Ingrese el apellido del cliente: ");
                                    apellidoCliente = input.nextLine();

                                    System.out.println("Ingrese la edad del cliente: ");
                                    edadCliente = input.nextShort();
                                    input.nextLine();

                                    System.out.println("Ingrese la ubicacion de vivienda del cliente: ");
                                    ubicacionCliente = input.nextLine();

                                    System.out.println("Ingrese la direccion exacta del cliente: ");
                                    direccionCliente = input.nextLine();

                                    System.out.println("Ingrese el numero de telefono del cliente: ");
                                    numeroCliente = input.nextInt();
                                    input.nextLine();

                                    cliente = new Cliente(cedulaCliente, nombreCliente, edadCliente, ubicacionCliente, direccionCliente, numeroCliente, apellidoCliente);

                                    lsClientes.modificarClientes(cedulaClienteBuscar, cliente);
                                } catch (Exception e) {
                                    System.out.println("Valor no válido. Por favor, ingrese los datos correctamente.");
                                    input.nextLine();
                                }
                                break;

                            case 3:
                                System.out.println("------Eliminar cliente--------");
                                lsClientes.imprimirListaClientes();
                                System.out.println("Ingrese la cedula del cliente que quiere eliminar: ");
                                try {
                                    cedulaCliente = input.nextInt();
                                    input.nextLine();
                                    lsClientes.eliminarClientes(cedulaCliente);
                                } catch (Exception e) {
                                    System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                    input.nextLine();
                                }
                                break;

                            case 4:
                                System.out.println("-----Creacion de una nueva solicitud------");
                                if (lsClientes.vacia()) {
                                    System.out.println("tiene que crear un cliente antes de usar esta opcion");
                                } else {
                                    System.out.println("imprimiendo lista de clientes...");
                                    lsClientes.imprimirListaClientes();

                                    System.out.println("digite la cedula del cliente con el que quiera crear su solicitud: ");
                                    try {
                                        cedulaBuscar = input.nextInt();
                                    } catch (Exception e) {
                                        System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                        input.nextLine();
                                        break;
                                    }
                                    input.nextLine();

                                    if (lsClientes.buscarClientes(cedulaBuscar)) {
                                        System.out.println("Ingrese la descripcion de su solicitud: ");
                                        descripcion = input.nextLine();
                                        System.out.println("Ingrese las caracteristicas de su solicitud: ");
                                        caracteristicas = input.nextLine();

                                        System.out.println("Seleccione que producto es (Ingrese el ID del producto): ");
                                        lsProducto.imprimirListaProducto();

                                        try {
                                            opcionProducto = input.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                            input.nextLine();
                                            break;
                                        }
                                        input.nextLine();

                                        Solicitud solicitud = new Solicitud(descripcion, caracteristicas, idSolicitud, cedulaBuscar, lsProducto.buscarProducto(opcionProducto));
                                        System.out.println("Su solicitud: ");
                                        System.out.println(solicitud);
                                        solicitudes.add(solicitud);
                                        idSolicitud++;
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("escriba el numero de cedula del cliente que quiere ver los datos: ");
                                try {
                                    cedulaBuscar = input.nextInt();
                                } catch (Exception e) {
                                    System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                    input.nextLine();
                                    break;
                                }
                                if (lsClientes.buscarClientes(cedulaBuscar)) {
                                    lsClientes.ImprimirCliente(cedulaBuscar);
                                }
                                break;

                            case 6:
                                lsClientes.imprimirListaClientes();
                                System.out.println("Ingrese el número de cedula del cliente que desea consultar:");
                                try {
                                    int cedulaConsultar = input.nextInt();
                                    input.nextLine();

                                    // le muestra todos sus tiquetes al cliente
                                    lsTiquetes.imprimirTiquetePorCliente(cedulaConsultar);
                                } catch (Exception e) {
                                    System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                    input.nextLine();
                                }
                                break;

                            case 7:
                                lsClientes.imprimirListaClientes();
                                break;

                            case 9:
                                seguirClientes = false;
                                break;

                            default:
                                System.out.println("Por favor ingrese un valor válido...");
                                break;
                        }
                    }
                    break;
                //fin menu clientes

                case 2:
                    //inicio menu digitador
                    System.out.println("Digite la contraseña: ");
                    password = input.next();

                    if (password.equals("digitador123")) {
                        boolean seguirDigitador = true;
                        while (seguirDigitador) {
                            System.out.println("--------------MENU DIGITADOR---------------");
                            System.out.println("1. Ingresar nuevo digitador");
                            System.out.println("2. Modificar digitador existente");
                            System.out.println("3. Anular digitador existente");
                            System.out.println("4. Atender una solicitud");
                            System.out.println("5. ver lista digitadores");
                            System.out.println("9. salir");
                            System.out.println("-----------------------------------------");
                            System.out.println("Digite el numero de opcion que desea inicializar: ");
                            int opcionDigitador = 0;
                            try {
                                opcionDigitador = input.nextInt();
                            } catch (Exception e) {
                                System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                input.nextLine();
                                continue;
                            }
                            input.nextLine();
                            switch (opcionDigitador) {
                                case 1:
                                    System.out.println("------Ingresar nuevo digitador--------");
                                    System.out.println("Ingrese la cedula del digitador: ");
                                    try {
                                        cedulaDigitador = input.nextInt();
                                    } catch (Exception e) {
                                        System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                        input.nextLine();
                                        break;
                                    }
                                    input.nextLine();

                                    if (!lsDigitador.ExisteDigitador(cedulaDigitador)) {

                                        System.out.println("Ingrese el nombre del digitador: ");
                                        nombreDigitador = input.nextLine();

                                        System.out.println("Ingrese el apellido del digitador: ");
                                        apellidoDigitador = input.nextLine();

                                        System.out.println("Ingrese el correo del digitador: ");
                                        correoDigitador = input.nextLine();

                                        System.out.println("Ingrese el estado del digitador: ");
                                        estadoDigitador = input.nextLine();

                                        System.out.println("Ingrese observaciones sobre el digitador: ");
                                        observacionDigitador = input.nextLine();

                                        System.out.println("Ingrese el tipo de digitador: ");
                                        tipoDigitador = input.nextLine();

                                        digitador = new Digitador(tipoDigitador, observacionDigitador, estadoDigitador, correoDigitador, nombreDigitador, apellidoDigitador, cedulaDigitador);
                                        lsDigitador.ingresarDigitadorFinal(digitador);
                                    } else {
                                        System.out.println("Ya hay un digitador con esa cedula.");
                                    }
                                    break;

                                case 2:
                                    if (!lsDigitador.vacia()) {
                                        System.out.println("------Modificar digitador--------");
                                        lsDigitador.imprimirListaDigitador();

                                        System.out.println("Ingrese la cedula del digitador que quiere modificar:");
                                        try {
                                            int cedulaDigitadorBuscar = input.nextInt();
                                            input.nextLine();

                                            cedulaDigitador = digitador.getCedula();

                                            System.out.println("Ingrese el nombre del digitador: ");
                                            nombreDigitador = input.nextLine();

                                            System.out.println("Ingrese el apellido del digitador: ");
                                            apellidoDigitador = input.nextLine();

                                            System.out.println("Ingrese el correo del digitador: ");
                                            correoDigitador = input.nextLine();

                                            System.out.println("Ingrese el estado del digitador: ");
                                            estadoDigitador = input.nextLine();

                                            System.out.println("Ingrese observaciones sobre el digitador: ");
                                            observacionDigitador = input.nextLine();

                                            System.out.println("Ingrese el tipo de digitador: ");
                                            tipoDigitador = input.nextLine();

                                            digitador = new Digitador(tipoDigitador, observacionDigitador, estadoDigitador, correoDigitador, nombreDigitador, apellidoDigitador, cedulaDigitador);

                                            lsDigitador.modificarDigitador(cedulaDigitadorBuscar, digitador);
                                        } catch (Exception e) {
                                            System.out.println("Valor no válido. Por favor, ingrese los datos correctamente.");
                                            input.nextLine();
                                        }
                                    } else {
                                        System.out.println("tiene que crear un digitador antes de usar esta funcion");
                                    }
                                    break;

                                case 3:
                                    if (!lsDigitador.vacia()) {
                                        System.out.println("------Eliminar digitador--------");
                                        System.out.println("Ingrese la cedula del digitador que quiere eliminar: ");
                                        try {
                                            cedulaDigitador = input.nextInt();
                                            input.nextLine();
                                            lsDigitador.eliminarDigitador(cedulaDigitador);
                                        } catch (Exception e) {
                                            System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                            input.nextLine();
                                        }
                                    } else {
                                        System.out.println("Tiene que crear un digitador antes de usar esta funcion");
                                    }
                                    break;

                                case 4:
                                    if (!lsDigitador.vacia()) {
                                        System.out.println("-----Atender una solicitud-----");
                                        lsDigitador.imprimirListaDigitador();
                                        System.out.println("ingrese la cedula del digitador que va a responder esta solicitud");
                                        try {
                                            cedulaDigitador = input.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                            input.nextLine();
                                            break;
                                        }
                                        input.nextLine();

                                        if (lsDigitador.buscarDigitador(cedulaDigitador)) {
                                            System.out.println(solicitudes.get(0).toString());
                                            System.out.println("por favor escriba las observaciones/respuesta: ");
                                            observaciones = input.nextLine();
                                            solicitudes.get(0).setObservacionesSolicitud(observaciones);
                                            solicitudes.get(0).setEstadoSolicitud("atendida");
                                            solicitudesAtendidas++;
                                            System.out.println("se han atendido: " + solicitudesAtendidas);
                                            Tiquete tiquete = new Tiquete(solicitudes.get(0).getIdSolicitud(),
                                                    solicitudes.get(0).getCedulaCliente(),
                                                    solicitudes.get(0).getDescripcion(),
                                                    solicitudes.get(0).getEstadoSolicitud(),
                                                    cedulaDigitador, solicitudes.get(0).getFecha(), solicitudes.get(0).getProducto());

                                            lsTiquetes.ingresarTiqueteFinal(tiquete);
                                            solicitudes.remove(0);
                                        } else {
                                            System.out.println("cedula no valida");
                                        }
                                    } else {
                                        System.out.println("tiene que crear un digitador para usar esta funcion");
                                    }
                                    break;

                                case 5:
                                    lsDigitador.imprimirListaDigitador();
                                    break;

                                case 9:
                                    seguirDigitador = false;
                                    break;

                                default:
                                    System.out.println("por favor ingrese un valor valido...");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("contraseña incorrecta, saliendo...");
                    }
                    break;
                //fin menu digitador

                case 3:
                    // inicio menu administrador
                    System.out.println("digite la contraseña: ");
                    password = input.next();

                    if (password.equals("Admin123")) {
                        boolean seguirAdministrador = true;
                        while (seguirAdministrador) {
                            System.out.println("--------------MENU ADMINISTRADOR---------------");
                            System.out.println("1. Ingresar nuevo administrador");
                            System.out.println("2. Modificar administrador existente");
                            System.out.println("3. Anular administrador existente");
                            System.out.println("4. anular una solicitud");
                            System.out.println("5. ver arbol de solicitudes anuladas");
                            System.out.println("6. ver lista admins");
                            System.out.println("7. ver todos los tiquetes");
                            System.out.println("9. salir");
                            System.out.println("-----------------------------------------");
                            try {
                                opcionAdministrador = input.nextInt();
                            } catch (Exception e) {
                                System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                input.nextLine();
                                continue;
                            }
                            input.nextLine();
                            switch (opcionAdministrador) {
                                case 1:
                                    System.out.println("------Ingresar nuevo administrador--------");
                                    System.out.println("Ingrese la cedula del administrador: ");
                                    try {
                                        cedulaAdmin = input.nextInt();
                                    } catch (Exception e) {
                                        System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                        input.nextLine();
                                        break;
                                    }
                                    input.nextLine();

                                    if (!lsAdministrador.ExisteAdministrador(cedulaAdmin)) {

                                        System.out.println("Ingrese el nombre del administrador: ");
                                        nombreAdmin = input.nextLine();

                                        System.out.println("Ingrese el apellido del administrador: ");
                                        apellidoAdmin = input.nextLine();

                                        System.out.println("Ingrese el estado del administrador: ");
                                        estadoAdmin = input.nextLine();

                                        System.out.println("Ingrese las funciones que realiza el administrador: ");
                                        funcionesAdmin = input.nextLine();

                                        System.out.println("Ingrese el tipo de administrador: ");
                                        tipoAdmin = input.nextLine();

                                        administrador = new Administrador(cedulaAdmin, nombreAdmin, tipoAdmin, funcionesAdmin, estadoAdmin, apellidoAdmin);
                                        lsAdministrador.ingresarAdministradorFinal(administrador);
                                    } else {
                                        System.out.println("ya existe un administrador con esa cedula");
                                    }
                                    break;

                                case 2:
                                    System.out.println("------Modificar administrador--------");

                                    lsAdministrador.imprimirListaAdministrador();

                                    System.out.println("Ingrese la cedula del administrador que quiere modificar:");
                                    try {
                                        int cedulAdminBuscar = input.nextInt();
                                        input.nextLine();

                                        cedulaAdmin = cedulAdminBuscar;

                                        System.out.println("Ingrese el nombre del administrador: ");
                                        nombreAdmin = input.nextLine();

                                        System.out.println("Ingrese el apellido del administrador: ");
                                        apellidoAdmin = input.nextLine();

                                        System.out.println("Ingrese el estado del administrador: ");
                                        estadoAdmin = input.nextLine();

                                        System.out.println("Ingrese las funciones que realiza el administrador: ");
                                        funcionesAdmin = input.nextLine();

                                        System.out.println("Ingrese el tipo de administrador: ");
                                        tipoAdmin = input.nextLine();

                                        administrador = new Administrador(cedulaAdmin, nombreAdmin, tipoAdmin, funcionesAdmin, estadoAdmin, apellidoAdmin);

                                        lsAdministrador.modificarAdministrador(cedulAdminBuscar, administrador);
                                    } catch (Exception e) {
                                        System.out.println("Valor no válido. Por favor, ingrese los datos correctamente.");
                                        input.nextLine();
                                    }
                                    break;

                                case 3:
                                    System.out.println("------Eliminar administrador--------");
                                    lsAdministrador.imprimirListaAdministrador();
                                    System.out.println("Ingrese la cedula del administrador que quiere eliminar: ");
                                    try {
                                        cedulaAdmin = input.nextInt();
                                        input.nextLine();
                                        lsAdministrador.eliminarAdministrador(cedulaAdmin);
                                    } catch (Exception e) {
                                        System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                        input.nextLine();
                                    }
                                    break;

                                case 4:
                                    System.out.println("------Anular una solicitud--------");
                                    System.out.println("Lista de solicitudes: ");
                                    for (Solicitud solicitud : solicitudes) {
                                        System.out.println(solicitud.toString());
                                    }

                                    System.out.println("Por favor, digite el ID de la solicitud que quiere anular: ");
                                    try {
                                        idBuscar = input.nextInt();
                                    } catch (Exception e) {
                                        System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                        input.nextLine();
                                        break;
                                    }

                                    Iterator<Solicitud> iterador = solicitudes.iterator();
                                    boolean solicitudEncontrada = false;

                                    while (iterador.hasNext()) {
                                        Solicitud solicitud = iterador.next();
                                        if (idBuscar == solicitud.getIdSolicitud()) {
                                            System.out.println("¡Solicitud encontrada!");
                                            solicitudEncontrada = true;

                                            if (colaSolicitudesAnuladas.TamanoCola() < 5) {
                                                // Cambiar el estado de la solicitud y agregarla a la cola de solicitudes anuladas
                                                solicitud.setEstadoSolicitud("Anulada");
                                                colaSolicitudesAnuladas.insertar(solicitud);

                                                // Eliminar la solicitud de la lista de solicitudes
                                                iterador.remove();
                                                System.out.println("¡Solicitud anulada y eliminada correctamente!");

                                            } else {
                                                System.out.println("La cola de solicitudes anuladas está llena.");
                                                colaSolicitudesAnuladas.imprimirSolicitudesAnuladas();
                                                System.out.println("¿Quiere vaciar la cola y transferir las solicitudes al Árbol Binario de Búsqueda?");
                                                System.out.println("Presione cualquier número y Enter para volver, o presione 1 y Enter para vaciar la cola:");

                                                try {
                                                    opc = input.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                                    input.nextLine();
                                                    break;
                                                }
                                                input.nextLine();

                                                if (opc == 1) {
                                                    System.out.println("Cola sin ordenar: ");
                                                    colaSolicitudesAnuladas.imprimirSolicitudesAnuladas();

                                                    colaSolicitudesAnuladas.OrganizarCola(); //Lista organizada usando bubble sort

                                                    System.out.println("Resultado de ordenar la lista usando bubble sort: ");
                                                    colaSolicitudesAnuladas.imprimirSolicitudesAnuladas();

                                                    while (colaSolicitudesAnuladas.TamanoCola() > 0) {
                                                        Solicitud solicitudTransferida = colaSolicitudesAnuladas.eliminar();
                                                        System.out.println("Transferiendo solicitud: " + solicitudTransferida.toString());
                                                        arbol.insertar(solicitudTransferida);
                                                    }

                                                    solicitud.setEstadoSolicitud("Anulada");
                                                    colaSolicitudesAnuladas.insertar(solicitud);
                                                    iterador.remove();
                                                    System.out.println("¡Solicitud anulada correctamente y cola vaciada!");

                                                } else {
                                                    System.out.println("No se ha podido anular la solicitud. (cola llena)");
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    if (!solicitudEncontrada) {
                                        System.out.println("No se ha encontrado la solicitud que digitó.");
                                    }
                                    break;

                                case 5:
                                    arbol.imprimirPre();
                                    break;

                                case 6:
                                    lsAdministrador.imprimirListaAdministrador();
                                    break;

                                case 7:
                                    lsTiquetes.imprimirListaTiquetes();
                                    break;

                                case 9:
                                    seguirAdministrador = false;
                                    break;

                                default:
                                    System.out.println("por favor ingrese un valor valido...");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("contraseña incorrecta... saliendo.");
                    }
                    break;

                case 4:
                    //inicio menu productos
                    boolean seguirProducto = true;
                    while (seguirProducto) {
                        System.out.println("--------------MENU PRODUCTO---------------");
                        System.out.println("1. Ingresar nuevo producto");
                        System.out.println("2. Modificar producto existente");
                        System.out.println("3. Anular producto existente");
                        System.out.println("4. Salir");
                        System.out.println("-----------------------------------------");
                        try {
                            opcionProducto = input.nextInt();
                        } catch (Exception e) {
                            System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                            input.nextLine();
                            continue;
                        }
                        input.nextLine();

                        switch (opcionProducto) {
                            case 1:
                                System.out.println("------Ingresar nuevo producto--------");
                                idProducto = lsProducto.Size();

                                System.out.println("Ingrese la descripcion del producto: ");
                                descripcionProducto = input.nextLine();

                                System.out.println("Ingrese el estado del producto: ");
                                estadoProducto = input.nextLine();

                                producto = new Producto(idProducto, descripcionProducto, estadoProducto);
                                lsProducto.ingresarProductoFinal(producto);
                                break;

                            case 2:
                                System.out.println("------Modificar producto--------");
                                System.out.println("Ingrese el ID del producto que quiere modificar:");
                                lsProducto.imprimirListaProducto();
                                try {
                                    int idProductoBuscar = input.nextInt();
                                    input.nextLine();

                                    System.out.println("Ingrese la descripcion del producto: ");
                                    descripcionProducto = input.nextLine();

                                    System.out.println("Ingrese el estado del producto: ");
                                    estadoProducto = input.nextLine();

                                    producto = new Producto(idProductoBuscar, descripcionProducto, estadoProducto);
                                    lsProducto.modificarProducto(idProductoBuscar, producto);
                                } catch (Exception e) {
                                    System.out.println("Valor no válido. Por favor, ingrese los datos correctamente.");
                                    input.nextLine();
                                }
                                break;

                            case 3:
                                System.out.println("------Eliminar producto--------");
                                lsProducto.imprimirListaProducto();
                                System.out.println("Ingrese el ID del producto que quiere eliminar: ");
                                try {
                                    idProducto = input.nextInt();
                                    input.nextLine();
                                    lsProducto.eliminarProducto(idProducto);
                                } catch (Exception e) {
                                    System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                                    input.nextLine();
                                }
                                break;

                            case 4:
                                seguirProducto = false;
                                break;

                            default:
                                System.out.println("Por favor ingrese un valor válido...");
                                break;
                        }
                    }
                    break;
                //fin menu productos

                case 5:
                    System.out.println("-----Solicitudes en espera-----");
                    if (solicitudes.isEmpty()) {
                        System.out.println("No hay solicitudes en espera.");
                    } else {
                        for (Solicitud solicitud : solicitudes) {
                            System.out.println(solicitud.toString());
                        }
                    }
                    break;

                case 6:
                    colaSolicitudesAnuladas.imprimirSolicitudesAnuladas();
                    break;

                case 7:
                    System.out.println("Ingrese el ID de la solicitud que desea buscar en el árbol binario:");
                    try {
                        int idBusqueda = input.nextInt();
                        String resultado = arbol.buscarPorTiquete(idBusqueda);
                        System.out.println(resultado);
                    } catch (Exception e) {
                        System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                        input.nextLine();
                    }
                    break;

                case 8:
                    System.out.println("Ingrese el ID de la solicitud que desea eliminar del árbol binario:");
                    try {
                        int idEliminar = input.nextInt();
                        if (arbol.eliminarEnviarAPila(idEliminar)) {
                            System.out.println("Solicitud con ID " + idEliminar + " eliminada correctamente.");

                            NodoArbol nodoEliminado = arbol.getPilaEliminados().verCima();
                            if (nodoEliminado != null) {
                                System.out.println("El nodo eliminado se ha almacenado en la pila: " + nodoEliminado.getInfo().toString());
                            }
                        } else {
                            System.out.println("No se encontró una solicitud con el ID " + idEliminar + " en el árbol binario.");
                        }
                    } catch (Exception e) {
                        System.out.println("Valor no válido. Por favor, ingrese un número entero.");
                        input.nextLine();
                    }
                    break;

                case 9:
                    seguir = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("por favor ingrese un valor valido...");
                    break;
            }
        }
    }
}
