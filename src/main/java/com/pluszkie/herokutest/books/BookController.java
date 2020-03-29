package com.pluszkie.herokutest.books;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    @ResponseBody
    List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @PostMapping(value = "/books", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }


}
