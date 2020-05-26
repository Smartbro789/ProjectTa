<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="addroom.css">
    <title>Add Room</title>
</head>
<body>
    <div id="frame">
        <div id="header"><h1>Room</h1></div>
        <form method="post">
            <label>Number:
                <input name="number"/>
            </label><br><br>
            <label>Type:
                <input name="type"/>
            </label><br><br>
            <label>Price:
                <input name="price"/>
            </label><br><br>
            <label>Description:
                <input name="desc"/>
            </label><br><br>
            <input class="button" type="submit" value="Add"/>
        </form>
        <div id="footer"></div>
    </div>

</body>
</html>
