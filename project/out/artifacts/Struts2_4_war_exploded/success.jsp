<%@ page import="pojo.Users" %><%--
  Created by IntelliJ IDEA.
  User: DreamMax
  Date: 2018/10/19
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%Users us=(Users)session.getAttribute("us");%>
    登录成功：<%=us.getUsername()%> 你好！
</body>
</html>
