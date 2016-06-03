<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>My JSP 'Login.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

</head>

<body>
<form action="login.do" method="post">
    <fieldset>
        <legend>查找用户</legend>
        <p>
            <label for="userName">
                用户姓名:<input placeholder="name" type="text" id="userName" name="userName"/>
            </label>
        </p>
        <input type="submit" value="查询"/>
        <input type="reset" value="重置"/>
    </fieldset>

</form>
</body>
</html>