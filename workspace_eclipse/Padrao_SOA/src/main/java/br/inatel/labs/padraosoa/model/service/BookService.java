package br.inatel.labs.padraosoa.model.service;

import br.inatel.labs.padraosoa.model.entity.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * Spring Service to retrieve Book objects from DB
 * @author isaquehg
 * @version 1.0
 * @since 7/11/23
 */
@Service
public class BookService {

    private List<Book> bookList = new ArrayList<>();

    /**
     * Callback method for Spring calling, to seed BookList
     */
    @PostConstruct
    private void seed(){
        Book b1 = new Book(1L, "Delphin Blanco", "Stories");
        Book b2 = new Book(2L, "Sherlock Holmes Collection", "Mistery");
        Book b3 = new Book(3L, "Python for Beginners", "Programming");
        Book b4 = new Book(4L, "Physics IV", "Physics");

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
    }

    /**
     * Retrieve Books
     * @return List of Book
     */
    public List<Book> findAll(){
        return this.bookList;
    }

    /**
     * Retrieve specific book by ID
     * @param id Book id from path vatiable
     * @return Book object to Controller
     */
    public Optional<Book> findById(Long id){
        return this.bookList
                .stream()
                .filter( b -> b.getId().equals(id) )
                .findFirst();
    }

    /**
     * Create a new Book and assign to BookList
     * @param book Book Object
     * @return New Book object created
     */
    public Book create(Book book){
        long genId = new Random().nextLong();
        book.setId(genId);
        this.bookList.add(book);
        return book;
    }

}
