package com.sapato.simarropop.pojo;


public class Articulo {
    private long id;
    private String titulo;
    private int likes;
    private String descripcion;
    private float precio;
    private boolean estado;
    private Usuario usuario;

    public Articulo(long id, String titulo, int likes, String descripcion, float precio, boolean estado, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.likes = likes;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        this.usuario = usuario;
    }

    public Articulo(String titulo, int likes, String descripcion, float precio, boolean estado, Usuario usuario) {
        this.titulo = titulo;
        this.likes = likes;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}