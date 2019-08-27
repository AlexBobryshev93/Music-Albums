<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Music Albums CRUD application</title>
</head>
<body>
<h2>Add a new album:</h2>
<form action="/new_album" method="POST">
    Name: <input name="name" />
    <br><br>
    Year: <input type="number" name="year" min="1920" max="2100"/>
    <br><br>
    Performer: <input name="performer" />
    <br><br>
    Genre: <select name="genre">
    <c:forEach var="genre" items="${genres}">
        <option>${genre}</option>
    </c:forEach>
    </select>
    <br><br>
    <input type="submit" value="Submit"/>
</form>
<br/>
<a href="/list">FULL LIST OF THE ALBUMS</a>
<br/>
<a href="/">BACK TO THE HOMEPAGE</a>
</body>
</html>