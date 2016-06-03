<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My JSP 'Main.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
</head>

<body>

<fieldset>
    <legend>用户信息</legend>
    <table>
        <thead>
        <tr>
            <td>用户姓名</td>
            <td>用户密码</td>
        </tr>
        </thead>

        <tbody>
        <tr>
            <td>${user.name}</td>
            <td>${user.password}</td>
        </tr>
        </tbody>
    </table>

</fieldset>
</body>
</html>