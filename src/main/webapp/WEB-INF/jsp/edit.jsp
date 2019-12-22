<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page errorPage="/error.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Music Albums CRUD application</title>
</head>
<body>
<h2>Edit the album:</h2>
<form action="/save_album" method="POST">
    ID: ${album.id} <input name="id" value="${album.id}" hidden/>
    <br><br>
    Name: <input name="name" value="${album.name}" maxlength="50" required/>
    <br><br>
    Year: <input type="number" name="year" value="${album.year}" min="1920" max="2030" required/>
    <br><br>
    Performer: <input name="performer" value="${album.performer.name}" maxlength="25" required/>
    <br><br>
    Genre: <select name="genre">
    <c:forEach var="genre" items="${genres}">
        <c:if test="${genre == album.genre}">
            <option selected>${genre}</option>
        </c:if>
        <c:if test="${genre != album.genre}">
            <option>${genre}</option>
        </c:if>
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