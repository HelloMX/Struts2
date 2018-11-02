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
  <s:fielderror cssStyle="color:red"/>
  <hr>
  <s:actionerror cssStyle="color:red"/>
  <form action="<%=path %>/registerAction.action" method="post">
      用户名:<input type="text" name="user.username"/>${errors["user.username"][0]}<br><br>
      密码：<input type="password" name="user.password"/>${errors["user.password"][0]}<br><br>
      确认密码：<input type="password" name="user.repassword"/>${errors["user.repassword"][0]}<br><br>
      年龄：<input type="text" name="user.age"/>${errors["user.age"][0]}<br><br>
      邮箱：<input type="text" name="user.email"/>${errors["user.email"][0]}<br><br>
      电话：<input type="text" name="user.phone"/>${errors["user.phone"][0]}<br><br>
      <input type="submit" value="提交"/>
  </form>
  </body>
</html>
