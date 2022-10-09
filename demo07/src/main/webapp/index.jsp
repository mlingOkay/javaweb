<%--
  Created by IntelliJ IDEA.
  User: 87427
  Date: 2022/10/6
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="addEmployee">
        员工编号：<input type="text" name="id" value=""> <br/>
        员工名字: <input type="text" name="name" value=""> <br/>
        员工工作: <input type="text" name="job" value=""> <br/>
        员工工资：<input type="text" name="salary" value=""> <br/>
        入职日期：<input type="text" name="date" value=""> <br/>
        <input type="submit" value="添加员工">
    </form>
</body>
</html>
