/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

import java.util.Date;
public class Solicitud {
    private int idSolicitud;
    private String descripcion;
    private String estadoSolicitud;
    private String caracteristicas;
    private String observacionesSolicitud;
    private String fecha;
    private int cedulaCliente;
    private Producto producto;

    public Solicitud(String descripcion, String caracteristicas, int idSolicitud, int cedula, Producto producto) {
        this.descripcion = descripcion;
        this.estadoSolicitud = "en espera";
        this.caracteristicas = caracteristicas;
        this.fecha = new Date().toString();
        this.idSolicitud = idSolicitud;
        this.observacionesSolicitud = "no hay observaciones";
        this.cedulaCliente = cedula;
        this.producto = producto;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }
    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }
    public void setObservacionesSolicitud(String observacionesSolicitud) {
        this.observacionesSolicitud = observacionesSolicitud;
    }

    public String getFecha() {
        return fecha;
    }
    public int getCedulaCliente() {
        return cedulaCliente;
    }
    public Producto getProducto() { return producto;}

    @Override
    public String toString() {
        return "Solicitud{" + "idSolicitud=" + idSolicitud + ", descripcion=" + descripcion +
                ", estadoSolicitud=" + estadoSolicitud + ", caracteristicas=" + caracteristicas +
                ", observacionesSolicitud=" + observacionesSolicitud + ", fecha=" + fecha + ", cedula: " + cedulaCliente +
                "Producto: " + producto.toString() + '}';
    }
}
