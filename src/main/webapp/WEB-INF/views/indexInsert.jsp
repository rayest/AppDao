<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IndexInsert</title>
</head>
<body>
<form action="/insert" method="post">
    用户id：<input type="text" name="id">
    用户姓名:<input type="text" name="name"><br/>
    用户密码:<input type="text" name="password"><br/>
    <!--password:<input type="password" name="userPassword"/><br/>-->
    <input type="submit" value="添加"/><input type="reset" value="reset"/>
</form>
</body>
</html>
