<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Genre</title>
</head>
<body>
<div align="center">
    <h2>Create Genre</h2>
    <form:button onclick="window.history.back()" type="button">Cancel</form:button>
    <hr>
    <form:form action="create" method="post" modelAttribute="book">
    <form:label path="userName">User Name:</form:label>
        <form:input path="userName"/>
    <br/>
    <form:label path="password">Password:</form:label>
        <form:password path="password"/>
    <br/>
    <form:label path="role">Role:</form:label>
        <form:select path="role" items="${roles}" />
    <br/>
    <form:button>Save</form:button>
    </form:form>
</body>
</html>