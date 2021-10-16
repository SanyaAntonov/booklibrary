<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>Genre list</title>
</head>
<body>
<section>
    <h3><a href="/library">Home</a></h3>
    <hr/>
    <h2>Genres</h2>
    <a href="genres?action=create">Add Genre</a>
    <br><br>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>Name</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${genres}" var="genre">
            <jsp:useBean id="genre" type="ru.antonov.booklibrary.entity.Genre"/>
            <td>${genre.name}</td>
            <td><a href="genres?action=update&id=${genre.name}">Update</a></td>
            <td><a href="genres?action=delete&id=${genre.name}">Delete</a></td>
        </c:forEach>
    </table>
</section>
</body>
</html>