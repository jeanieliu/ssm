<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/19
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>对象中的数据</title>
</head>
<body>
<%--
   name的值：和User字段名一致
--%>
   <form action="/user/login.do" method="get">
        用户id:<input type="text" name="uid"><br>
       用户名：<input type="text"name="uname"/><br>
       年龄：<input type="text" name="age"/><br>
       <input type="submit" value="注册">
   </form>

<form action="/user/loginpost.do" method="post">
    用户id:<input type="text" name="uid"><br>
    用户名：<input type="text"name="uname"/><br>
    年龄：<input type="text" name="age"/><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
