<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp"%>
<%@ page import="com.sonnguyen.webdochoioto.util.SecurityUtils" %>
	<nav class="navbar navbar-default navbar-cls-top " role="navigation"
			style="margin-bottom: 0">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".sidebar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href='<c:url  value="/quan-tri/trang-chu" />'>ADMIN</a>
		</div>
		<div style="color: white; padding: 15px 50px 5px 50px; float: right; font-size: 16px; ">
			<security:authorize access="isAuthenticated()">
				<a class="btn btn-danger "  
					href="#"><%=SecurityUtils.getPrincipal().getFullName()%>
				</a>
				<a class="btn btn-danger" href="<c:url value='/thoat'/>">Thoát</a>
			</security:authorize>
		</div>
</nav>