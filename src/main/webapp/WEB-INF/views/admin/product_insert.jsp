<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Quản lý sản phẩm | Thế giới đồ chơi ô tô</title>
	<meta charset="UTF-8">
</head>
<body>
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h2>Quản Lý Sản Phẩm</h2>
					</div>
				</div>

				<hr />
				<div class="row">
					<div class="col-md-12">

						<div class="panel panel-default">
							<div class="panel-heading">Quản Lý Sản Phẩm</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-6">
									<c:url value="/quan-tri/san-pham/add-product" var="Url"/>
										<form:form modelAttribute="product" action='${Url }' method="post" enctype="multipart/form-data">
											<div class="form-group">
												<label>Danh Mục</label> 
												<select class="form-control" name="categoryId">
													<option value="-1" selected="selected">===Chọn===</option>
													<c:forEach items="${categories }" var="category">
														<option value="${category.id }"> ${category.name }</option>
													</c:forEach>
												</select>
												<span style="color:red;"><form:errors path="categoryId"></form:errors></span>
											</div>
											
											<div class="form-group">
												<label>Thương hiệu</label> 
												<select class="form-control" name="brandId">
													<option value="-1" selected="selected">===Chọn===</option>
													<c:forEach items="${brands }" var="brand">
														<option value="${brand.id }"> ${brand.name }</option>
													</c:forEach>
												</select>
												<span style="color:red;"><form:errors path="brandId"></form:errors></span>
											</div>
											<div class="form-group">
												<label>Tên Sản Phẩm</label> 
												<input class="form-control" name="name" placeholder="VD: IPhone 5" type="text" />
												<span style="color:red;"><form:errors path="name"></form:errors></span>
											</div>
											<div class="form-group">
												<label>Chọn Hình Ảnh</label> <input type="file">
											</div>
											<div class="form-group">
												<label>Số Lượng</label> 
												<input class="form-control" name="soLuong" placeholder="VD: Nhập số lượng" type="text" />
												<span style="color:red;"><form:errors path="soLuong"></form:errors></span>
											</div>
											<div class="form-group">
												<label>Mô Tả</label>
												<textarea class="form-control" name="description" rows="" cols=""></textarea>
												
											</div>
											<div class="form-group">
												<label>Giá Bán</label> 
												<input class="form-control" name="price" placeholder="VD: Nhập giá bán" type="text" />
												<span style="color:red;"><form:errors path="price"></form:errors></span>
											</div>
											<div class="form-group">
												<label>Giảm Giá</label> 
												<input class="form-control" name= "discount" placeholder="VD: Nhập giá giảm" type="text" />
											</div>
											<button type="submit" class="btn btn-success">Thêm</button>
											<button type="reset" class="btn btn-primary">Làm mới</button>

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