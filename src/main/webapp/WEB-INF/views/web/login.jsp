<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/resources/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng nhập</title>
</head>

<body>

	<div class="container">
		<form method="POST" action="j_spring_security_check"
			class="form-signin">
			<h2 class="form-heading">Đăng nhập</h2>

			<div class="form-group">
				<c:if test="${param.incorrectAccount != null}">
					<div class="alert alert-danger" role="alert">	
							Tài khoản hoặc mật khẩu không chính sác!
					</div>
				</c:if>
				<c:if test="${param.accessDenied != null}">
					<div class="alert alert-warning" role="alert">	
							Bạn không có quyền truy cập vào địa chỉ này!
					</div>
				</c:if>
				<input type="text" class="form-control" id="userName" name="j_username" placeholder="Tên đăng nhập" autofocus="true"/>
				<input type="password" class="form-control" id="password" name="j_password" placeholder="Mật khẩu"/>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<button class="btn btn-lg btn-primary btn-block" type="submit">Đăng nhập</button>
			</div>

		</form>

	</div>
	
</body>
</html>