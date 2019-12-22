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
<h2>Available albums:</h2>
<c:forEach var="album" items="${list}">
    <p>ID: ${album.id}</p>
    <p>Name: ${album.name}</p>
    <p>Performer: ${album.performer.name}</p>
    <p>Year: ${album.year}</p>
    <p>Genre: ${album.genre.toString()}</p>
    <a href="/edit/${album.id}">edit</a>
    <a href="/delete/${album.id}">delete</a>
    <br /><br />
</c:forEach>
<br />
<a href="/add">ADD AN ALBUM TO THE DATABASE</a>
<br/>
<a href="/">BACK TO THE HOMEPAGE</a>
</body>
</html>