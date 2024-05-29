<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <div>
        <h2>Add</h2>
        <form action="/shop/category/add" method="post">
            ID: <input type="text" name="id">
            <br>
            Name: <input type="text" name="name">
            <br>
            <button>Save</button>
        </form>
    </div>
    <h2>Table</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th colspan="3">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${page.content}" var="item">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td><a href="/shop/category/detail/${item.id}">Detail</a></td>
                    <td><a href="/shop/category/update/${item.id}">Update</a></td>
                    <td><a href="/shop/category/delete?id=${item.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/shop/category/list">First</a>
    <a href="/shop/category/list?p=${page.first ? 0 : page.number - 1}">Prev</a>
    <a href="/shop/category/list?p=${page.last ? page.totalPages - 1 : page.number + 1}">Next</a>
    <a href="/shop/category/list?p=${page.totalPages - 1}">Last</a>
</body>
</html>