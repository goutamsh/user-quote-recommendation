package com.gshepur.quoteservice.service;

import com.gshepur.quoteservice.dao.AuthorDao;
import com.gshepur.quoteservice.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorDao authorDao;

    public Iterable<Author> getAllAuthors() {
        return authorDao.findAll();
    }

    public Optional<Author> getAuthorById(int id) {
        return authorDao.findById(id);
    }

    public Author createAuthor(Author author) {
        return authorDao.save(author);
    }
}
