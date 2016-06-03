<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IndexInsert</title>
</head>
<body>
<form action="/insert" method="post">
    <fieldset>
        <legend>添加用户</legend>
        <p>用户标识: <input placeholder="id" type="text" name="id" /></p>
        <p>用户姓名: <input placeholder="name" type="text" name="name" /></p>
        <p>用户密码: <input placeholder="password" type="password" name="password" /></p>
        <input type="submit" value="添加"/><input type="reset" value="重置"/>
    </fieldset>
</form>
</body>
</html>
