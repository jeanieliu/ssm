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
    <title>添加分类</title>
</head>
<body>
<div class="laycontent">
    <%--通过include指令，调用页面--%>
    <%@include file="lay/top.jsp"%>
    <%--<jsp:include page="lay/top.jsp"></jsp:include>--%>
    <div class="lay_middle">
        <%@include file="lay/left.jsp"%>
        <div class="lay_right">
            <form method="post" action="add.cate">
               <table>
                   <tr>
                       <td>分类名</td>
                       <td><input type="text" name="cname" id="cname"></td>
                   </tr>
                   <tr>
                       <td colspan="2">
                           <input type="submit" value="增加" onclick="return checkName();">
                       </td>
                   </tr>
               </table>
            </form>
        </div>

    </div>
    <%@include file="lay/foot.jsp"%>
</div>


<script>
    /**
     * 定义方法：关键词：function
     * 定义的格式： function 方法名(参数){
     *                  方法体
     *          }
     *          没有返回类型，但是可以根据return的返回值来确定
     */
  function checkName(){
      /*获取元素<input type="text" name="cname" id="cname">*/
      /*1:使用id进行获取
      *   var: 数据类型
      *    cname：变量名：自定义的
      *    document.getElementById("cname"（要获取元素的id）)：根据id获取元素
      *    2:当元素的value为空，显示提示框：分类名不能为空
      *      否则：添加到数据库
      * */
     var cname= document.getElementById("cname");
     console.log(cname)
        //cname.value==""
        if(cname!=null&&cname.value.length==0){//判断是不是没有数据，数据长度为0，则没有数据：

           alert("分类名不能为空")
            return false;//不执行后面的语句
        }
        return true;//执行后的语句：onSubmit功能
    }
</script>

</body>
</html>
