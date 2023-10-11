package com.edu.icesi.LibraryManagement.service;

import com.edu.icesi.LibraryManagement.persistence.model.Author;

import java.util.List;

public interface IAuthorService {

    List<Author> getAll();

}
