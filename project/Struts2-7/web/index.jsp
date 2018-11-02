<%--
  Created by IntelliJ IDEA.
  User: DreamMax
  Date: 2018/10/23
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <s:text name="login.title"/>
      <s:form  action="changeLanguage"  method="POST">
        <s:textfield name="username" key="login.username"/>
        <s:password name="password" key="login.password"/>
        <s:submit key="login.submit"/>
      </s:form>
      <a href="changeLanguage.action?request_locale=zh_CN">中文</a>
      <a href="changeLanguage.action?request_locale=en_US">英文</a>
  </body>
</html>
