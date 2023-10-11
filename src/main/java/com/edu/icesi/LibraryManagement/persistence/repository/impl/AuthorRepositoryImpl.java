package com.edu.icesi.LibraryManagement.persistence.repository.impl;

import com.edu.icesi.LibraryManagement.persistence.model.Author;
import com.edu.icesi.LibraryManagement.persistence.model.Book;
import com.edu.icesi.LibraryManagement.persistence.repository.IAuthorRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AuthorRepositoryImpl implements IAuthorRepository {

    List<Author> authors = new ArrayList<>();

    public AuthorRepositoryImpl(){};

    @Override
    public List<Author> getAllAuthors() {
        return null;
    }

    @Override
    public Optional<Author> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Author saveAuthor(Author author) {
        return null;
    }

    @Override
    public Boolean uploadAuthor(Long id, Author author) {
        return null;
    }

    @Override
    public Boolean deleteAuthor(Long id) {
        return null;
    }

    @Override
    public List<Book> getBookOfAuthor(Long id) {
        return null;
    }
}
