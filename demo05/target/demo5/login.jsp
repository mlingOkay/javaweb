<%@page language="java" pageEncoding="UTF-8" import="java.util.*" %>
<html>
<body>
    <form action="loginServlet" method="post">
        <h2>用户登录</h2>
        用户名 <input type="text" name="UserName">
        密码 <input type="text" name="userPass">
        <input type="submit" value="登录">
        <input type="reset" value="重置">
    </form>
</body>
</html>
