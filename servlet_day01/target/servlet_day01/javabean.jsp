<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 20/09/07/007
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="people" class="hs.example.pojo.People" scope="page"></jsp:useBean>
<jsp:setProperty name="people" property="address" value="HF"></jsp:setProperty>
<jsp:setProperty name="people" property="age" value="23"></jsp:setProperty>
<jsp:setProperty name="people" property="id" value="1"></jsp:setProperty>
<jsp:setProperty name="people" property="name" value="hs"></jsp:setProperty>

name:<jsp:getProperty name="people" property="name"/>
id:<jsp:getProperty name="people" property="id"/>
age:<jsp:getProperty name="people" property="age"/>
address:<jsp:getProperty name="people" property="address"/>
</body>
</html>
