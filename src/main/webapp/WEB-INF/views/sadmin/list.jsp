<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../../../common/basejspf/base.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有用户</title>
<%@ include file="../../../../common/basejspf/easyui.jspf"%>
<style type="text/css">
.center {
	/* position: absolute; */
	left: 0;
	right: 0;
	top: 0;
	bottom: 0;
	margin: 0;
}
</style>
</head>
<body>
	<div class="center">
		<div id="allusers"></div>
	</div>
	<script type="text/javascript">
		$(function(){
			$("#allusers").datagrid({
				fitColumns:true,
				cls:"easyui-datagrid",
				title:"所有用户",
				url:"list.action",
				columns:[[    
				          {field:'username',title:'姓名',width:150,align:'center'},    
				          {field:'sex',title:'性别',width:150,align:'center'},
				          {field:'account',title:'账户',width:150,align:'center'},
				          {field:'phone',title:'手机',width:150,align:'center'},
				          {field:'email',title:'邮箱',width:150,align:'center'},
				          {field:'roleName',title:'角色',width:150,align:'center'},
				          {field:'altertime',title:'创建时间',width:150,align:'center',
				        	  formatter:function(value) {
				    	      		return formattime(value);
				    	      	}
				          },
				          {field:'checkintime',title:'修改时间',width:150,align:'center',
				        	  formatter:function(value) {
				    	      		return formattime(value);
				    	      	}
				          },
				          {field:"userid",title:'操作', width:150,align:'center',
					  		  	formatter: function(value,row,index){
					  		  		var str = '<a href=initUpdateUser.action?userid='+value+' name="update" class="easyui-linkbutton" ></a>'; 
					  		  		str = str + '|<a href=javascript:fdelete('+value+') name="delete" class="easyui-linkbutton" ></a>';
					  		  		return str;
					  			}
					  	  }
				      ]],
				  onLoadSuccess:function(data){    
				          $("a[name='update']").linkbutton({text:'修改',plain:true}); 
				          $("a[name='delete']").linkbutton({text:'删除',plain:true}); 
				  }, 
				  
				/* 防止水平滚动 */
				fitColumns:true,
				/* 显示斑马线效果 */
				striped:true,
				/* 显示一个行号列*/
				rownumbers:true,
				/* 底部显示分页工具栏*/
				pagination:true,
				/* 设置分页属性的时候初始化页码*/
				pageNumber:1,
				/* 设置分页属性的时候初始化页面大小 */
				pageSize:1,
				/* 设置分页属性的时候 初始化页面大小选择列表 */
				pageList:[1,2],
				/* 行号列宽度 *//* deleteUser.action?userid='+value+' */
				rownumberWidth:50,
			});
			
		});
		function formattime(value) {
			if(value==""||value==null) {
				return "";
			}
			var dt=new Date(value);
			num=dt+"";
	        var date = "";
	        var month = new Array();
	        month["Jan"] = 01; month["Feb"] = 02; month["Mar"] = 03; month["Apr"] = 04; month["May"] = 05; month["Jan"] = 06;
	        month["Jul"] = 07; month["Aug"] = 08; month["Sep"] = 09; month["Oct"] = 10; month["Nov"] = 11; month["Dec"] = 12;
	        var week = new Array();
	        week["Mon"] = "一"; week["Tue"] = "二"; week["Wed"] = "三"; week["Thu"] = "四"; week["Fri"] = "五"; week["Sat"] = "六"; week["Sun"] = "日";
	        str = num.split(" ");
	        date = str[3] + "-";
	        date = date + month[str[1]] + "-" + str[4];
	        return date;
			return time;
		};
		function fdelete(value){
			$.messager.confirm('确认删除', '您确定要删除该用户吗？', function(r){
				if (r){
					 top.location="deleteUser.action?userid="+value+"";
				}
			});
		}
		
	</script>
</body>
</html>