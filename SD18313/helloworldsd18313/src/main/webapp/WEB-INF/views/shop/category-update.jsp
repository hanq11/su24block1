<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>Update</h2>
<form action="/shop/category/update" method="post">
    ID: <input type="text" name="id" value="${category.id}" readonly>
    <br>
    Name: <input type="text" name="name" value="${category.name}">
    <br>
    <button>Save</button>
</form>
</body>
</html>