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
							<div class="panel-heading">Quản Lý Hóa Đơn</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr style="text-align: center;">
												<th>Mã Hóa Đơn</th>
												<th>Khách Hàng</th>
												<th>Địa Chỉ Giao Hàng</th>
												<th>Ngày Mua Hàng</th>
												<th>Trạng Thái Đơn Hàng</th>
												<th>Chi tiết đơn hàng</th>
												<th>Chức Năng</th>
											</tr>
										</thead>
										<c:forEach items="${orders }" var= "order">
										<tbody>
											<tr class="odd gradeX">
												<td>${order.id }</td>
												<td>${order.user.fullName }</td>
												<td>${order.address }</td>
												
												<td>${order.orderDate }</td>	
												<td class="center" style="text-align: center;">
												<c:if test="${order.status==1 }">
													<a class="btn btn-success btn-xs" >Đã Thanh Toán</a>
												</c:if>
												<c:if test="${order.status!=1 }">
													<a class="btn btn-success btn-xs" >Đang chờ </a>
												</c:if>
												</td>
												<td>
													<a href= '<c:url value="/quan-tri/don-hang/orderDetail/${order.id }" />' class="btn btn-danger btn-xs">Xem chi tiết</a> 
												</td>
												<td class="center" style="text-align: center;">
												<a href= '<c:url value="/quan-tri/don-hang/update-order/${order.id }" />' class="btn btn-danger btn-xs">Sửa</a> 
												<a href='<c:url value="/quan-tri/don-hang/delete-order/${order.id }" />' onclick="return confirm('Bạn không thể xóa dòng này nếu mà bạn chưa xóa dòng tương ứng với hóa đơn chi tiết ?')"
													class="btn btn-warning btn-xs">Xóa</a></td>
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