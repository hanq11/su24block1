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
<h2>Form add</h2>
    <form action="/gio-hang/update" method="post">
        <input type="text" name="id" hidden value="${gioHang.id}">
        Ma gio hang: <input type="text" name="maGioHang" value="${gioHang.maGioHang}"> <br>
        Ngay tao: <input type="date" name="ngayTao" value="${gioHang.ngayTao}"><br>
        Ten nguoi nhan: <input type="text" name="tenNguoiNhan" value="${gioHang.tenNguoiNhan}"> <br>
        Dia chi: <input type="text" name="diaChi" value="${gioHang.diaChi}"> <br>
        SDT: <input type="text" name="sdt" value="${gioHang.sdt}"> <br>
        Khach hang:
        <select name="khachHang">
            <c:forEach items="${listKhachHang}" var="khachHang">
                <option value="${khachHang.id}" label="${khachHang.tenKhachHang}" ${gioHang.khachHang.id == khachHang.id ? "selected" : ""}></option>
            </c:forEach>
        </select>
        <button>Update</button>
    </form>
</body>
</html>