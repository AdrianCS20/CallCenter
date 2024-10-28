/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class ListaSimpleClientes {
    private NodoListaSimpleClientes primero;
    private NodoListaSimpleClientes ultimo;
    private boolean bandera = false;
    public ListaSimpleClientes() {}

    public boolean vacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void ingresarClienteFinal(Cliente cliente) {
        NodoListaSimpleClientes nodoNuevo = new NodoListaSimpleClientes();
        nodoNuevo.setCliente(cliente);
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

    public boolean buscarClientes(int cedula) {
        NodoListaSimpleClientes actual;
        actual = primero;
        bandera = false;
        while (actual != null) {
            if (actual.getCliente().getCedula() == cedula) {
                System.out.println("Cliente encontrado");
                bandera = true;
                return true;
            }
            actual = actual.getSiguiente();
        }
        if (bandera == false) {
            System.out.println("Cliente no encontrado");
            return false;
        }
        return false;
    }

    public void modificarClientes(int cedulaBuscar, Cliente clienteReemplazar) {
        NodoListaSimpleClientes actual = primero;
        while (actual != null) {
            if (actual.getCliente().getCedula() == cedulaBuscar) {
                actual.setCliente(clienteReemplazar);
            }
            actual = actual.getSiguiente();
        }
    }

    public void eliminarClientes(int cedulaCliente) {
        NodoListaSimpleClientes actual = primero;
        NodoListaSimpleClientes anterior = null;

        while (actual != null) {
            if (actual.getCliente().getCedula() == cedulaCliente) {
                if (actual == primero) {
                    primero = primero.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                System.out.println("Cliente eliminado");
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
    }

    public void imprimirListaClientes() {
        NodoListaSimpleClientes actual = primero;

        while (actual != null) {
            System.out.println(actual.getCliente() + " ");
            actual = actual.getSiguiente();
        }
    }

    public void ImprimirCliente(int cedula) {
        NodoListaSimpleClientes actual = primero;

        while (actual != null) {
            if (actual.getCliente().getCedula() == cedula) {
                System.out.println(actual.getCliente());
            }
            actual = actual.getSiguiente();
        }
    }

    public boolean ExisteCliente(int cedula) {
        NodoListaSimpleClientes actual;
        actual = primero;
        bandera = false;
        while (actual != null) {
            if (actual.getCliente().getCedula() == cedula) {
                bandera = true;
                return true;
            }
            actual = actual.getSiguiente();
        }
        if (bandera == false) {
            return false;
        }
        return false;
    }
}
