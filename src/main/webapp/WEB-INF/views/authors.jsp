<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>Author list</title>
</head>
<body>
<section>
    <h3><a href="/library">Home</a></h3>
    <hr/>
    <h2>Authors</h2>
    <a href="authors?action=create">Add Author</a>
    <br><br>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>Id</th>
            <th>First name</th>
            <th>Last name</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${authors}" var="author">
            <jsp:useBean id="author" type="ru.antonov.booklibrary.entity.Author"/>
                <td>${author.id}</td>
                <td>${author.firstName}</td>
                <td>${author.lastName}</td>
                <td><a href="meals?action=update&id=${author.id}">Update</a></td>
                <td><a href="meals?action=delete&id=${author.id}">Delete</a></td>
        </c:forEach>
    </table>
</section>
</body>
</html>