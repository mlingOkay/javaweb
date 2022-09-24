<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>图书信息</h2>
<table width="450px" border="1" cellpadding="0" cellspacing="0">
    <tr>
        <th scope="col">编号</th>
        <th scope="col">书名</th>

        <th scope="col">单价</th>
        <th scope="col">数量</th>
        <th scope="col">作者</th>
    </tr>

<%
    Connection co=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/javaweb";
        co = DriverManager.getConnection(url, "root", "admin");
        ps = co.prepareStatement("select  * from tb_book");
        rs=ps.executeQuery();
        while (rs.next()){
%>

    <tr>
        <th><%=rs.getInt("id")%></th>
        <th><%=rs.getString("name")%></th>
        <th><%=rs.getDouble("price")%></th>
        <th><%=rs.getInt("count")%></th>
        <th><%=rs.getString("author")%></th>

    </tr>
       <%   }
        rs.close();
        ps.close();
        co.close();
       }catch (Exception e){
           e.printStackTrace();
       }%>


</table>
</body>
</html>
