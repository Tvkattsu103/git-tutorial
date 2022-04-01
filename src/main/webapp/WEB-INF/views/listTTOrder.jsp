<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List TT Order</title>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />
</head>
<body>
	<jsp:include page="/WEB-INF/views/layout/page-loader.jsp" />
	<jsp:include page="/WEB-INF/views/layout/navbar.jsp" />
	<jsp:include page="/WEB-INF/views/layout/sidebar.jsp" />

	<section class="content">
		<div class="container-fluid">
			<!-- Striped Rows -->
			<div class="row clearfix">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="card">
						<div class="header">
							<h2>Danh sách các order</h2>
						</div>
						<div id="success" class="alert-success"><c:out value="${message}"></c:out></div>
						<div class="body table-responsive">
							<table class="table table-striped" id="dataTable-listMember">
								<thead>
									<tr>
										<th>Mã Order</th>
										<th>Tên Khách Hàng</th>
										<th>Mã loại KH</th>
										<th>Số Điện Thoại</th>
										<th>Ngày order</th>
										<th>Số người lớn</th>
										<th>Số trẻ em</th>
										<th>Giờ vào</th>
										<th>Tiền thanh toán</th>
										<th>Button</th>
									</tr>
								</thead>
								<tbody>
									<c:if test="${not empty ttOrder}">
										<c:forEach items="${ttOrder}" var="tt">
											<tr>
												<td>${tt.maOrder }</td>
												<td>${tt.tenKH }</td>
												<td>${tt.loaiKH.maLoaiKH }</td>
												<td>${tt.soDienThoai }</td>
												<td>${tt.ngayOrder }</td>
												<td>${tt.soNguoiLon }</td>
												<td>${tt.soTreEm }</td>
												<td>${tt.gioVao }</td>
												<td>${tt.tienThanhToan }</td>
												<td><a
													href="${contextPath}/ttorder/update?maOrder=${tt.maOrder }"
													class="fa fa-edit">Update</a></td>
											</tr>
										</c:forEach>
									</c:if>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
			<!-- #END# Striped Rows -->
		</div>
	</section>
	<jsp:include page="/WEB-INF/views/layout/script.jsp" />
	<jsp:include page="/WEB-INF/views/layout/footer.jsp" />
</body>
</html>