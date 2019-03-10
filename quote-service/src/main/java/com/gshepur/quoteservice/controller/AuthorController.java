package com.gshepur.quoteservice.controller;

import com.gshepur.entity.Author;
import com.gshepur.quoteservice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/")
    public Iterable<Author> getAuthors(){
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable int id){
        return authorService.getAuthorById(id);
    }

    @PostMapping("/")
    public Author createAuthor(@RequestBody Author author){

        return authorService.createAuthor(author);
    }
}
