<%--
  Created by IntelliJ IDEA.
  User: kui.li
  Date: 2014/11/7
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>帮助信息</title>
    <link href="${pageContext.request.contextPath}/lib/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" id="mylink"/>
    <style type="text/css">
        span {
            display:block;
            min-width:1000px;
        }
    </style>
</head>
<body>
<form method="post" id="form1" action="upload" onsubmit="return checkParams()" enctype="multipart/form-data">
    <p>&nbsp;</p>

    <h1>餐补系统介绍</h1>

    <p>&nbsp;</p>


    <h5>用户管理</h5>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;【用户管理】-【用户】显示所有用户。</span>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;【用户管理】-【权限】为所有用户分配权限。(待续)</span>
    <p>&nbsp;</p>
    <h5>我的菜单</h5>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;【我的菜单】-【我的用餐记录】显示当前登录用户的所有用餐记录。(待续)</span>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;【我的菜单】-【我的缴费】显示当前登录用户缴费记录。(待续)</span>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;【我的菜单】-【我的统计】统计当前登录用户一段时间内总缴费,用餐,申请公费以及个人公费资产结余(待续)。</span>
    <p>&nbsp;</p>
    <h5>统计查询</h5>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;【统计查询】-【所有餐补】显示所有用户的所有缴费记录。</span>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;【统计查询】-【所有用餐记录】显示所有用户的用餐记录与漏餐记录以及处理情况。</span>
    <p>&nbsp;</p>
    <h5>后台管理</h5>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;【后台管理】-【上传考勤记录】上传打卡记录。</span>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;【后台管理】-【考勤异常表单】管理请假单，未打卡记录单等单据。</span>
    <p>&nbsp;</p>
    <h5>系统管理</h5>
    <span>&nbsp;&nbsp;&nbsp;&nbsp;【系统管理】-【账务基本类型】编辑系统支持哪些类型，如交公费、买菜、公共购物、申请报销、其它等（<font color="red" size="1">这里的数据一般只是系统初期设定，非特殊情况不做变更</font>）。 </span>
    <p>&nbsp;</p>
</form>
</body>
</html>
