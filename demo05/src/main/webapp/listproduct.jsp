<%@ page import="java.util.ArrayList" %>
<%@ page import="com.entity.Product" %><%--
  Created by IntelliJ IDEA.
  User: 87427
  Date: 2022/9/21
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArrayList productList = (ArrayList) session.getAttribute("productlist");%>
<html>
<head>


</head>
<body>
<table border="1px" cellspacing="0px" cellpadding="5px" width="400px" height="200px" >
    <tr>
        <td>名称</td>
        <td>价格</td>
    </tr>
    <%
        for (int i = 0; i < productList.size(); i++) {
            Product product = (Product) productList.get(i);

    %>
    <tr height="50" align="center">
        <td>
            <%=product.getPname() %>
        </td>
        <td>
            <%=product.getPprice() %>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
