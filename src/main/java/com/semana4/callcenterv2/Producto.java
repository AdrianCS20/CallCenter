/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class Producto {
    private int idProducto;
    private String descripcionProducto;
    private String estadoProducto;
    public Producto(int idProducto, String descripcionProducto) {
        this.idProducto = idProducto;
        this.descripcionProducto = descripcionProducto;
        this.estadoProducto = "no definido";
    }

    public Producto(int idProducto, String descripcionProducto, String estadoProducto) {
        this.idProducto = idProducto;
        this.descripcionProducto = descripcionProducto;
        this.estadoProducto = estadoProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", descripcionProducto=" + descripcionProducto + ", estadoProducto=" + estadoProducto + '}';
    }
}
