# Taxi-service

This is a demo application of drivers registration system where the driver can login and view all information
about available cars and drivers assigned to them. A new driver can register in the system.
The functionality include basic CRUD oprtaions.

### UML diagram that describes the relationship between the entities.

![uml2](https://user-images.githubusercontent.com/55792704/124461127-e9127300-dd98-11eb-9d16-1356bffe54f5.png)

### Key tools
+ JDBC, Java Servlets, JSP, HTML/CSS
+ MySQL
+ Maven, Tomcat

### Installation

+ To run the project on your local machine, clone this project into your local folder and open the project in an IDE.

+ Configure Tomcat Server and set up the MySQL DS and MySQL Workbench on your machine.

+ Replicate the database from the project by copying the script from init_db.sql into the MySQL Workbench query editor window.

+ Insert your own MySQL username and login in dbProperties in the ConnectionUtil class.

+ Setup url: jdbc:mysql://"your host name":"your port"/"your name db"?useUnicode=true&serverTimezone=UTC
