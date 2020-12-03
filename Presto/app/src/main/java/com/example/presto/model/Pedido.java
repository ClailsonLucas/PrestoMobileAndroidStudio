package com.example.presto.model;

import java.util.List;

public class Pedido {

    private long id;

    private Mesa mesa;

    private String descricao;

    private double valorTotal;

    private long maiorTempo;

    private long tempoIdeal;

    private List<Produto> itensDoPedido;

    public Pedido() {
    }

    public Pedido(long id, Mesa mesa, String descricao, double valorTotal) {
        this.id = id;
        this.mesa = mesa;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public long getMaiorTempo() {
        return maiorTempo;
    }

    public void setMaiorTempo(long maiorTempo) {
        this.maiorTempo = maiorTempo;
    }

    public long getTempoIdeal() {
        return tempoIdeal;
    }

    public void setTempoIdeal(long tempoIdeal) {
        this.tempoIdeal = tempoIdeal;
    }

    public List<Produto> getItensDoPedido() {
        return itensDoPedido;
    }

    public void setItensDoPedido(List<Produto> itensDoPedido) {
        this.itensDoPedido = itensDoPedido;
    }
}
