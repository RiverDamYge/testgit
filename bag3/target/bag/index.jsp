<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: RiverDamSN
  Date: 2020-07-24
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
</head>
<style>
    .d1{
        display: none;
    }
</style>
<script>

   function clk() {
       var b1=document.getElementById("b1");
       var d1=document.getElementById("d1");
       d1.style.display="block";
   }
</script>
<body>
<h1>背包</h1>
<div class="d1" id="d1">
    <table class="t1" id="t1">
        <tr>
            <th>编号</th>
            <th>名称</th>
            <th>个数</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="goods">
            <tr>
                <td>${goods.id}</td>
                <td>${goods.name}</td>
                <td>${goods.number}</td>
                <td><a href="/game/bag/DeleteByid/${goods.id}">删除</a></td>
                <td><a href="/game/bag/findById/${goods.id}">修改 </a></td>
            </tr>
        </c:forEach>
    </table>
    <a href="/save.jsp">添加</a>
</div>

<input type="button" id="b1" value="背包" onclick="clk()">
</body>
</html>