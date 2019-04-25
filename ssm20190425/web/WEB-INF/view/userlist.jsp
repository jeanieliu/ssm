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
        <%@include file="/lay/left.jsp"%>
        <div class="lay_right">

            <a href="/user/addlist.do"><input type="button" value="添加"></a>
            <table>
                <caption>显示用户信息</caption>
                <tr>
                    <th>用户名</th>
                    <th>电话号码</th>
                    <th>住址</th>
                    <th>操作</th>
                </tr>

                <c:forEach items="${pages.list}" var="user" >
                    <tr >
                        <td > ${user.uname} </td >
                        <td > ${user.telephone}</td >
                        <td >${user.address} </td >
                       <td > <a href='/user/${user.uid}/delete.do'>删除</a> &nbsp;&nbsp;&nbsp;<a href='find.user?id=${user.uid}'>修改</a></td >
                    </tr >


                </c:forEach>

            </table>
            <div><input type="button" id="first" value="第一页" onclick="first()">
                <input type="button" id="pre" value="上一页" onclick="preb()">
                <input type="button" id="next" value="下一页" onclick="nexb()">
                <input type="button" id="last" value="最后一页" onclick="last()"></div>
        </div>

    </div>

    <%@include file="/lay/foot.jsp"%>
</div>

<script>
    /*
    *  直接设置第一页和最后一页的按钮是否可用
    * */
    var isFirstPage=${pages.isFirstPage}
    if(isFirstPage==true){
    document.getElementById("first").setAttribute("disabled","disabled")
    }else{
        document.getElementById("first").removeAttribute("disabled");
    }

    var isLastPage=${pages.isLastPage}
    if(isLastPage==true){
        document.getElementById("last").setAttribute("disabled","disabled")
    }else{
        document.getElementById("last").removeAttribute("disabled");
    }

    var hasPreviousPage=${pages.hasPreviousPage}

    if(hasPreviousPage==false){
        document.getElementById("pre").setAttribute("disabled","disabled")
    }else{
        document.getElementById("pre").removeAttribute("disabled");
    }

    var hasNextPage=${pages.hasNextPage}

    if(hasNextPage==false){
        document.getElementById("next").setAttribute("disabled","disabled")
    }else{
        document.getElementById("next").removeAttribute("disabled");
    }

    function first(){
        window.location.href="/user/list.do?pageNum=1";
    }

    function last(but){
        window.location.href="/user/list.do?pageNum=${pages.pages}";
    }

   function preb() {
       window.location.href="/user/list.do?pageNum="+(${pages.pageNum}-1);
   }

   function nexb(){

       window.location.href="/user/list.do?pageNum="+(${pages.pageNum}+1);
   }

</script>
</body>

</html>
