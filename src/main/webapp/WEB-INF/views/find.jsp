<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Rayest
  Date: 2016/5/26 0026
  Time: 下午 5:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>find</title>
    <style>
        th{
            text-align: left;
        }
    </style>
</head>
<body>

<fieldset>
    <legend>用户信息</legend>
    <table>
        <thead>
        <tr>
            <th>用户标识</th>
            <th>用户姓名</th>
            <th>用户密码</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${user}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</fieldset>
</body>
</html>