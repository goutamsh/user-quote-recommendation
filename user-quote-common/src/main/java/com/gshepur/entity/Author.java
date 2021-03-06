package com.gshepur.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    @ApiModelProperty(notes = "The database generated author ID")
    private Integer id;

    @Column(name = "name")
    @ApiModelProperty(notes = "Author name")
    private String name;

    @Column(name = "city")
    @ApiModelProperty(notes = "Author city")
    private String city;

    @Column(name = "country")
    @ApiModelProperty(notes = "Author country")
    private String country;

    @Column(name = "email_id")
    @ApiModelProperty(notes = "Author emailID")
    private String emailId;

    @OneToMany(mappedBy = "author")
    @JsonIgnoreProperties(value = {"author"}, allowSetters = true)
    @ApiModelProperty(notes = "Author quotes")
    private List<Quote> quotes;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }
}
