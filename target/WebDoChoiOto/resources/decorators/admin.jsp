<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/resources/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title><dec:title>Trang quản trị</dec:title> </title>
<!-- BOOTSTRAP STYLES-->
<link href='<c:url  value="/resources/templates/admin/assets/css/bootstrap.css" />' rel="stylesheet" />
<!-- FONTAWESOME STYLES-->
<link href='<c:url  value="/resources/templates/admin/assets/css/font-awesome.css" />' rel="stylesheet" />
<!-- MORRIS CHART STYLES-->
<link href='<c:url  value="/resources/templates/admin/assets/js/morris/morris-0.4.3.min.css" />' rel="stylesheet" />
<!-- CUSTOM STYLES-->
<link href='<c:url  value="/resources/templates/admin/assets/css/custom.css" />' rel="stylesheet" />
<!-- GOOGLE FONTS-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
	<div id="wrapper">
		<jsp:include page="/resources/common/admin/header.jsp"></jsp:include>
		<jsp:include page="/resources/common/admin/menu.jsp"></jsp:include>
		<dec:body/>
		<jsp:include page="/resources/common/admin/footer.jsp"></jsp:include>
	</div>
	<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
	<!-- JQUERY SCRIPTS -->
	<script src='<c:url  value="/resources/templates/admin/assets/js/jquery-1.10.2.js" />'></script>
	<!-- BOOTSTRAP SCRIPTS -->
	<script src='<c:url  value="/resources/templates/admin/assets/js/bootstrap.min.js" />'></script>
	<!-- METISMENU SCRIPTS -->
	<script src='<c:url  value="/resources/templates/admin/assets/js/jquery.metisMenu.js" />'></script>
	<!-- CUSTOM SCRIPTS -->
	<script src='<c:url  value="/resources/templates/admin/assets/js/custom.js" />'></script>
</body>
</html>