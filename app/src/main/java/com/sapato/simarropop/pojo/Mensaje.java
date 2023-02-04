package com.sapato.simarropop.pojo;

import java.sql.Timestamp;

public class Mensaje {
    private long id;
    private String contenido;
    private Timestamp hora;
    private Usuario usuarioEmisor;
    private Usuario usuarioReceptor;

    public Mensaje(){}

    public Mensaje(long id, String contenido, Timestamp hora, Usuario usuarioEmisor, Usuario usuarioReceptor) {
        this.id = id;
        this.contenido = contenido;
        this.hora = hora;
        this.usuarioEmisor = usuarioEmisor;
        this.usuarioReceptor = usuarioReceptor;
    }

    public Mensaje(String contenido, Timestamp hora, Usuario usuarioEmisor, Usuario usuarioReceptor) {
        this.contenido = contenido;
        this.hora = hora;
        this.usuarioEmisor = usuarioEmisor;
        this.usuarioReceptor = usuarioReceptor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }

    public Usuario getUsuarioEmisor() {
        return usuarioEmisor;
    }

    public void setUsuarioEmisor(Usuario usuarioEmisor) {
        this.usuarioEmisor = usuarioEmisor;
    }

    public Usuario getUsuarioReceptor() {
        return usuarioReceptor;
    }

    public void setUsuarioReceptor(Usuario usuarioReceptor) {
        this.usuarioReceptor = usuarioReceptor;
    }
}