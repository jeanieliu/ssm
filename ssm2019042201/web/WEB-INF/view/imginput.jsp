<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/4
  Time: 8:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图片的处理--上传图片</title>
</head>
<body>
      <img src="imgload/img01.jpg" id="imgshow" style="width: 100px;height: 100px"/>
   <form action="imginput.goods" method="post" enctype="multipart/form-data">
       <input type="file" name="inputfile" onchange="fun(this)">
       <br>
       <input type="submit" value="图片上传">
   </form>

      <%--添加的时候预览的实现--%>
      <script>
          function fun(element){
               var file=element.files.item(0);//第一个文件
               console.log(file)
                var url=window.URL.createObjectURL(file);//创建url
               document.getElementById("imgshow").src=url;
          }
      </script>



<%--
1：数据库中保存的是图片的路径（或者图片的名）
2：图片存放的位置：1）服务器中
                   2）本地存放 ==== 第三方进行存储
--%>
   <%--
     如何上传图片
      1）页面的设置
         <form action=""></form>
         中必须设置两个属性
         method="post"：请求的方式post
          enctype="multipart/form-data"：编码
     2）servlet的设置
   --%>
</body>
</html>
