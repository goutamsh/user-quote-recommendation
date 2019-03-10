

Steps: 
1. Install MySQL Database

2. Create database (below commands)

    create database db_quote; -- Create the new database
    
    create user 'quoteuser'@'%' identified by 'quotepassword'; -- Creates the user
    
    grant all on db_quote.* to 'quoteuser'@'%'; -- Gives all the privileges to the new user on the newly created database


# Issues Faced while developing:
1. Issue with infinite recursion when fetching  hibernate one to many relationship
    - Used @JsonIgnoreProperties which ignores the properties fetching recursively by jackson when populating the child properties