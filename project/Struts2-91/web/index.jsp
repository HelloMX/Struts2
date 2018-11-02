<%--
  Created by IntelliJ IDEA.
  User: DreamMax
  Date: 2018/10/24
  Time: 10:50
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

  <form action="<%=path %>/login.action" method="post">
     请输入地点的x和y坐标,中间用逗号分割<input type="text" name="position">
      <input type="submit" value="提交"/>
  </form>
  </body>
</html>
