/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsc.fln.model.domain;

/**
 *
 * @author mpisc
 */
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    
    private Categoria categoria;
//    
//    public Produto() {
//        
//    }
    /**
     * Método para construir um objeto produto conhecendo o seu id
     * @param id 
     */
    public Produto(int id) {
        this.id = id;
    }

    /**
     * Método ....
     * @param id é id obrigatório do produto que deve ser difeente de zero......
     * @param nome uma string que condiz .....
     */
    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    
    public Produto(int id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public void setPreco(double preco) {
        if (preco < 0.0) {
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", categoria=" + categoria + '}';
    }
    
}
