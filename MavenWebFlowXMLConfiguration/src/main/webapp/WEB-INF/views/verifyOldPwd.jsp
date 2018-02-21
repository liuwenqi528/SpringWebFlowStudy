<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: LiuWenqi
  Date: 2018-02-21
  Time: 11:40
  Description:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>验证旧密码</title>
</head>
<body>
<form:form>
    <input type="hidden" name="_flowExecutionKey"
           value="${flowExecutionKey}"/>
    <b>userName: </b><input type="text" name="userName"/><br/>
    <b>password: </b><input type="text" name="password"/><br/>
    <b>trueName: </b><input type="text" name="trueName"/><br/>
    <b>email: </b><input type="text" name="email"/><br/>
    <b>phone: </b><input type="text" name="phone"/><br/>
    <input type="submit" name="_eventId_submit"
           value="校验旧密码" />
</form:form>

</body>
</html>
