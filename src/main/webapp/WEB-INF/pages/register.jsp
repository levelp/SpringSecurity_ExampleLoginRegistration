<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>

<form:form id="formRegister" modelAttribute="user" method="post" action="do_register">
    <div class="form-group">
        <label for="emailId">Логин</label>
        <form:input path="login" id="emailId" cssClass="form-control"/>
    </div>
    <div class="form-group">
        <label for="passwordId">Пароль</label>
        <form:password path="password" id="passwordId" cssClass="form-control"/>
    </div>
    <button name="submit">Зарегистрироваться!</button>
</form:form>
</body>
</html>
