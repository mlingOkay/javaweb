<%--
  Created by IntelliJ IDEA.
  User: 87427
  Date: 2022/9/15
  Time: 0:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        int i,j;
        for ( i = 2; i <=100 ; i++) {
            for ( j = 2; j < i; j++) {
                if (i%j==0){
                    break;
                }
            }
                if (i==j){
                    %>
        <%=i%>
    <%
                }
        }
    %>
</body>
</html>
