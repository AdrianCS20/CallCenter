/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class Digitador extends Persona {
    private String tipoDigitador;
    private String observaciones;
    private String estadoDigitador;
    private String correo;

    public Digitador(String tipoDigitador, String observaciones, String estadoDigitador, String correo, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.tipoDigitador = tipoDigitador;
        this.observaciones = observaciones;
        this.estadoDigitador = estadoDigitador;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Digitador{" + "cedulaDigitador=" + super.getCedula() + ", nombreDigitador=" + super.getNombre() + ", apellidoDigitador: " + super.getApellido() + ", tipoDigitador=" + tipoDigitador + ", observaciones=" + observaciones + ", estadoDigitador=" + estadoDigitador + ", correo: " + correo + '}';
    }
}
