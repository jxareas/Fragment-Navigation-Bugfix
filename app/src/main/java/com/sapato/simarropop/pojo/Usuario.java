package com.sapato.simarropop.pojo;

import java.util.List;

public class Usuario {
    private long id;
    private String nombre;
    private String apellidos;
    private String ubicacion;
    private String contrasenya;
    private String avatar;
    private List<Articulo> listaArticulos;
    private List<Mensaje> mensajesEmisor;
    private List<Mensaje> mensajesReceptor;

    public Usuario(){

    }

    public Usuario(long id, String nombre, String apellidos, String ubicacion, String contrasenya, String avatar, List<Articulo> listaArticulos, List<Mensaje> mensajesEmisor, List<Mensaje> mensajesReceptor) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ubicacion = ubicacion;
        this.contrasenya = contrasenya;
        this.avatar = avatar;
        this.listaArticulos = listaArticulos;
        this.mensajesEmisor = mensajesEmisor;
        this.mensajesReceptor = mensajesReceptor;
    }

    public Usuario(String nombre, String apellidos, String ubicacion, String contrasenya, String avatar, List<Articulo> listaArticulos, List<Mensaje> mensajesEmisor, List<Mensaje> mensajesReceptor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ubicacion = ubicacion;
        this.contrasenya = contrasenya;
        this.avatar = avatar;
        this.listaArticulos = listaArticulos;
        this.mensajesEmisor = mensajesEmisor;
        this.mensajesReceptor = mensajesReceptor;
    }

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(List<Articulo> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    public List<Mensaje> getMensajesEmisor() {
        return mensajesEmisor;
    }

    public void setMensajesEmisor(List<Mensaje> mensajesEmisor) {
        this.mensajesEmisor = mensajesEmisor;
    }

    public List<Mensaje> getMensajesReceptor() {
        return mensajesReceptor;
    }

    public void setMensajesReceptor(List<Mensaje> mensajesReceptor) {
        this.mensajesReceptor = mensajesReceptor;
    }
}