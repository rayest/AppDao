<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/30 0030
  Time: 下午 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IndexEdit</title>
</head>
<body>
<form action="/edit" method="post">
    userId:<input type="text" name="id"/><br/>
    userName:<input type="text" name="name"><br/>
    userPassword:<input type="text" name="password"><br/>
    <!--password:<input type="password" name="userPassword"/><br/>-->
    <input type="submit" value="eidt"/><input type="reset" value="reset"/>
</form>
</body>
</html>
