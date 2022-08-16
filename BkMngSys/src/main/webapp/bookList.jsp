<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>书籍列表</title>
	</head>
	<body>
		<table border="1em" style="margin: 0 auto;text-align: center;">
			<tr>
				<td>序号</td>
				<td>书名</td>
				<td>作者</td>
				<td colspan="4">描述</td>
				<td>价格</td>
			</tr>
			<c:forEach items="${bookList}" var="book">
				<tr>
					<td>${book.getBid()}</td>
					<td>${book.getBname()}</td>
					<td>${book.getAuthor()}</td>
					<td colspan="4">${book.getPress()}</td>
					<td>${book.getPrice()}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>