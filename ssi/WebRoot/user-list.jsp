<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
<table border="1" cellspacing="0">
	<tr>
		<th>ID</th>
		<th>登录名</th>
		<th>真实姓名</th>
		<th>出生日期</th>
		<th>性别</th>
	</tr>
	<c:forEach items="${userList}" var="u">
		<tr>
			<td>${u.id}</td>
			<td>${u.loginName}</td>
			<td>${u.realName}</td>
			<td><fmt:formatDate value="${u.birthday}" pattern="yyyy-MM-dd"/></td>
			<td><c:if test="${u.gender == 1}">男</c:if><c:if test="${u.gender == 0}">女</c:if></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>