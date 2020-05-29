<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="add.css">
	<title>Add Customer</title>
</head>
<body>
	<div id="frame">
		<div id="header"><h1>Registration</h1></div>
		<p>Name: <input name="Name"></p>
		<p>Surname: <input name="Surname"></p>
		<p>Date: <input name="Date"></p>
		<table border="1" id="table">
			<c:forEach var="type" items="${types.keySet()}">
				<tr class="tr">
					<td>${type}</td>
					<td>${types.get(type).size()}</td>
					<td><button class="button"><a href="more.jsp"><h3>More</h3></a></button></td>
				</tr>
			</c:forEach>
		</table>
		<div id="footer"></div>
	</div>
</body>
</html>
