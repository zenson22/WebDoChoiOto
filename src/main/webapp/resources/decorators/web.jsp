<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title><dec:title default="Trang chủ" /></title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="decorator" content="layoutName" /> 
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href='<c:url  value="/resources/templates/web/images/icons/favicon.png" />' />
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/vendor/bootstrap/css/bootstrap.min.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/fonts/font-awesome-4.7.0/css/font-awesome.min.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/fonts/themify/themify-icons.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/fonts/Linearicons-Free-v1.0.0/icon-font.min.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/fonts/elegant-font/html-css/style.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/vendor/animate/animate.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/vendor/css-hamburgers/hamburgers.min.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/vendor/animsition/css/animsition.min.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/vendor/select2/select2.min.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/vendor/daterangepicker/daterangepicker.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/vendor/slick/slick.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/vendor/lightbox2/css/lightbox.min.css" />'>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/css/util.css" />'>
	<link rel="stylesheet" type="text/css" href='<c:url  value="/resources/templates/web/css/main.css" />'>
<!--===============================================================================================-->
</head>
<body class="animsition">

	<!-- Header -->
		<jsp:include page="/resources/common/web/header.jsp"/>
		
		<!-- Body -->
		<dec:body/>
		
	 <!-- Footer -->
		<jsp:include page="/resources/common/web/footer.jsp"/>

	<!-- Back to top -->
	<div class="btn-back-to-top bg0-hov" id="myBtn">
		<span class="symbol-btn-back-to-top">
			<i class="fa fa-angle-double-up" aria-hidden="true"></i>
		</span>
	</div>

	<!-- Container Selection1 -->
	<div id="dropDownSelect1"></div>



<!--===============================================================================================-->
	<script type="text/javascript" src='<c:url  value="/resources/templates/web/vendor/jquery/jquery-3.2.1.min.js" />'></script>
<!--===============================================================================================-->
	<script type="text/javascript" src='<c:url  value="/resources/templates/web/vendor/animsition/js/animsition.min.js" />'></script>
<!--===============================================================================================-->
	<script type="text/javascript" src='<c:url  value="/resources/templates/web/vendor/bootstrap/js/popper.js" />'></script>
	<script type="text/javascript" src='<c:url  value="/resources/templates/web/vendor/bootstrap/js/bootstrap.min.js" />'></script>
<!--===============================================================================================-->
	<script type="text/javascript" src='<c:url  value="/resources/templates/web/vendor/select2/select2.min.js" />'></script>
	<script type="text/javascript">
		$(".selection-1").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});
	</script>
<!--===============================================================================================-->
	<script type="text/javascript" src='<c:url  value="/resources/templates/web/vendor/slick/slick.min.js" />'></script>
	<script type="text/javascript" src='<c:url  value="/resources/templates/web/js/slick-custom.js" />'></script>
<!--===============================================================================================-->
	<script type="text/javascript" src='<c:url  value="/resources/templates/web/vendor/countdowntime/countdowntime.js" />'></script>
<!--===============================================================================================-->
	<script type="text/javascript" src='<c:url  value="/resources/templates/web/vendor/lightbox2/js/lightbox.min.js" />'></script>
<!--===============================================================================================-->
	<script type="text/javascript" src='<c:url  value="/resources/templates/web/vendor/sweetalert/sweetalert.min.js" />'></script>
	<script type="text/javascript">
		$('.block2-btn-addcart').each(function(){
			var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
			$(this).on('click', function(){
				swal(nameProduct, "is added to cart !", "success");
			});
		});

		$('.block2-btn-addwishlist').each(function(){
			var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
			$(this).on('click', function(){
				swal(nameProduct, "is added to wishlist !", "success");
			});
		});
	</script>

<!--===============================================================================================-->
	<script src='<c:url  value="/resources/templates/web/js/main.js" />'></script>

</body>
</html>
