<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  >
    留言：<textarea name="liuyan"></textarea>
    <input type="submit" name="提交"/>
</form>
<jsp:useBean id="Deomo03liuyan" class="com.Deomo03liuyan" scope="request">
    <jsp:setProperty name="Deomo03liuyan"    property = "liuyan" param = "liuyan" ></jsp:setProperty>
</jsp:useBean>
<%
    String liuyan = Deomo03liuyan.getLiuyan(); %>
<%!
    ArrayList<String> list=new ArrayList<String>();
%>
<%
    list.add(liuyan);
        for(int i=0;i<list.size();i++){
%>
留言板:<%= list.get(i)%><br/>
<%}%>
</body>
</html>
