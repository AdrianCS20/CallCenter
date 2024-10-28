package com.semana4.callcenterv2;

public class Cliente extends Persona {
    private short edad;
    private String ubicacion;
    private String direccion;
    private int telefono;

    public Cliente(int cedulaCliente, String nombreCliente, short edad, String ubicacion, String direccion, int telefono, String apellidoCliente) {
        super(nombreCliente, apellidoCliente, cedulaCliente);
        this.edad = edad;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return this.getNombre() + " " + this.getApellido();
    }

    @Override
    public String toString() {
        return "nombre: " + super.getNombre() + " apellido: " + super.getApellido() + " cedula: " + super.getCedula() + " edad: " + edad + " ubicacion: " + ubicacion + " direccion: " + direccion + " telefono: " + telefono;
    }
}
