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
    <div class="container">
    <table border="1" id="table">
        <tr class="tr">
            <th class="colomn">Number</th>
            <th class="colomn">Status</th>
            <th class="colomn">Type</th>
            <th class="colomn">Price</th>
            <th class="colomn">Decsription</th>
            <th class="colomn"></th>
        </tr>
        <c:forEach var="room" items="${rooms}">
            <tr class="tr">
                <td class="colomn">${room.getRoomNumber()}</td>
                <td class="colomn">${room.getRoomStatus()}</td>
                <td class="colomn">${room.getRoomType()}</td>
                <td class="colomn">${room.getRoomPrice()} $</td>
                <td class="colomn">${room.getRoomDescription()}</td>
                <td  class="colomn" style="width: 170px; text-align: center;">
                    <button class="button"><a href='<c:url value="/editRoom?id=${room.getRoomId()}" />'><h2>Edit</h2></a></button>
                    <button class="button"><a href='<c:url value="/deleteRoom?id=${room.getRoomId()}" />'><h2>Delete</h2></a></button>
                </td>
            </tr>
        </c:forEach>
    </table>
    </div>
    <div id="footer"></div>
</div>

</body>
</html>
