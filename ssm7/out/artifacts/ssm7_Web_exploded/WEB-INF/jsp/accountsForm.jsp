<%--
  Created by IntelliJ IDEA.
  User: HUAWEI
  Date: 2022/10/31
  Time: 21:36
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
    o.push({aname:'张三',amount:1000});
    o.push({aname:'b',amount:2000});
    $.ajax({
        type:"POST",
        url:"transfer",
        data:JSON.stringify(o),
        contentType:"application/json;charset=utf-8",
    })
</script>
<body>
    <h1>转账</h1>
    <form action="transfer2" method="post">
        转出账户1：<input name="accounts[0].aname" type="text"><br>
        金额1：<input name="accounts[0].amount" type="text"><br>
        转入账户2：<input name="accounts[1].aname" type="text"><br>
        金额2：<input name="accounts[1].amount" type="text"><br>
        转入账户3：<input name="accounts[2].aname" type="text"><br>
        金额3：<input name="accounts[2].amount" type="text"><br>
        <input type="submit">
    </form>
</body>
</html>
