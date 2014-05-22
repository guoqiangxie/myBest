<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>登录管理系统</title></head>
<body>
<div class="main">
    <input class="name" id="name" name="用户" value="" type="text"/>
    <input class="password" id="password" name="密码" value="" type="password"/>
    <input class="btn" name="登录" type="button"/>

    <div style="color: red;display: none;" id="error"></div>
</div>
</body>
</html>
