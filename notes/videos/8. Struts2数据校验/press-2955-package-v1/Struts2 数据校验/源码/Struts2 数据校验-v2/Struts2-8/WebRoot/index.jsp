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
    <form action="<%=path %>/test/registerUser" method="post">
    	用户名:<input type="text" name="username"/>${errors.username[0]}<br><br>
    	密码：<input type="password" name="password"/>${errors.password[0]}<br><br>
    	确认密码：<input type="password" name="repassword"/>${errors.repassword[0]}<br><br>
    	年龄：<input type="text" name="age"/>${errors.age[0]}<br><br>
    	邮箱：<input type="text" name="email"/>${errors.email[0]}<br><br>
    	电话：<input type="text" name="phone"/>${errors.phone[0]}<br><br>
    	<input type="submit" value="提交"/>
    </form>
  </body>
</html>
