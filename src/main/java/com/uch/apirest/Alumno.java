package com.uch.apirest;

public class Alumno {
    private String nombre;
    private String apellido;
    private int añoNacimiento;

    // Constructor
    public Alumno(String nombre, String apellido, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoNacimiento = añoNacimiento;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimientoo) {
        this.añoNacimiento = añoNacimiento;
    }

    // toString method (optional but useful for debugging)
    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + nombre + '\'' +
                ", modelo='" + apellido + '\'' +
                ", año=" + añoNacimiento +
                '}';
    }
}
