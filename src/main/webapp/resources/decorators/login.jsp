<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title><dec:title>Đăng nhập</dec:title></title>
<link href='<c:url value="/resources/templates/login/css/bootstrap.min.css" />' rel="stylesheet">
<link href=' <c:url value="/resources/templates/login/css/common.css" />' rel="stylesheet">
</head>
<body id="LoginForm">
    <dec:body/>
    <!-- /container -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src=' <c:url value="/resources/templates/login/js/bootstrap.min.js" />' ></script>
</body>
</html>