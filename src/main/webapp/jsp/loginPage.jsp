<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>登录</title>
    <!-- 引入jquery-->
    <script type="text/javascript" src="${ctx}/static/jQuery/jquery-3.3.1.min.js"></script>
    <!-- 引入样式-->
    <link href="${ctx}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${ctx}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../static/vue/vue.js"></script>
</head>
<body>
<div class="container">
    <form action="${ctx}/user/login" method="post">
        <div class="row" style="height: 20%"></div>
        <div class="row">
            <div class="col-lg-3">
                <div class="row">用户名：</div>
                <div class="row">
                    <input type="text" id="userName" name="userName">
                </div>
                <div class="row">密码：</div>
                <div class="row">
                    <input type="password" id="userPassword" name="userPassword">
                </div>
                <div class="row">
                    <button type="submit">登录</button>
                </div>
            </div>
        </div>
    </form>

    <div class="row" id="app">
        <input type="text" >
        <p>hello</p>
    </div>
</div>
<script type="text/javascript">
    const vu = new Vue({
        el:"#app",
        data:{
            username:"xianghaowei"
        }
    })
</script>
</body>
</html>
