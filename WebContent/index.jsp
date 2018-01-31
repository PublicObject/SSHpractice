<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/SSH/insertUser.action" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" id="username" name="user.userName"></input></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="text" id="age" name="user.age"></input></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="text" id="gender" name="user.gender"></input></td>
			</tr>
			<tr><td rowspan="2"><input type="submit" value="提交"></input><input type="reset" value="重置"></input></td></tr>
		</table>
	</form>
	<h3><a href="${pageContext.request.contextPath}/SSH/getUserById.action?user.id=1"><input type="button" value="查询"></input></a></h3>
	<form action="${pageContext.request.contextPath}/SSH/updateUser.action" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" id="id" name="user.id"></input></td>
			</tr>
			<tr>
				<td>用户名</td>
				<td><input type="text" id="username" name="user.userName"></input></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="text" id="age" name="user.age"></input></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="text" id="gender" name="user.gender"></input></td>
			</tr>
			<tr><td rowspan="2"><input type="submit" value="提交"></input><input type="reset" value="重置"></input></td></tr>
		</table>
	</form>
	<h3><a href="${pageContext.request.contextPath}/SSH/getInfo.action?rows=2&&lines=1"><input type="button" value="分页"></input></a></h3>
</body>
</html>