package com.gshepur.quoteservice.service;

import com.gshepur.quoteservice.dao.AuthorDao;
import com.gshepur.quoteservice.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorDao authorDao;

    public List<Author> getAllAuthors() {
        return null;
    }

    public Author getAuthorById(int id) {
        return null;
    }

    public Author createAuthor(Author author) {
        return null;
    }
}
