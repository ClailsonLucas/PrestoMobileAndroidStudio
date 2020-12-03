package com.example.presto.model;

public class Mesa {

    private long id;

    private String nome;

    private Pedido pedido;

    private Usuario mesaUsuario;

    public Mesa() {
    }

    public Mesa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Usuario getMesaUsuario() {
        return mesaUsuario;
    }

    public void setMesaUsuario(Usuario mesaUsuario) {
        this.mesaUsuario = mesaUsuario;
    }
}
