package com.semana4.callcenterv2;

public class ColaSolicitud {
    private NodoCola inicio, fin;

    public ColaSolicitud() {
        inicio = fin = null;
    }

    public boolean ColaVacia() {
        return inicio == null;
    }

    public void insertar(Solicitud soli) {
        NodoCola nuevo = new NodoCola(soli);
        if (ColaVacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
    }

    public Solicitud eliminar() {
        if (inicio == null) {
            throw new IllegalStateException("No se puede eliminar de una cola vacía");
        }
        Solicitud aux = inicio.getSolicitud();
        inicio = inicio.getSiguiente();
        return aux;
    }

    public int TamanoCola() {
        int size = 0;
        NodoCola actual = inicio;

        while (actual != null) {
            size++;
            actual = actual.getSiguiente();
        }
        return size;
    }

    public void imprimirSolicitudesAnuladas() {
        if (ColaVacia()) {
            System.out.println("No hay solicitudes anuladas.");
            return;
        }
        NodoCola actual = inicio;
        while (actual != null) {
            if (actual.getSolicitud().getEstadoSolicitud().equals("Anulada")) {
                System.out.println(actual.getSolicitud().toString());
            }
            actual = actual.getSiguiente();
        }
    }

    public void OrganizarCola() {
        if (inicio == null || inicio.getSiguiente() == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            NodoCola actual = inicio;

            while (actual.getSiguiente() != null) {
                NodoCola siguiente = actual.getSiguiente();

                if (actual.getSolicitud().getIdSolicitud() < siguiente.getSolicitud().getIdSolicitud()) {

                    Solicitud temp = actual.getSolicitud();
                    actual.setSolicitud(siguiente.getSolicitud());
                    siguiente.setSolicitud(temp);

                    swapped = true;
                }
                actual = siguiente;
            }
        } while (swapped);
    }
}

