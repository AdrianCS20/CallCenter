/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class NodoListaSimpleDigitador {
    private Digitador digitador;
    private NodoListaSimpleDigitador siguiente;
    public NodoListaSimpleDigitador() {}
    public Digitador getDigitador() {
        return digitador;
    }
    public void setDigitador(Digitador digitador) {
        this.digitador = digitador;
    }

    public NodoListaSimpleDigitador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimpleDigitador siguiente) {
        this.siguiente = siguiente;
    }
}
