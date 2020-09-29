<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>

</head>
<body>
<h2>Hello World!</h2>
<form action="/s1/req" method="get">
    用户名：<input type="text" name="usename"><br>
    密码：  <input type="text" name="pwd"><br>
    <input type="submit">
<%--    System.out.println(${pageContext.request.contextPath});--%>
</form>
<hr>
<form action="/req" method="get">
    用户名：<input type="text" name="usename"><br>
    密码：  <input type="text" name="pwd"><br>
    <input type="submit">
        System.out.println(${pageContext.request.contextPath});
</form>
<form action="req" method="get">
    用户名：<input type="text" name="usename"><br>
    密码：  <input type="text" name="pwd"><br>
    <input type="submit">
    System.out.println(${pageContext.request.contextPath});
</form>
<form action="${pageContext.request.contextPath}/Hello" method="get">
    <button type="submit">click</button>
</form>
</body>
</html>
