
Install MySQL Database

Create database

mysql> create database db_quote; -- Create the new database
mysql> create user 'quoteuser'@'%' identified by 'quotepassword'; -- Creates the user
mysql> grant all on db_quote.* to 'quoteuser'@'%'; -- Gives all the privileges to the new user on the newly created database

