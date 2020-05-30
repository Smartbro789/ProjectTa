<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="addroom.css">
    <title>Edit Room</title>
</head>
<body>
<div id="frame">
    <div id="header"><h1>Edit Room</h1></div>
    <form method="post">
        <input type="hidden" value="${room.roomId}" name="id" />
        <label>Number</label><br>
        <label>
            <input name="number" value="${room.roomNumber}" />
        </label><br><br>
        <label>Status</label><br>
        <label>
            <input name="status" value="${room.roomStatus}" />
        </label><br><br>
        <label>Type</label><br>
        <label>
            <input name="type" value="${room.roomType}" />
        </label><br><br>
        <label>Price</label><br>
        <label>
            <input name="price" value="${room.roomPrice}" />
        </label><br><br>
        <label>Description</label><br>
        <label>
            <input name="desc" value="${room.roomDescription}" />
        </label><br><br>
        <input class="button" type="submit" value="Save"/>
    </form>
    <div id="footer"></div>
</div>
</body>
</html>
