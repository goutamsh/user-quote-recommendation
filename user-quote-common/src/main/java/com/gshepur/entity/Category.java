package com.gshepur.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    @ApiModelProperty(notes = "The database generated ID")
    private Integer id;

    @Column(name = "name")
    @ApiModelProperty(notes = "Category name")
    private String name;

    @Column(name = "create_date")
    @ApiModelProperty(notes = "Category date")
    private Date createDate;

    @ManyToMany(mappedBy = "categories")
    @JsonIgnoreProperties(value = {"categories"}, allowSetters = true)
    @ApiModelProperty(notes = "Category users")
    private Set<User> users = new HashSet<>();

    @ManyToMany(mappedBy = "categories")
    @JsonIgnoreProperties(value = {"categories"}, allowSetters = true)
    @ApiModelProperty(notes = "Category quotes")
    private Set<Quote> quotes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(Set<Quote> quotes) {
        this.quotes = quotes;
    }
}
