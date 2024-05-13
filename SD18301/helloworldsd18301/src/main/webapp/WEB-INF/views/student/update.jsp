<html>
<head>
    <title>Sửa thông tin</title>
</head>
<body>

<form action="/student/update">
    MSSV: <input type="text" name="id"  />
    <br/>
    Tên: <input type="text" name="name" />
    <br/>
    Tuổi: <input type="text" name="age" />
    <br/>
    Địa chỉ: <input type="text" name="address" />
    <br/>
    Giới tính:
    <input type="radio" name="gender" checked value="true"/>Nam
    <input type="radio" name="gender" value="false"/>Nữ
    <br/>
    <button>Update</button>
</form>

</body>
</html>
