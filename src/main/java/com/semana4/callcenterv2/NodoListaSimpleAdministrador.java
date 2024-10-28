/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class NodoListaSimpleAdministrador {
    private Administrador administrador;
    private NodoListaSimpleAdministrador siguiente;
    public NodoListaSimpleAdministrador() {}
    public Administrador getAdministrador() {
        return administrador;
    }
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public NodoListaSimpleAdministrador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimpleAdministrador siguiente) {
        this.siguiente = siguiente;
    }
}
