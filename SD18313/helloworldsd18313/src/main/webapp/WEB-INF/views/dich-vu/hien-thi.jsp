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
    <h2>Form</h2>
    <form action="/dich-vu/add" method="post">
        Ten phong: <input type="text" name="tenPhong" value="${phong.tenPhong}"> <br>
        So luong phong: <input type="text" name="soLuongPhong" value="${phong.soLuongPhong}"> <br>
        Trang thai:
            <input type="radio" value="1" name="trangThai" ${phong.trangThai == "1" ? "checked" : ""}> Con phong
            <input type="radio" value="2" name="trangThai" ${phong.trangThai != "1" ? "checked" : ""}> Het phong
        <br>
        Ghi chu: <input type="text" name="ghiChu" value="${phong.ghiChu}"> <br>
        Loai phong:
        <select name="loaiPhong">
            <c:forEach items="${listLoaiPhong}" var="loaiPhong">
                <option value="${loaiPhong.id}" label="${loaiPhong.tenLoaiPhong}" ${phong.loaiPhong.id == loaiPhong.id ? "selected" : ""}></option>
            </c:forEach>
        </select>
        <button>Add</button>
    </form>

    <h2>Table</h2>
    <table>
        <thead>
            <tr>
                <th>Ten phong</th>
                <th>So luong phong</th>
                <th>Trang thai</th>
                <th>Ghi chu</th>
                <th>Ten loai phong</th>
                <th>Hanh dong</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listPhong}" var="phong">
                <tr>
                    <td>${phong.tenPhong}</td>
                    <td>${phong.soLuongPhong}</td>
                    <td>${phong.trangThai == "1" ? "Con phong" : "Het phong"}</td>
                    <td>${phong.ghiChu}</td>
                    <td>${phong.loaiPhong.tenLoaiPhong}</td>
                    <td><a href="/dich-vu/detail/${phong.id}">Detail</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>