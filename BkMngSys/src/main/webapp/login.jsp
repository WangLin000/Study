<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>登录</title>
	</head>
	<body>
		<form action="login" method="post">
			<table border="1em" style="margin: 0 auto;text-align: center;">
				<tr>
					<td>用户名</td>
					<td><label><input type="text" name="username"/></label></td>				
				</tr>
				<tr>
					<td>密码</td>
					<td><label><input type="password" name="password"/></label></td>				
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="登录"/><a href="register.jsp">没有账号？点击注册</a></td>
				</tr>
				<tr>
					<td colspan="2">${msg}</td>
				</tr>
			</table>
		</form>
	</body>
</html>