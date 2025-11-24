<%@ page import="java.util.List" %>
<html><body>
<h1>Dashboard</h1>
Balance: ₹<%= session.getAttribute("balance") %><br/>
<a href="deposit.jsp">Deposit</a><br/>
<a href="withdraw.jsp">Withdraw</a><br/>
<a href="mini-statement.jsp">Mini Statement</a><br/>
</body></html>
