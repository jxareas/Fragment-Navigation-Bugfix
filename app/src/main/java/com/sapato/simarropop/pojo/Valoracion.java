package com.sapato.simarropop.pojo;

public class Valoracion {
    private long id;
    private int estrellas;
    private String opinion;
    private Usuario usuario;

    public Valoracion(long id, int estrellas, String opinion, Usuario usuario) {
        this.id = id;
        this.estrellas = estrellas;
        this.opinion = opinion;
        this.usuario = usuario;
    }

    public Valoracion(int estrellas, String opinion, Usuario usuario) {
        this.estrellas = estrellas;
        this.opinion = opinion;
        this.usuario = usuario;
    }

    public Valoracion(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
