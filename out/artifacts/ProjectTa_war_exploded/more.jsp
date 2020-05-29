<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="more.css">
	<title>more</title>
</head>
<body>
	<div id="frame">
		<div id="header"><h1 id="logo">Book Room</h1></div>
		<table border="1" id="table">
			<tr class="tr">
				<th>NUMBER</th>
				<th>PRICE</th>
				<th>DESCRIPTION</th>
			</tr>
			<c:forEach var="room" items="${rooms}">
				<tr class="tr">
					<td>${room.getRoomNumber()}</td>
					<td>${room.getRoomPrice()}</td>
					<td>${room.getRoomDescription()}</td>
					<th><button class="button"><a href='<c:url value="/book?number=${room.getRoomNumber()}" />'><h3>To Book</h3></a></button></th>
				</tr>
			</c:forEach>
		</table>
		<div id="footer"></div>
	</div>

</body>
</html>