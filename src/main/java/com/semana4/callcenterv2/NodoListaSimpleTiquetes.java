/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class NodoListaSimpleTiquetes {
    private Tiquete tiquete;
    private NodoListaSimpleTiquetes siguiente;
    public NodoListaSimpleTiquetes() {}
    public Tiquete getTiquete() {
        return tiquete;
    }
    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public NodoListaSimpleTiquetes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimpleTiquetes siguiente) {
        this.siguiente = siguiente;
    }
}
