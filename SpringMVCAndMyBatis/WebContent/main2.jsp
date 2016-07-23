<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

 <title></title>
    <link href="lib/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css">
    <script src="lib/jquery/jquery-1.9.0.min.js" type="text/javascript"></script>
    <script src="lib/ligerUI/js/core/base.js" type="text/javascript"></script>
   <script src="lib/ligerUI/js/plugins/ligerLayout.js" type="text/javascript"></script>
 <style type="text/css">
    </style> 
 
        <script type="text/javascript"> 
            $(function ()
            { 
 
                $("#layout1").ligerLayout({
                    onLeftToggle: function (isColl)
                    {
                        alert(isColl ? "收缩" : "显示");
                    },
                    onRightToggle: function (isColl)
                    {
                        alert(isColl ? "收缩" : "显示");
                    },
 
                });
            });
             
     </script> 
    <style type="text/css">
        body{ padding:10px; margin:0;}
        #layout1{  width:100%; margin:40px;  height:400px;
                   margin:0; padding:0;}
        #accordion1 { height:270px;}
         h4{ margin:20px;}
    </style>
 
 
   
        <div class="l-layout" id="layout1" style="height: 352.56px;" ligeruiid="layout1">
             <div class="l-layout-left" style="left: 0px; top: 55px; width: 110px; height: 241px;"><div class="l-layout-header"><div class="l-layout-header-toggle"></div><div class="l-layout-header-inner"></div></div><div class="l-layout-content" position="left"></div></div>
            <div class="l-layout-center" style="left: 115px; top: 55px; width: 1032px; height: 241px;"><div class="l-layout-header">标题</div><div title="" class="l-layout-content" style="height: 216px;" position="center">
            <h4>$("#layout1").ligerLayout(); </h4>
            默认为固定layout的高度百分一百
            </div></div>
            <div class="l-layout-right" style="left: 1152px; top: 55px; width: 170px; height: 241px;"><div class="l-layout-header"><div class="l-layout-header-toggle"></div><div class="l-layout-header-inner"></div></div><div class="l-layout-content" position="right"></div></div>
            <div class="l-layout-top" style="top: 0px; height: 50px;"><div class="l-layout-content" position="top"></div></div>
            <div class="l-layout-bottom" style="top: 301px; height: 50px;"><div class="l-layout-content" position="bottom"></div></div>
        <div class="l-layout-lock"></div><div class="l-layout-drophandle-left" style="left: 110px; top: 55px; height: 241px; display: block;"></div><div class="l-layout-drophandle-right" style="left: 1149px; top: 55px; height: 241px; display: block;"></div><div class="l-layout-drophandle-top" style="top: 50px; width: 1322px; display: block;"></div><div class="l-layout-drophandle-bottom" style="top: 298px; width: 1322px; display: block;"></div><div class="l-layout-dragging-xline"></div><div class="l-layout-dragging-yline"></div><div class="l-dragging-mask" style="height: 353px;"></div><div class="l-layout-collapse-left" style="top: 55px; height: 241px; display: none;"><div class="l-layout-collapse-left-toggle"></div></div><div class="l-layout-collapse-right" style="top: 55px; height: 241px; display: none;"><div class="l-layout-collapse-right-toggle"></div></div></div> 
            
     <div style="display:none;">
      
</div> 
</html>