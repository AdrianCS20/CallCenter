package com.semana4.callcenterv2;

public class CallCenter {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Cliente cliente = new Cliente(1, "pablo", (short) 20, "San Jose", "San pedro por la UCR", 72349012, "a");
        menu.lsClientes.ingresarClienteFinal(cliente);

        Digitador digitador = new Digitador("a", "a", "a", "a", "pablo", "ruiz", 5);
        menu.lsDigitador.ingresarDigitadorFinal(digitador);

        Producto producto1 = new Producto(0, "Movil, ipad o similares");
        Producto producto2 = new Producto(1, "computador (escritorio, laptop o similares)");
        Producto producto3 = new Producto(2, "Externo (Impresora, Perifericos o similares");
        menu.lsProducto.ingresarProductoFinal(producto1);
        menu.lsProducto.ingresarProductoFinal(producto2);
        menu.lsProducto.ingresarProductoFinal(producto3);

        Solicitud solicitud = new Solicitud("a", "1", 0, 1, producto1);
        menu.solicitudes.add(solicitud);

        menu.menu();
    }
}
