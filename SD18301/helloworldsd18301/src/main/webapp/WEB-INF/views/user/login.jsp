<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <%@ page contentType="text/html; charset=UTF-8" %>
</head>
<body>
    <h1>Đăng ký</h1>
    <p>${message}</p>
    <form action="/user/login" method="POST">
        <div>Username: </div>
        <input name="username">
        <div>Password: </div>
        <input name="password">
        <br>
        <div><input type="checkbox" name="remember"> Remember me?</div>
        <button>Login</button>
    </form>
</body>
</html>