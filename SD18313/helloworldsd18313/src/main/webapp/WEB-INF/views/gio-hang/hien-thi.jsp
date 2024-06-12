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
    <h2>Tim kiem</h2>
    <form action="/gio-hang/search" method="get">
        Ma gio hang: <input type="text" name="maGioHang"> <br>
        Ten nguoi nhan: <input type="text" name="tenNguoiNhan"> <br>
        <button>Search</button>
    </form>

    <h2>Add form</h2>
    <form action="/gio-hang/add" method="post">
        Ma gio hang: <input type="text" name="maGioHang"> <br>
        Ngay tao: <input type="date" name="ngayTao"> <br>
        Ten nguoi nhan: <input type="text" name="tenNguoiNhan"> <br>
        Dia chi: <input type="text" name="diaChi"> <br>
        Sdt: <input type="text" name="sdt"> <br>
        Khach hang:
            <select name="khachHang">
                <c:forEach items="${listKhachHang}" var="khachHang">
                    <option value="${khachHang.id}" label="${khachHang.tenKhachHang}"></option>
                </c:forEach>
            </select>
        <button>Add</button>
    </form>

    <h2>Table</h2>

    <table>
        <thead>
            <tr>
                <th>Ma</th>
                <th>Ngay tao</th>
                <th>Ten nguoi nhan</th>
                <th>Dia chi</th>
                <th>Sdt</th>
                <th>Ma khach hang</th>
                <th>Ten khach hang</th>
                <th colspan="3">Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listGioHang}" var="gioHang">
                <tr>
                    <td>${gioHang.maGioHang}</td>
                    <td>${gioHang.ngayTao}</td>
                    <td>${gioHang.tenNguoiNhan}</td>
                    <td>${gioHang.diaChi}</td>
                    <td>${gioHang.sdt}</td>
                    <td>${gioHang.khachHang.maKhachHang}</td>
                    <td>${gioHang.khachHang.tenKhachHang}</td>
                    <td><a href="/gio-hang/view-update/${gioHang.id}">Update</a></td>
                    <td><a href="/gio-hang/delete?id=${gioHang.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>