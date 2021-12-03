package com.duoc.models;

public class Usuario {

    private String nombreUsuario;
    private String password;
    private String cargo;

    public Usuario(String nombreUsuario, String password, String cargo) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.cargo = cargo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
