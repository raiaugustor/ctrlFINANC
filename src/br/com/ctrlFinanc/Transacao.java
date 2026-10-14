package br.com.ctrlFinanc;// Abstrata

import java.util.Objects;

public abstract class Transacao {

    private double valor;
    private String id;
    private String descricao;
    private Categoria categoria;

    public Transacao(double valor, String id, String descrição, Categoria categoria){
        this.valor = valor;
        this.descricao = descrição;
        this.id = id;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = Objects.requireNonNull(categoria, "A transacao deve corresponder a uma categoria!");
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}
