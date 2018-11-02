<%--
  Created by IntelliJ IDEA.
  User: DreamMax
  Date: 2018/10/23
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


        <a href="<%=path%>/Users_add">添加</a><br>
        <a href="<%=path%>/Users_show">查看</a><br>
        <a href="<%=path%>/Users_delete">删除</a><br>
        <a href="<%=path%>/Users_update">修改</a><br>

        <hr>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</hr><br>

        <a href="<%=path%>/News_add">添加</a><br>
        <a href="<%=path%>/News_show">查看</a><br>
        <a href="<%=path%>/News_delete">删除</a><br>
        <a href="<%=path%>/News_update">修改</a><br>

        <hr>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</hr><br>
        <a href="<%=path%>/loginAction.action">拦截器</a><br>
  </body>
</html>
