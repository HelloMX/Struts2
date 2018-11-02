<%--
  Created by IntelliJ IDEA.
  User: DreamMax
  Date: 2018/10/23
  Time: 13:21
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
    <title>Title</title>
</head>
<body>
        <%--以下两句话是等价的--%>
        <%--<%request.setAttribute("age",61);%>--%>
        <s:set name="age" value="61" ></s:set>
        <%=request.getAttribute("age")%>
        <%=pageContext.getAttribute("age")%>
        <%=session.getAttribute("age")%>
        <%=application.getAttribute("age")%>

        <br/>

        <s:set name="age1" value="61" scope="session" ></s:set>
        <%=request.getAttribute("age1")%>
        <%=pageContext.getAttribute("age1")%>
        <%=session.getAttribute("age1")%>
        <%=application.getAttribute("age1")%>

        <br/>
        <s:set name="age2" value="61" scope="application" ></s:set>
        <%=request.getAttribute("age2")%>
        <%=pageContext.getAttribute("age2")%>
        <%=session.getAttribute("age2")%>
        <%=application.getAttribute("age2")%>

        <br/>
        <s:set name="booklist" value="{'a','b','c'}"/>
        <s:set name="bookMap" value="#{'1':'a','2':'b','3':'c'}"/>
        <s:select label="书籍" list="#booklist"/>
        <br/>
        <s:select label="书籍map" list="#bookMap" listKey="key" listValue="value"/>

        <br/>
        <s:property value="#age"/>
        <s:property value="#session.age1"/>
        <br/>
        <s:property value="#booklist"/>
        <br/>
        <s:property value="#booklist[1]"/>
        <br/>
        <s:property value="#bookMap.keys"/>
        <br/>
        <s:property value="#bookMap.values"/>
        <br>
        <s:set name="score" value="20"/>
        <s:if test="#score>=60">
            及格
        </s:if>
        <s:elseif test="#score>30">
            学渣
        </s:elseif>
        <s:else>
            学渣渣
        </s:else>

</body>
</html>
