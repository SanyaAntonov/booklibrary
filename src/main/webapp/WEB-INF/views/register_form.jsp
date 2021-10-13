<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Registration Form</title>
</head>
<body>
<div align="center">
    <h2>User Registration</h2>
    <form:form action="register" method="post" modelAttribute="user">
        <form:label path="userName">User Name:</form:label>
        <form:input path="userName"/><br/>

        <form:label path="password">Password:</form:label>
        <form:password path="password"/><br/>

        <form:label path="role">Role:</form:label>
        <form:select path="role" items="${roles}" /><br/>

        <form:button>Register</form:button>
    </form:form>
</div>
</body>
</html>