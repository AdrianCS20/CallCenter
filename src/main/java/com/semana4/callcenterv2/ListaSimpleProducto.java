/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class ListaSimpleProducto {
    private NodoListaSimpleProducto primero;
    private NodoListaSimpleProducto ultimo;
    private boolean bandera = false;
    public ListaSimpleProducto() {}

    public void ingresarProductoFinal(Producto producto) {
        NodoListaSimpleProducto nodoNuevo = new NodoListaSimpleProducto();
        nodoNuevo.setProducto(producto);
        if (primero == null) {
            primero = nodoNuevo;
            primero.setSiguiente(null);
            ultimo = primero;
        } else {
            ultimo.setSiguiente(nodoNuevo);
            nodoNuevo.setSiguiente(null);
            ultimo = nodoNuevo;
        }
    }

    public Producto buscarProducto(int idProducto) {
        NodoListaSimpleProducto actual;
        actual = primero;
        bandera = false;
        while (actual != null) {
            if (actual.getProducto().getIdProducto() == idProducto) {
                bandera = true;
                return actual.getProducto();
            }
            actual = actual.getSiguiente();
        }
        if (bandera == false) {
            System.out.println("Producto no encontrado");
            return null;
        }
        return null;
    }

    public void modificarProducto(int idProductoBuscar, Producto productoReemplazar) {
        NodoListaSimpleProducto actual = primero;
        while (actual != null) {
            if (actual.getProducto().getIdProducto() == idProductoBuscar) {
                actual.setProducto(productoReemplazar);
            }
            actual = actual.getSiguiente();
        }
    }

    public void eliminarProducto(int idProducto) {
        NodoListaSimpleProducto actual = primero;
        NodoListaSimpleProducto anterior = null;

        while (actual != null) {
            if (actual.getProducto().getIdProducto() == idProducto) {
                if (actual == primero) {
                    primero = primero.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                System.out.println("Producto eliminado");
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
    }

    public void imprimirListaProducto() {
        NodoListaSimpleProducto actual = primero;

        while (actual != null) {
            System.out.println(actual.getProducto());
            actual = actual.getSiguiente();
        }
    }

    public int Size() {
        int size = 0;
        NodoListaSimpleProducto actual;
        actual = primero;

        while (actual != null) {
            size++;
            actual = actual.getSiguiente();
        }
        return size;
    }
}
