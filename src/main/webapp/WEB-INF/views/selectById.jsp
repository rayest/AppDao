<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/30 0030
  Time: 下午 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SelectById</title>
</head>
<body>

<fieldset>
    <legend>查找用户</legend>
    <table>
        <thead>
        <tr>
            <td>用户标识</td>
            <td>用户姓名</td>
            <td>用户密码</td>
        </tr>
        </thead>

        <tbody>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
        </tr>
        </tbody>
        <tr>

        </tr>
    </table>
</fieldset>
</body>
</html>
