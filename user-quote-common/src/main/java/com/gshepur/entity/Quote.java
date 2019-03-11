package com.gshepur.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "quote")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "quote_id")
    private Integer id;

    @Column(name = "quote_text")
    private String quoteText;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    @JsonIgnoreProperties(value =  {"quotes"}, allowSetters=true)
    private Author author;

    @ManyToMany
    @JoinTable(name = "quote_category",
        joinColumns = {@JoinColumn(name = "quote_id")},
        inverseJoinColumns = {@JoinColumn(name = "category_id")})
    @JsonIgnoreProperties(value = {"quotes"}, allowSetters = true)
    private Set<Category> categories;

    @Column(name = "date")
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
