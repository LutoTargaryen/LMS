<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录失败</title>
<%@ include file="../../common/basejspf/easyui.jspf"%>
<style type="text/css">
.divcenter {
	width: 400px;
	height: 400px;
	position: absolute;
	text-align: center;
	left: 0;
	right: 0;
	top: 200px;
	bottom: 0;
	margin: auto;
}
</style>
<script type="text/javascript">
	$(function() {
		$(document).ready(function() {
			function jump(count) {
				window.setTimeout(function() {
					count--;
					if (count > 0) {
						$('#num').html(count);
						jump(count);
					} else {
						location.href = "/LMS/login.jsp";
					}
				}, 1000);
			}
			jump(5);
		});
	});
</script>

</head>
<body >
	<div class="divcenter">
		<font>登录失败，<span id="num">5</span>秒后跳转到登录页面</font><br/>
		<a href="/LMS/login.jsp">点击立即跳转</a>
	</div>
</body>
</html>