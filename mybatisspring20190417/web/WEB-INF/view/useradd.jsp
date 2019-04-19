<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/28
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.neuedu.entity.User" %>
<html>
<head>
    <title>添加用户</title>
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
            <form method="post" action="add.user">
                <table>
                    <caption>添加用户</caption>
                    <tr>
                        <td>用户名</td>
                        <td><input type="text" name="username" onblur="checkName(this)"><span id="result"></span></td>
                    </tr>
                    <tr>
                        <td>密码</td>
                        <td><input type="password" name="password"></td>
                    </tr>
                    <tr>
                        <td>电话</td>
                        <td><input type="text" name="telephone"></td>
                    </tr>
                    <tr>
                        <td>地址</td>
                        <td><input type="text" name="address"></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <%--onclick="return checkValue();"--%>
                            <input type="submit" value="添加" >

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
    * 1:测试jquery调用是否成功
    *  $(function () {
        alert("测试")
    })‘

    $===>jquery
    功能：javasript中的onload


    */

    function checkName(name){
        //1:从页面中提取name的值
        /*console.log(name)*/
        var username=$(name).val();
       /* console.log(username);*/

        /**
         * 将数据传入servlet进行处理，并接收servlet返回的数据
         */

        $.ajax({
            url:"checkName.user",/*servlet的处理*/
            data:{"uname":username},/*向服务器传入数据：数据格式json*/
            dataType:"json",/*接收返回的类型："xml": 返回 XML 文档，可用 jQuery 处理。
"html": 返回纯文本 HTML 信息；包含的 script 标签会在插入 dom 时执行。
"script": 返回纯文本 JavaScript 代码。不会自动缓存结果。除非设置了 "cache" 参数。注意：在远程请求时(不在同一个域下)，所有 POST 请求都将转为 GET 请求。（因为将使用 DOM 的 script标签来加载）
"json": 返回 JSON 数据 。
"jsonp": JSONP 格式。使用 JSONP 形式调用函数时，如 "myurl?callback=?" jQuery 将自动替换 ? 为正确的函数名，以执行回调函数。
"text": 返回纯文本字符串*/
            async:true,/*默认true异步传输*/
            type:"get",/*请求的类型：get(默认);post*/
            success:function (result) {/*通过回调函数处理返回的数据*/
                //result={"flag":true}
               /* console.log(result);*/
               /*console.log(result.flag)*/
               if(result.flag==true){
                   $("#result").text("用户名可用")
               }else{
                   $("#result").text("用户名已用，重写输入新的用户名")
               }
            },
            error:function(){
              console.log("发生错误")
        }
        })
/*
*
* 原生ajax
* */

//1：生成对象----XMLHttpRequest
/*

    var xmlhttprequest=new  XMLHttpRequest();


    //3:处理
       // 存储函数（或函数名），每当 readyState 属性改变时，就会调用该函数。
        xmlhttprequest.onreadystatechange=function(){
            /!**
             * 存有 XMLHttpRequest 的状态。从 0 到 4 发生变化。
             * 0: 请求未初始化1: 服务器连接已建立
             * 2: 请求已接收
             * 3: 请求处理中
             * 4: 请求已完成，且响应已就绪
             * *!/
            console.log("readyState:"+xmlhttprequest.readyState)
            if(xmlhttprequest.readyState==4){
                //响应状态：200  404
                console.log("status:"+xmlhttprequest.status)
                if(xmlhttprequest.status==200){
                    // 响应的数据：responseText ;responseXML
                    console.log(xmlhttprequest.responseText)
                }
            }
        }

   //2：与服务器进行数据交换

        /!**
         * 规定请求的类型、URL 以及是否异步处理请求。
         * method：请求的类型；GET 或 POST
         * url：文件在服务器上的位置
         * async：true（异步）或 false（同步）
         *!/
   xmlhttprequest.open("get","checkName.user?uname="+username,true);

   xmlhttprequest.send();

*/





    }


</script>




<%--
   1:不能为空
   2：密码的长度最少6字符
   3：电话号码11位， 数字
--%>
<script>
    function checkValue() {
        /**
         * 1:通过name值获取元素
         *  document.getElementsByName("username")得到的一个Object数组
         *    存放name=username的所有的元素
         *    现在获取的是第一个元素，所有[0]
         */
        var uname = document.getElementsByName("username")[0];
        /*console.log(uname);*/
        var pwd = document.getElementsByName("password")[0];
        var telephone = document.getElementsByName("telephone")[0];
        var address = document.getElementsByName("address")[0];

        /*
        * 2:判断不为空
        * */

        if (uname.value.length == 0) {
            alert("用户名不能为空");
            return false;
        }

        if (pwd.value.length == 0) {
            alert("密码不能为空");
            return false;
        }
        if (telephone.value.length == 0) {
            alert("电话不能为空");
            return false;
        }
        if (address.value.length == 0) {
            alert("地址不能为空");
            return false;
        }

        /*
        * 3：密码的长度最低6
        * */
        if (pwd.value.length < 6) {
            alert("密码的长度最少6个字符");
            return false;
        }

        /**
         * 4：电话号码11位， 数字
         */
        if (telephone.value.length != 11) {
            alert("电话号码输入不正确");
            return false;
        }
        /**
         *  * 正则表达式：第一个字符1-9的数字，第二个字符到第11个字符是0-9里面的数
         * ^:从第一个字符开始比较
         * $:比较到最后一个
         * 电话号码："^[1-9]{1}[0-9]{10}$"
         * 身份证："^ [1-9]{1}[0-9]{16}[0-9Xx]{1}$"
         * 邮箱：\w+@\w+.\w+
         *     \w:匹配的字母，数字,_====>[a-zA-Z0-9_]
         *     +:至少匹配一个
         * 1：new RegExp()
         * 2:/正则表达式/;
         *
         * 3：变量.test（要验证的字符串）：
         *     true：满足条件的
         *     false：不满足条件的
         * 4：trim()：删除字符串两端的空格
         *     |     kdjfkd    |.trim()=kdjfkd
         *
         */
       // var reg = new RegExp("^[1-9]{1}[0-9]{10}$")
        var reg=/^[1-9]{1}[0-9]{10}$/;
        // console.log(reg.test(telephone.value))
        if (!reg.test(telephone.value.trim())) {
            alert("电话号码必须是数字");
            return false;
        }

      //  var reg2=new RegExp("^[1-9]{1}[0-9]{16}[0-9Xx]{1}$");
       /* var reg2=/^[1-9]{1}[0-9]{16}[0-9Xx]{1}$/;
        console.log(address.value.trim())
        console.log(reg2.test(address.value.trim()))*/
        return false;
    }
</script>
</body>
</html>
