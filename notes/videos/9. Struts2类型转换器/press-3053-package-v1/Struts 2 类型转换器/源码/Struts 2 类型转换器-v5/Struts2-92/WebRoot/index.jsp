<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
  </head>
  
  <body>
    <form action="<%=path %>/test/logins" method="post">
    	请输入地点的x和y的坐标中间用，分隔：<input type="text" name="po">
    		<input type="submit" value="提交"/>
    </form>
  </body>
</html>
