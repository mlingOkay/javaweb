<%@page language="java" pageEncoding="UTF-8" import="java.util.*" %>
<html>
<body>
    <form action="productServlet?action=add" method="post">
        <h2>添加产品</h2>
        名称 <input type="text" name="pname">
        价格 <input type="text" name="pprice">
        <input type="submit" value="添加">
        <input type="reset" value="重置">
        <a href="productServlet?action=list">查看产品</a>
    </form>
</body>
</html>
