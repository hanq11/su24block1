<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>Add</h2>
<form action="/shop/product/update" method="post">
    ID: <input type="text" name="id" readonly value="${product.id}"> <br>
    Name: <input type="text" name="name" value="${product.name}"><br>
    Price: <input type="text" name="price" value="${product.price}"><br>
    Create Date: <input type="date" name="createDate" value="${product.createDate}"><br>
    Category:
    <select name="category">
        <c:forEach items="${listCategory}" var="item">
            <option value="${item.id}" label="${item.name}" ${product.category.id == item.id ? "selected" : ""}></option>
        </c:forEach>
    </select> <br>
    <button>Submit</button>
</form>