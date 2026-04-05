<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>

<form action="login" method="post">
    <label for="usernameId">Логин</label>
    <input type="text" id="usernameId" name="username" placeholder="Логин"><br>
    <label for="passwordId">Пароль</label>
    <input type="password" id="passwordId" name="password"><br>
    <button name="submit">Войти!</button>
    <sec:csrfInput />
</form>
</body>
</html>
