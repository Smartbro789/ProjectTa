<%--
  Created by IntelliJ IDEA.
  User: Alexandr
  Date: 26.05.2020
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="rooms.css">
    <title>Rooms data</title>
</head>
<body>
<div id="frame">
    <div id="header"><h1>Rooms</h1></div>
    <button class="button"><a href="${pageContext.request.contextPath}/addRoom"><h2>Add Room</h2></a></button>
    <table border="1" id="table">
        <tr class="tr">
            <th>ID</th>
            <th>Number</th>
            <th>Status</th>
            <th>Type</th>
            <th>Price</th>
            <th>Decsription</th>
            <th></th>
        </tr>
        <tr class="tr">
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="width: 170px; text-align: center;">
                <button class="button"><a href="${pageContext.request.contextPath}/addCustomer.jsp"><h2>Edit</h2></a></button>
                <button class="button"><a href="${pageContext.request.contextPath}/addCustomer.jsp"><h2>Delete</h2></a></button>
            </td>
        </tr>
        <tr class="tr">
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="width: 170px; text-align: center;">
                <button class="button"><a href="${pageContext.request.contextPath}/addCustomer.jsp"><h2>Edit</h2></a></button>
                <button class="button"><a href="${pageContext.request.contextPath}/addCustomer.jsp"><h2>Delete</h2></a></button>
            </td>
        </tr>
        <tr class="tr">
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="width: 170px; text-align: center;">
                <button class="button"><a href="${pageContext.request.contextPath}/addCustomer.jsp"><h2>Edit</h2></a></button>
                <button class="button"><a href="${pageContext.request.contextPath}/addCustomer.jsp"><h2>Delete</h2></a></button>
            </td>
        </tr>
        <tr class="tr">
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td style="width: 170px; text-align: center;">
                <button class="button"><a href="${pageContext.request.contextPath}/addCustomer.jsp"><h2>Edit</h2></a></button>
                <button class="button"><a href="${pageContext.request.contextPath}/addCustomer.jsp"><h2>Delete</h2></a></button>
            </td>
        </tr>
    </table>
    <div id="footer"></div>
</div>

</body>
</html>
