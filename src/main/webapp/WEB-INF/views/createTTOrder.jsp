<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create new TT Order</title>
<link rel="stylesheet" href="/resources/css/index.css">
<jsp:include page="/WEB-INF/views/layout/header.jsp" />
</head>
<body>
	<jsp:include page="/WEB-INF/views/layout/page-loader.jsp" />
	<jsp:include page="/WEB-INF/views/layout/navbar.jsp" />
	<jsp:include page="/WEB-INF/views/layout/sidebar.jsp" />

	<div class="page-content container">
		<div class="row">
			<div class="col-md-5 col-md-offset-4 col-md-offset-4-custom">
				<div class="login-wrapper">
					<h1 style="text-align: center;">Tạo mới tt Order</h1>
					<form:form action="${contextPath}/ttorder/create" method="post"
						modelAttribute="ttOrder" onsubmit="return validateForm();">
						<div class="form-group">
							<label for="exampleInputEmail1">Tên khách hàng</label>
							<form:input path="tenKH" type="text" class="form-control" id="tenKH"></form:input>
							<form:errors path="tenKH" cssClass="error"
								class="form-text text-muted"></form:errors>
								<small id="tenKH1" class="error"></small>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Mã loại KH</label>
							<form:input path="maloaiKH" type="text" class="form-control" id="maloaiKH"></form:input>
							<form:errors path="maloaiKH" cssClass="error"
								class="form-text text-muted"></form:errors>
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">Số điện thoai</label>
							<form:input path="soDienThoai" type="text" class="form-control" id="soDienThoai"></form:input>
							<form:errors path="soDienThoai" cssClass="error"
								class="form-text text-muted"></form:errors>
								<small id="soDienThoai1" class="error"></small>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Ngày Order</label>
							<form:input path="ngayOrder" type="text" class="form-control" id="ngayOrder"></form:input>
							<form:errors path="ngayOrder" cssClass="error"
								class="form-text text-muted"></form:errors>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Số người lớn</label>
							<form:input path="soNguoiLon" type="text" class="form-control" id="soNguoiLon"></form:input>
							<form:errors path="soNguoiLon" cssClass="error"
								class="form-text text-muted"></form:errors>
								<small id="soNguoiLon1" class="error"></small>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Số trẻ em</label>
							<form:input path="soTreEm" type="text" class="form-control" id="soTreEm"></form:input>
							<form:errors path="soTreEm" cssClass="error"
								class="form-text text-muted"></form:errors>
								<small id="soTreEm1" class="error"></small>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Giờ vào</label>
							<form:input path="gioVao" type="text" class="form-control" id="gioVao"></form:input>
							<form:errors path="gioVao" cssClass="error"
								class="form-text text-muted"></form:errors>
						</div>
						<input type="reset" value="Reset" class="btn btn-primary">
						<form:button class="btn btn-success">Register</form:button>
					</form:form>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="/WEB-INF/views/layout/script.jsp" />
<%-- 	<jsp:include page="/WEB-INF/views/layout/footer.jsp" /> --%>
</body>
</html>