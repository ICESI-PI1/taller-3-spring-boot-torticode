package com.edu.icesi.LibraryManagement.controller;

import com.edu.icesi.LibraryManagement.persistence.model.Book;
import com.edu.icesi.LibraryManagement.service.IBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final IBookService bookService;
    public BookController(IBookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/libros")
    public List<Book> showAllBooks(){
        return bookService.getAllBooks();
    }

}
