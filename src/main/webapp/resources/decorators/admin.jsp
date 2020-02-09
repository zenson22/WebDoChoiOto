<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp" %>
<!doctype html>
<html class="no-js" lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>srtdash - ICO Dashboard</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/png" '<c:url value="/resources/templates/admin/images/icon/favicon.ico"/>'>
    <link rel="stylesheet" href='<c:url value="/resources/templates/admin/css/bootstrap.min.css" />'>
    <link rel="stylesheet" href='<c:url value="/resources/templates/admin/css/font-awesome.min.css"/>' >
    <link rel="stylesheet" href='<c:url value="/resources/templates/admin/css/themify-icons.css"/>'>
    <link rel="stylesheet" href='<c:url value="/resources/templates/admin/css/metisMenu.css"/>'>
    <link rel="stylesheet" href='<c:url value="/resources/templates/admin/css/owl.carousel.min.css"/>'>
    <link rel="stylesheet" href='<c:url value="/resources/templates/admin/css/slicknav.min.css"/>'>
    <!-- amchart css -->
    <link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
    <!-- others css -->
    <link rel="stylesheet" href='<c:url value="/resources/templates/admin/css/typography.css"/>'>
    <link rel="stylesheet" href='<c:url value="/resources/templates/admin/css/default-css.css"/>'>
    <link rel="stylesheet" href='<c:url value="/resources/templates/admin/css/styles.css"/>'>
    <link rel="stylesheet" href='<c:url value="/resources/templates/admin/css/responsive.css"/>'>
    <!-- modernizr css -->
    <script src='<c:url value="/resources/templates/admin/js/vendor/modernizr-2.8.3.min.js"/>'></script>
</head>
<body>
	 <div class="page-container">
	 <%@ include file="/resources/common/admin/menu.jsp" %>
	<!-- Header -->
		 <div class="main-content">
			<%@ include file="/resources/common/admin/header.jsp" %>
			
			<!-- Body -->
				<dec:body/>
			
			</div>
		<!-- Footer -->
		<%@ include file="/resources/common/admin/footer.jsp" %>
	
	</div>

	<!-- jquery latest version -->
    <script src='<c:url value="/resources/templates/admin/js/vendor/jquery-2.2.4.min.js"/>'></script>
    <!-- bootstrap 4 js -->
    <script src='<c:url value="/resources/templates/admin/js/popper.min.js"/>'></script>
    <script src='<c:url value="/resources/templates/admin/js/bootstrap.min.js"/>'></script>
    <script src='<c:url value="/resources/templates/admin/js/owl.carousel.min.js"/>'></script>
    <script src='<c:url value="/resources/templates/admin/js/metisMenu.min.js"/>'></script>
    <script src='<c:url value="/resources/templates/admin/js/jquery.slimscroll.min.js"/>'></script>
    <script src='<c:url value="/resources/templates/admin/js/jquery.slicknav.min.js"/>'></script>

    <!-- start chart js -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
    <!-- start highcharts js -->
    <script src="https://code.highcharts.com/highcharts.js"></script>
    <!-- start zingchart js -->
    <script src="https://cdn.zingchart.com/zingchart.min.js"></script>
    <script>
    zingchart.MODULESDIR = "https://cdn.zingchart.com/modules/";
    ZC.LICENSE = ["569d52cefae586f634c54f86dc99e6a9", "ee6b7db5b51705a13dc2339db3edaf6d"];
    </script>
    <!-- all line chart activation -->
    <script src='<c:url value="/resources/templates/admin/js/line-chart.js"/>'></script>
    <!-- all pie chart -->
    <script src='<c:url value="/resources/templates/admin/js/pie-chart.js"/>'></script>
    <!-- others plugins -->
    <script src='<c:url value="/resources/templates/admin/js/plugins.js"/>'></script>
    <script src='<c:url value="/resources/templates/admin/js/scripts.js"/>'></script>
</body>
</html>