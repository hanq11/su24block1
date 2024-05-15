<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm sinh viên</title>
</head>
<body>

<form action="/student/create" method="post">
    MSSV: <input type="text" name="id"/>
    <br/>
    Tên: <input type="text" name="name"/>
    <br/>
    Tuổi: <input type="text" name="age"/>
    <br/>
    Địa chỉ: <input type="text" name="address"/>
    <br/>
    Giới tính:
    <input type="radio" name="gender" checked value="true"/>Nam
    <input type="radio" name="gender" value="false"/>Nữ
    <br/>
    <button type="submit">Add</button>
</form>
</body>
</html>
