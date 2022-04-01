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
<div class="container">
	<div class="jumbotron" style="background-color:white">
	<h1 style="color: red">${errorTitle}</h1>
	<hr />

	<blockquote>${errorDescription}</blockquote>
</div>
</div>
<jsp:include page="/WEB-INF/views/layout/script.jsp" />
<%-- 	<jsp:include page="/WEB-INF/views/layout/footer.jsp" /> --%>
</body>
</html>