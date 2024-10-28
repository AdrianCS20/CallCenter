/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class NodoListaSimpleProducto {
    private Producto producto;
    private NodoListaSimpleProducto siguiente;
    public NodoListaSimpleProducto() {}
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public NodoListaSimpleProducto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimpleProducto siguiente) {
        this.siguiente = siguiente;
    }
}
