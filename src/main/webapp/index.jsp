<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../../../common/basejspf/base.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>

	<%@ include file="common/basejspf/easyui.jspf"%>
	<style type="text/css">
		.divcenter{
		    width: 400px;
		    height: 400px;
		    position: absolute;
		
		    text-align: center;
		
		    left:0;
		    right:0;
		    top: 200px;
		    bottom: 0;
		    margin: auto;
		}
	</style>
</head>
 <body>
 	<div class="divcenter">
	<div  id="paneldiv" class="easyui-panel" title="请登录" style="width:100%;max-width:400px;padding:30px 60px;">
		<form id="loginForm" method="post" action="<%=baseUrl%>/user/login.action">
			<div style="margin-bottom:20px">
					<input id="account"  name="account" >
			</div> 
			<div style="margin-bottom:20px">
					<input type="password" id="password"  name="password" >
			</div> 
		</form>
		<div style="text-align:center;padding:5px 0">
			<button class="easyui-linkbutton" onclick="submitForm()" style="width:80px">登录</button>
			<button class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</button>
		</div>
	</div>
	</div>
	
	<script type="text/javascript">
		$(function(){
			
			$("#account").textbox({
				cls:'easyui-textbox',
				width:'100%',
				label:'账号:',
				required:true,
				missingMessage:"账号不能为空！"
			});
			
			$("#password").textbox({
				cls:'easyui-textbox',
				width:'100%',
				label:'密码:',
				required:true,
				missingMessage:"密码不能为空！"
			});
			
			
		});
		function submitForm(){
			$('#loginForm').submit();
		}
		function clearForm(){
			$('#loginForm').form('clear'); 
		}
	</script> 
</body>

</html>