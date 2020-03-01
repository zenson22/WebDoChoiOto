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
				<div class="row">
					<div class="col-md-12">
						<h2><a href="Admin/invoice_manager.jsp" style="color: red">Sửa Hóa Đơn</a></h2>						
					</div>		
				</div>

				<hr />
				<div class="row">
					<div class="col-md-12">

						<div class="panel panel-default">
							<div class="panel-heading">Quản Lý Hóa Đơn</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-6">
										<form action="/SOF301_Assignment/InvoiceServlet_Update_Del"
											method="post">

											<div class="form-group">
												<label>Địa Chỉ Giao Hàng: </label>	
												<span style="color: red;">${error_address }</span>							
												<input	class="form-control" type="text" name="Shipping_Address" value="${order.address }" />
											</div>

											<div class="form-group">
												<label>Phương Thức Thanh Toán: </label>
												<span style="color: red;">${error_payment }</span>		
												 <select class="form-control" name="Payment_Methods" >
													<option value="${order.option }">Chọn</option>
													<option value="Thanh toan khi giao hang">Thanh
														toán khi giao hàng</option>
													<option value="Thanh toan qua the ngan hang">Thanh
														toán qua thẻ ngân hàng</option>
													<option value="Chuyen khoan ngan hang">Chuyển
														khoản ngân hàng</option>
												</select>
											</div>

											<div class="form-group">
												<label>Trạng Thái Đơn Hàng: </label> 
													
												<select
													class="form-control" name="Status_Order">
													<option value="1">Đã Thanh Toán</option>
													<option value="2">Đang Xử Lý</option>
												</select>
											</div>
											<input type="hidden" name="action" value="Update"> 
											<input type="hidden" name="ID_Invoice" value="${order.id }"> 
											<input type="submit" class="btn btn-danger" value="Sửa" /> 
											<input type="reset" class="btn btn-primary" value="Reset">
											<p style="color: red;">
											
											
											</p>
		
										</form>
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