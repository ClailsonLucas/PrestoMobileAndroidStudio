package com.example.presto.model;

import java.util.List;

public class Produto {

    private long id;

    private Cardapio cardapio;

    private List<Pedido> pedidos;
    private String nome;
    private String tipo;
    private String descricao;

    private Integer tempo;
    private String imagem;

    private double valor;

    private Integer quantidadeEstoque;

    private Integer contador = 0;

    private long cardapio_id;

    private Usuario produtoUsuario;

    public Produto() {
    }

    public Produto(String nome, String tipo, String descricao, Integer tempo, String imagem, Integer quantidadeEstoque, long cardapio_id) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.tempo = tempo;
        this.imagem = imagem;
        this.quantidadeEstoque = quantidadeEstoque;
        this.cardapio_id = cardapio_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cardapio getCardapio() {
        return cardapio;
    }

    public void setCardapio(Cardapio cardapio) {
        if(cardapio==null) {
            this.cardapio_id = 0;
            this.cardapio = cardapio;
        }else if (cardapio!= null){
            this.cardapio_id = cardapio.getId();
            this.cardapio = cardapio;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

    public long getCardapio_id() {
        return cardapio_id;
    }

    public void setCardapio_id(long cardapio_id) {
        this.cardapio_id = cardapio_id;
    }

    public Usuario getProdutoUsuario() {
        return produtoUsuario;
    }

    public void setProdutoUsuario(Usuario produtoUsuario) {
        this.produtoUsuario = produtoUsuario;
    }
}
