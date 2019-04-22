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
    <div class="lay_top">
        电商平台管理系统
    </div>
    <div class="lay_middle">
        <div class="lay_left">
            <div>
                <a href="list.user" target="content">用户管理</a>
            </div>
            <div>
                <a href="#">分类管理</a>
            </div>
            <div>
                <a href="#">商品管理</a>
            </div>
            <div>
                <a href="#">订单管理</a>
            </div>
            <div>
                <a href="#">密码修改</a>
            </div>
        </div>
        <div class="lay_right">
            <%--嵌入的框架iframe ：属性：name style src：初始界面--%>
            <iframe name="content" style="width:100%;height: 100%;border:0px;" src="welcome.jsp" >

            </iframe>
        </div>

    </div>
    <div class="lay_foot">版权</div>
</div>
</body>
</html>
