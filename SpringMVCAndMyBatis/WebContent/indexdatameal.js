﻿var indexdata1 =
[
    { text: '我的菜单',isexpand:true, children: [
		{url:"mySupplement",text:"我的餐补"}
	]
    }
];


var indexdata2 =
    [
        { text: '我的菜单',isexpand:true, children: [
            {url:"mySupplement",text:"我的餐补"},
            {url:"kaoqin",text:"我的考勤"},
            {url:"search",text:"统计查询"}
        ]
        }
    ];
 
var indexdata3 =
    [
        { text: '用户管理', isexpand:false, children: [
            {url:'user', text:"用户", tabid:100101},
            {url:'permission', text:"权限", tabid:100102}
        ]},
        { text: '我的菜单',isexpand:true, children: [
            {url:"kaoqin",text:"我的考勤", tabid:100201},
            {url:"mySupplement",text:"我的餐补", tabid:100202},
            {url:"myleave", text:"我的考勤异常", tabid:100203},
            {url:"mystatistic", text:"我的统计", tabid:100204}
        ]},
        { text: '统计查询',isexpand:true, children: [
            {url:"search",text:"所有餐补",tabid:100301},
            {url:"leave",text:"所有考勤异常",tabid:100302},
            {url:"statistic",text:"所有统计",tabid:100303}
        ]},
        { text: '后台管理', isexpand:true, children: [
            {url:"upload.jsp",text:"上传考勤记录",tabid:100401},
            {url:'bill', text:"考勤异常单据",tabid:100402}
        ]},
        { text: '系统管理', isexpand:false, children: [
            {url:'billtype', text:"考勤异常单据类型",tabid:100501}
        ]}
    ];
var indexdata4 =
    [
     { text: '用户管理', isexpand:false, children: [
            {url:'userList', text:"用户", tabid:100101}
        ]},
        { text: '我的菜单',isexpand:true, children: [
            {url:"#",text:"我的用餐记录(待完善)",tabid:100201}
           ,{url:"#",text:"我的缴费(待完善)", tabid:100202}
           ,{url:"#",text:"我的统计(待完善)", tabid:100203}
        ]},
        { text: '统计查询',isexpand:true, children: [
           {url:"../expense/expenseList",text:"公共费用与支出"}
             ,{url:"#",text:"我的缴费(待完善)",tabid:100301}
             ,{url:"#",text:"统计查询(待完善)",tabid:100302}
           ]
        },
        { text: '系统管理', isexpand:false, children: [
          {url:'../expense/fundTypeList', text:"考勤异常单据类型",tabid:100501}
         ]}
    ];