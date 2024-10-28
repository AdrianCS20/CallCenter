/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.semana4.callcenterv2;

public class Persona {
    private String nombre;
    private String apellido;
    private int cedula;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getCedula() {
        return cedula;
    }

    public Persona(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
}
