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
									<c:url value="/quan-tri/san-pham/update-product" var="ApiURL"/>
										<form:form modelAttribute="product" action='${ApiURL }' method="post" enctype="multipart/form-data">
											<div class="form-group">
												<label>Danh Mục</label> 
												<select class="form-control" name="categoryId">
													<c:forEach items="${categories }" var="category">
														<c:if test="${category.id == product.categoryId }">
															<option value="${category.id }" selected="selected"> ${category.name }</option>
														</c:if>
														<c:if test="${category.id != product.categoryId }">
															<option value="${category.id }"> ${category.name }</option>
														</c:if>
													</c:forEach>
												</select>
											</div>
											
											<div class="form-group">
												<label>Thương hiệu</label> 
												<select class="form-control" name="brandId">
													<c:forEach items="${brands }" var="brand">
														<c:if test="${brand.id == product.brandId }">
															<option value="${brand.id }" selected="selected"> ${brand.name }</option>
														</c:if>
														<c:if test="${brand.id != product.brandId }">
															<option value="${brand.id }"> ${brand.name }</option>
														</c:if>
													</c:forEach>
												</select>
											</div>
											<div class="form-group">
												<label>Tên Sản Phẩm</label> 
												<input class="form-control" name="name" value="${product.name }" type="text" />
												<span style="color:red;"><form:errors path="name"></form:errors></span>
											</div>
											<div class="form-group">
												<label>Chọn Hình Ảnh</label> <input type="file">
											</div>
											<div class="form-group">
												<label>Số Lượng</label> 
												<input class="form-control" name="soLuong" value="${product.soLuong }" type="text" />
												<span style="color:red;"><form:errors path="soLuong"></form:errors></span>
											</div>
											<div class="form-group">
												<label>Mô Tả</label>
												<textarea class="form-control" name="description"  rows="" cols="">${product.description }</textarea>
												
											</div>
											<div class="form-group">
												<label>Giá Bán</label> 
												<input class="form-control" name="price" value="${product.price }" type="text" />
												<span style="color:red;"><form:errors path="price"></form:errors></span>
											</div>
											<div class="form-group">
												<label>Giảm Giá</label> 
												<input class="form-control" name= "discount" value="${product.discount }" type="text" />
											</div>
											<button type="submit" class="btn btn-danger">Sửa</button>
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