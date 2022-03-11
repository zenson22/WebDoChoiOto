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
				<hr />
				<div class="row">
					<div class="col-md-12">

						<div class="panel panel-default">
							<div class="panel-heading">Quản Lý Danh Mục</div>
							<div class="panel-body">
								<div class="row">
									<div class="col-md-6">
										<c:url value="/quan-tri/danh-muc/add-category" var="Url"/>
										<form:form  modelAttribute="category" action='${Url }' method="post" enctype="multipart/form-data">
											
											<div class="form-group">
												<label>Tên Danh Mục</label> 
												<input class="form-control" name="name" placeholder="VD: Nước hoa cao cấp" type="text" />
												<span style="color:red;"><form:errors path="name"></form:errors></span>
											</div>

											<button type="submit" class="btn btn-success">Thêm</button>
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