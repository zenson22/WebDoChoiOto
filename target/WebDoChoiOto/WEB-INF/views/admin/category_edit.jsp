<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>QUản lý danh mục | Thế giới dồ chơi ô tô</title>
	<meta charset="UTF-8">
</head>
<body>
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<p>Quản trị > Quản Lý Danh Mục</p>
					</div>
				</div>

				<hr />
				<div class="row">
					<div class="col-md-12">

						<div class="panel panel-default">
							<div class="panel-heading">Quản Lý Danh Mục</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-6">
									<c:url value="/quan-tri/danh-muc/update-category"  var="ApiURL"/>
										<form:form  modelAttribute="category" action='${ApiURL}' method="post" enctype="multipart/form-data">
											<div class="form-group">
												<input class="form-control" name="id" value="${category.id }" type="hidden" />
											</div>
											<div class="form-group">
												<label>Tên Danh Mục</label> 
												<input class="form-control"  name="name" value="${category.name }" type="text" />
												<span style="color:red;"><form:errors path="name"></form:errors></span>
											</div>

											<button type="submit" class="btn btn-danger">Sửa</button>
											<button type="reset" class="btn btn-primary">Reset Button</button>

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