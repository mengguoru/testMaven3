<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/10
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>哈哈哈</title>
</head>
<body>
    <h3>中文测试3</h3>
    <a href="/helloSSM/Message/go">跳转</a><br/>
    <a href="/helloSSM/Message/index">跳转2</a><br/>

    用户名:<input type="text" id="userName" name="userName"/>
    <input type="button" value="查找" onclick="Search()"/>

    <form id="reportGet" action="Message/report1", method="get">
        开始:<input type="text" name="begin"/><br>
        结束:<input type="text"  name="end"/><br>
        <input type="submit" value="Get找到报表"/>
    </form>

    <form id="reportPost" action="Message/report2", method="post">
        开始:<input type="text" name="begin"/><br>
        结束:<input type="text"  name="end"/><br>
        <input type="submit" value="Post找到报表"/>
    </form>
    <script>
        function Search(){
            window.open("/helloSSM/Message/detail/data=" + document.getElementById("userName").value);
        }
    </script>
</body>
</html>
