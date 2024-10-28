/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class ListaSimpleDigitador {
    private NodoListaSimpleDigitador primero;
    private NodoListaSimpleDigitador ultimo;
    private boolean bandera = false;

    public ListaSimpleDigitador() {
    }

    public boolean vacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void ingresarDigitadorFinal(Digitador digitador) {
        NodoListaSimpleDigitador nodoNuevo = new NodoListaSimpleDigitador();
        nodoNuevo.setDigitador(digitador);
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

    public boolean buscarDigitador(int cedulaDigitador) {
        NodoListaSimpleDigitador actual;
        actual = primero;
        bandera = false;
        while (actual != null) {
            if (actual.getDigitador().getCedula() == cedulaDigitador) {
                System.out.println("Digitador encontrado");
                bandera = true;
                return true;
            }
            actual = actual.getSiguiente();
        }
        if (bandera == false) {
            System.out.println("Digitador no encontrado");
            return false;
        }
        return false;
    }

    public void modificarDigitador(int cedulaDigitadorBuscar, Digitador digitadorReemplazar) {
        NodoListaSimpleDigitador actual = primero;
        while (actual != null) {
            if (actual.getDigitador().getCedula() == cedulaDigitadorBuscar) {
                actual.setDigitador(digitadorReemplazar);
            }
            actual = actual.getSiguiente();
        }
    }

    public void eliminarDigitador(int cedulaDigitador) {
        NodoListaSimpleDigitador actual = primero;
        NodoListaSimpleDigitador anterior = null;

        while (actual != null) {
            if (actual.getDigitador().getCedula() == cedulaDigitador) {
                if (actual == primero) {
                    primero = primero.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                System.out.println("Digitador eliminado");
            }
            anterior = actual;
            actual = actual.getSiguiente();
        }
    }

    public void imprimirListaDigitador() {
        NodoListaSimpleDigitador actual = primero;

        while (actual != null) {
            System.out.println(actual.getDigitador());
            actual = actual.getSiguiente();
        }
    }

    public boolean ExisteDigitador(int cedulaDigitador) {
        NodoListaSimpleDigitador actual;
        actual = primero;
        bandera = false;
        while (actual != null) {
            if (actual.getDigitador().getCedula() == cedulaDigitador) {
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
