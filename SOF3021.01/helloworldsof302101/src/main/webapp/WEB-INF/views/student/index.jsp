<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
<table>
    <form action="/student/detail">
        MSSV: <input name="id"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="/student/create">Add Student</a></button>
    <tr>
        <th>STT</th>
        <th>MSSV</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${list}" var="student" varStatus="i">
            <tr>
                <td>${i.index + 1}</td>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td>${student.address}</td>
                <td>${student.gender ? "Nam" : "Nữ"}</td>
                <td colspan="2">
                    <a href="/student/update/${student.id}">Sửa</a>
                    <a href="/student/delete?id=${student.id}">Xoá</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
