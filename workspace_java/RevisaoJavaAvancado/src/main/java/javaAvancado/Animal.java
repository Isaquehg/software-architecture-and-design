package javaAvancado;

import java.util.Objects;

/**
 * Class to represent Animal objects using Java Bean model
 *  * @author Isaquehg
 *  * @version 1.0
 *  * @since 21/08/2023
 */
public class Animal {
    /**
     * Animal object properties
     */
    private Long id;
    private String nome;

    public Animal(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    /**
     * toString implementation to print objects
     * @return object's properties
     */
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    /**
     * Checking equality
     * @param o Animal object to be compared
     * @return boolean value to check if it's the same one
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(id, animal.id);
    }

    /**
     * Auxiliar function to generate hash for comparing
     * @return hash id
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
