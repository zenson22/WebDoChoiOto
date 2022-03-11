<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Product Management</title>
<meta charset="UTF-8">
</head>
<body>
	<div id="page-wrapper">
		<div id="page-inner">
			<div class="row">
				<div class="col-md-12">
						<a class="navbar-brand btn btn-danger " href='<c:url value="/quan-tri/san-pham/add-product" />'>Thêm Sản Phẩm</a>
					</div>
			</div>

			<hr />

			<div class="row">
				<div class="col-md-12">

					<div class="panel panel-default">
						<div class="panel-heading">Quản lý sản phẩm</div>
						<div class="panel-body">
							<div class="table-responsive">
								<table class="table table-striped table-bordered table-hover"
									id="dataTables-example">
									<thead>
										<tr>
											<th>Mã Danh Mục</th>
											<th>Tên Sản Phẩm</th>
											<th>Hình Ảnh</th>
											<th>Số Lượng</th>
											<th>Mô Tả</th>
											<th>Giá Bán</th>
											<th>Giảm Giá</th>
											<th></th>
										</tr>
									</thead>
									<c:forEach items="${products}" var="product">
									<tbody>
										<tr class="odd gradeX">
											<td>${product.categoryId }</td>
											<td>${product.name }</td>
											<td>${product.brandId}</td>
											<td>${product.soLuong }</td>
											<td>${product.description }</td>
											<td>${product.price }</td>
											<td>${product.discount }</td>
											<td class="center">
												<a href='<c:url  value="/quan-tri/san-pham/update-product/${product.id }" />' class="btn btn-danger btn-xs">Sửa</a> 
												<a href='<c:url  value="/quan-tri/san-pham/delete-product/${product.id }" />' class="btn btn-warning btn-xs">Xóa</a></td>
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