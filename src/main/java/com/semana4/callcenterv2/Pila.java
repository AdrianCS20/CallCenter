/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class Pila {
    private NodoPila cima;
    public Pila() {
        this.cima = null;
    }
    public void apilar(NodoArbol nodo) {
        NodoPila nuevoNodo = new NodoPila(nodo);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }
    public NodoArbol verCima() {
        if (cima == null) {
            return null;
        }
        return cima.dato;
    }
}
