<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<script src="../jquery-1.11.3.min.js"></script>

<body>

    <form id="formId" METHOD="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>

    <a href="/add">增加</a>
    <center>
        <table border="1">
            <tr>
                <td>编号</td>
                <td>用户名</td>
                <td>性别</td>
                <td>日期</td>
                <td>操作</td>
            </tr>
            <#list user as user>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>
                        <#if user.sex == 1>
                            男
                        <#elseif user.sex == 2>
                            女
                        </#if>
                    </td>
                    <td>${user.date}</td>
                    <td>
                        <a href=javascript:del(${user.id})>删除</a>
                        <a href="update/${user.id}">修改</a>
                    </td>
                </tr>
            </#list>
        </table>
    </center>
</body>
    <script>  function del(id) {
        $("#formId").prop("action","user/"+id);
        $("#formId").submit();
    }
    </script>
</html>