/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

import java.util.Date;
public class Tiquete {
    private int idTiquete;
    private int cedulaCliente; 
    private String descripcionTiquete;
    private String estadoTiquete;
    private int cedulaDigitadorAtendio;
    private String fechaAtencion;
    private String fechaRespuesta;
    private Date date = new Date();
    private Producto producto;
    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public Tiquete(int idTiquete, int cedulaCliente, String descripcionTiquete, String estadoTiquete, int cedulaDigitadorAtendio, String fechaAtencion, Producto producto) {
        this.idTiquete = idTiquete;
        this.cedulaCliente = cedulaCliente;
        this.descripcionTiquete = descripcionTiquete;
        this.estadoTiquete = estadoTiquete;
        this.cedulaDigitadorAtendio = cedulaDigitadorAtendio;
        this.fechaAtencion = fechaAtencion;
        this.fechaRespuesta = date.toString();
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "idTiquete=" + idTiquete + ", cedulaCliente=" + cedulaCliente + ", descripcionTiquete=" + descripcionTiquete
                + ", estadoTiquete=" + estadoTiquete + ", cedulaDigitadorAtendio=" + cedulaDigitadorAtendio + ", fechaAtencion=" + fechaAtencion
                + ", fechaRespuesta=" + fechaRespuesta + "Producto: " + producto.toString() + '}';
    }
}
