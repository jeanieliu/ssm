<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/1
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.*,com.neuedu.entity.User" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>头部</title>
    <link rel="stylesheet" type="text/css" href="css/lay.css">
</head>
<body>

<div class="lay_top">

    电商平台管理系统
    <div>

        <div  class="date">
            <span id="resultdate">

            </span>
        </div>
        </div>
    退出
</div>

<script>
    function getDate(){
        var date=new Date();
        var year=date.getFullYear();
        var month=str(date.getMonth()+1);/*javascript中，月份使用0开始*/
        var day=str(date.getDay());
        var hours=str(date.getHours());
        var minutes=str(date.getMinutes());
        var second=str(date.getSeconds());

        var datestr=year+"年"+month+"月"+day+"日  "+hours+":"+minutes+":"+second;
        document.getElementById("resultdate").innerText=datestr;
    }
    getDate();//调用

    setInterval("getDate()",1000)

    function str(value){
        var val=value+"";
        if(val.length==1){
            return "0"+value;
        }else{
            return value;
        }
    }

</script>

</body>
</html>
