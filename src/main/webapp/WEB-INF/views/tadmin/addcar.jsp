<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../../../../common/basejspf/base.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加车队</title>
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
	<div  id="paneldiv" class="easyui-panel" title="添加车辆信息" style="width:100%;max-width:400px;padding:30px 60px;">
		<form id="loginForm" method="post" action="<%=baseUrl%>/tadmin/addcar.action">
			
			<div style="margin-bottom:20px">
					<input id="number"  name="number" >
			</div> 
			<div style="margin-bottom:20px">
					<select id="type" name="type">
						<option value="公司车辆" selected="selected">公司车辆</option>
						<option value="私人车辆" >私人车辆</option>
					</select>
			</div>
			<div style="margin-bottom:20px">
					<input  id="length"  name="length"  >
			</div>
			<div style="margin-bottom:20px">
					<input  id="tonnage"  name="tonnage"  >
			</div>
			<div style="margin-bottom:20px">
				<select id="fkTeamid" name="fkTeamid">
					<c:forEach items="${truckteams }" var="truckteam">
						<c:choose>
							<c:when test="${truckteam.teamid eq 1}">
								<option value="${truckteam.teamid }" selected="selected">${truckteam.teamname }</option>
							</c:when>
							<c:otherwise>
								<option  value="${truckteam.teamid }">${truckteam.teamname}</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</select>
			</div>
			
		</form>
		<div style="text-align:center;padding:5px 0">
			<button class="easyui-linkbutton" onclick="submitForm()" style="width:80px">添加</button>
			<button class="easyui-linkbutton" onclick="clearForm()" style="width:80px">重置</button>
		</div>
	</div>
	</div>
	
	<script type="text/javascript">
		$(function(){
			
			$("#number").textbox({
				cls:'easyui-textbox',
				width:'100%',
				label:'车牌号码:',
				required:true,
				missingMessage:"车牌号码不能为空！"
			});
			$("#length").textbox({
				cls:'easyui-textbox',
				width:'100%',
				label:'车辆长度:',
				required:true,
				missingMessage:"车辆长度不能为空！"
			});
			$("#tonnage").textbox({
				cls:'easyui-textbox',
				width:'100%',
				label:'车辆吨位:',
				required:true,
				missingMessage:"车辆吨位不能为空！"
			});
			$("#type").combobox({
				cls:'easyui-textbox',
				width:'100%',
				label:'车辆类型:',
				required:true
			});
			$("#fkTeamid").combobox({
				cls:'easyui-textbox',
				width:'100%',
				label:'所属车队:',
				required:true
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