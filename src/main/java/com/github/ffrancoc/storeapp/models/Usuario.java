/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.ffrancoc.storeapp.models;

import java.util.Date;

/**
 *
 * @author niruc
 */
public class Usuario {

    private Integer id;
    private String login;
    private String nombre;
    private String apellido;
    private String clave;
    private String telefono;
    private Date creacion;
    private Date modificacion;
    private String estado;

    public Usuario(Integer id, String login, String nombre, String apellido, String clave, String telefono, Date creacion, Date modificacion, String estado) {
        this.id = id;
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.telefono = telefono;
        this.creacion = creacion;
        this.modificacion = modificacion;
        this.estado = estado;
    }

    public Usuario(String login, String nombre, String apellido, String clave, String telefono) {
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Date getModificacion() {
        return modificacion;
    }

    public void setModificacion(Date modificacion) {
        this.modificacion = modificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n");
        sb.append("LOGIN: ").append(login).append("\n");
        sb.append("NOMBRE: ").append(nombre).append("\n");
        sb.append("APELLIDO: ").append(apellido).append("\n");
        sb.append("CLAVE(HASH): ").append(clave).append("\n");
        sb.append("TELEFONO: ").append(telefono).append("\n");
        sb.append("CREACION: ").append(creacion).append("\n");
        sb.append("MODIFICACION: ").append(modificacion).append("\n");
        sb.append("ESTADO: ").append(estado).append("\n");

        return sb.toString();
    }
}
