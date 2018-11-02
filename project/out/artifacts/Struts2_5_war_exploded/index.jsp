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
        <%--<s:form action="slogin" method="POST">--%>
            <%--<s:textfield label="用户名" name="us.username"/>--%>
            <%--<s:password label="密码" name="us.password"/>--%>
            <%--<s:checkboxlist name="hobby" label="爱好" list="{'打篮球','踢足球','跑步'}"/>--%>
            <%--<s:checkboxlist name="hobby1" label="爱好" list="#{'1':'打篮球','2':'踢足球','3':'跑步'}"/>--%>
            <%--<s:radio name="hobby2" label="爱好" list="{'打篮球','踢足球','跑步'}"/>--%>
            <%--<s:radio name="hobby3" label="爱好" list="#{'1':'打篮球','2':'踢足球','3':'跑步'}"/>--%>
            <%--<s:select label="爱好" list="#{'1':'打篮球','2':'踢足球','3':'跑步'}"/>--%>
            <%--<s:textarea label="简述" rows="22" cols="50"/>--%>
            <%--<s:doubleselect  list="{'a','b'}"--%>
                             <%--doubleList="top=='a'?{'a1','a2'}:{'b1','b2'}" doubleName="doublename"/>--%>
            <%--<s:submit/>--%>
        <%--</s:form>--%>


  </body>
</html>
