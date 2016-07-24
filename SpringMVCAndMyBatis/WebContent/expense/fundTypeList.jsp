<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>用户</title>

<%@include file="/header.jsp" %>
<script src="${pageContext.request.contextPath}/indexdatameal.js"
	type="text/javascript"></script>

<style type="text/css">
#maingrid table td a {
	color: #395a7b;
	text-decoration: none;
}

#maingrid table td a:hover {
	text-decoration: underline;
}
</style>
<script type="text/javascript">

        //var editID = "";
		
     /*    var userdata = '';
         	 $.ajaxSettings.async = false;
       	 $.getJSON("${pageContext.request.contextPath}/user/userListData", function(data) {
       	
       	   userdata =JSON.stringify(data); 
       	userdata = '{Rows:'+userdata + ' ,Total: 91}';
       		alert(userdata);
        });   */
        
        var gridManager = null;
        var statusData = [{Status:0,text:'参与考勤'},{Status:1,text:'不参与考勤'},{Status:2,text:'离职'},{Status:3,text:'高管'}];
        $(function () {
            //表格
//            var data = {Rows:[{user_info:'210000010-蔡正龙',day_str:'2014-10-15',start_time:'09:26:54',end_time:'21:05:28',fee1:'null',fee2:'12',fee3:'15',fee4:'null',fee5:'null'}]};
            $("#maingrid").ligerGrid({
                columns: [
                    { display: '用户名', name: 'username', isSort: 'true', width: 150, minWidth: 60 },
                    { display: '姓名', name: 'trueName',align: 'center', isSort: 'true', width: 150, minWidth: 60 },
                    { display: '描述', name: 'groupNames',align: 'center', isSort: 'true', width: 400, minWidth: 200 },
                    { display: '加入时间', name: 'createDate', align: 'center', isSort: 'true', width: 100, minWidth: 60,
                        editor: {type:'date', format:'yyyy/MM/dd', onChange:function(item) {
                            var before = item.record.enterDay;
                            var after = item.value;
                            if(after == null) { //不能修改为空
                                item.value = before;
                            } else {
                                var date = new Date(after);
                                var afterDay = Admin.formatToDate(date);
                                if(before != afterDay) {
                                    var id = item.record.id;
                                    DWREngine.setAsync(false);
                                    dwr.updateUserEnterDay(id, afterDay, function(data) {
                                        var res = eval("("+data+")");
                                        if(!res.res) {
                                            item.value = before;
                                            Tip.tip(res.msg);
                                        } else {
                                            Tip.tip("修改成功！");
                                            item.value = afterDay;
                                        }
                                    });
                                    DWREngine.setAsync(true);
                                } else { //必须要手动赋值回退，不然就会显示为日期字符串了
                                    item.value = before;
                                }
                            }
                        }},
                        render: function(item) {
                            if(item.enterDay == "") {
                                return "<a href='javascript:void(0);'>点击录入</a>";
                            } else {
                                return "<a href='javascript:void(0);'>"+item.enterDay+"</a>";
                            }
                        }
                    },
                     //yingjing.liu add  20160629 start 添加离职日期
                    { display: '退出时间', name: 'updateDate', align: 'center', isSort: 'true', width: 100, minWidth: 60,
                         editor: {type:'date', format:'yyyy/MM/dd', onChange:function(item) {
                            var before = item.record.leaveDay;
                            var after = item.value;
                            if(after == null) { //不能修改为空
                                item.value = before;
                            } else {
                                var date = new Date(after);
                                var afterDay = Admin.formatToDate(date);
                                if(before != afterDay) {
                                    var id = item.record.id;
                                    DWREngine.setAsync(false);
                                    dwr.updateUserLeaveDay(id, afterDay, function(data) {
                                        var res = eval("("+data+")");
                                        if(!res.res) {
                                            item.value = before;
                                            Tip.tip(res.msg);
                                        } else {
                                            Tip.tip("修改成功！");
                                            item.value = afterDay;
                                        }
                                    });
                                    DWREngine.setAsync(true);
                                } else { //必须要手动赋值回退，不然就会显示为日期字符串了
                                    item.value = before;
                                }
                            }
                        }},
                        render: function(item) {
                            if(item.leaveDay == "") {
                                return "<a href='javascript:void(0);'></a>";
                            } else {
                                return "<a href='javascript:void(0);'>"+item.leaveDay+"</a>";
                            }
                        }
                    },//yingjing.liu add  20160629 end
                    { display: '状态', name: 'status', align: 'center',isSort: 'true',type:'int', width: 100, minWidth: 60, render: function(item) {
                        if(item.status==null || item.status==0) {
                            return "<a href='javascript:void(0);'>参与考勤</a>";
                        } else if(item.status == 1) {
                            return "<a href='javascript:void(0);'>不参与考勤</a>";
                        } else if(item.status == 2) {
                            return "<a href='javascript:void(0);'>离职</a>"
                        } else if(item.status == 3) {
                            return "<a href='javascript:void(0);'>高管</a>"
                        } else {
                            return item.status;
                        }
                    },editor:{type:'select',data:statusData, valueField:'Status',textField:'text',onChange:function(item) {
                        //alert(item.record.status+":"+item.record.id+":"+item.record.name+":"+item.value);
                        var before = item.record.status;
                        var after = item.value;
                        if(after == '') {
                            item.value = before; //数据回退
                        } else if(before != after) {
                            var id = item.record.id;
                            //if(id == 20042) {item.value = before;}
                            DWREngine.setAsync(false);
                            dwr.updateUserStatus(id, after, function(data) {
                                var res = eval('('+data+')');
                                //alert(data+":"+res.res);
                                if(!res.res) {
                                    item.value = before; //数据回退
                                    $.ligerDialog.alert(res.msg);
                                } else {
                                    Tip.tip("修改成功！");
                                }
                            });
                            DWREngine.setAsync(true);
                        }
                        return true;
                    }} },
                    { display: '最近登录时间', name: 'lastLogin',type:'date',format:'yyyy-MM-dd hh:mm:ss', align: 'center', isSort: 'true', width: 100, minWidth: 60 }
                ], dataAction: 'server', data: ${data}, sortName: 'day_str',enabledEdit:true,
                width: '100%', height: '100%', pageSize: 20, rownumbers: false,
                checkbox: false,
                //应用灰色表头
                cssClass: 'l-grid-gray',
                heightDiff: -6,

                toolbar: { items: [
                    { text: '增加', click: btnaddItemClick, icon: 'add',url: ""  },
                     { line: true },
                     { text: '修改', click: modifyItemClick, icon: 'modify',url:"" }, 
                    { line: true },

                ]
                }
            });

            gridManager = $("#maingrid").ligerGetGridManager();

            $("#pageloading").hide();

            //$("#sDate").ligerDateEditor({labelWidth: 100, labelAlign: 'right'});
            //$("#eDate").ligerDateEditor({labelWidth: 100, labelAlign: 'right'});
        });


        save =function (){
			  alert("提交了");	
			  var euf= $("#EditUserForm");
			  euf.submit();
        }
         function btnaddItemClick(){
        	 var detailWin =  $.ligerDialog.open({ title:"添加用户",target:$("#Editdetail"), height: 400,width: 550,
            	 buttons: [
                           { text: '保存', onclick: function () { save(); } },
                           { text: '取消', onclick: function () { detailWin.hide(); } }
                           ]});
        }
         function modifyItemClick(){
        	 var row = gridManager.getSelectedRow();
             if (row == 'null' || !row) { 
            	 $.ligerDialog.alert('请选择要修改的人', '提示', 'warn'); 
             return; 
             }
             $("#userName").val(row.userName);
             $("#trueName").val(row.trueName)
			 $("#groupNames").val(row.groupNames);
             
        	 var detailWin = $.ligerDialog.open({ title:"修改用户",target:$("#Editdetail"), height: 400,width: 550,
            	 buttons: [
                           { text: '保存', onclick: function () { save(); } },
                           { text: '取消', onclick: function () { detailWin.hide();} }
                           ]});
         }

         function getJson() {
        	 var jsonStr = '';
        	 $.ajaxSettings.async = false;
        	$.getJSON("${pageContext.request.contextPath}/user/userListData", function(data) {
        		jsonStr = eval(data);
        	       		alert(jsonStr);
        	       		alert(jsonStr.Row)
        	       		alert(jsonStr.Row.length)
        	 });
          /*   $.ligerDialog.waitting("正在同步，请稍后...");
            dwr.syncLdapUser(function() {
                $.ligerDialog.closeWaitting();
                location.reload();
            }); */
        }  
    </script>
</head>
<body style="padding: 0px; overflow: hidden;">
	<div class="l-loading" style="display: block" id="pageloading"></div>
	<form id="form1" action="user" method="post" >
		<div id="toptoolbar"></div>
		
		<div class="l-panel-search" style="display: none;">
			<div class="l-panel-search-item">账户名：</div>
			<div class="l-panel-search-item">
				<input type="text" id="username" name="pms.username"
					value="${pms.username}" />
			</div>
			<div class="l-panel-search-item">部门：</div>
			<div class="l-panel-search-item">
				<input type="text" id="depart" name="pms.depart"
					value="${pms.depart}" />
			</div>
			<div class="l-panel-search-item">
				<input type="submit" value="搜 索" />
			</div>
			<div style="float: right; margin-right: 10px;">
				<input type="button" value="得到json" onclick="getJson();">
			</div>
		</div>

		<div id="maingrid" style="margin: 0; padding: 0"></div>

	</form>
	<div style="display: none;"></div>


	<!--添加用户 -->
	<div id="Editdetail" style="display:none;">
	<form id="EditUserForm"  action="${pageContext.request.contextPath}/user/saveOrmodifyUser" method="post">
		<input type="hidden" name="id" id="id">
		<table>
			<tr>
				<td style="align:right">用户名：</td>
				<td><input type="text" name="userName" id="userName"></td>
			</tr>
			<tr>
				<td style="align:right">姓名：</td>
				<td><input type="text" name="trueName" id="trueName"></td>
			</tr>
			<tr>
				<td style="align:right">描述：</td>
				<td>
					<textarea rows="60%" cols="60%" name="groupNames" id="groupNames"></textarea>
				</td>
			</tr>
			<tr>
				<td style="align:right">状态：</td>
				<td>
				
				</td>
			</tr>
		</table>
	 </form> 
	</div>   
</body>
</html>
