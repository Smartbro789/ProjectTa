<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="more.css">
    <title>Book a room</title>
</head>
<body>
<form method="POST">
    <p>Name: <input name="name"></p>
    <p>Surname: <input name="surname"></p>
    <p>Date: <input type="date" id="start" name="date"
                    min="2020-01-01" max="2021-12-31"></p>
    <input class="button" type="submit" value="Book"/>
</form>
</body>
</html>
