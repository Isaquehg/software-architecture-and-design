package br.inatel.labs.padraomvc.model.entity;

/**
 * Class for product representation
 * @author Isaque
 * @version 1.0
 * @since 30/10/23
 */
public class Produto {

    private Long id;
    private String descricao;
    private Double preco;

    public Produto(long id, String descricao, Double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
