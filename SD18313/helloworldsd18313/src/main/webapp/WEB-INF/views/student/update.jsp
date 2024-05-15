<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sửa thông tin</title>
</head>
<body>

<form action="/student/update" method="post">
    MSSV: <input type="text" name="id"  value="${student.id}" readonly/>
    <br/>
    Tên: <input type="text" name="name" value="${student.name}"/>
    <br/>
    Tuổi: <input type="text" name="age" value="${student.age}"/>
    <br/>
    Địa chỉ: <input type="text" name="address" value="${student.address}"/>
    <br/>
    Giới tính:
    <input type="radio" name="gender" ${student.gender ? "checked" : ""} value="true"/>Nam
    <input type="radio" name="gender" ${student.gender ? "" : "checked"} value="false"/>Nữ
    <br/>
    <button>Update</button>
</form>

</body>
</html>
