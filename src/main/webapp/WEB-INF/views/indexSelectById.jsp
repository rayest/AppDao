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
    <fieldset>
        <legend>查找用户</legend>
        <p>
            <label for="id">
                用户标识: <input placeholder="id" type="text" id="id" name="id" />
            </label>
        </p>
        <input type="submit" value="查找"/>
        <input type="reset" value="重置"/>
    </fieldset>
</form>
</body>
</html>
