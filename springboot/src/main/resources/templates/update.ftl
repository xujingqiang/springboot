<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>update</title>
</head>
<body>
<form method="post" action="/user">
    <input type="hidden" name="_method" value="PUT">
    <input type="hidden" name="id" value="${user.id}">
    用户名:<input name="name" value="${user.name}">
    <br>
    性别:
    <#if user.sex == 1>
        <input type="radio" value="1" name="sex" checked>男
        <input type="radio" value="2" name="sex">女
    <#elseif user.sex == 2>
        <input type="radio" value="1" name="sex" >男
        <input type="radio" value="2" name="sex" checked>女
    </#if>

    <br>
    日期:<input type="text" name="date" value="${user.date}">
    <br>
    <input type="submit">
</form>
</body>
</html>