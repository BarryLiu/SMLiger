<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
    <meta charset="utf-8">
    <title>我的测试系统——登陆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/supersized/css/supersized.css?t=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/supersized/css/style.css?t=1">
    <style type="text/css">
    .rdo {
    width: 20px;
    height: 17px;
    background: rgba(45,45,45,.15);
    -moz-border-radius: 6px;
    -webkit-border-radius: 6px;
    border-radius: 6px;
    border: 1px solid #3d3d3d; /* browsers that don't support rgba */
    border: 1px solid rgba(255,255,255,.15);
    -moz-box-shadow: 0 2px 3px 0 rgba(0,0,0,.1) inset;
    -webkit-box-shadow: 0 2px 3px 0 rgba(0,0,0,.1) inset;
    box-shadow: 0 2px 3px 0 rgba(0,0,0,.1) inset;
    font-family: 'PT Sans', Helvetica, Arial, sans-serif;
}
    </style>
<script src="${pageContext.request.contextPath}/js/supersized/js/jquery-1.8.2.min.js" ></script>
<script src="${pageContext.request.contextPath}/js/supersized/js/supersized.3.2.7.min.js" ></script>
<script type="text/javascript">
    $(function() {
        $.supersized({
            // 功能
            slide_interval     : 2000,    // 转换之间的长度
            transition         : 1,    // 0 - 无，1 - 淡入淡出，2 - 滑动顶，3 - 滑动向右，4 - 滑底，5 - 滑块向左，6 - 旋转木马右键，7 - 左旋转木马
            transition_speed   : 1000,    // 转型速度
            performance        : 1,    // 0 - 正常，1 - 混合速度/质量，2 - 更优的图像质量，三优的转换速度//（仅适用于火狐/ IE浏览器，而不是Webkit的）

            // 大小和位置
            min_width          : 0,    // 最小允许宽度（以像素为单位）
            min_height         : 0,    // 最小允许高度（以像素为单位）
            vertical_center    : 1,    // 垂直居中背景
            horizontal_center  : 1,    // 水平中心的背景
            fit_always         : 0,    // 图像绝不会超过浏览器的宽度或高度（忽略分钟。尺寸）
            fit_portrait       : 1,    // 纵向图像将不超过浏览器高度
            fit_landscape      : 0,    // 景观的图像将不超过宽度的浏览器

            // 组件
            slide_links        : 'blank',    // 个别环节为每张幻灯片（选项：假的，'民'，'名'，'空'）
            slides             : [    // 幻灯片影像
                {image : '${pageContext.request.contextPath}/js/supersized/img/1.jpg'},
                {image : '${pageContext.request.contextPath}/js/supersized/img/2.jpg'},
                {image : '${pageContext.request.contextPath}/js/supersized/img/3.jpg'},
                {image : '${pageContext.request.contextPath}/js/supersized/img/4.jpg'},
            ]

        });
    });
</script>
</head>
<body>

<div class="page-container">
    <h1>我的测试系统登录(Login)</h1>
    <form  action="${pageContext.request.contextPath}/user/login" id="form1" method="post">
        <input type="text" id="userName" name="userName" class="username" placeholder="请输入您的用户名！">
        <input type="password" id="passWord" name="passWord" class="password" placeholder="请输入您的用户密码！">
        <div align="left" style="">
        	界面风格:<input type="radio" name="view_style" value="1" class="rdo" checked="checked">经典 &nbsp;&nbsp;&nbsp;&nbsp;
        		<input type="radio"   name="view_style"  value="2" class="rdo" >win7
         </div>
        <button id="login_btn" class="submit_button">登录</button>  <!-- type="submit"  -->
        <div style=" margin-top: 2%;" align="left" >
        	<a style="margin-left: 0px;"  href="#">注册新号</a>
        	<a style="margin-left: 200px;" href="#" >忘记密码</a>
        </div>
        <div class="error"><span>${error_msg}</span></div> 
    </form>
</div>
</body>
</html>