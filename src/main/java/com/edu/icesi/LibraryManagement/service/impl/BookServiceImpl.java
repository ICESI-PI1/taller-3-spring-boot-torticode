package com.edu.icesi.LibraryManagement.service.impl;

import com.edu.icesi.LibraryManagement.persistence.model.Book;
import com.edu.icesi.LibraryManagement.service.IBookRepository;

import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements IBookRepository {



    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Book saveBook(Book book) {
        return null;
    }

    @Override
    public Boolean uploadBook(Long id, Book book) {
        return null;
    }

    @Override
    public Boolean deleteBook(Long id) {
        return null;
    }
}