package com.gshepur.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    @ApiModelProperty(notes = "The database generated ID")
    private Integer id;

    @Column(name = "first_name")
    @ApiModelProperty(notes = "First name")
    private String firstName;


    @Column(name = "last_name")
    @ApiModelProperty(notes = "Last name")
    private String lastName;

    @Column(name = "email_id")
    @ApiModelProperty(notes = "Email ID")
    private String emailId;

    @ManyToMany
    @JoinTable(name = "user_category" ,
            joinColumns = {@JoinColumn(name= "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")}
    )
    @JsonIgnoreProperties(value = {"users"}, allowSetters = true)
    @ApiModelProperty(notes = "Categories")
    private Set<Category> categories = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
