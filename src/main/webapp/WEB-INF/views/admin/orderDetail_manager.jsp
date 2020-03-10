<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Quản Lý ĐƠN HÀNG | Admin HTT-Mobile</title>
</head>
<body>
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">

						<div class="panel panel-default">
							<div class="panel-heading">Hóa Đơn Chi Tiết</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr style="text-align: center;">
												<th>Hóa Đơn Chi Tiết</th>
												<th>Sản Phẩm</th>
												<th>Số Lượng</th>
												<th>Giá Sản Phẩm</th>
												<th>Giảm Giá</th>
												<th>Tổng Tiền</th>
												<th>Chức Năng</th>
											</tr>
										</thead>
										<c:forEach items="${orders}" var = "order">
										<tbody>
											<tr class="odd gradeX">
												<td>${order.id}</td>
												<td>${order.product.name }</td>
												<td>${order.product.soLuong}</td>
												<td>${order.product.price } VNĐ</td>
												<td>${order.product.discount*100 } %</td>
												<td>${order.product.soLuong * order.product.price * order.product.discount } VNĐ
												</td>
												<td class="center" style="text-align: center;">
												<a href='<c:url value = "/quan-tri/don-hang/update-order/${order.id }" />' class="btn btn-danger btn-xs">Sửa</a> 
												<a href='<c:url value = "/quan-tri/don-hang/delete-order/${order.id} " />' onclick="return confirm('Bạn chắc chắn chứ ?')" class="btn btn-warning btn-xs">Xóa</a>
												</td>
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