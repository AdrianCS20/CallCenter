/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class ListaSimpleAdministrador {
    private NodoListaSimpleAdministrador primero;
    private NodoListaSimpleAdministrador ultimo;
    private boolean bandera = false;

    public ListaSimpleAdministrador() {
    }

    public void ingresarAdministradorFinal(Administrador administrador) {
        NodoListaSimpleAdministrador nodoNuevo = new NodoListaSimpleAdministrador();
        nodoNuevo.setAdministrador(administrador);
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

    public boolean ExisteAdministrador(int cedulaAdministrador) {
        NodoListaSimpleAdministrador actual;
        actual = primero;
        bandera = false;
        while (actual != null) {
            if (actual.getAdministrador().getCedula() == cedulaAdministrador) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        if (!bandera) {
            return false;
        }
        return false;
    }

    public void modificarAdministrador(int cedulaAdminBuscar, Administrador administradorReemplazar) {
        NodoListaSimpleAdministrador actual = primero;
        while (actual != null) {
            if (actual.getAdministrador().getCedula() == cedulaAdminBuscar) {
                actual.setAdministrador(administradorReemplazar);
            }
            actual = actual.getSiguiente();
        }
    }

    public void eliminarAdministrador(int cedulaAdministrador) {
        NodoListaSimpleAdministrador actual = primero;
        NodoListaSimpleAdministrador anterior = null;

        while (actual != null) {
            if (actual.getAdministrador().getCedula() == cedulaAdministrador) {
                if (actual == primero) {
                    primero = primero.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                System.out.println("Administrador eliminado");
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
    }

    public void imprimirListaAdministrador() {
        NodoListaSimpleAdministrador actual = primero;

        while (actual != null) {
            System.out.println(actual.getAdministrador());
            actual = actual.getSiguiente();
        }
    }
}
