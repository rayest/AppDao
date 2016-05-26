<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/26 0026
  Time: 下午 5:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>find</title>
</head>
<body>
<h3>id   name   password</h3>
<c:forEach items="${user}" var="user">
    <h3>${user.id}  ${user.name}  ${user.password}</h3>
</c:forEach>
</body>
</html>