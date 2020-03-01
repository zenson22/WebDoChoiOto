<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/resources/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Sửa Hóa Đơn Chi Tiết | Admin HTT-Mobile</title>
<body>

		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h2>Quản Lý Hóa Đơn Chi Tiết</h2>
					</div>
				</div>

				<hr />
				<div class="row">
					<div class="col-md-12">

						<div class="panel panel-default">
							<div class="panel-heading">Quản Lý Hóa Đơn Chi Tiết</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-6">
										<form  action="/SOF301_Assignment/InvoiceDetailServlet_Update_Del" method="post">
											<div class="form-group">
												<label>Số Lượng</label> 
												<span style="color: red">${error_soLuong}</span>
												<input class="form-control" type="text" name="Quantity" value="${order.product.soLuong}"/>
											</div>										
											<div class="form-group">
												<label>Giảm Giá</label>
												<select class="form-control" name="Sale">
													<option value=0>Không Giảm Giá</option>
													<option value=2>Giảm Giá 2%</option>
													<option value=5>Giảm Giá 5%</option>
													<option value=8>Giảm Giá 8%</option>
													<option value=10>Giảm Giá 10%</option>
												</select>									
											</div>
											<input type="hidden" name="action" value="Update"/>
											<input type="hidden" name="ID_InvoiceDetail" value="${order.id}"/>
											<button type="submit" class="btn btn-danger">Sửa</button>
											<button type="reset" class="btn btn-primary">Reset
												Button</button>

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