<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../../../../common/basejspf/base.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户</title>
<%@ include file="../../../../common/basejspf/easyui.jspf"%>
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
	<div  id="paneldiv" class="easyui-panel" title="用户信息修改" style="width:100%;max-width:400px;padding:30px 60px;">
		<form id="loginForm" method="post" action="<%=baseUrl%>/sadmin/updateUser.action">
			<input  name="userid" type="hidden" value="${vuser.userid }">
			<div style="margin-bottom:20px">
					<input id="username"  name="username" value="${vuser.username }" >
			</div> 
			<div style="margin-bottom:20px">
					<select id="sex" name="sex">
						<c:choose>
							<c:when test="${vuser.sex eq '男' }">
								<option value="男" selected="selected">男</option>
								<option value="女" >女</option>
							</c:when>
							<c:otherwise>
								<option value="女" selected="selected">女</option>
								<option value="男" >男</option>
							</c:otherwise>
						</c:choose>
					</select>
			</div>
			<div style="margin-bottom:20px">
					<input id="account"  name="account" value="${vuser.account }">
			</div> 
			<div style="margin-bottom:20px">
					<input  id="phone"  name="phone" value="${vuser.phone }" >
			</div>
			<div style="margin-bottom:20px">
					<input id="email"  name="email" value="${vuser.email }">
			</div>
			<div style="margin-bottom:20px">
				<select id="fkRoleid" name="fkRoleid">
					<c:forEach items="${roles }" var="role">
						<c:choose>
							<c:when test="${role.rolename eq vuser.roleName}">
								<option value="${role.roleid }" selected="selected">${role.rolename }</option>
							</c:when>
							<c:otherwise>
								<option  value="${role.roleid }">${role.rolename}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</select>
			</div>
		</form>
		<div style="text-align:center;padding:5px 0">
			<button class="easyui-linkbutton" onclick="submitForm()" style="width:80px">确认修改</button>
		</div>
	</div>
	</div>
	
	<script type="text/javascript">
		$(function(){
			
			$("#username").textbox({
				cls:'easyui-textbox',
				width:'100%',
				label:'用户姓名:',
				required:true,
				missingMessage:"用户姓名不能为空！"
			});
			$("#sex").combobox({
				cls:'easyui-textbox',
				width:'100%',
				label:'用户性别:',
				required:true,
				missingMessage:"用户性别不能为空！"
			});
			$("#account").textbox({
				cls:'easyui-textbox',
				width:'100%',
				label:'用户账号:',
				required:true,
				missingMessage:"用户账号不能为空！"
			});
			$("#phone").textbox({
				cls:'easyui-textbox',
				width:'100%',
				label:'用户电话:',
				required:true,
				missingMessage:"用户电话不能为空！"
			});
			$("#email").textbox({
				cls:'easyui-textbox',
				width:'100%',
				label:'用户邮箱:',
				required:true,
				missingMessage:"用户邮箱不能为空！"
			});
			
			$("#fkRoleid").combobox({
				cls:'easyui-textbox',
				width:'100%',
				label:'用户角色:',
				required:true,
				missingMessage:"用户角色不能为空！"
			});
			
			
		});
		function submitForm(){
			$('#loginForm').submit();
		}
	</script> 
</body>
</html>