<%@ page import="java.util.List" %>
<html><body>
<h1>Mini Statement</h1>
<ul>
<%
    List<String> statement = (List<String>) session.getAttribute("statement");
    for (String entry : statement) {
%>
<li><%= entry %></li>
<%
    }
%>
</ul>
</body></html>
