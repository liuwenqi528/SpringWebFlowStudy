<%--
  Created by IntelliJ IDEA.
  User: LiuWenqi
  Date: 2018-02-10
  Time: 09:52
  Description:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>用户列表</title>
</head>
<body>
<h1>用户列表</h1>
<table>
    <thead>
    <tr>
        <td><input type="checkbox" class="checkAll"/></td>
        <td>编号</td>
        <td>用户名</td>
        <td>真是姓名</td>
        <td>邮箱</td>
        <td>手机号</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td><input type="checkbox" class="checkOne"/></td>
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.trueName}</td>
            <td>${user.email}</td>
            <td>${user.phone}</td>
            <td><a href="/user/toEdit?id=${user.id}">编辑</a><a href="/user/delete?id=${user.id}">删除</a></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
