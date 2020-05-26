<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="style.css">
	<title>hotel</title>
</head>
<body>
	<div id="frame">
		<div id="header">
			<button class="button"><a href="${pageContext.request.contextPath}/addCustomer.jsp"><h2>Add Customer</h2></a></button>
			<button class="button"><a href="${pageContext.request.contextPath}/rooms.jsp"><h2>Rooms</h2></a></button>
		</div>
		<table border="1" id="table">
			<tr class="tr">
				<th>ID</th>
				<th>NAME</th>
				<th>ROOM</th>
				<th>DATE</th>
			</tr>
			<tr class="tr">
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr class="tr">
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr class="tr">
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr class="tr">
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
		<div id="footer"></div>
	</div>

</body>
</html>