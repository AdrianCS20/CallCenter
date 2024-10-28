/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class NodoArbol {
    private Solicitud info;
    private NodoArbol izq;
    private NodoArbol der;
    public Solicitud getInfo() {
        return info;
    }
    public void setInfo(Solicitud info) {
        this.info = info;
    }
    public NodoArbol getIzq() {
        return izq;
    }
    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }
    public NodoArbol getDer() {
        return der;
    }
    public void setDer(NodoArbol der) {
        this.der = der;
    }
}
