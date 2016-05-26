<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/26 0026
  Time: 下午 7:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>indexDelete</title>
</head>
<body>
<form action="/delete" method="post">
    userId:<input type="text" name="id"/><br/>
    <!--password:<input type="password" name="userPassword"/><br/>-->
    <input type="submit" value="Delete"/><input type="reset" value="reset"/>
</form>
</body>
</html>
