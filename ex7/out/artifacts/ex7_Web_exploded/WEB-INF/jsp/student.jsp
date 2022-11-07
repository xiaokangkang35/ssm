<%--
  Created by IntelliJ IDEA.
  User: HUAWEI
  Date: 2022/11/7
  Time: 8:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
    const o = new Array();
    o.push({sname:'a',age:20});
    o.push({sname:'b',age:21});
    $.ajax({
        type:"POST",
        url:"a",
        data:JSON.stringify(o),
        contentType:"application/json;charset=utf-8",
    })
</script>
<body>
    <input type="submit">
</body>
</html>
