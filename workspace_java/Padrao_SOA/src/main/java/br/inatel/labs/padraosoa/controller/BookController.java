package br.inatel.labs.padraosoa.controller;

import br.inatel.labs.padraosoa.model.entity.Book;
import br.inatel.labs.padraosoa.model.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

/**
 * Spring Controller using BookService to retrieve the books
 * @author isaquehg
 * @version 1.0
 * @since 7/11/23
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service; // Dependency injection

    /**
     * Retrieve all books
     * @return List of Book
     */
    @GetMapping
    public List<Book> getAllBooks(){
        return this.service.findAll();
    }

    /**
     * Retrieve book with given id in path
     * @param id Book ID
     * @return Book Object
     */
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id){ // Assigning path variable to method parameter
        Optional<Book> optionalBook = this.service.findById(id);

        // Unpack optional if a book is present
        if(optionalBook.isPresent()){
            return optionalBook.get();
        }

        // Client HTTP error
        throw new ResponseStatusException(HttpStatusCode.valueOf(404), "Book id not found");
    }

    /**
     * POST endpoint for Book object creation
     * @param book Book object from request body
     * @return Book created
     */
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Book postBook(@RequestBody Book book){
        return this.service.create(book);
    }

}
