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
	<h1>Noi  dung </h1>
	<c:url value='/thong-tin-nguoi-dung'  var="addUserURL" />
	<form:form    method="POST" modelAttribute="user" action="${addUserURL }" enctype="multipart/form-data">
		<form:input path="username"/>
		<p style="color:red;"><form:errors path="username"/></p>
		
		<form:hidden path="id"/>
		
		<form:input path="phone"/>
		<p style="color:red;"><form:errors path="phone"/></p>
		<form:input path="avatar" type="file"/>
		<br/>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>