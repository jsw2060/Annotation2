<%--
  Created by IntelliJ IDEA.
  User: sist
  Date: 2016-02-29
  Time: 오후 4:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%
  Date now = new Date();
%>
<html>
  <head>
    <title>현재 시간</title>
  </head>
  <body>
    현재 시간:
    <%= now %>
  </body>
</html>
