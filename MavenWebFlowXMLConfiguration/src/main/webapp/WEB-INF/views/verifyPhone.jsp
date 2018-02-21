<%--
  Created by IntelliJ IDEA.
  User: LiuWenqi
  Date: 2018-02-21
  Time: 11:39
  Description:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>验证手机</title>
</head>
<body>
<form:form>
    <input type="hidden" name="_flowExecutionKey"
           value="${flowExecutionKey}" />
    手机号：<input type="text" name="phone" />
    <input type="submit" name="_eventId_submit"
           value="校验手机" />
</form:form>

</body>
</html>
