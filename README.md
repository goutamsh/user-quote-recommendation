# User Quote recommendation

## Steps to configure database: 
1. Install MySQL Database

2. Create database (below commands)

    create database db_quote; -- Create the new database
    
    create user 'quoteuser'@'%' identified by 'quotepassword'; -- Creates the user
    
    grant all on db_quote.* to 'quoteuser'@'%'; -- Gives all the privileges to the new user on the newly created database
3. Use below configuration in application.properties file
        
        spring.jpa.hibernate.ddl-auto=update
        
        spring.datasource.url=jdbc:mysql://localhost:3306/db_quote?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
        
        spring.datasource.username=quoteuser
        
        spring.datasource.password=quotepassword


## DAO Layer Unit testing

* Used H2 in-memory DB for testing repository layer
* Created [*persistence-user-quote.properties*](https://github.com/goutamsh/user-quote-recommendation/blob/master/user-quote-common/src/test/resources/persistence-user-quote.properties) under /src/test/resources folder
* Created [*UserQuoteTestConfig.java*](https://github.com/goutamsh/user-quote-recommendation/blob/master/user-quote-common/src/test/java/com/gshepur/dao/UserQuoteTestConfig.java) bean config file in /src/test
* Finally Junit tests in [*AuthorDaoTest.java*](https://github.com/goutamsh/user-quote-recommendation/blob/master/user-quote-common/src/test/java/com/gshepur/dao/AuthorDaoTest.java)
## Issues Faced while developing

* Issue with infinite recursion when fetching  hibernate one to many relationship
    - Used @JsonIgnoreProperties which ignores the properties fetching recursively by jackson when populating the child properties
* Connection issue with DB because of timezone setting.
    - Resolved by appending timezone setting in connection url like "?serverTimezone=UTC"
   