package com.gshepur.quoteservice.controller;

import com.gshepur.entity.Author;
import com.gshepur.quoteservice.service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("authors")
@Api(value = "authors", description = "Operations pertaining to authors")
public class AuthorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthorController.class);
    @Autowired
    private AuthorService authorService;

    @ApiOperation(value = "View a list of available products",response = Iterable.class)
    @GetMapping("/")
    public Iterable<Author> getAuthors(){
        LOGGER.info("Request to fetch all authors");
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable int id){
        LOGGER.info("Request to fetch  author by ID:{}", id);
        return authorService.getAuthorById(id);
    }

    @PostMapping("/")
    public Author createAuthor(@RequestBody Author author){

        return authorService.createAuthor(author);
    }
}
