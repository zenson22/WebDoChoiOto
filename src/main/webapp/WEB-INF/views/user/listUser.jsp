<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Danh sach nguoi dung</h1>
	
	<table border="1">
		<tr>
			<th>ID</th>
			<th>TEN KH</th>
			<th>SO DT KH</th>
			<th>TUY CHON</th>
		</tr>
		<c:forEach items="${ users}" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.username }</td>
				<td>${user.phone }</td>
				<td>
					<a href="<c:url value='/sua-nguoi-dung/${user.id }' /> ">Sua</a>
					<a href="<c:url value='/xoa-nguoi-dung/${user.id }' />">Xoa</a>
					<a href="<c:url value='/chi-tiet-nguoi-dung/${user.id }' />">chi tiet</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="<c:url value='/them-nguoi-dung' />">Them</a>
	<br/>
	<a href="<c:url value='/danh-sach-nguoi-dung'/>">Quay ve</a>
</body>
</html>