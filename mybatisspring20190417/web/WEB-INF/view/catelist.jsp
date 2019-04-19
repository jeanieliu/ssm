<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>分类显示</title>
</head>
<body>
<div class="laycontent">
    <%--通过include指令，调用页面--%>
    <%@include file="lay/top.jsp"%>
    <%--<jsp:include page="lay/top.jsp"></jsp:include>--%>
    <div class="lay_middle">
        <%@include file="lay/left.jsp"%>
        <div class="lay_right">
            <a href="cateadd.jsp"><input type="button" value="添加"></a>
            <table>

                <tr>
                    <td>分类编号</td>
                    <td>分类名</td>
                    <td>操作</td>
                </tr>
                <c:forEach items="${cates}" var="cate">
                    <tr>
                        <td>${cate.cid}</td>
                        <td>${cate.cname}</td>
                        <td><a href="delete.cate?id=${cate.cid}">删除</a>&nbsp;&nbsp;<a href="find.cate?id=${cate.cid}">修改</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </div>
    <%@include file="lay/foot.jsp"%>
</div>
</body>
</html>
