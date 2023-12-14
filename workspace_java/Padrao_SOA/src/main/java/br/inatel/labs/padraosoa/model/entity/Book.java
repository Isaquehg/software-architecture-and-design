package br.inatel.labs.padraosoa.model.entity;

import java.util.Objects;

/**
 * Spring Model Entity to represent Book, with getters, setters, hashCode and equals
 * @author isaquehg
 * @version 1.0
 * @since 7/11/23
 */
public class Book {

    private Long id;
    private String title;
    private String category;

    public Book(Long id, String title, String category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
