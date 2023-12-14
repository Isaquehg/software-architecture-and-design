package javaAvancado;

/**
 * Class to represent Products objects using Java Bean model
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 21/08/2023
 */
public class Produto {
    /**
     * Product's properties
     */
    private Long id;
    private String descricao;
    private Double preco;

    public Produto(Long id, String descricao, Double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    /**
     * toString implementation to print objects
     * @return object's properties
     */
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
