<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/30 0030
  Time: 下午 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SelectById</title>
</head>
<body>
<form action="/selectbyid" method="post">
    userId:<input type="text" name="id"/><br/>
    <!--password:<input type="password" name="userPassword"/><br/>-->
    <input type="submit" value="查询"/><input type="reset" value="reset"/>
</form>
</body>
</html>
