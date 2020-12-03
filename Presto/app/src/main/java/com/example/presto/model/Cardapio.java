package com.example.presto.model;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private long id;

    private String nome;

    private Usuario cardapioUsuario;

    private List<Produto> produtos = new ArrayList<>();

    public Cardapio() {
    }

    public Cardapio(String nome) {
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

    public Usuario getCardapioUsuario() {
        return cardapioUsuario;
    }

    public void setCardapioUsuario(Usuario cardapioUsuario) {
        this.cardapioUsuario = cardapioUsuario;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
