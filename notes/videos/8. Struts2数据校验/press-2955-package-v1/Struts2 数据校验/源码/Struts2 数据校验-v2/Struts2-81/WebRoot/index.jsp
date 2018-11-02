<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body>
  	<s:fielderror cssStyle="color:red"/>
  	<hr>
  	<s:actionerror cssStyle="color:red"/>
  	<br><br>
    <form action="<%=path %>/test/registerAction" method="post">
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
