<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../common/base.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加角色</title>
</head>
<body>
	<form action="<%=baseUrl%>/role/add.action">
		<table>
			<tr>
				<td>角色ID</td>
				<td><input name="roleId"> </td>
			</tr>
			<tr>
				<td>角色名称</td>
				<td><input name="roleName"></td>
			</tr>
			<tr>
				<td>角色权限</td>
				<td><input name="rolePurview"> </td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="确认添加"></td>
			</tr>
		</table>
	</form>
</body>
</html>