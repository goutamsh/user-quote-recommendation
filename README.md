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

## Integration testing with FitNesse
* FitNesse is a wiki based tool for integration testing. 
* Consists of 2 test systems Fit and Slim. Slim is lightweight protocol compared to Fit. Here we have use Slim.
* We can define Test Suites and Test wiki pages.
* Integration tests are under [Fitnesse progect](https://github.com/goutamsh/user-quote-recommendation/tree/master/fitnesse-test)
* The integration tests are defined in wiki file [UserTest](https://github.com/goutamsh/user-quote-recommendation/blob/master/fitnesse-test/FitNesseRoot/UserServiceSuite/UserTest/content.txt)
* This actually refers to Fixture Java file Called [UserFixture](https://github.com/goutamsh/user-quote-recommendation/blob/master/fitnesse-test/src/test/java/com/gshepur/UsersFixture.java)
* UserFixture java class is nothing but a client to actual rest service. Passes the values from wiki to actual service and returns the response back, the output is then validated back in wiki file
* We have used FitNesse *maven-classpath-plugin* plugin for refrering to class path from pom.xml dependencies
* FitNesse standalone service is started by using *exec-maven-plugin* plugin
* The output of running integration tests can be found in [screnshot](https://github.com/goutamsh/user-quote-recommendation/blob/master/fitnesse-test/FitnesseOutputScrenshot.JPG)
* Steps to run FitNesse (Start user-service springboot application)
   * cd to fitnesse-test module
   * mvn exec:exec
   * Open local fitnesse webpage at http://localhost:9000/UserServiceSuite.UserTest
   * Click on Test button to run integration tests
   
## Api Documentation with Swagger
* Followed [link](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api) to setup swagger for rest endpoints
* Add below maven dependencies in pom.xml

        <dependency>
                <groupId>io.springfox</groupId>
                <artifactId>springfox-swagger2</artifactId>
                <version>2.9.2</version>
                <scope>compile</scope>
            </dependency>
            <dependency>
                <groupId>io.springfox</groupId>
                <artifactId>springfox-swagger-ui</artifactId>
                <version>2.9.2</version>
                <scope>compile</scope>
            </dependency>

* Add Swagger configuration [SwaggerConfig](https://github.com/goutamsh/user-quote-recommendation/blob/master/user-service/src/main/java/com/gshepur/userservice/config/SwaggerConfig.java)
* After starting springboot application we can access swagger json at

    http://localhost:8091/v2/api-docs
 
* Swagger UI can be accessed at 

    http://localhost:8091/swagger-ui.html
       

## Issues Faced while developing    

* Issue with infinite recursion when fetching  hibernate one to many relationship
    - Used @JsonIgnoreProperties which ignores the properties fetching recursively by jackson when populating the child properties
* Connection issue with DB because of timezone setting.
    - Resolved by appending timezone setting in connection url like "?serverTimezone=UTC"
   