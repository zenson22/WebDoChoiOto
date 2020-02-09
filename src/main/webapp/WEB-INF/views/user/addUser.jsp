<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href=" <c:url value='/templates/css/style.css'/> "/>
<script type="text/javascript" src="<c:url value='/templates/js/script.js'/> " ></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url value="/them-nguoi-dung" var="auURL" />
	<p>FORM NGUOI DUNG</p>
	<form:form modelAttribute="user" method="POST" action="${auURL }"  enctype="multipart/form-data">
		<p>Ten nguoi dung:</p>
		<form:input path="username" />
		<p style="color:red;">  <form:errors path="username"></form:errors> </p>
		<p>So dien thoai:</p>
		<form:input path="phone" />
		<p style="color:red;">  <form:errors path="phone"></form:errors> </p>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>