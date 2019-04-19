<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>修改分类</title>
</head>
<body>
<div class="laycontent">
    <%--通过include指令，调用页面--%>
    <%@include file="lay/top.jsp"%>
    <%--<jsp:include page="lay/top.jsp"></jsp:include>--%>
    <div class="lay_middle">
        <%@include file="lay/left.jsp"%>
        <div class="lay_right">
            <form method="post" action="update.cate">
               <table>
                   <tr>
                       <td>分类名</td>
                       <td><input type="text" name="cname" value="${cate.cname}"></td>
                   </tr>
                   <tr>
                       <td colspan="2">
                           <input type="hidden" value="${cate.cid}" name="cid"/>
                           <input type="submit" value="修改">
                       </td>
                   </tr>
               </table>
            </form>
        </div>

    </div>
    <%@include file="lay/foot.jsp"%>
</div>
</body>
</html>
