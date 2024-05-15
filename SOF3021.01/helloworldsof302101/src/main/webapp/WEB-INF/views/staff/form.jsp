<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
${message}
    <form:form action="/staff/form" method="post" modelAttribute="staff">
        Ten: <form:input path="name"/>
        <br>
        Tuoi: <form:input path="age"/>
        <br>
        Dia chi: <form:input path="address"/>
        <br>
        Vi tri: <form:radiobuttons path="position" items="${positions}"/>
        <br>
        So Thich: <form:checkboxes path="hobbies" items="${hobbies}"/>
        <br>
        Quoc gia: <form:select path="country.id">
            <form:options items="${countries}" itemLabel="name" itemValue="id"/>
        </form:select>
        <br>
        <button>Save</button>
    </form:form>
</body>
</html>