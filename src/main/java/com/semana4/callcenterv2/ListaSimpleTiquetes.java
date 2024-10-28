/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class ListaSimpleTiquetes {
    private NodoListaSimpleTiquetes primero;
    private NodoListaSimpleTiquetes ultimo;
    public ListaSimpleTiquetes() {}

    public void ingresarTiqueteFinal(Tiquete solicitud) {
        NodoListaSimpleTiquetes nodoNuevo = new NodoListaSimpleTiquetes();
        nodoNuevo.setTiquete(solicitud);
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

    public void imprimirTiquetePorCliente(int id) {
        int size = 0;
        NodoListaSimpleTiquetes actual = primero;
        while (actual != null) {
            if (actual.getTiquete().getCedulaCliente() == id) {
                System.out.println(actual.getTiquete());
                size++;
            }
            actual = actual.getSiguiente();
        }
        System.out.println("el cliente tiene: " + size + " tiquetes asignados");
    }

    public void imprimirListaTiquetes() {
        NodoListaSimpleTiquetes actual = primero;

        while (actual != null) {
            System.out.println(actual.getTiquete());
            actual = actual.getSiguiente();
        }
    }
}
