<%--
  Created by IntelliJ IDEA.
  User: DreamMax
  Date: 2018/10/23
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <h3>登录实例（LoginAction）</h3>
  <form action="<%=path%>/loginAction.action" method="post">
      username:<input type="text" name="username"/>
      password:<input type="password" name="password"/>
      <input type="submit" value="submit">
  </form>



    <h3>使用Struts2 Aware拦截器（FirstAction）</h3>
    <form action="<%=path%>/firstAction.action" method="post">
        username:<input type="text" name="username"/>
        password:<input type="password" name="password"/>
        <input type="submit" value="submit">
    </form>

    <h3>使用Struts2 RequestAware拦截器（Second Action）</h3>
    <form action="<%=path%>/secondAction.action" method="post">
        username:<input type="text" name="username"/>
        password:<input type="password" name="password"/>
        <input type="submit" value="submit">
    </form>

    <h3>使用Struts2内置静态对象ActionContext（Third Action）</h3>
    <form action="<%=path%>/thirdAction.action" method="post">
        username:<input type="text" name="username"/>
        password:<input type="password" name="password"/>
        <input type="submit" value="submit">
    </form>


    <h3>使用Struts2内置静态对象ServletActionContext（FourthAction）(推荐使用)</h3>
    <form action="<%=path%>/fourthAction.action" method="post">
        username:<input type="text" name="username"/>
        password:<input type="password" name="password"/>
        <input type="submit" value="submit">
    </form>
  </body>
</html>
