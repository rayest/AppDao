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
    <fieldset>
        <legend>编辑用户</legend>
        <p>用户标识: <input placeholder="id" type="text" name="id" /></p>
        <p>用户姓名: <input placeholder="name" type="text" name="name" /></p>
        <p>用户密码: <input placeholder="password" type="password" name="password" /></p>
        <input type="submit" value="编辑"/>
        <input type="reset" value="重置"/>
    </fieldset>
</form>

</body>
</html>
