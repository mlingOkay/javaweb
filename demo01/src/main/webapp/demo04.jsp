<%--
  Created by IntelliJ IDEA.
  entity.Product.User: 87427
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
        int i=1;
            if (application.getAttribute("shu")==null) {
                application.setAttribute("shu", i);
            }else {
                    if (session.isNew()) {
                        i++;
                        application.setAttribute("shu", i);
                    }
                    %>
    <%=application.getAttribute("shu")%>
<%
    }
            }
    %>
</body>
</html>
