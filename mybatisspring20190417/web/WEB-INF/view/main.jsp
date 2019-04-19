<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/1
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>电商平台管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/lay.css">
</head>
<body>
<div class="laycontent">
    <%--通过include指令，调用页面--%>
   <%@include file="lay/top.jsp"%>
        <%--<jsp:include page="lay/top.jsp"></jsp:include>--%>
    <div class="lay_middle">
        <%@include file="lay/left.jsp"%>
        <div class="lay_right">
             显示页面
        </div>

    </div>
    <%@include file="lay/foot.jsp"%>
</div>
</body>
</html>
