<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Sửa Hóa Đơn | Admin HTT-Mobile</title>
</head>
<body>
		<div id="page-wrapper">
			<div id="page-inner">
				<hr />
				<div class="row">
					<div class="col-md-12">

						<div class="panel panel-default">
							<div class="panel-heading">Quản Lý Hóa Đơn</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-6">
									<c:url value="/quan-tri/don-hang/update-order" var="Url"/>
										<form:form  modelAttribute="order" action='${Url}' method="post" enctype="multipart/form-data">

											<div class="form-group">
												<label>Địa Chỉ Giao Hàng: </label>	
												<span style="color: red;">${error_address }</span>							
												<input	class="form-control" type="text" name="address" value="${order.address }" />
											</div>

											<div class="form-group">
												<label>Phương Thức Thanh Toán: </label>
												<span style="color: red;">${error_payment }</span>		
												 <select class="form-control" name="payment" >
													<option value="0">Chọn</option>
													<option value="Thanh toán sau khi nhận hàng">Thanh
														toán khi giao hàng</option>
													<option value="Thanh toán qua thẻ ngân hàng">Thanh
														toán qua thẻ ngân hàng</option>
												</select>
											</div>

											<div class="form-group">
												<label>Trạng Thái Đơn Hàng: </label> 
													
												<select
													class="form-control" name="status">
													<option value="1">Đã Thanh Toán</option>
													<option value="2">Đang Xử Lý</option>
												</select>
											</div>
											<input type="hidden" name="id" value="${order.id }"> 
											<input type="submit" class="btn btn-danger" value="Sửa" /> 
											<input type="reset" class="btn btn-primary" value="Reset">
		
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