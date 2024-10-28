/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class NodoListaSimpleClientes {
    private Cliente cliente;
    private NodoListaSimpleClientes siguiente;
    public NodoListaSimpleClientes() {}
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NodoListaSimpleClientes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimpleClientes siguiente) {
        this.siguiente = siguiente;
    }
}
