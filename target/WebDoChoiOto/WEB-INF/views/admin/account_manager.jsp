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
						<a class="navbar-brand btn btn-danger " href='<c:url value="/quan-tri/nguoi-dung/add-account" />'>Thêm Tài Khoản</a>
					</div>
				</div>
				<hr />
				<div class="row">
					<div class="col-md-12">

						<div class="panel panel-default">
							<div class="panel-heading">Quản lý tài khoản</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr>
												<th>Tài Khoản</th>
												<th>Mật Khẩu</th>
												<th>Email</th>
												<th>Họ Và Tên</th>
												<th>Địa Chỉ</th>
												<th>Số Điện Thoại</th>
												<th>Quyền</th>
												<th>Trạng Thái</th>
												<th>Chức Năng</th>
											</tr>
										</thead>

										<tbody>
											<c:forEach var="acc" items="${users}">
											<tr class="odd gradeX">
												<td>${acc.username }</td>
												<td>******</td>
												<td>${acc.email }</td>
												<td>${acc.fullName }</td>
												<td>${acc.address }</td>
												<td>${acc.phone }</td>
												<td class="center" style="text-align: center;">
													<a class="btn btn-success btn-xs" >${acc.roleId}</a>
												</td>
												<td class="center" style="text-align: center;">
												<c:if test="${acc.status==1 }">
													<a class="btn btn-success btn-xs" >Đã kích hoạt</a>
												</c:if>
												<c:if test="${acc.status==0 }">
													<a class="btn btn-success btn-xs" >Đang chờ</a>
												</c:if>
												</td>
												<td class="center" style="text-align: center;">
													<a href='<c:url value="/quan-tri/nguoi-dung/update-account/${acc.id}" />'
													class="btn btn-info btn-xs">Sửa</a> 
													<a  href='<c:url value="/quan-tri/nguoi-dung/delete-account/${acc.id}" />' onclick="return confirm('Bạn chắc chắn mốn xóa ?')"
													 class="btn btn-warning btn-xs">Xóa</a></td>
											</tr>
											</c:forEach>
										</tbody>

									</table>
								</div>

							</div>
						</div>
					</div>
				</div>

			</div>

		</div>
</body>
</html>