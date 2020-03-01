<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp"%>
<%@ page import="com.sonnguyen.webdochoioto.util.SecurityUtils" %>
<!-- Header -->
<header class="header1">
	<!-- Header desktop -->
	<div class="container-menu-header">
		<div class="wrap_header">
			<!-- Logo -->
			<a href='<c:url value="/trang-chu" />' class="logo"> 
			<img src='<c:url  value="/resources/templates/web/images/icons/logo1.png" />'
				alt="IMG-LOGO">
			</a>

			<!-- Menu -->
			<div class="wrap_menu">
				<nav class="menu">
					<ul class="main_menu">
						<li><a href='<c:url value="/trang-chu" />' >Home</a></li>

						<li><a href='<c:url value="/san-pham" />'>Sản phẩm</a></li>

						<li class="sale-noti"><a href='<c:url value="/san-pham/sale" />'>Sale</a></li>

						<li><a href='<c:url value="/blog" />'>Blog</a></li>

						<li><a href='<c:url value="/about" />'>About</a></li>

						<security:authorize access="isAnonymous()">
							<li class="nav-item"><a class="nav-link" href='<c:url value="/dang-nhap" />'>Đăng
									nhập</a></li>
							<li class="nav-item"><a class="nav-link" href='<c:url value="/dang-nhap" />'>Đăng
									ký</a></li>
						</security:authorize>
						<security:authorize access="isAuthenticated()">
							<li class="nav-item"><a class="nav-link" href="#">Chào! 
									<%=SecurityUtils.getPrincipal().getFullName()%>
									</a></li>
							<li class="nav-item"><a class="nav-link"
								href="<c:url value='/thoat'/>">Thoát</a></li>
						</security:authorize>
					</ul>
				</nav>
			</div>

			<security:authorize access="isAuthenticated()">
			<!-- Header Icon -->
			<div class="header-icons">

				<div class="header-wrapicon2">
					<img
						src='<c:url  value="/resources/templates/web/images/icons/icon-header-02.png" />'
						class="header-icon1 js-show-header-dropdown" alt="ICON"> <span
						class="header-icons-noti">0</span>

					<!-- Header cart noti -->
					<div class="header-cart header-dropdown">
						<ul class="header-cart-wrapitem">
							<li class="header-cart-item">
								<div class="header-cart-item-img">
									<img
										src='<c:url  value="/resources/templates/web/images/item-cart-01.jpg" />'
										alt="IMG">
								</div>

								<div class="header-cart-item-txt">
									<a href="#" class="header-cart-item-name"> White Shirt With
										Pleat Detail Back </a> <span class="header-cart-item-info">
										1 x $19.00 </span>
								</div>
							</li>			
						</ul>

						<div class="header-cart-total">Total: $75.00</div>

						<div class="header-cart-buttons">
							<div class="header-cart-wrapbtn">
								<!-- Button -->
								<a href='<c:url value="/nguoi-dung/gio-hang " />'
									class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
									Xem giỏ hàng </a>
							</div>

							<div class="header-cart-wrapbtn">
								<!-- Button -->
								<a href='<c:url value="/nguoi-dung/thanh-toan" />'
									class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
									Thanh toán </a>
							</div>
						</div>
					</div>
				</div>
			</div>
			</security:authorize>
		</div>
	</div>

	<!-- Header Mobile -->
	<div class="wrap_header_mobile">
		<!-- Logo moblie -->
		<a href="index.html" class="logo-mobile"> <img
			src='<c:url  value="/resources/templates/web/images/icons/logo1.png" />'
			alt="IMG-LOGO">
		</a>

		<!-- Button show menu -->
		<div class="btn-show-menu">
			<!-- Header Icon mobile -->
			<div class="header-icons-mobile">
				
				<div class="header-wrapicon2">
					<img
						src='<c:url  value="/resources/templates/web/images/icons/icon-header-02.png" />'
						class="header-icon1 js-show-header-dropdown" alt="ICON"> <span
						class="header-icons-noti">0</span>

					<!-- Header cart noti -->
					<div class="header-cart header-dropdown">
						<ul class="header-cart-wrapitem">
							<li class="header-cart-item">
								<div class="header-cart-item-img">
									<img
										src='<c:url  value="/resources/templates/web/images/item-cart-01.jpg" />'
										alt="IMG">
								</div>

								<div class="header-cart-item-txt">
									<a href="#" class="header-cart-item-name"> White Shirt With
										Pleat Detail Back </a> <span class="header-cart-item-info">
										1 x $19.00 </span>
								</div>
							</li>			
						</ul>

						<div class="header-cart-total">Total: $75.00</div>

						<div class="header-cart-buttons">
							<div class="header-cart-wrapbtn">
								<!-- Button -->
								<a href='<c:url value="/nguoi-dung/gio-hang " />'
									class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
									Xem giỏ hàng </a>
							</div>

							<div class="header-cart-wrapbtn">
								<!-- Button -->
								<a href='<c:url value="/nguoi-dung/thanh-toan" />'
									class="flex-c-m size1 bg1 bo-rad-20 hov1 s-text1 trans-0-4">
									Thanh toán </a>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="btn-show-menu-mobile hamburger hamburger--squeeze">
				<span class="hamburger-box"> <span class="hamburger-inner"></span>
				</span>
			</div>
		</div>
	</div>

	<!-- Menu Mobile -->
	<div class="wrap-side-menu">
		<nav class="side-menu">
			<ul class="main-menu">

				<li><a href='<c:url value="/trang-chu" />' >Home</a></li>

						<li><a href='<c:url value="/san-pham" />'>Sản phẩm</a></li>

						<li class="sale-noti"><a href='<c:url value="/san-pham/sale" />'>Sale</a></li>

						<li><a href='<c:url value="/blog" />'>Blog</a></li>

						<li><a href='<c:url value="/about" />'>About</a></li>

						<security:authorize access="isAnonymous()">
							<li class="nav-item"><a class="nav-link" href='<c:url value="/dang-nhap" />'>Đăng
									nhập</a></li>
							<li class="nav-item"><a class="nav-link" href='<c:url value="/dang-nhap" />'>Đăng
									ký</a></li>
						</security:authorize>
						<security:authorize access="isAuthenticated()">
							<li class="nav-item"><a class="nav-link" href="#">Wellcome
									<%=SecurityUtils.getPrincipal().getFullName()%>
									</a></li>
							<li class="nav-item"><a class="nav-link"
								href="<c:url value='/thoat'/>">Thoát</a></li>
						</security:authorize>
			</ul>
		</nav>
	</div>
</header>