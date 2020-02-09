<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Thong tin nguoi dung </h1>
	<p>Ten : ${user.username }</p>
	<p>Phone : ${user.phone }</p>
	<p>File : ${user.avatar }</p>
	<p>Id : ${user.id }</p>
</body>
</html>