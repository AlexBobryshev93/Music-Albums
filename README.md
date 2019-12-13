# Music Albums

## Tutorial
A learning project. A CRUD web-application that allows:
* adding a music album info to the database
* getting an existing album info from the database
* getting all existing albums info
* updating an existing album info
* deleting an album info from the database



### Technologies used:
* Java
* Spring Framework (Core, Boot, MVC, Data)
* PostgreSQL
* JDBC (with spring Data JDBC Template)
* JSP
* Maven

### Steps to setup

**1. Clone the repository (alternatively you can just download it) using 
the following command:**

```bash
git clone https://github.com/AlexBobryshev93/Music-Albums.git
```

**2. Install and configure PostgreSQL**

First, install PostgreSQL and create a database named `music_albums`. 
Then, open `src/main/resources/application.properties` file and change 
the spring datasource username and password to yours if you 
didn't use the default values during the installation. The default username is
`user1` and password - `pass` .

**3. Run the application**

Use the following command from the root directory of the project to run it:

```bash
mvn spring-boot:run
```

Also you may do the same from your IDE.

**4. Use the application as you wish**

Now you can access the application at http://localhost:8080/ in your browser
(port number can be changed in `src/main/resources/application.properties`).

Enjoy!