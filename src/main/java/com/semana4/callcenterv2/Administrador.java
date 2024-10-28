package com.semana4.callcenterv2;

public class Administrador extends Persona {
    private String tipoAdministrador;
    private String funciones;
    private String estadoAdministrador;

    public Administrador(int cedulaAdministrador, String nombreAdministrador, String tipoAdministrador, String funciones, String estadoAdministrador, String apellidoAdministrador) {
        super(nombreAdministrador, apellidoAdministrador, cedulaAdministrador);
        this.tipoAdministrador = tipoAdministrador;
        this.funciones = funciones;
        this.estadoAdministrador = estadoAdministrador;
    }


    @Override
    public String toString() {
        return "Administrador{" + "cedulaAdministrador=" + super.getCedula() + ", nombreAdministrador=" +
                super.getNombre() + "Apellido administrador: " + super.getApellido() + ", tipoAdministrador="
                + tipoAdministrador + ", funciones=" + funciones + ", estadoAdministrador=" + estadoAdministrador + '}';
    }
}
