<%--
  Created by IntelliJ IDEA.
  User: HUAWEI
  Date: 2022/11/7
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>insert title here</title>
    <script type="text/javascript" src="js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
        const obj = new Array();
        const str = "{'name': 'zhangsan'}";
        $.ajax({
            type:"POST",
            url:"test4",
            data:"",
            contentType:"application/json;charset=utf-8",
            success:function (data){
                alert(data.name);
            }
        })
    </script>
</head>
<body>
    <form action="test5" method="post" enctype="multipart/form-data">
        <input type="text"><br>
        文件1：<input type="file" name="files"><br>
        文件2：<input type="file" name="files"><br>
        文件3：<input type="file" name="files"><br>
        文件4：<input type="file" name="files"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
