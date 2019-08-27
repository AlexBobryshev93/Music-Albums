<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Music Albums CRUD application</title>
</head>
<body>
<h2>a new album:</h2>
    <!-- ID: -->
    Name: <%= request.getParameter("name") %>
    <br><br>
    Year: <%= request.getParameter("year") %>
    <br><br>
    Performer: <%= request.getParameter("performer") %>
    <br><br>
    Genre: <%= request.getParameter("genre") %>
    <br><br>
<a href="/list">FULL LIST OF THE ALBUMS</a>
<br/>
<a href="/">BACK TO THE HOMEPAGE</a>
</body>
</html>