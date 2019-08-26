<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="com.alexbobryshev.music_albums.repo.AlbumRepoImpl"%>
<%@ page import="com.alexbobryshev.music_albums.repo.AlbumRepo" %>
<%@ page import="com.alexbobryshev.music_albums.model.Album" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Music Albums CRUD application</title>
</head>
<body>
<h2>Available albums:</h2>
<%
    out.println("Hello, world! ");
%>
<a href="/add">ADD AN ALBUM TO THE DATABASE</a>
<br/>
<a href="/">BACK TO THE HOMEPAGE</a>
</body>
</html>