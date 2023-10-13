package com.edu.icesi.LibraryManagement.controller;

import com.edu.icesi.LibraryManagement.persistence.model.Author;
import com.edu.icesi.LibraryManagement.persistence.model.Book;
import com.edu.icesi.LibraryManagement.service.IAuthorService;
import com.edu.icesi.LibraryManagement.service.IBookService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final IAuthorService authorService;
    private final IBookService bookService;

    public AuthorController(IAuthorService authorService, IBookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }
    @GetMapping("/autores")
    public List<Author> showAllAuthor(){
        return authorService.getAllAuthors();
    }
    @GetMapping("/autores/{id}")
    public Author showAuthor(@PathVariable Long id, Model model){
        return authorService.findById(id).orElse(null);
    }
    @PostMapping("/autores")
    public Author createAuthor(@RequestBody Author newAuthor){
        return authorService.saveAuthor(newAuthor);
    }

    @PutMapping("/autores/{id}")
    public Boolean uploadAuthor(@PathVariable Long id, Author uploadAuthor){
        return authorService.uploadAuthor(id, uploadAuthor);
    }
    @DeleteMapping("/autores/{id}")
    public Boolean deleteAuthor(@PathVariable Long id){
        return authorService.deleteAuthor(id);
    }

    @GetMapping("/autores/{id}/libros")
    public List<Book> showBooksByAuthor(@PathVariable Long idAuthor){
        return bookService.getBooksbyAuthor(idAuthor);
    }





}
