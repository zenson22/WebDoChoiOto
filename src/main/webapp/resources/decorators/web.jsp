<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Colo Shop</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="Colo Shop Template">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/styles/bootstrap4/bootstrap.min.css" />'>
	<link href='<c:url  value="/resources/templates/web/plugins/font-awesome-4.7.0/css/font-awesome.min.css" />' rel="stylesheet" type="text/css">
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/plugins/OwlCarousel2-2.2.1/owl.carousel.css"/>' >
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/plugins/OwlCarousel2-2.2.1/owl.theme.default.css" />'>
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/plugins/OwlCarousel2-2.2.1/animate.css" />' >
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/styles/main_styles.css" />' >
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/styles/responsive.css"/>' >
</head>

<body>
	<div class="super_container">
		<!-- Header -->
		<jsp:include page="/resources/common/web/header.jsp"/>
	
		<!-- Body -->
		<dec:body/>
		
		<!-- Footer -->
		<jsp:include page="/resources/common/web/footer.jsp"/>
	</div>
	<script src='<c:url  value="/resources/templates/web/js/jquery-3.2.1.min.js"/>' ></script>
	<script src='<c:url  value="/resources/templates/web/styles/bootstrap4/popper.js" />'></script>
	<script src='<c:url  value="/resources/templates/web/styles/bootstrap4/bootstrap.min.js"/>' ></script>
	<script src='<c:url  value="/resources/templates/web/plugins/Isotope/isotope.pkgd.min.js" />'></script>
	<script src='<c:url  value="/resources/templates/web/plugins/OwlCarousel2-2.2.1/owl.carousel.js" />'></script>
	<script src='<c:url  value="/resources/templates/web/plugins/easing/easing.js" />'></script>
	<script src='<c:url  value="/resources/templates/web/js/custom.js"/>'></script>
</body>
</html>
