<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/28
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@page import="java.util.*,com.neuedu.entity.User" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示用户信息</title>
</head>
<body>

<div class="laycontent">
    <%@include file="/lay/top.jsp"%>
    <div class="lay_middle">
        <%@include file="lay/left.jsp"%>
        <div class="lay_right">

            <a href="useradd.jsp"><input type="button" value="添加"></a>
            <table>
                <caption>显示用户信息</caption>
                <tr>
                    <th>用户名</th>
                    <th>电话号码</th>
                    <th>住址</th>
                    <th>操作</th>
                </tr>
              <%--  <%
                    List<User> userList=(List<User>)request.getAttribute("users");
                    for(User u:userList) {
                        out.print("<tr >"+
                                "<td >" +u.getUname()+"</td >"+
                                "<td >" +u.getTelephone()+"</td >"+
                                "<td >" + u.getAddress()+"</td >"+
                                "<td > <a href='delete.user?id="+u.getUid()+"'>删除</a> &nbsp;&nbsp;&nbsp;<a href='find.user?id="+u.getUid()+"'>修改</a></td ></tr >");
                    }
                %>--%>
                <%--
                   显示所有的数据：
                   循环标签： <c:forEach>
                </c:forEach>
                items：传入的集合元素
                       通过el表达式调用
                       ${users}-- userlist
                  var:user(自定义) --- u
                  ${user.uname}:user.属性
                --%>
                <c:forEach items="${users}" var="user" >
                    <tr >
                        <td > ${user.uname} </td >
                        <td > ${user.telephone}</td >
                        <td >${user.address} </td >
                       <td > <a href='delete.user?id=${user.uid}'>删除</a> &nbsp;&nbsp;&nbsp;<a href='find.user?id=${user.uid}'>修改</a></td >
                    </tr >


                </c:forEach>

            </table>

        </div>

    </div>
    <%@include file="lay/foot.jsp"%>
</div>


</body>

</html>
