/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class NodoCola {
    private Solicitud solicitud;
    private NodoCola siguiente;

    public NodoCola(Solicitud dato) {
        this.solicitud = dato;
        this.siguiente = null;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }
    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
}
