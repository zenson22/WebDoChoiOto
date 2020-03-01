<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp"%>
<nav class="navbar-default navbar-side" role="navigation">
	<div class="sidebar-collapse">
		<ul class="nav" id="main-menu">
			<li class="text-center"><img src='<c:url  value="/resources/templates/admin/assets/img/find_user.png" />'
				class="user-image img-responsive" /></li>
			<li><a  href='<c:url  value="/quan-tri/nguoi-dung" />'><i
					class="fa fa-user fa-2x"></i> Account Manager</a></li>
			<li><a href='<c:url  value="/quan-tri/danh-muc" />'><i class="fa fa-qrcode fa-3x"></i>
					Category Manager</a></li>
			<li><a href='<c:url  value="/quan-tri/san-pham" />'><i
					class="fa fa-briefcase fa-2x"></i> Product Manager </a></li>
			<li><a href='<c:url  value="/quan-tri/don-hang" />'><i
					class="fa fa-shopping-cart fa-2x"></i> Order Manager</a></li>

		</ul>
	</div>
</nav>