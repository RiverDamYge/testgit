

<%--
  Created by IntelliJ IDEA.
  User: RiverDamSN
  Date: 2020-08-12
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save</title>
</head>
<body>
<form action="/game/bag/save" method="post">
    编号:<input type="text" name="id" /><br/>
    数量:<input type="text" name="number"/><br/>
    名称:<input type="text" name="name" /><br/>
    <input type="submit" value="保存"/>
</form>
</body>
</html>
