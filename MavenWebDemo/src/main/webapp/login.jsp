<%--
  Created by IntelliJ IDEA.
  User: LiuWenqi
  Date: 2018-02-10
  Time: 09:52
  Description:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
    <title>登录页面</title>
</head>
<body>
    <form action="user/login" method="post">
        <div>用户名：<input type="text" name="userName" placeholder="用户名" value="admin"/></div>
        <div>密码：<input type="text" name="password" placeholder="密码" value="123456"/></div>
        <div><input type="submit" value="登陆"/></div>
    </form>
</body>
</html>
