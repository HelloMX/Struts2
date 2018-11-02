<%--
  Created by IntelliJ IDEA.
  User: DreamMax
  Date: 2018/10/23
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="<%=path %>/loginAction.action" method="post">
        <input type="text" name="username"/>
        <br>
         <input type="submit" value="提交"/>
    </form>

    <a href="<%=path %>/salaryAction!add.action">add</a>
    <a href="<%=path %>/salaryAction!show.action">show</a>
    <a href="<%=path %>/salaryAction!update.action">update</a>

</body>
</html>
