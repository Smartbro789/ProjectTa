<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="rooms.css">
    <title>Rooms data</title>
</head>
<body>
<div id="frame">
    <div id="header"><h1 id="logo">Rooms</h1></div>
    <button class="button"><a href='<c:url value="/addRoom" />'><h2>Add Room</h2></a></button>
    <table border="1" id="table">
        <tr class="tr">
            <th>Number</th>
            <th>Status</th>
            <th>Type</th>
            <th>Price</th>
            <th>Decsription</th>
            <th></th>
        </tr>
        <c:forEach var="room" items="${rooms}">
            <tr class="tr">
                <td>${room.getRoomNumber()}</td>
                <td>${room.getRoomStatus()}</td>
                <td>${room.getRoomType()}</td>
                <td>${room.getRoomPrice()}</td>
                <td>${room.getRoomDescription()}</td>
                <td style="width: 170px; text-align: center;">
                    <button class="button"><a href='<c:url value="/editRoom?id=${room.getRoomId()}" />'><h2>Edit</h2></a></button>
                    <button class="button"><a href='<c:url value="/deleteRoom?id=${room.getRoomId()}" />'><h2>Delete</h2></a></button>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div id="footer"></div>
</div>

</body>
</html>
