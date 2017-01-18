<%@ page import="core.Calc" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Моя первая JSP-страница</h1>
<h2>JSP = Java Server Pages</h2>

<%
    // Тут может быть большой кусок Java-кода
    final int SIZE = 10;
%>
<table border="1">
    <% for (int i = 1; i <= SIZE; i++) { %>
    <tr>
        <% for (int j = 1; j <= SIZE; j++) { %>
        <td><%=Calc.operation(i, j)%></td>
        <% } %>
    </tr>
    <% } %>
</table>

</body>
</html>
