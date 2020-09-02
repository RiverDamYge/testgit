<%--
  Created by IntelliJ IDEA.
  User: RiverDamSN
  Date: 2020-08-31
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/game/bag/update" method="post">
    编号:<input type="text" name="id" value="${goods.id}" /><br/>
    名称:<input type="text" name="name" value="${goods.name}"/><br/>
    数量:<input type="text" name="number" value="${goods.number}"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
