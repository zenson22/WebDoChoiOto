<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Account Management</title>
	<meta charset="UTF-8">
</head>
<body>
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h2>Quản Lý Tài Khoản</h2>
					</div>
				</div>

				<hr />
				<div class="row">
					<div class="col-md-12">

						<div class="panel panel-default">
							<div class="panel-heading">Thêm Tài Khoản</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-6">
									<c:url value="/quan-tri/nguoi-dung/add-account" var="Url"/>
										<form:form modelAttribute="user" action='${Url}' method="post" enctype="multipart/form-data">
										
											<div class="form-group">
												<label>Tài khoản</label>
												<input class="form-control" type="text" name="username" />
												<span style="color:red;"><form:errors path="username"></form:errors></span>
											</div>
											
											<div class="form-group">
												<label>Mật Khẩu</label>
												<input class="form-control" type="password" name="password" />
												<span style="color:red;"><form:errors path="password"></form:errors></span>
											</div>
											
											<div class="form-group">											
												<label>Địa Chỉ Email</label> 
												<input class="form-control" placeholder="@gmail.com" type="text" name="email" />
												<span style="color:red;"><form:errors path="email"></form:errors> </span>
											</div>
											
											<div class="form-group">
												<label>Họ Và Tên</label>
												<input class="form-control" type="text" name="fullName"  />
												<span style="color:red;"><form:errors path="fullName"></form:errors> </span>
											</div>
											
											<div class="form-group">
												<label>Địa Chỉ</label>
												<input class="form-control" type="text" name="address"  />
												<span style="color:red;"><form:errors path="address"></form:errors></span>
											</div>
											
											<div class="form-group">
												<label>Số Điện Thoại</label>
												<input class="form-control" type="text" name="phone" />
												<span style="color:red;"><form:errors path="phone"></form:errors> </span>
											</div>
											
											<div class="form-group">
												<label>Quyền Truy Cập</label>
												<select class="form-control" name="roleId">
													<option value="0" selected="selected">===Chọn===</option>
													<option value="1">ADMIN</option>
													<option value="2">USER</option>
												</select>
											</div>
											<div class="form-group">
												<label>Trạng Thái</label>
												<select class="form-control" name="status">
													<option value="0" selected="selected">===Chọn===</option>
													<option value="1" >Đã Kích Hoạt</option>
													<option value="0" >Đang Chờ</option>
												</select>
											</div>
											<input type="hidden" name="action" value="Insert"> 
											<button type="submit" class="btn btn-success">Thêm</button>
											<button type="reset" class="btn btn-primary">Reset</button>
										</form:form>
										<br />
									</div>
								</div>
							</div>
						</div>				
					</div>
				</div>
			</div>
		</div>
</body>
</html>