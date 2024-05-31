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
    <h2>Add</h2>
    <form action="/shop/product/add" method="post">
        Name: <input type="text" name="name"><br>
        Price: <input type="text" name="price"><br>
        Create Date: <input type="date" name="createDate"><br>
        Category:
        <select name="category">
            <c:forEach items="${listCategory}" var="item">
                <option value="${item.id}" label="${item.name}"></option>
            </c:forEach>
        </select> <br>
        <button>Submit</button>
    </form>
    <h2>Table</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Create Date</th>
                <th>Category name</th>
                <th colspan="3">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="item">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.price}</td>
                    <td>${item.createDate}</td>
                    <td>${item.category.name}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>