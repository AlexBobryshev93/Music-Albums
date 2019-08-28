<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Music Albums CRUD application</title>
</head>
<body>
<h2>An album saved:</h2>
    ID: ${album.id}
    <br><br>
    Name: ${album.name}
    <br><br>
    Year: ${album.year}
    <br><br>
    Performer: ${album.performer.name}
    <br><br>
    Genre: ${album.genre}
    <br><br>
<a href="/list">FULL LIST OF THE ALBUMS</a>
<br/>
<a href="/">BACK TO THE HOMEPAGE</a>
</body>
</html>