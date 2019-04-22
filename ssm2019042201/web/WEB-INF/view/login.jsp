<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/29
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
  <form action="login.user" method="post">
      用户名:<input type="text" name="username" value="">
      <br>
      密码：<input type="password" name="password" value="">
      <br>
      <input type="checkbox" name="ifsave" value="1" >记住用户名和密码
      <br>
      <input type="submit" value="登录">

  </form>
<%--从cookie中取值--%>
    <%-- <%
        Cookie[] cookies=request.getCookies();
        if(cookies!=null){
            for(Cookie c:cookies){
                if(c.getName().equals("name")){
                    out.print(c.getValue());
                }
                if(c.getName().equals("password")){
                    out.print(c.getValue());
                }
            }
        }

     %>--%>

<script>
    var cs=document.cookie;
    // console.log(cs);
    var strs=cs.split(";");
    if(strs.length==2){
        for(var i=0;i<strs.length;i++){
            var s=strs[i];
           /* console.log(s.substr(s.indexOf("=")+1))*/
           var value=s.substr(s.indexOf("=")+1);
           if(i==0){
               document.getElementsByName("username")[0].value=value;
           }else{
               document.getElementsByName("password")[0].value=value;
           }
        }

        document.getElementsByName("ifsave")[0].checked=true;
    }
</script>


</body>
</html>
