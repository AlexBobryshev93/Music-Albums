<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page errorPage="/error.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Music Albums CRUD application</title>
</head>
<body>
<h2>Add a new album:</h2>
<form action="/save_album" method="POST">
    <!-- ID: ${album.id} <br><br> -->
    Name: <input name="name" maxlength="50" required/>
    <br><br>
    Year: <input type="number" name="year" min="1920" max="2030" required/>
    <br><br>
    Performer: <input name="performer" value="unknown" maxlength="25" required/>
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