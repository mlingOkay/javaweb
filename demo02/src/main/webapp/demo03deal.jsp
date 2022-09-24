
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String username= request.getParameter("username");
        String psd= request.getParameter("psd");

    %>
    用户名字是：<%=username%>
    用户密码是：<%=psd%>
</body>
</html>
