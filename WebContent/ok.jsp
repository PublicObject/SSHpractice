<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr><td>姓名</td><td>年龄</td><td>性别</td></tr>
		<c:forEach items="${userMap.page}"  var="user">
			<tr><td>${user.userName}</td><td>${user.age}</td><td>${user.gender}</td></tr>
		</c:forEach>
	</table>
	<table>
		<tr><td>姓名</td><td>年龄</td><td>性别</td></tr>
			<tr><td>${user.userName}</td><td>${user.age}</td><td>${user.gender}</td></tr>
	</table>
	<h3>${userMap.count}</h3>
</body>
</html>