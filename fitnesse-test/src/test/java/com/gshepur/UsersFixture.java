package com.gshepur;

import com.google.gson.Gson;
import com.gshepur.entity.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class UsersFixture {

    private String firstName;

    private String lastName;

    private String emailId;

    private User user;

    private int id;

    public boolean createUser(){
        Client client = Client.create();

        WebResource webResource = client
                .resource("http://localhost:8091/users/");

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmailId(emailId);

        Gson gson = new Gson();

        String input = gson.toJson(user);

        ClientResponse response = webResource.type("application/json")
                .post(ClientResponse.class, input);

        user = response.getEntity(User.class);

        return true;
    }

    public int id(){
        return user.getId();
    }

    public boolean fetchUser(){

        Client client = Client.create();

        WebResource webResource = client
                .resource("http://localhost:8091/users/"+id);

        ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);

        user = response.getEntity(User.class);

        return true;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setId(int id) {
        this.id = id;
    }


    public static void main(String[] args) {

        UsersFixture usersFixture = new UsersFixture();
        usersFixture.setEmailId("3123");
        usersFixture.setFirstName("12321");
        usersFixture.setLastName("2e21");
        usersFixture.createUser();
    }

}
