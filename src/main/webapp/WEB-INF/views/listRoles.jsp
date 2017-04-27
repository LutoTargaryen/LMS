<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../common/base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色信息</title>
</head>
<body>
	<fieldset>
		<legend>所有角色 
			<a href="<%=baseUrl%>/role/initadd.action">添加角色</a>
		</legend>
		<table width="100%" border="1">
			<tr>
				<th>角色ID</th>
				<th>角色名称</th>
				<th>角色权限</th>
			</tr>
			<c:forEach items="${roles }" var="role">
				<tr>
					<th>${role.roleid }</th>
					<th>${role.rolename }</th>
					<th>${role.rolepurview }</th>
				</tr>
			</c:forEach>
		</table>
	</fieldset>
</body>
</html>