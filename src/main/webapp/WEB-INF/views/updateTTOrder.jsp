<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create new may</title>

<link rel="stylesheet" href="/resources/css/index.css">
<jsp:include page="/WEB-INF/views/layout/header.jsp" />

</head>
<body>
	<jsp:include page="/WEB-INF/views/layout/page-loader.jsp" />
	<jsp:include page="/WEB-INF/views/layout/navbar.jsp" />

	<div class="page-content container">
		<div class="row">
			<div class="col-md-5 col-md-offset-4 col-md-offset-4-custom">
					<h1>Tạo mới máy</h1>
					<form:form action="${contextPath}/ttorder/update" method="post"
						modelAttribute="updateTTOrder">
						<div class="form-group">
							<label>Mã Máy</label><br/>
							${ updateTTOrder.maOrder}
							
							<form:errors path="maOrder" cssClass="error"
								class="form-text text-muted"></form:errors>
						</div>
						<div class="form-group">
							<label>Số người lớn</label>
							<form:input path="soNguoiLon" type="text" class="form-control"></form:input>
							<form:errors path="soNguoiLon" cssClass="error"
								class="form-text text-muted"></form:errors>
						</div>
						<div class="form-group">
							<label>Số trẻ em</label>
							<form:input path="soTreEm" type="text" class="form-control"></form:input>
							<form:errors path="soTreEm" cssClass="error"
								class="form-text text-muted"></form:errors>
						</div>
						<div class="form-group">
							<label>Giờ vào</label>
							<form:input path="gioVao" type="text" class="form-control"></form:input>
							<form:errors path="gioVao" cssClass="error"
								class="form-text text-muted"></form:errors>
						</div>

						<input type="reset" value="Reset" class="btn btn-primary">
						<form:button class="btn btn-success">Update</form:button>
						<form:hidden path="maOrder"/>
						<form:hidden path="ngayOrder"/>	
						<form:hidden path="loaiKH"/>						
					</form:form>
				</div>
			</div>
		</div>

	<jsp:include page="/WEB-INF/views/layout/script.jsp" />
	<jsp:include page="/WEB-INF/views/layout/footer.jsp" />
</body>
</html>