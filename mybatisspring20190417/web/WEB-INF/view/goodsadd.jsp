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
    <title>商品的添加</title>
    <link rel="stylesheet" type="text/css" href="css/lay.css">
    <script type="application/javascript" src="js/jquery-3.3.1.js"></script>
</head>
<body>
<div class="laycontent">
    <%--通过include指令，调用页面--%>
   <%@include file="lay/top.jsp"%>
        <%--<jsp:include page="lay/top.jsp"></jsp:include>--%>
    <div class="lay_middle">
        <%@include file="lay/left.jsp"%>
        <div class="lay_right">
            <form>
                <table>
                    <tr>
                    <td>商品编号</td>
                    <td><input type="text" name="gnum"></td>
                </tr>
                    <tr>
                        <td>商品名</td>
                        <td><input type="text" name="gname"></td>
                    </tr>
                    <tr>
                        <td>单价</td>
                        <td><input type="text" name="gprice"></td>
                    </tr>
                    <tr>
                        <td>库存量</td>
                        <td><input type="text" name="gstock"></td>
                    </tr>
                    <tr>
                        <td>描述</td>
                        <td><input type="text" name="gdesc"></td>
                    </tr>
                    <tr>
                        <td>分类</td>
                        <td>
                            <select name="cid">

                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="添加"/>
                        </td>

                    </tr>
                </table>

            </form>


        </div>

    </div>
    <%@include file="lay/foot.jsp"%>
</div>

<script>

/*
    $(function () {
        alert("测试");
    })
*/
   $(function () {
       //异步请求实现
       /*$.ajax({
           url:"cateall.cate",
           async:true,
           dataType:"json",
           success:function(result){
               /!*console.log(result);*!/
               /!*
               拼接：  <option value="1">玫瑰</option>
                         <option value="2">百合</option>
                         。。。。。。
               * *!/
            var  str="";

            $(result).each(function () {
                str+="<option value="+this.cid+">"+this.cname+"</option>"
            })
             console.log(str);

            //放入到元素中
           $("select[name='cid']").html(str);

           },
           error:function(){
               console.log("程序有误");
           }
       })*/


  //同步实现
       var  str="";
       $.ajax({
           url:"cateall.cate",
           async:false,
           dataType:"json",
           success:function(result){
               $(result).each(function () {
                   str+="<option value="+this.cid+">"+this.cname+"</option>"
               })
               console.log(str);
           },
           error:function(){
               console.log("程序有误");
           }
       })

       //放入到元素中
       $("select[name='cid']").html(str);
   })

</script>




</body>
</html>
