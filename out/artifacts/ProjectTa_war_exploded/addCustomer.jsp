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
			<tr class="tr">
				<th>Standart</th>
				<th><button class="button"><a href="more.jsp"><h3>More</h3></a></button></th>
			</tr>
			<tr class="tr">
				<th>De Luxe</th>
				<th><button class="button"><a href="more.jsp"><h3>More</h3></a></button></th>
			</tr>
			<tr class="tr">
				<th>Family Room</th>
				<th><button class="button"><a href="more.jsp"><h3>More</h3></a></button></th>
			</tr>
			<tr class="tr">
				<th>Apartament</th>
				<th><button class="button"><a href="more.jsp"><h3>More</h3></a></button></th>
			</tr>
			
			<tr class="tr">
				<th>Villa</th>
				<th><button class="button"><a href="more.jsp"><h3>More</h3></a></button></th>
			</tr>
		</table>
		<div id="footer"></div>
	</div>

</body>
</html>