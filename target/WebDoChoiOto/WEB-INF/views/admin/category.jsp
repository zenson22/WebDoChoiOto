<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Category Management</title>
	<meta charset="UTF-8">
</head>
<body>
		<div id="page-wrapper">
			<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
						<a class="navbar-brand btn btn-danger " href='<c:url value="/quan-tri/danh-muc/add-category" />'>Thêm Danh Mục</a>
					</div>
			</div>

				<hr />

				<div class="row">
					<div class="col-md-12">
						<div class="panel panel-default">
							<div class="panel-heading">Quản lý danh mục</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover">
										<thead>
											<tr style="text-align: center;">
												<th>Mã Danh Mục</th>
												<th>Tên Danh Mục</th>
												<th>Chức Năng</th>
											</tr>
										</thead>
										<c:forEach items="${categories}" var="category">
											<tbody>
												<tr class="odd gradeX">
													<td>${category.id }</td>
													<td>${category.name }</td>
													<td class="center">
														<a href='<c:url  value="/quan-tri/danh-muc/update-category/${category.id}" />' class="btn btn-danger btn-xs">Sửa</a> 
														<a href='<c:url  value="/quan-tri/danh-muc/delete-category/${category.id}" />' class="btn btn-warning btn-xs">Xóa</a></td>
												</tr>
											</tbody>
										</c:forEach>
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