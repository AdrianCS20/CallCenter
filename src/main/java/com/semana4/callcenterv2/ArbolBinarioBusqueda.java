package com.semana4.callcenterv2;

public class ArbolBinarioBusqueda {
    NodoArbol raiz;
    int cantidad;
    int altura;
    Pila pilaEliminados = new Pila();

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public void insertar(Solicitud info) {
        if (!existe(info)) {
            NodoArbol nuevo = new NodoArbol();
            nuevo.setInfo(info);
            nuevo.setIzq(null);
            nuevo.setDer(null);

            if (raiz == null) {
                raiz = nuevo;
            } else {
                NodoArbol anterior = null, reco = raiz;
                while (reco != null) {
                    anterior = reco;
                    if (info.getIdSolicitud() < reco.getInfo().getIdSolicitud()) {
                        reco = reco.getIzq();  // Move left in the tree
                    } else {
                        reco = reco.getDer();  // Move right in the tree
                    }
                }
                if (info.getIdSolicitud() < anterior.getInfo().getIdSolicitud()) {
                    anterior.setIzq(nuevo);
                } else {
                    anterior.setDer(nuevo);
                }
            }
        }
    }

    public boolean existe(Solicitud info) {
        NodoArbol reco = raiz;
        while (reco != null) {
            if (info.getIdSolicitud() == reco.getInfo().getIdSolicitud()) {
                return true;
            } else if (info.getIdSolicitud() > reco.getInfo().getIdSolicitud()) {
                reco = reco.getDer();  // Move right in the tree
            } else {
                reco = reco.getIzq();  // Move left in the tree
            }
        }
        return false;
    }

    private void cantidad(NodoArbol reco) {
        if (reco != null) {
            cantidad++;
            cantidad(reco.getIzq());
            cantidad(reco.getDer());
        }
    }

    private void cantidadNodosHoja(NodoArbol reco) {
        if (reco != null) {
            if (reco.getIzq() == null && reco.getDer() == null) {
                cantidad++;
                cantidadNodosHoja(reco.getIzq());
                cantidadNodosHoja(reco.getDer());
            }
        }
    }

    private void retornarAltura(NodoArbol reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.getIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
                retornarAltura(reco.getDer(), nivel + 1);
            }
        }
    }

    private void imprimirPre(NodoArbol reco) {
        if (reco != null) {
            System.out.println(reco.getInfo() + " ");
            imprimirPre(reco.getIzq());
            imprimirPre(reco.getDer());
        }
    }

    public void imprimirPre() {
        imprimirPre(raiz);
        System.out.println();
    }

    private void imprimirSimetrico(NodoArbol reco) {
        if (reco != null) {
            imprimirSimetrico(reco.getIzq());
            System.out.println(reco.getInfo() + " ");
            imprimirSimetrico(reco.getDer());
        }
    }

    private void imprimirPost(NodoArbol reco) {
        if (reco != null) {
            imprimirPost(reco.getIzq());
            imprimirPost(reco.getDer());
            System.out.println(reco.getInfo() + " ");
        }
    }

    public boolean eliminarEnviarAPila(int dato) {
        NodoArbol aux = raiz;
        NodoArbol padre = null;
        boolean esHijoIzq = true;


        while (aux != null && aux.getInfo().getIdSolicitud() != dato) {
            padre = aux;
            if (dato < aux.getInfo().getIdSolicitud()) {
                esHijoIzq = true;
                aux = aux.getIzq();
            } else {
                esHijoIzq = false;
                aux = aux.getDer();
            }
        }

        if (aux == null) {
            return false; // No se encontró el nodo
        }

        // Guardar el nodo en la pila antes de eliminarlo
        pilaEliminados.apilar(aux);

        if (aux.getIzq() == null && aux.getDer() == null) {
            if (aux == raiz) {
                raiz = null;
            } else if (esHijoIzq) {
                padre.setIzq(null);
            } else {
                padre.setDer(null);
            }
        } else if (aux.getDer() == null) { // Solo tiene hijo izquierdo
            if (aux == raiz) {
                raiz = aux.getIzq();
            } else if (esHijoIzq) {
                padre.setIzq(aux.getIzq());
            } else {
                padre.setDer(aux.getIzq());
            }
        } else if (aux.getIzq() == null) { // Solo tiene hijo derecho
            if (aux == raiz) {
                raiz = aux.getDer();
            } else if (esHijoIzq) {
                padre.setIzq(aux.getDer());
            } else {
                padre.setDer(aux.getDer());
            }
        }
        // Caso 3: El nodo tiene dos hijos
        else {
            NodoArbol reemplazo = obtenerNodoRemplazo(aux);

            if (aux == raiz) {
                raiz = reemplazo;
            } else if (esHijoIzq) {
                padre.setIzq(reemplazo);
            } else {
                padre.setDer(reemplazo);
            }

            reemplazo.setIzq(aux.getIzq());
        }

        return true;
    }

    public NodoArbol obtenerNodoRemplazo(NodoArbol nodoRemp) {
        NodoArbol remplazarPadre = nodoRemp;
        NodoArbol remplazo = nodoRemp;
        NodoArbol aux = nodoRemp.getDer();
        while (aux != null) {
            remplazarPadre = remplazo;
            remplazo = aux;
            aux = aux.getIzq();
        }

        if (remplazo != nodoRemp.getDer()) {
            remplazarPadre.setIzq(remplazo.getDer());
            remplazo.setDer(nodoRemp.getDer());
        }
        System.out.println("el nodo es " + remplazo);
        return remplazo;
    }

    public String buscarPorTiquete(int idSolicitud) {
        NodoArbol reco = raiz;
        while (reco != null) {
            if (idSolicitud == reco.getInfo().getIdSolicitud()) {
                return "Solicitud encontrada: " + reco.getInfo().toString();
            } else if (idSolicitud > reco.getInfo().getIdSolicitud()) {
                reco = reco.getDer();
            } else {
                reco = reco.getIzq();
            }
        }
        return "No se encontró ninguna solicitud con el ID: " + idSolicitud;
    }

    public Pila getPilaEliminados() {
        return pilaEliminados;
    }
}
